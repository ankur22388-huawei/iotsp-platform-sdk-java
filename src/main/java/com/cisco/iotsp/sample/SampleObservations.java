package com.cisco.iotsp.sample;

import com.cisco.iotsp.client.observations.ApiException;
import com.cisco.iotsp.client.observations.ObservationsApi;
import com.cisco.iotsp.client.observations.model.Observations;
import com.cisco.iotsp.client.observations.model.PageObservations;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleObservations {
	private ObservationsApi api;

	public SampleObservations(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for presence at %s", serviceAddr));

		api = ServiceApiHelper.getObservationsApi(serviceAddr, accessToken);
	}

	public boolean getObservations(String query, int limit, int offset) {
		try {
			// Get Last N Observation
			PageObservations myThingObs = api.getObservations(query, limit, offset);
			System.out.printf("\n--- getObservations, query string =  %s, limit=%d, offset=%d is successful: ---",
					query, limit, offset);
			System.out.println(myThingObs);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- getObservations failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.println("\n--- getObservations failed!!! ---");
			e.printStackTrace();
			return false;
		}
	}

	public boolean getObservation(String observationUid) {
		try {
			// Get Last N Observation
			Observations ob = api.getObservation(observationUid);
			System.out.printf("\n--- getObservation, observationUid =  %s, is successful: ---", observationUid);
			System.out.println(ob);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- getObservation failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		}  catch (Exception e) {
			System.out.println("\n--- getObservation failed!!! ---");
			e.printStackTrace();
			return false;
		}
	}
}
