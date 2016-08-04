package com.cisco.iotsp.sample;

import java.util.List;
import java.util.Map;

import com.cisco.iotsp.client.things.ApiException;
import com.cisco.iotsp.client.things.ThingsApi;
import com.cisco.iotsp.client.things.model.SectionSchemaPair;
import com.cisco.iotsp.client.things.model.Thing;
import com.cisco.iotsp.client.things.model.ThingCreateRequest;
import com.cisco.iotsp.client.things.model.ThingIdentifier;
import com.cisco.iotsp.helper.JsonHelper;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleThingsCreate {
	private ThingsApi api;

	public SampleThingsCreate(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for iot-thing-registry at %s", serviceAddr));

		api = ServiceApiHelper.getThingsApi(serviceAddr, accessToken);
	}

	public Thing createThingFromJsonFile(String accountAlias, String thingDefFilePath) {
		try {
			ThingCreateRequest newRequest = new ThingCreateRequest();

			Map<String, Object> rootMap = JsonHelper.convertJsonFileToMap(thingDefFilePath);
			System.out.println(String.format("Parse file %s", thingDefFilePath));
			System.out.println(rootMap.toString());

			@SuppressWarnings("unchecked")
			Map<String, String> thingIdMap = (Map<String, String>) rootMap.get("uniqueIdentifiers");
			ThingIdentifier thingId = new ThingIdentifier();
			thingId.setMacAddress(thingIdMap.get("macAddress"));
			thingId.setManufacturingId(thingIdMap.get("manufacturingId"));
			thingId.setSerialNumber(thingIdMap.get("serialNumber"));

			newRequest.setUniqueIdentifiers(thingId);

			// The schema uid is in the format of  "accountAlias~region~schemaName".  
			// For now region is empty string. accountAliase is user specified string that is used when creating the account
			// The thingDefFilePath file only contains the schemaName, the "accountAlias" has to be replaced with actual accountAlias
			@SuppressWarnings("unchecked")
			List<SectionSchemaPair> sectionSchemasList = (List<SectionSchemaPair>) (rootMap.get("sectionSchemas"));
			for (Object section : sectionSchemasList) {
				Map<String, String> secSchemaPair = (Map<String, String>) section;
				String shemaUid = secSchemaPair.get("schemaUid").replaceFirst("accountAlias", accountAlias);
				secSchemaPair.put("schemaUid", shemaUid);
			}
			newRequest.setSectionSchemas(sectionSchemasList);

			Map<String, Object> sectionsMap = JsonHelper.convertPojoToMap(rootMap.get("sections"));
			newRequest.setSections(sectionsMap);

			//User can assign a uid (must be unique) to the new Thing object
			//The Thing Uid must be in the formation of accountAlias~region~id.  Region is empty string for now
			//If user does not assign uid in createThing request, then system will assign a uid
			String region = "";
			newRequest.setUid(accountAlias + "~" + region  + "~" + "MyUniqueyDeviceUid");
			System.out.printf("\n createThing, request is: %s", newRequest);
			Thing newThing = api.createThing(newRequest);

			if (newThing != null) {
				System.out.println("\n--- createThingFromJsconFile is successful: ---");
				System.out.println(newThing);
			} else
				System.out.println("\n--- createThingFromJsconFile failed! ---");

			return newThing;
		} catch (ApiException apiE) {
			System.out.printf("\n--- createThingFromJsonFile failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return null;

		} catch (Exception e) {
			System.out.printf("\n--- createThingFromJsconFile failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return null;
		}
	}

}
