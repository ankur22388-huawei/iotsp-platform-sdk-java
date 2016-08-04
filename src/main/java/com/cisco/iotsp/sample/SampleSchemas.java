package com.cisco.iotsp.sample;

import java.util.Map;

import com.cisco.iotsp.client.schemas.ApiException;
import com.cisco.iotsp.client.schemas.SchemasApi;
import com.cisco.iotsp.client.schemas.model.PageSchema;
import com.cisco.iotsp.client.schemas.model.Schema;
import com.cisco.iotsp.helper.JsonHelper;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleSchemas {

	private SchemasApi api;

	public SampleSchemas(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample Schemas with iotsp-schemas at %s", serviceAddr));

		api = ServiceApiHelper.getSchemasApi(serviceAddr, accessToken);
	}

	public Schema getSchema(String schemaUid) {
		try {
			Schema s = api.getSchema(schemaUid);
			System.out.printf("\n--- getSchema %s is sucessful\n", schemaUid);
			System.out.println(s);
			return s;
		} catch (ApiException apiE) {
			System.out.printf("\n--- getSchema failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return null;
		} catch (Exception e) {
			System.out.printf("\n--- getSchema %s failed !!! ---", schemaUid);
			System.out.println(e);
			e.printStackTrace();
			return null;
		}
	}

	public PageSchema getSchemas(String schemaName, int limit, int offset) {
		try {
			PageSchema pageSchemas = api.getSchemas(schemaName, limit, offset);
			System.out.printf("\n--- getSchemas(schemaName=%s, limit=%d, offest=%d) is sucessful. Returns %d schemas\n",
					schemaName, limit, offset, pageSchemas.getTotalRows());
			System.out.println(pageSchemas);
			return pageSchemas;
		} catch (ApiException apiE) {
			System.out.printf("\n--- getSchemas failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return null;
		} catch (Exception e) {
			System.out.printf("\n--- getSchemas(schemaName=%s, limit=%d, offest=%d) failed !!! ---", schemaName, limit,
					offset);
			System.out.println(e);
			e.printStackTrace();
			return null;
		}
	}

	public boolean deleteSchema(String schemaUid) {
		try {
			Schema deletedSchemaObj = api.deleteSchema(schemaUid);

			if (deletedSchemaObj != null && deletedSchemaObj.getUid().equalsIgnoreCase(schemaUid)) {
				System.out.printf("\n---  deleteSchema(%s) is successful", schemaUid);
				System.out.println(deletedSchemaObj);
			} else {
				System.out.printf("\n--- deleteSchema(%s) failed ---", schemaUid);

			}

			return true;
		} catch (ApiException apiE) {
			System.out.printf("\n--- deleteSchema failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return false;
		} catch (Exception e) {
			System.out.printf("\n--- deleteSchema(scheamUid=%s) failed !!! ---", schemaUid);
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	// Delete the first schema with name as schemaName
	public boolean deleteSchemaByName(String schemaName) {
		try {
			PageSchema schemas = getSchemas(schemaName, 1, 0);
			return deleteSchema(schemas.getItems().get(0).getUid());
		} catch (Exception e) {
			System.out.printf("\n--- deleteSchemaByName(schemaName=%s) failed !!! ---", schemaName);
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

	public boolean getSystemSchemas() {
		try {
			String schemaName = "ciot-descriptor-schema";
			PageSchema pageSchemas1 = getSchemas(schemaName, 100, 0);
			Schema sysSchema1 = pageSchemas1.getItems().get(0);
			System.out.printf("\n getSystemSchemas(schemaName=%s) \n", schemaName);
			System.out.println(JsonHelper.convertPojoToJsonString(sysSchema1));

			schemaName = "ciot-vendor-info-schema";
			PageSchema pageSchemas2 = getSchemas(schemaName, 100, 0);
			Schema sysSchema2 = pageSchemas2.getItems().get(0);
			Map<String, Object> schemaMap2 = sysSchema2.getSchema();
			System.out.printf("\n--- getSystemSchemas(schemaName=%s)\n", schemaName);
			System.out.println(JsonHelper.convertPojoToJsonString(sysSchema2));
			return true;
		} catch (Exception e) {
			System.out.printf("\n--- getSystemSchemas(schemaName) failed !!! ---");
			System.out.println(e);
			e.printStackTrace();
			return false;
		}
	}

}
