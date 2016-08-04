package com.cisco.iotsp.client.schemas;

import com.cisco.iotsp.client.schemas.ApiException;
import com.cisco.iotsp.client.schemas.ApiClient;
import com.cisco.iotsp.client.schemas.Configuration;
import com.cisco.iotsp.client.schemas.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.schemas.model.SchemaCreateRequest;
import com.cisco.iotsp.client.schemas.model.Schema;
import com.cisco.iotsp.client.schemas.model.IoTExceptionModel;
import com.cisco.iotsp.client.schemas.model.PageSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:12.299-07:00")
public class SchemasApi {
  private ApiClient apiClient;

  public SchemasApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SchemasApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create new schema
   * 
   * @param schemaCreateRequest The schema to be created (required)
   * @return Schema
   * @throws ApiException if fails to make API call
   */
  public Schema createSchema(SchemaCreateRequest schemaCreateRequest) throws ApiException {
    Object localVarPostBody = schemaCreateRequest;
    
    // verify the required parameter 'schemaCreateRequest' is set
    if (schemaCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaCreateRequest' when calling createSchema");
    }
    
    // create path and map variables
    String localVarPath = "/v1/schema-services/schemas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuthScheme" };

    GenericType<Schema> localVarReturnType = new GenericType<Schema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create new system schema
   * 
   * @param schemaCreateRequest The schema to be created (required)
   * @return Schema
   * @throws ApiException if fails to make API call
   */
  public Schema createSystemSchema(SchemaCreateRequest schemaCreateRequest) throws ApiException {
    Object localVarPostBody = schemaCreateRequest;
    
    // verify the required parameter 'schemaCreateRequest' is set
    if (schemaCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaCreateRequest' when calling createSystemSchema");
    }
    
    // create path and map variables
    String localVarPath = "/v1/schema-services/schemas/actions/createSystemSchema".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuthScheme" };

    GenericType<Schema> localVarReturnType = new GenericType<Schema>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete schema by schemaUid
   * 
   * @param schemaUid Uid of schema (required)
   * @return Schema
   * @throws ApiException if fails to make API call
   */
  public Schema deleteSchema(String schemaUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'schemaUid' is set
    if (schemaUid == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaUid' when calling deleteSchema");
    }
    
    // create path and map variables
    String localVarPath = "/v1/schema-services/schemas/{schemaUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "schemaUid" + "\\}", apiClient.escapeString(schemaUid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuthScheme" };

    GenericType<Schema> localVarReturnType = new GenericType<Schema>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get schema by schemaUid
   * 
   * @param schemaUid Uid of schema (required)
   * @return Schema
   * @throws ApiException if fails to make API call
   */
  public Schema getSchema(String schemaUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'schemaUid' is set
    if (schemaUid == null) {
      throw new ApiException(400, "Missing the required parameter 'schemaUid' when calling getSchema");
    }
    
    // create path and map variables
    String localVarPath = "/v1/schema-services/schemas/{schemaUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "schemaUid" + "\\}", apiClient.escapeString(schemaUid.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuthScheme" };

    GenericType<Schema> localVarReturnType = new GenericType<Schema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a page of schemas by filter
   * 
   * @param schemaName search by name of the schema (optional)
   * @param limit maximum number of schemas to return (optional, default to 50)
   * @param offset starting index of schemas in return payload (optional, default to 0)
   * @return PageSchema
   * @throws ApiException if fails to make API call
   */
  public PageSchema getSchemas(String schemaName, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/schema-services/schemas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "schemaName", schemaName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuthScheme" };

    GenericType<PageSchema> localVarReturnType = new GenericType<PageSchema>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create the system schemas
   * 
   * @throws ApiException if fails to make API call
   */
  public void init() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/schema-services/schemas/actions/init".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuthScheme" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
