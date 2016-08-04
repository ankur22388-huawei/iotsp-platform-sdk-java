package com.cisco.iotsp.sample;

import com.cisco.iotsp.client.registration.ApiException;
import com.cisco.iotsp.client.registration.RegistrationApi;
import com.cisco.iotsp.client.registration.model.*;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleRegistration {
	private RegistrationApi api;

	public SampleRegistration(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for iot-thing-registry at %s", serviceAddr));

		api = ServiceApiHelper.getRegistrationApi(serviceAddr, accessToken);
	}

	public boolean registerThing() {
		try {
			// Register a thing
			// for now, the only property needed is the uuid and data_connector
			Thing theThing = new Thing();
			
			UniqueIdentifier thingUid = new UniqueIdentifier();
			thingUid.setManufacturingId("a151c893-c7bc-48d6-8494-7e7775dcf3e5");
			theThing.setUniqueIdentifiers(thingUid);

			RegistrationRequest req = new RegistrationRequest();
			req.setThing(theThing);

			System.out.println("Register thing with request:");
			System.out.println(req);

			RegistrationResponse resp = api.registerThing(req);
			resp.getService().getCredentials();

			System.out.println("\n--- registerThing is successful: ---");
			System.out.println(resp);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- registerThing failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.printf("\n--- registerThing failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean registerThing(String thingUid, Thing thing, Secret credentials) {
		try {
			// Register a thing
			// for now, the only property needed is the uuid and data_connector
			RegistrationRequest req = new RegistrationRequest();
			req.setThing(thing);
			
			ThingService service = new ThingService();
			service.setCredentials(credentials);
			service.setThingUid(thingUid);
			req.setService(service);

			System.out.println("Register thing with request:");
			System.out.println(req);

			RegistrationResponse resp = api.registerThing(req);

			System.out.println("\n--- registerThing is successful: ---");
			System.out.println(resp);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- registerThing failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.printf("\n--- registerThing failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}
}
