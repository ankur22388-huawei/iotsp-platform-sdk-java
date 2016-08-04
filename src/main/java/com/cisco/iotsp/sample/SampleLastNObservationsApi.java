package com.cisco.iotsp.sample;

import java.util.List;

import com.cisco.iotsp.client.presence.ApiException;
import com.cisco.iotsp.client.presence.LastNObservationsApi;
import com.cisco.iotsp.client.presence.model.Observation;
import com.cisco.iotsp.client.presence.model.PageObservation;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleLastNObservationsApi {
	private LastNObservationsApi api;

	public SampleLastNObservationsApi(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for presence at %s", serviceAddr));

		api = ServiceApiHelper.getLastNObservationsApi(serviceAddr, accessToken);
	}

	public boolean getLastObservations(String thingUid, int limit, int offset) {
		try {
			// Get Last N Observation
			PageObservation pageOb = api.getLastObservations(thingUid, limit, offset);
			System.out.printf("\n--- Get last observations for thing uid %s, limit=%d, offset=%d is successful: ---",
					thingUid, limit, offset);
			System.out.println(pageOb);
			if(pageOb != null) {
				List<Observation> listOb = pageOb.getItems();
				if(listOb != null && !listOb.isEmpty()){
					Observation lastOb = listOb.get(0);
					System.out.printf("Last observation is %s", lastOb);
				}
			}
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- getLastObservations failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.println("\n--- Get last observations failed!!! ---");
			e.printStackTrace();
			return false;
		}
	}
}
