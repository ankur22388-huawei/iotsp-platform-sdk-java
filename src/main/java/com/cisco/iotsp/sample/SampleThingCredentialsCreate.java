package com.cisco.iotsp.sample;

import com.cisco.iotsp.client.thing_credentials.ApiException;
import com.cisco.iotsp.client.thing_credentials.ThingCredentialsApi;
import com.cisco.iotsp.client.thing_credentials.model.Secret;
import com.cisco.iotsp.client.thing_credentials.model.ThingBaseCredential;
import com.cisco.iotsp.client.thing_credentials.model.ThingCredentialResponse;
import com.cisco.iotsp.client.thing_credentials.model.ThingBaseCredential.CredentialTypeEnum;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleThingCredentialsCreate {

	private ThingCredentialsApi api;

	public SampleThingCredentialsCreate(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for iot-things-credentials at %s", serviceAddr));

		api = ServiceApiHelper.getThingCredentialsApi(serviceAddr, accessToken);

	}

	public String createCredential(String thingUid, String secret) {
		try {
			ThingBaseCredential thingCredentialRequest = new ThingBaseCredential();
			thingCredentialRequest.setCredentialType(CredentialTypeEnum.SECRET);
			thingCredentialRequest.setThingUid(thingUid);
			Secret credential = new Secret();
			credential.setName(thingUid);
			credential.setSecret(secret);
			thingCredentialRequest.setCredential(credential);
			ThingCredentialResponse resp = api.createCredential(thingCredentialRequest);

			System.out.println("\n--- createCredential is successful");
			System.out.println(resp);
			return resp.getUid();
		} catch (ApiException apiE) {
			System.out.printf("\n--- createCredential failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return "";

		} catch (Exception e) {
			System.out.printf("\n--- createCredential failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return "";

		}
	}
}
