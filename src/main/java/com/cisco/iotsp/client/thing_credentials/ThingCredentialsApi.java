//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.thing_credentials;

import com.cisco.iotsp.client.thing_credentials.ApiException;
import com.cisco.iotsp.client.thing_credentials.ApiClient;
import com.cisco.iotsp.client.thing_credentials.Configuration;
import com.cisco.iotsp.client.thing_credentials.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.thing_credentials.model.Secret;
import com.cisco.iotsp.client.thing_credentials.model.ThingCredentialResponse;
import com.cisco.iotsp.client.thing_credentials.model.IoTExceptionModel;
import com.cisco.iotsp.client.thing_credentials.model.ThingBaseCredential;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-21T16:34:05.634-07:00")
public class ThingCredentialsApi {
  private ApiClient apiClient;

  public ThingCredentialsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ThingCredentialsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Authenticates credential with credential object.
   * 
   * @param credentialRequest authenticate credentials (required)
   * @return ThingCredentialResponse
   * @throws ApiException if fails to make API call
   */
  public ThingCredentialResponse authenticateCredential(Secret credentialRequest) throws ApiException {
    Object localVarPostBody = credentialRequest;
    
    // verify the required parameter 'credentialRequest' is set
    if (credentialRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialRequest' when calling authenticateCredential");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/credentials/actions/authenticate".replaceAll("\\{format\\}","json");

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

    GenericType<ThingCredentialResponse> localVarReturnType = new GenericType<ThingCredentialResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates or imports credential for a thing.
   * 
   * @param thingCredentialRequest credential to create (required)
   * @return ThingCredentialResponse
   * @throws ApiException if fails to make API call
   */
  public ThingCredentialResponse createCredential(ThingBaseCredential thingCredentialRequest) throws ApiException {
    Object localVarPostBody = thingCredentialRequest;
    
    // verify the required parameter 'thingCredentialRequest' is set
    if (thingCredentialRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'thingCredentialRequest' when calling createCredential");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/credentials".replaceAll("\\{format\\}","json");

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

    GenericType<ThingCredentialResponse> localVarReturnType = new GenericType<ThingCredentialResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete credential of thing.
   * 
   * @param credentialUid Uid of credential (required)
   * @return ThingCredentialResponse
   * @throws ApiException if fails to make API call
   */
  public ThingCredentialResponse deleteCredential(String credentialUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credentialUid' is set
    if (credentialUid == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialUid' when calling deleteCredential");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/credentials/{credentialUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "credentialUid" + "\\}", apiClient.escapeString(credentialUid.toString()));

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

    GenericType<ThingCredentialResponse> localVarReturnType = new GenericType<ThingCredentialResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Resets credential with generated or imported credential.
   * 
   * @param thingCredentialRequest reset credential (required)
   * @return ThingCredentialResponse
   * @throws ApiException if fails to make API call
   */
  public ThingCredentialResponse resetCredential(ThingBaseCredential thingCredentialRequest) throws ApiException {
    Object localVarPostBody = thingCredentialRequest;
    
    // verify the required parameter 'thingCredentialRequest' is set
    if (thingCredentialRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'thingCredentialRequest' when calling resetCredential");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/credentials/actions/reset".replaceAll("\\{format\\}","json");

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

    GenericType<ThingCredentialResponse> localVarReturnType = new GenericType<ThingCredentialResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
