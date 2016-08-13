//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.sample;

import com.cisco.iotsp.client.thing_credentials.ApiException;
import com.cisco.iotsp.client.thing_credentials.ThingCredentialsApi;
import com.cisco.iotsp.client.thing_credentials.model.Secret;
import com.cisco.iotsp.client.thing_credentials.model.ThingBaseCredential;
import com.cisco.iotsp.client.thing_credentials.model.ThingBaseCredential.CredentialTypeEnum;
import com.cisco.iotsp.client.thing_credentials.model.ThingCredentialResponse;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleThingCredentials {
	private ThingCredentialsApi api;

	public SampleThingCredentials(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for iot-things-credentials at %s", serviceAddr));

		api = ServiceApiHelper.getThingCredentialsApi(serviceAddr, accessToken);

	}

	public boolean authenticateCredential(String name, String secret) {
		try {
			Secret credential = new Secret();
			credential.setName(name);
			credential.setSecret(secret);
			ThingCredentialResponse resp = api.authenticateCredential(credential);
			System.out.println("\n--- authenticateCredential is successful");
			System.out.println(resp);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- authenticateCredential failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.printf("\n--- authenticateCredential failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteCredential(String credentialUid) {
		try {
			ThingCredentialResponse resp = api.deleteCredential(credentialUid);

			System.out.println("\n--- deleteCredential is successful");
			System.out.println(resp);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- deleteCredential failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.printf("\n--- deleteCredential failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	public boolean resetCredential(String thingUid, String name, String secret) {
		try {
			ThingBaseCredential thingCredentialRequest = new ThingBaseCredential();
			thingCredentialRequest.setCredentialType(CredentialTypeEnum.SECRET);
			thingCredentialRequest.setThingUid(thingUid);
			Secret credential = new Secret();
			credential.setName(name);
			credential.setSecret(secret);
			ThingCredentialResponse resp = api.resetCredential(thingCredentialRequest);

			System.out.println("\n--- resetCredential is successful");
			System.out.println(resp);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- resetCredential failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.printf("\n--- resetCredential failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}
}
