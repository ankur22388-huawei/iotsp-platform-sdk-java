//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.observations;

import com.cisco.iotsp.client.observations.ApiException;
import com.cisco.iotsp.client.observations.ApiClient;
import com.cisco.iotsp.client.observations.Configuration;
import com.cisco.iotsp.client.observations.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.observations.model.Observations;
import com.cisco.iotsp.client.observations.model.PageObservations;
import com.cisco.iotsp.client.observations.model.IoTExceptionModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T22:21:44.967-07:00")
public class ObservationsApi {
  private ApiClient apiClient;

  public ObservationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ObservationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a observation
   * 
   * @param observationUid resource id (required)
   * @return Observations
   * @throws ApiException if fails to make API call
   */
  public Observations getObservation(String observationUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'observationUid' is set
    if (observationUid == null) {
      throw new ApiException(400, "Missing the required parameter 'observationUid' when calling getObservation");
    }
    
    // create path and map variables
    String localVarPath = "/v1/data-services/observations/{observationUid}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "observationUid" + "\\}", apiClient.escapeString(observationUid.toString()));

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

    GenericType<Observations> localVarReturnType = new GenericType<Observations>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get observations
   * 
   * @param query the query string to apply on elastic (optional)
   * @param limit maximum number of docs to return (optional, default to 50)
   * @param offset starting index of docs in return payload (optional, default to 0)
   * @return PageObservations
   * @throws ApiException if fails to make API call
   */
  public PageObservations getObservations(String query, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/data-services/observations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "query", query));
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

    GenericType<PageObservations> localVarReturnType = new GenericType<PageObservations>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
