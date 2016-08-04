package com.cisco.iotsp.sample.workflow;

import java.io.File;

import com.cisco.iotsp.client.http_device_connector.ApiException;
import com.cisco.iotsp.client.http_device_connector.HttpDeviceConnectorApi;
import com.cisco.iotsp.client.thing_credentials.ThingCredentialsApi;
import com.cisco.iotsp.client.thing_credentials.model.Secret;
import com.cisco.iotsp.client.thing_credentials.model.ThingBaseCredential;
import com.cisco.iotsp.client.thing_credentials.model.ThingBaseCredential.CredentialTypeEnum;
import com.cisco.iotsp.client.thing_credentials.model.ThingCredentialResponse;
import com.cisco.iotsp.client.things.ThingsApi;
import com.cisco.iotsp.client.things.model.SectionSchemaPair;
import com.cisco.iotsp.client.things.model.Thing;
import com.cisco.iotsp.client.things.model.ThingCreateRequest;
import com.cisco.iotsp.helper.AuthenticationHelper;
import com.cisco.iotsp.helper.ServiceApiHelper;
import com.cisco.iotsp.sample.SampleHttpDeviceConnector;
import com.cisco.iotsp.sample.SampleLastNObservationsApi;
import com.cisco.iotsp.sample.SampleThingsCreate;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SamplePostObservation {

	private String serviceAddress;
	private String userAccountToken;

	private SampleHttpDeviceConnector connectAPi;

	public SamplePostObservation(String serviceAddr, String userAccountAccessToken) {
		System.out.println(String.format("Client for SamplePostObservation at %s", serviceAddr));

		serviceAddress = serviceAddr;
		userAccountToken = userAccountAccessToken;
	}

	public boolean postMessage(String accountAlias) {
		try {
			// Step 1. Create thing
			ObjectMapper mapper = new ObjectMapper();
			ThingCreateRequest thingRequest = mapper.readValue(new File("src/main/resources/file/sampleThing.json"), ThingCreateRequest.class);
			for (SectionSchemaPair section : thingRequest.getSectionSchemas()) {
				String schemaUid =  section.getSchemaUid().replaceFirst("accountAlias", accountAlias);	
				section.setSchemaUid(schemaUid);
			}
			
			ThingsApi apiThing = ServiceApiHelper.getThingsApi(serviceAddress, userAccountToken);
			Thing newThing = apiThing.createThing(thingRequest);
			String thingUid = newThing.getUid();
			
			// Step 2. create a credential for the device.
			// thingUid : device uid generated by IoTSP
			// name & secret: user specified string that is used as credential for the device
			String secret = "myDeviceSecret";
			ThingCredentialsApi thingCredApi = ServiceApiHelper.getThingCredentialsApi(serviceAddress,
					userAccountToken);
			ThingBaseCredential thingCredentialRequest = new ThingBaseCredential();
			thingCredentialRequest.setCredentialType(CredentialTypeEnum.SECRET);
			thingCredentialRequest.setThingUid(thingUid);
			Secret credential = new Secret();
			credential.setName(thingUid);
			credential.setSecret(secret);
			thingCredentialRequest.setCredential(credential);
			ThingCredentialResponse resp = thingCredApi.createCredential(thingCredentialRequest);
			System.out.printf("device credential response is %s\n", resp.toString());

			System.out.println("Sleep 1 second after create a credential for device");
			Thread.sleep(1000);

			// Step 3. get OAuth2 access token for the device
			// thingUid: used as the user name to get device access token
			// Secret: used as password to get the device access token
			// clientID: for device, it's hard coded to "iotspdeviceoauth2client" for now. 
			// clientSecret: for device, it's hard coded to "iotspdeviceoauth2client" for now. 
			String deviceAccessToken = AuthenticationHelper.getAccessToken(serviceAddress, thingUid, secret,
					"iotspdeviceoauth2client", "iotspdeviceoauth2client");
			System.out.printf("device access token is %s\n", deviceAccessToken);

			// Step 4. use device access token to post observation, by calling http device connector service
			try {
				boolean successPost = true;
				String data = "{\"messages\":[{\"data\":{\"atm-sensor-reading\":{\"amount\":\"2\",\"account-id\":\"481730\",\"transaction-time\":\"1469208709759\"},\"count\":\"21\"},\"ts\":1469208709760,\"format\":\"json\"},{\"data\":{\"farm-sensor-reading\":{\"temperature\":\"3\",\"humidity\":\"4\",\"soil-moisture\":\"5\"},\"wind\":\"2\"},\"ts\":1469208709760,\"format\":\"json\"}]}";

				HttpDeviceConnectorApi api = ServiceApiHelper.getHttpDeviceConnectorApi(serviceAddress,
						deviceAccessToken);
				String route = String.format("/v1/%s/json-env/dev2app/", thingUid);
				api.postMessage(data.getBytes(), route);

				System.out.printf("\n--- postMessage suceess  ---");
				
				// Step 5 get last N observations to verify post was indeed successful
				Thread.sleep(1000);
				SampleLastNObservationsApi observ = new SampleLastNObservationsApi(serviceAddress, userAccountToken);
				boolean sucessGet = observ.getLastObservations(thingUid, 10, 0);
				return successPost && sucessGet;

			} catch (ApiException apiE) {
				System.out.printf("\n--- postMessage failed !!! ---\n");
				System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
						apiE.getResponseHeaders(), apiE.getResponseBody());
				System.out.println(apiE);
				apiE.printStackTrace();
				return false;
			}
		} catch (Exception e) {
			System.out.printf("\n--- postMessage failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

}
