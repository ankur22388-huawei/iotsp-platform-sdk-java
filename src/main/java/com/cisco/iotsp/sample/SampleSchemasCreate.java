//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.sample;

import java.io.File;
import java.util.Locale;
import java.util.Map;

import com.cisco.iotsp.client.schemas.ApiException;
import com.cisco.iotsp.client.schemas.SchemasApi;
import com.cisco.iotsp.client.schemas.model.Schema;
import com.cisco.iotsp.client.schemas.model.SchemaCreateRequest;
import com.cisco.iotsp.client.schemas.model.SchemaCreateRequest.SchemaTypeEnum;
import com.cisco.iotsp.helper.JsonHelper;
import com.cisco.iotsp.helper.ServiceApiHelper;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleSchemasCreate {

	private SchemasApi api;

	public SampleSchemasCreate(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample Schemas with iotsp-schemas at %s", serviceAddr));

		api = ServiceApiHelper.getSchemasApi(serviceAddr, accessToken);
	}

	public String createSchema(String schemaFilePathInResources) {
		String newSchemaUid = "";
		try {
			ObjectMapper mapper = new ObjectMapper();			
			SchemaCreateRequest newSchemaObj = mapper.readValue(ClassLoader.getSystemResourceAsStream(schemaFilePathInResources), SchemaCreateRequest.class);
			Schema createdSchema = api.createSchema(newSchemaObj);
			if (createdSchema != null) {
				newSchemaUid = createdSchema.getUid();
				System.out.println("\n--- Create schema is successful: ---");
				System.out.println(createdSchema);
			} else
				System.out.println("\n--- Create schema failed! ---");

			return newSchemaUid;
		} catch (ApiException apiE) {
			System.out.printf("\n--- createSchema failed !!! ---");
			System.out.printf("\ncode=%d\n msg=%s\n header=%s\n body=%s\n", apiE.getCode(), apiE.getMessage(),
					apiE.getResponseHeaders(), apiE.getResponseBody());
			System.out.println(apiE);
			apiE.printStackTrace();
			return "";
		} catch (Exception e) {
			System.out.println("\n--- Create Schema failed!!! ---");
			System.out.println(e);
			e.printStackTrace();
			return newSchemaUid;
		}
	}
}
