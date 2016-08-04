package com.cisco.iotsp.sample;

import java.util.ArrayList;
import java.util.List;

import com.cisco.iotsp.client.things.ApiException;
import com.cisco.iotsp.client.things.ThingsApi;
import com.cisco.iotsp.client.things.model.FilterCriteria;
import com.cisco.iotsp.client.things.model.FilterCriteria.ValueFilterTypeEnum;
import com.cisco.iotsp.client.things.model.PageInfo;
import com.cisco.iotsp.client.things.model.PageThing;
import com.cisco.iotsp.client.things.model.SortCriteria;
import com.cisco.iotsp.client.things.model.SortCriteria.SortOrderEnum;
import com.cisco.iotsp.client.things.model.Thing;
import com.cisco.iotsp.client.things.model.ThingFilter;
import com.cisco.iotsp.client.things.model.ThingFilter.FilterOperatorEnumEnum;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleThings {
	private ThingsApi api;

	public SampleThings(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample client for iot-thing-registry at %s", serviceAddr));

		api = ServiceApiHelper.getThingsApi(serviceAddr, accessToken);
	}

	public Thing getThingByUid(String thingUid) {
		try {
			Thing thing = api.getThing(thingUid);
			System.out.printf("getThing by thingUid %s is successful", thingUid);
			System.out.println(thing);
			return thing;
		} catch (ApiException apiE) {
			System.out.printf("\n--- getThing failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return null;

		} catch (Exception e) {
			System.out.printf("\n--- getThing failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return null;
		}
	}

	public boolean getThingByKeyValue(String accountAlias) {
		try {
			// get things by key value pair
			// all_params =
			String manufacturingId = "a151c893-c7bc-48d6-8494-7e7775dcf3e5";
			String macAddress = "38:4f:3e:99:47:29";
			String serialNumber = "d361945a-453b-4504-9226-eb825dda7822";

			// Get things by a specific serial number
			PageThing pageThingBySerialNum = api.getThings("uniqueIdentifiers.serialNumber", serialNumber,
					"uniqueIdentifiers.serialNumber", "Ascending", 5, 0);
			System.out.printf("\n--- Get thing by serialNumber %s is successful: ---", serialNumber);
			System.out.println(pageThingBySerialNum);

			// Get things that contain a particular schema, sorted by serial
			// number
			String schemaUid = accountAlias + "~~ciot-vendor-info-schema";
			PageThing pageThingBySchemaName = api.getThings("sectionSchemas.schemaUid", schemaUid,
					"uniqueIdentifiers.serialNumber", "Ascending", 5, 0);
			System.out.printf("\n--- Get thing by schema uid %s is successful: ---", schemaUid);
			System.out.println(pageThingBySchemaName);

			// Get things by specific make, sorted by serial number
			String make = "Cisco Systems";
			PageThing pageThingByMake = api.getThings("sections.vendor.make", make, "uniqueIdentifiers.serialNumber",
					"Ascending", 5, 0);
			System.out.printf("\n--- Get thing by make %s is successful: ---", make);
			System.out.println(pageThingByMake);
			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- getThing failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.printf("\n--- getThing failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	public boolean getThingsByFilter() {
		try {
			PageInfo page = new PageInfo();
			page.setLimit(5);
			page.setOffset(0); // first page

			ThingFilter filter = new ThingFilter();
			filter.setPageInfo(page);

			// Sort by manufacturingId
			SortCriteria sortCrit = new SortCriteria();
			sortCrit.setSortKey("uniqueIdentifiers.manufacturingId");
			sortCrit.setSortOrder(SortOrderEnum.ASCENDING);
			filter.setSortCriteria(sortCrit);

			// Filter by schema Uid
			FilterCriteria filterCrit1 = new FilterCriteria();
			filterCrit1.setKey("sectionSchemas.schemaUid");
			filterCrit1.setValue("SDK_Test6_Alias||sampleSchemaVendor");
			filterCrit1.setValueFilterType(ValueFilterTypeEnum.EXACT);

			// Filter by make
			FilterCriteria filterCrit2 = new FilterCriteria();
			filterCrit2.setKey("sections.vendor.make");
			filterCrit2.setValue("Cisco Systems");
			filterCrit2.setValueFilterType(ValueFilterTypeEnum.STARTSWITH);

			List<FilterCriteria> listCrit = new ArrayList<FilterCriteria>();
			listCrit.add(filterCrit1);
			listCrit.add(filterCrit2);
			filter.setFilterCriteria(listCrit);

			// Get thigns that satisfy any of filterCrit1 or filterCrit2
			filter.setFilterOperatorEnum(FilterOperatorEnumEnum.ANY);

			PageThing pageThingByFilter = api.getThingsByFilter(filter);

			System.out.println("\n--- getThingsByFilter is successful: ---");
			System.out.println(pageThingByFilter);

			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- getThingsByFilter failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.printf("\n--- getThingsByFilter failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteThing(String thingUid) {
		try {
			Thing deleteThing = api.deleteThing(thingUid);
			if (deleteThing.getUid().equalsIgnoreCase(thingUid)) {
				System.out.println("\n--- deleteThing is successful: ---");
				System.out.println(deleteThing);
				return true;
			} else {
				System.out.println("\n --- deleteThing failed!!! ---");
			}
			return false;
		} catch (ApiException apiE) {
			System.out.printf("\n--- deleteThing failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.println("\n--- deleteThing failed!!! ---");
			System.out.println(e.getMessage());
			return false;
		}
	}

}
