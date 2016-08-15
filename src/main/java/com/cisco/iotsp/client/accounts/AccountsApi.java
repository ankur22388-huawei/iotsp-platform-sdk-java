//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.accounts;

import com.cisco.iotsp.client.accounts.ApiException;
import com.cisco.iotsp.client.accounts.ApiClient;
import com.cisco.iotsp.client.accounts.Configuration;
import com.cisco.iotsp.client.accounts.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.accounts.model.Account;
import com.cisco.iotsp.client.accounts.model.AccountCreateObject;
import com.cisco.iotsp.client.accounts.model.IoTExceptionModel;
import com.cisco.iotsp.client.accounts.model.PageAccount;
import com.cisco.iotsp.client.accounts.model.AccountUpdateObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:12.363-07:00")
public class AccountsApi {
  private ApiClient apiClient;

  public AccountsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Creates a new account
   * 
   * @param accountCreateRequest The account to be created (required)
   * @return Account
   * @throws ApiException if fails to make API call
   */
  public Account createAccount(AccountCreateObject accountCreateRequest) throws ApiException {
    Object localVarPostBody = accountCreateRequest;
    
    // verify the required parameter 'accountCreateRequest' is set
    if (accountCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'accountCreateRequest' when calling createAccount");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/accounts".replaceAll("\\{format\\}","json");

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

    GenericType<Account> localVarReturnType = new GenericType<Account>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete account by accountUid
   * 
   * @param accountUid Uid of account (required)
   * @return Account
   * @throws ApiException if fails to make API call
   */
  public Account deleteAccount(String accountUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountUid' is set
    if (accountUid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountUid' when calling deleteAccount");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/accounts/{accountUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountUid" + "\\}", apiClient.escapeString(accountUid.toString()));

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

    GenericType<Account> localVarReturnType = new GenericType<Account>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get account by accountUid
   * 
   * @param accountUid Uid of account (required)
   * @return Account
   * @throws ApiException if fails to make API call
   */
  public Account getAccount(String accountUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'accountUid' is set
    if (accountUid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountUid' when calling getAccount");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/accounts/{accountUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountUid" + "\\}", apiClient.escapeString(accountUid.toString()));

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

    GenericType<Account> localVarReturnType = new GenericType<Account>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a page of accounts
   * 
   * @param alias search by alias of the account (optional)
   * @param sortKey sort by a key in account. Nested fields can be . delimited (optional)
   * @param sortOrder sort in ascending or descending order (optional)
   * @param limit start index of page (optional, default to 50)
   * @param offset size of page (optional, default to 0)
   * @return PageAccount
   * @throws ApiException if fails to make API call
   */
  public PageAccount getAccounts(String alias, String sortKey, String sortOrder, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/user-services/accounts".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "alias", alias));
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

    GenericType<PageAccount> localVarReturnType = new GenericType<PageAccount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update account
   * 
   * @param accountUid Uid of account (required)
   * @param accountUpdateRequest The account data to be updated (required)
   * @return Account
   * @throws ApiException if fails to make API call
   */
  public Account updateAccount(String accountUid, AccountUpdateObject accountUpdateRequest) throws ApiException {
    Object localVarPostBody = accountUpdateRequest;
    
    // verify the required parameter 'accountUid' is set
    if (accountUid == null) {
      throw new ApiException(400, "Missing the required parameter 'accountUid' when calling updateAccount");
    }
    
    // verify the required parameter 'accountUpdateRequest' is set
    if (accountUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'accountUpdateRequest' when calling updateAccount");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/accounts/{accountUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "accountUid" + "\\}", apiClient.escapeString(accountUid.toString()));

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

    GenericType<Account> localVarReturnType = new GenericType<Account>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
