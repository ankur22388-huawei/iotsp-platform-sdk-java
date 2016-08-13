//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.sample;

import java.util.ArrayList;
import java.util.List;

import com.cisco.iotsp.client.claims.ApiException;
import com.cisco.iotsp.client.claims.ClaimsApi;
import com.cisco.iotsp.client.claims.model.FilterCriteria;
import com.cisco.iotsp.client.claims.model.FilterCriteria.ValueFilterTypeEnum;
import com.cisco.iotsp.client.claims.model.PageInfo;
import com.cisco.iotsp.client.claims.model.PageThingClaim;
import com.cisco.iotsp.client.claims.model.SortCriteria;
import com.cisco.iotsp.client.claims.model.SortCriteria.SortOrderEnum;
import com.cisco.iotsp.client.claims.model.ThingClaim;
import com.cisco.iotsp.client.claims.model.ThingClaimFilter;
import com.cisco.iotsp.client.claims.model.ThingClaimRequest;
import com.cisco.iotsp.client.claims.model.ThingDescriptor;
import com.cisco.iotsp.client.claims.model.UniqueIdentifier;
import com.cisco.iotsp.client.claims.model.ThingClaimFilter.FilterOperatorEnumEnum;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleClaims {
	private ClaimsApi api;

	public SampleClaims(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for iot-things-claims at %s", serviceAddr));

		api = ServiceApiHelper.getClaimsApi(serviceAddr, accessToken);
	}
	
	public String createClaim() {
		try {
			ThingClaimRequest request = new ThingClaimRequest();
			request.setMake("Cisco Systems");
			request.setModel("SensorX");
			UniqueIdentifier uniqueIdentifiers = new UniqueIdentifier();
			uniqueIdentifiers.setManufacturingId("a151c893-c7bc-48d6-8494-7e7775dcf3e5");
			uniqueIdentifiers.setMacAddress("38:4f:3e:99:47:29");
			uniqueIdentifiers.setSerialNumber("d361945a-453b-4504-9226-eb825dda7822");
			request.setUniqueIdentifiers(uniqueIdentifiers);
			
			ThingDescriptor thingDetails = new ThingDescriptor();
			thingDetails.setName("sensorABC");
			thingDetails.setType("tempSensor");
			thingDetails.setDescription("Temperature Sensor in Control Room");
			request.setThingDetails(thingDetails);
			List<String> tags = new ArrayList<String>();
			tags.add("Control Room");
			tags.add("Temperature Sensor");
			request.setTags(tags);
								
			ThingClaim createdClaim = api.createClaim(request);
			System.out.printf("\n--- createClaim is successful. New Claim: \n%s", createdClaim);

			return createdClaim.getUid();
		} catch (ApiException apiE) {
			System.out.printf("\n--- createClaim failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return "";
		} catch (Exception e) {
			System.out.printf("\n--- createClaim failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return "";
		}
	}


	public boolean getClaim(String claimUid) {
		boolean success = false;
		try {
			// Query Claim
			ThingClaim queryClaim = api.getClaim(claimUid);

			System.out.println("\n--- getClaim by uid is successful");
			System.out.println(queryClaim);
			return true;
		} catch (Exception e) {
			System.out.printf("\n--- getClaim failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	public boolean getClaims() {
		try {
			PageThingClaim pageClaim = api.getClaims("uniqueIdentifiers.macAddress", "38:4f:3e:99:47:29",
					"thingDetails.name", "Ascending", 20, 0);
			System.out.println("\n--- getClaims by macAddress is successful");
			System.out.println(pageClaim);

			pageClaim = api.getClaims("thingDetails.type", "tempSensor", "make", "Ascending", 20, 0);
			System.out.println("\n--- getClaims by thingDetails.type is successful");
			System.out.println(pageClaim);

			pageClaim = api.getClaims("make", "Cisco Systems", "model", "Ascending", 20, 0);
			System.out.println("\n--- getClaims by make is successful");
			System.out.println(pageClaim);

			return true;
		} catch (Exception e) {
			System.out.printf("\n--- getClaim failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	public boolean getClaimsByFilter(String claimUid) {
		boolean success = false;
		try {

			// Query Claim
			FilterCriteria filterCrit1 = new FilterCriteria();
			filterCrit1.setKey("thingDetails.name");
			filterCrit1.setValue("temp");
			filterCrit1.setValueFilterType(ValueFilterTypeEnum.STARTSWITH);

			FilterCriteria filterCrit2 = new FilterCriteria();
			filterCrit2.setKey("make");
			filterCrit2.setValue("Cisco");
			filterCrit2.setValueFilterType(ValueFilterTypeEnum.STARTSWITH);

			List<FilterCriteria> filterCritList = new ArrayList<FilterCriteria>();
			filterCritList.add(filterCrit1);
			filterCritList.add(filterCrit2);

			ThingClaimFilter filter = new ThingClaimFilter();
			filter.setFilterCriteria(filterCritList);
			filter.setFilterOperatorEnum(FilterOperatorEnumEnum.ANY);

			PageInfo page = new PageInfo();
			page.setLimit(5);
			page.setOffset(0); // first page
			filter.setPageInfo(page);

			// Sort by model
			SortCriteria sortCrit = new SortCriteria();
			sortCrit.setSortKey("model");
			sortCrit.setSortOrder(SortOrderEnum.ASCENDING);
			filter.setSortCriteria(sortCrit);

			PageThingClaim pageClaim = api.getClaimsByFilter(filter);

			System.out.println("\n--- getClaimsByFilter is successful");
			System.out.printf("\nThingClaimFilter is: \n%s", filter.toString());
			System.out.printf("\nPageThingClaim is: \n%s", pageClaim);
			return true;

		} catch (Exception e) {
			System.out.printf("\n--- getClaim failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	public boolean updateClaim(String claimUid) {
		try {
			// Update a claim
			/*
			 * ThingClaim claim = api.getClaim(claimUid); ThingClaimEntity
			 * claimEntity = new ThingClaimEntity(); claim.setModel(
			 * "Updated Model"); api.updateClaim(claimUid, claim);
			 */
			return true;

		} catch (Exception e) {
			System.out.printf("\n--- updateClaim failed !!! ---");
			System.out.println(e);
			e.printStackTrace();

			return false;
		}
	}

	public boolean deleteClaim(String claimUid) {
		try {
			api.deleteClaim(claimUid);
			System.out.printf("\n--- Delete claim %s is successful.", claimUid);
			return true;
		} catch (Exception e) {
			System.out.printf("\n--- deleteClaim failed !!! ---");
			System.out.println(e);
			e.printStackTrace();

			return false;
		}
	}

}