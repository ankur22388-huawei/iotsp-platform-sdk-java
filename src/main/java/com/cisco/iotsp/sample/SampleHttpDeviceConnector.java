package com.cisco.iotsp.sample;

import com.cisco.iotsp.client.http_device_connector.ApiException;
import com.cisco.iotsp.client.http_device_connector.HttpDeviceConnectorApi;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleHttpDeviceConnector {
	private HttpDeviceConnectorApi api;
	
	public SampleHttpDeviceConnector(String serviceAddr, String deviceAccessToken) {
		System.out.println(String.format("Sample client for iotsp-device-connector-http at %s", serviceAddr));
		System.out.printf("device access token is %s\n", deviceAccessToken);
		
		api = ServiceApiHelper.getHttpDeviceConnectorApi(serviceAddr, deviceAccessToken);
	}
	
	public void postMessage(String thingUid, String data) {
		try {
			String route = String.format("/v1/%s/json-env/dev2app/", thingUid);
			api.postMessage(data.getBytes(), route);
			
			System.out.printf("\n--- postMessage suceess  ---");
			
		} catch(ApiException apiE) { 
			System.out.printf("\n--- postMessage failed !!! ---\n");
			System.out.printf("code=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(), apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();	
			
		} catch (Exception e) {
			System.out.printf("\n--- postMessage failed !!! ---");
			System.out.println(e);
			e.printStackTrace();	
		}
	}

}

