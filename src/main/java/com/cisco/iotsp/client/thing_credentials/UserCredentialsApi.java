//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.thing_credentials;

import com.cisco.iotsp.client.thing_credentials.ApiException;
import com.cisco.iotsp.client.thing_credentials.ApiClient;
import com.cisco.iotsp.client.thing_credentials.Configuration;
import com.cisco.iotsp.client.thing_credentials.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.thing_credentials.model.Secret;
import com.cisco.iotsp.client.thing_credentials.model.UserCredentialResponse;
import com.cisco.iotsp.client.thing_credentials.model.IoTExceptionModel;
import com.cisco.iotsp.client.thing_credentials.model.UserBaseCredential;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-21T16:34:05.634-07:00")
public class UserCredentialsApi {
  private ApiClient apiClient;

  public UserCredentialsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserCredentialsApi(ApiClient apiClient) {
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
   * @param credential authenticate credentials (required)
   * @return UserCredentialResponse
   * @throws ApiException if fails to make API call
   */
  public UserCredentialResponse authenticateCredential(Secret credential) throws ApiException {
    Object localVarPostBody = credential;
    
    // verify the required parameter 'credential' is set
    if (credential == null) {
      throw new ApiException(400, "Missing the required parameter 'credential' when calling authenticateCredential");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/credentials/actions/authenticate".replaceAll("\\{format\\}","json");

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

    GenericType<UserCredentialResponse> localVarReturnType = new GenericType<UserCredentialResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Creates or imports credential for a user.
   * 
   * @param userCredentialRequest credential to create (required)
   * @return UserCredentialResponse
   * @throws ApiException if fails to make API call
   */
  public UserCredentialResponse createCredential(UserBaseCredential userCredentialRequest) throws ApiException {
    Object localVarPostBody = userCredentialRequest;
    
    // verify the required parameter 'userCredentialRequest' is set
    if (userCredentialRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'userCredentialRequest' when calling createCredential");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/credentials".replaceAll("\\{format\\}","json");

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

    GenericType<UserCredentialResponse> localVarReturnType = new GenericType<UserCredentialResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete credential of user.
   * 
   * @param credentialUid Uid of object (required)
   * @return UserCredentialResponse
   * @throws ApiException if fails to make API call
   */
  public UserCredentialResponse deleteCredential(String credentialUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'credentialUid' is set
    if (credentialUid == null) {
      throw new ApiException(400, "Missing the required parameter 'credentialUid' when calling deleteCredential");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/credentials/{credentialUid}".replaceAll("\\{format\\}","json")
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

    GenericType<UserCredentialResponse> localVarReturnType = new GenericType<UserCredentialResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Resets credential with generated or imported credential.
   * 
   * @param userCredentialRequest reset credential (required)
   * @return UserCredentialResponse
   * @throws ApiException if fails to make API call
   */
  public UserCredentialResponse resetCredential(UserBaseCredential userCredentialRequest) throws ApiException {
    Object localVarPostBody = userCredentialRequest;
    
    // verify the required parameter 'userCredentialRequest' is set
    if (userCredentialRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'userCredentialRequest' when calling resetCredential");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/credentials/actions/reset".replaceAll("\\{format\\}","json");

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

    GenericType<UserCredentialResponse> localVarReturnType = new GenericType<UserCredentialResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
