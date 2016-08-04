package com.cisco.iotsp.client.users;

import com.cisco.iotsp.client.users.ApiException;
import com.cisco.iotsp.client.users.ApiClient;
import com.cisco.iotsp.client.users.Configuration;
import com.cisco.iotsp.client.users.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.users.model.User;
import com.cisco.iotsp.client.users.model.IoTExceptionModel;
import com.cisco.iotsp.client.users.model.UserCreateObject;
import com.cisco.iotsp.client.users.model.PageUser;
import com.cisco.iotsp.client.users.model.UserUpdateObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:36.534-07:00")
public class UsersApi {
  private ApiClient apiClient;

  public UsersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UsersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create new user
   * 
   * @param userCreateRequest The user to be created (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User createUser(UserCreateObject userCreateRequest) throws ApiException {
    Object localVarPostBody = userCreateRequest;
    
    // verify the required parameter 'userCreateRequest' is set
    if (userCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'userCreateRequest' when calling createUser");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/users".replaceAll("\\{format\\}","json");

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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete user by userUid
   * 
   * @param userUid Uid of user (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User deleteUser(String userUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userUid' is set
    if (userUid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUid' when calling deleteUser");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/users/{userUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userUid" + "\\}", apiClient.escapeString(userUid.toString()));

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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get user by userUid
   * 
   * @param userUid Uid of user (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User getUser(String userUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userUid' is set
    if (userUid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUid' when calling getUser");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/users/{userUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userUid" + "\\}", apiClient.escapeString(userUid.toString()));

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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a page of users by filter
   * 
   * @param emailAddress search by emailAddress of the user (optional)
   * @param sortKey sort by a key in user. Nested fields can be . delimited (optional)
   * @param sortOrder sort in ascending or descending order (optional)
   * @param limit maximum number of users to return (optional, default to 50)
   * @param offset starting index of users in return payload (optional, default to 0)
   * @return PageUser
   * @throws ApiException if fails to make API call
   */
  public PageUser getUsers(String emailAddress, String sortKey, String sortOrder, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/user-services/users".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "emailAddress", emailAddress));
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

    GenericType<PageUser> localVarReturnType = new GenericType<PageUser>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update user by userUid
   * 
   * @param userUid Uid of user (required)
   * @param userUpdateRequest The complete list of field and their values to be updated (required)
   * @return User
   * @throws ApiException if fails to make API call
   */
  public User updateUser(String userUid, UserUpdateObject userUpdateRequest) throws ApiException {
    Object localVarPostBody = userUpdateRequest;
    
    // verify the required parameter 'userUid' is set
    if (userUid == null) {
      throw new ApiException(400, "Missing the required parameter 'userUid' when calling updateUser");
    }
    
    // verify the required parameter 'userUpdateRequest' is set
    if (userUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'userUpdateRequest' when calling updateUser");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/users/{userUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "userUid" + "\\}", apiClient.escapeString(userUid.toString()));

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

    GenericType<User> localVarReturnType = new GenericType<User>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
