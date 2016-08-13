//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.sample;

import com.cisco.iotsp.client.presence.ApiException;
import com.cisco.iotsp.client.presence.PresenceApi;
import com.cisco.iotsp.client.presence.model.PresenceView;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SamplePresence {
	private PresenceApi api;

	public SamplePresence(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for presence at %s", serviceAddr));
		api = ServiceApiHelper.getPresenceApi(serviceAddr, accessToken);
	}

	public boolean updateKeepAliveTimestamp(String thingUid, long keepAliveTs) {
		try {
			PresenceView thingPresence = api.updateKeepAliveTimestamp(thingUid, keepAliveTs);
			System.out.println("\n--- updateKeepAliveTimestamp is successful: ---");
			System.out.println(thingPresence);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- updateKeepAliveTimestamp failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.println("\n--- updateKeepAliveTimestamp failed!!! ---");
			e.printStackTrace();
			return false;
		}
	}

	public boolean getPresence(String thingUid) {
		try {
			PresenceView thingPresence = api.getPresence(thingUid);
			System.out.println("\n--- getPresence is successful: ---");
			System.out.println(thingPresence);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- getPresence failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.println("\n--- getPresence failed!!! ---");
			e.printStackTrace();
			return false;
		}
	}

	public boolean deletePresence(String thingUid) {
		try {
			PresenceView thingPresence = api.deletePresence(thingUid);
			System.out.println("\n--- deletePresence is successful: ---");
			System.out.println(thingPresence);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- deletePresence failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.println("\n--- deletePresence failed!!! ---");
			e.printStackTrace();
			return false;
		}
	}
}
