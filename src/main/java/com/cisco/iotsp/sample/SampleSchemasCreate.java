package com.cisco.iotsp.sample;

import java.util.Locale;
import java.util.Map;

import com.cisco.iotsp.client.schemas.ApiException;
import com.cisco.iotsp.client.schemas.SchemasApi;
import com.cisco.iotsp.client.schemas.model.Schema;
import com.cisco.iotsp.client.schemas.model.SchemaCreateRequest;
import com.cisco.iotsp.client.schemas.model.SchemaCreateRequest.SchemaTypeEnum;
import com.cisco.iotsp.helper.JsonHelper;
import com.cisco.iotsp.helper.ServiceApiHelper;

public class SampleSchemasCreate {

	private SchemasApi api;

	public SampleSchemasCreate(String serviceAddr, String accessToken) {
		System.out.println(String.format("Sample Schemas with iotsp-schemas at %s", serviceAddr));

		api = ServiceApiHelper.getSchemasApi(serviceAddr, accessToken);
	}

	public String createSchema(String schemaFilePath) {
		String newSchemaUid = "";
		try {
			Map<String, Object> mapRoot = JsonHelper.convertJsonFileToMap(schemaFilePath);
			System.out.println(String.format("Parse file %s", schemaFilePath));
			System.out.println(mapRoot.toString());

			String schemaName = mapRoot.get("name").toString();
			SchemaTypeEnum schemaType = SchemaTypeEnum
					.valueOf(mapRoot.get("schemaType").toString().toUpperCase(Locale.ENGLISH));
			SchemaCreateRequest newSchemaObj = new SchemaCreateRequest();
			newSchemaObj.setName(schemaName);
			newSchemaObj.setSchemaType(schemaType);

			Object objSchema = mapRoot.get("schema");
			String jsonSchema = JsonHelper.convertPojoToJsonString(objSchema);
			Map<String, Object> mapSchema = JsonHelper.convertJsonStringToMap(jsonSchema);
			newSchemaObj.setSchema(mapSchema);

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
