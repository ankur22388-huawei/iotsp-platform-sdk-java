package com.cisco.iotsp.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cisco.iotsp.client.claims.*;
import com.cisco.iotsp.client.claims.model.*;
import com.cisco.iotsp.helper.ClientHelper;
import com.cisco.iotsp.helper.JsonHelper;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleClaimsCreate {
	private ClaimsApi api;

	public SampleClaimsCreate(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for iot-things-claims at %s", serviceAddr));

		api = ServiceApiHelper.getClaimsApi(serviceAddr, accessToken);
	}

	public String createClaimFromJsonFile(String claimJsonFilePath) {
		try {
			Map<String, Object> rootMap = JsonHelper.convertJsonFileToMap(claimJsonFilePath);
			System.out.println(String.format("Parse file %s", claimJsonFilePath));
			System.out.println(rootMap.toString());

			return createClaim(rootMap);
		} catch (Exception e) {
			System.out.printf("\n--- createClaim failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return "";
		}

	}

	public String createClaimFromJsonString(String claimJsonString) {
		try {
			Map<String, Object> rootMap = JsonHelper.convertJsonStringToMap(claimJsonString);
			System.out.println(String.format("Parse claim Json:\n %s", claimJsonString));
			System.out.println(rootMap.toString());

			return createClaim(rootMap);
		} catch (Exception e) {
			System.out.printf("\n--- createClaim failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return "";
		}

	}

	@SuppressWarnings("unchecked")
	private String createClaim(Map<String, Object> claimMap) throws ApiException {
		try {
			ThingClaimRequest newClaim = new ThingClaimRequest();
			newClaim.setMake(claimMap.get("make").toString());
			newClaim.setModel(claimMap.get("model").toString());

			Map<String, String> claimIdMap = (Map<String, String>) claimMap.get("uniqueIdentifiers");
			UniqueIdentifier claimId = new UniqueIdentifier();
			claimId.setMacAddress(claimIdMap.get("macAddress"));
			claimId.setManufacturingId(claimIdMap.get("manufacturingId"));
			claimId.setSerialNumber(claimIdMap.get("serialNumber"));
			newClaim.setUniqueIdentifiers(claimId);

			Map<String, String> thingDetailsMap = (Map<String, String>) claimMap.get("thingDetails");
			ThingDescriptor thingDetails = new ThingDescriptor();
			thingDetails.setName(thingDetailsMap.get("name"));
			thingDetails.setType(thingDetailsMap.get("type"));
			thingDetails.setDescription(thingDetailsMap.get("description"));
			newClaim.setThingDetails(thingDetails);

			List<String> tagsList = (List<String>) (claimMap.get("tags"));
			newClaim.setTags(tagsList);

			ThingClaim createdClaim = api.createClaim(newClaim);
			System.out.printf("\n--- createClaim is successful. New Claim: \n%s", createdClaim);

			return createdClaim.getUid();
		} catch (ApiException apiE) {
			System.out.printf("\n--- getAccount failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return "";
		}
	}
}