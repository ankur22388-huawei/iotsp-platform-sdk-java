//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.accounts;

import com.cisco.iotsp.client.accounts.ApiException;
import com.cisco.iotsp.client.accounts.ApiClient;
import com.cisco.iotsp.client.accounts.Configuration;
import com.cisco.iotsp.client.accounts.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.accounts.model.WhitelistedEntry;
import com.cisco.iotsp.client.accounts.model.IoTExceptionModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:12.363-07:00")
public class AccountWhitelistApi {
  private ApiClient apiClient;

  public AccountWhitelistApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountWhitelistApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Retrieves an entry from the whitelist.
   * 
   * @param emailAddress The email address of the entry to be retrieved from the whitelist (required)
   * @return WhitelistedEntry
   * @throws ApiException if fails to make API call
   */
  public WhitelistedEntry getEntryFromWhitelist(String emailAddress) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'emailAddress' is set
    if (emailAddress == null) {
      throw new ApiException(400, "Missing the required parameter 'emailAddress' when calling getEntryFromWhitelist");
    }
    
    // create path and map variables
    String localVarPath = "/v1/user-services/accounts/whitelist/{emailAddress}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "emailAddress" + "\\}", apiClient.escapeString(emailAddress.toString()));

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

    GenericType<WhitelistedEntry> localVarReturnType = new GenericType<WhitelistedEntry>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
