package com.cisco.iotsp.client.users;

import com.cisco.iotsp.client.users.ApiException;
import com.cisco.iotsp.client.users.ApiClient;
import com.cisco.iotsp.client.users.Configuration;
import com.cisco.iotsp.client.users.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.users.model.UserPolicyCreateObject;
import com.cisco.iotsp.client.users.model.UserPolicy;
import com.cisco.iotsp.client.users.model.IoTExceptionModel;
import com.cisco.iotsp.client.users.model.PageUserPolicy;
import com.cisco.iotsp.client.users.model.UserPolicyUpdateObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:36.534-07:00")
public class UserPoliciesApi {
  private ApiClient apiClient;

  public UserPoliciesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserPoliciesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create new user policy
   * 
   * @param userPolicyCreateRequest The user policy to be created (required)
   * @return UserPolicy
   * @throws ApiException if fails to make API call
   */
  public UserPolicy createUserPolicy(UserPolicyCreateObject userPolicyCreateRequest) throws ApiException {
    Object localVarPostBody = userPolicyCreateRequest;
    
    // verify the required parameter 'userPolicyCreateRequest' is set
    if (userPolicyCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'userPolicyCreateRequest' when calling createUserPolicy");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/policies".replaceAll("\\{format\\}","json");

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

    GenericType<UserPolicy> localVarReturnType = new GenericType<UserPolicy>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete user policy by userPolicyUid
   * 
   * @param userPolicyUid Uid of user policy (required)
   * @return UserPolicy
   * @throws ApiException if fails to make API call
   */
  public UserPolicy deleteUserPolicy(String userPolicyUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userPolicyUid' is set
    if (userPolicyUid == null) {
      throw new ApiException(400, "Missing the required parameter 'userPolicyUid' when calling deleteUserPolicy");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/policies/{userPolicyUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userPolicyUid" + "\\}", apiClient.escapeString(userPolicyUid.toString()));

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

    GenericType<UserPolicy> localVarReturnType = new GenericType<UserPolicy>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a page of user policies
   * 
   * @param crn crn value of user policy.  (optional)
   * @param sortKey sort by a key in userPolicy. Nested fields can be . delimited (optional)
   * @param sortOrder sort in ascending or descending order (optional)
   * @param limit maximum number of user policies to return (optional, default to 50)
   * @param offset starting index of user policies in return payload (optional, default to 0)
   * @return PageUserPolicy
   * @throws ApiException if fails to make API call
   */
  public PageUserPolicy getUserPolicies(String crn, String sortKey, String sortOrder, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/user-services/policies".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "crn", crn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortKey", sortKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortOrder", sortOrder));
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

    GenericType<PageUserPolicy> localVarReturnType = new GenericType<PageUserPolicy>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user policy by userPolicyUid
   * 
   * @param userPolicyUid Uid of user policy (required)
   * @return UserPolicy
   * @throws ApiException if fails to make API call
   */
  public UserPolicy getUserPolicy(String userPolicyUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userPolicyUid' is set
    if (userPolicyUid == null) {
      throw new ApiException(400, "Missing the required parameter 'userPolicyUid' when calling getUserPolicy");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/policies/{userPolicyUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userPolicyUid" + "\\}", apiClient.escapeString(userPolicyUid.toString()));

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

    GenericType<UserPolicy> localVarReturnType = new GenericType<UserPolicy>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update user policy by userPolicyUid
   * 
   * @param userPolicyUid Uid of user policy (required)
   * @param userPolicyUpdateRequest The user policy to be updated (required)
   * @return UserPolicy
   * @throws ApiException if fails to make API call
   */
  public UserPolicy updateUserPolicy(String userPolicyUid, UserPolicyUpdateObject userPolicyUpdateRequest) throws ApiException {
    Object localVarPostBody = userPolicyUpdateRequest;
    
    // verify the required parameter 'userPolicyUid' is set
    if (userPolicyUid == null) {
      throw new ApiException(400, "Missing the required parameter 'userPolicyUid' when calling updateUserPolicy");
    }
    
    // verify the required parameter 'userPolicyUpdateRequest' is set
    if (userPolicyUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'userPolicyUpdateRequest' when calling updateUserPolicy");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/policies/{userPolicyUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userPolicyUid" + "\\}", apiClient.escapeString(userPolicyUid.toString()));

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

    GenericType<UserPolicy> localVarReturnType = new GenericType<UserPolicy>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
