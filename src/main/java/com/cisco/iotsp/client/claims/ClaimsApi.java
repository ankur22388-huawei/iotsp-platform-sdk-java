//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.claims;

import com.cisco.iotsp.client.claims.ApiException;
import com.cisco.iotsp.client.claims.ApiClient;
import com.cisco.iotsp.client.claims.Configuration;
import com.cisco.iotsp.client.claims.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.claims.model.ThingClaimRequest;
import com.cisco.iotsp.client.claims.model.ThingClaim;
import com.cisco.iotsp.client.claims.model.IoTExceptionModel;
import com.cisco.iotsp.client.claims.model.PageThingClaim;
import com.cisco.iotsp.client.claims.model.ThingClaimFilter;
import com.cisco.iotsp.client.claims.model.ThingClaimUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:36.313-07:00")
public class ClaimsApi {
  private ApiClient apiClient;

  public ClaimsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ClaimsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create a claim.
   * 
   * @param claimCreateRequest claim to create (required)
   * @return ThingClaim
   * @throws ApiException if fails to make API call
   */
  public ThingClaim createClaim(ThingClaimRequest claimCreateRequest) throws ApiException {
    Object localVarPostBody = claimCreateRequest;
    
    // verify the required parameter 'claimCreateRequest' is set
    if (claimCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'claimCreateRequest' when calling createClaim");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/claims".replaceAll("\\{format\\}","json");

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

    GenericType<ThingClaim> localVarReturnType = new GenericType<ThingClaim>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete a claim.
   * 
   * @param claimUid Uid of claim (required)
   * @return ThingClaim
   * @throws ApiException if fails to make API call
   */
  public ThingClaim deleteClaim(String claimUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'claimUid' is set
    if (claimUid == null) {
      throw new ApiException(400, "Missing the required parameter 'claimUid' when calling deleteClaim");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/claims/{claimUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "claimUid" + "\\}", apiClient.escapeString(claimUid.toString()));

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

    GenericType<ThingClaim> localVarReturnType = new GenericType<ThingClaim>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a claim by claim uid.
   * 
   * @param claimUid Uid of claim (required)
   * @return ThingClaim
   * @throws ApiException if fails to make API call
   */
  public ThingClaim getClaim(String claimUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'claimUid' is set
    if (claimUid == null) {
      throw new ApiException(400, "Missing the required parameter 'claimUid' when calling getClaim");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/claims/{claimUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "claimUid" + "\\}", apiClient.escapeString(claimUid.toString()));

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

    GenericType<ThingClaim> localVarReturnType = new GenericType<ThingClaim>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get claims using query string parameters.
   * 
   * @param key key to search on (optional)
   * @param value value to search on (optional)
   * @param sortKey sort by a key (optional)
   * @param sortOrder sort in ascending or descending order (optional)
   * @param limit maximum number of thing claims to return (optional, default to 50)
   * @param offset starting index of thing claims in return payload (optional, default to 0)
   * @return PageThingClaim
   * @throws ApiException if fails to make API call
   */
  public PageThingClaim getClaims(String key, String value, String sortKey, String sortOrder, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/claims".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "value", value));
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

    GenericType<PageThingClaim> localVarReturnType = new GenericType<PageThingClaim>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a page of thing claims by filter
   * 
   * @param filter The filter criteria on which to return paginated thing claims (required)
   * @return PageThingClaim
   * @throws ApiException if fails to make API call
   */
  public PageThingClaim getClaimsByFilter(ThingClaimFilter filter) throws ApiException {
    Object localVarPostBody = filter;
    
    // verify the required parameter 'filter' is set
    if (filter == null) {
      throw new ApiException(400, "Missing the required parameter 'filter' when calling getClaimsByFilter");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/claims/actions/getPageByFilter".replaceAll("\\{format\\}","json");

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

    GenericType<PageThingClaim> localVarReturnType = new GenericType<PageThingClaim>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update a claim.
   * 
   * @param claimUid Uid of claim (required)
   * @param claimUpdateRequest Updated claim object (required)
   * @return ThingClaim
   * @throws ApiException if fails to make API call
   */
  public ThingClaim updateClaim(String claimUid, ThingClaimUpdateRequest claimUpdateRequest) throws ApiException {
    Object localVarPostBody = claimUpdateRequest;
    
    // verify the required parameter 'claimUid' is set
    if (claimUid == null) {
      throw new ApiException(400, "Missing the required parameter 'claimUid' when calling updateClaim");
    }
    
    // verify the required parameter 'claimUpdateRequest' is set
    if (claimUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'claimUpdateRequest' when calling updateClaim");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/claims/{claimUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "claimUid" + "\\}", apiClient.escapeString(claimUid.toString()));

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

    GenericType<ThingClaim> localVarReturnType = new GenericType<ThingClaim>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
