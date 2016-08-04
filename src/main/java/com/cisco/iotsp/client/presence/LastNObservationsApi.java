package com.cisco.iotsp.client.presence;

import com.cisco.iotsp.client.presence.ApiException;
import com.cisco.iotsp.client.presence.ApiClient;
import com.cisco.iotsp.client.presence.Configuration;
import com.cisco.iotsp.client.presence.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.presence.model.PageObservation;
import com.cisco.iotsp.client.presence.model.IoTExceptionModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-29T16:35:05.563-07:00")
public class LastNObservationsApi {
  private ApiClient apiClient;

  public LastNObservationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public LastNObservationsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get a page of last n observations by query params
   * 
   * @param thingUid value of thingUid (optional)
   * @param limit maximum number of observations to return (optional, default to 50)
   * @param offset starting index of observation in return payload (optional, default to 0)
   * @return PageObservation
   * @throws ApiException if fails to make API call
   */
  public PageObservation getLastObservations(String thingUid, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/last-observations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "thingUid", thingUid));
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

    GenericType<PageObservation> localVarReturnType = new GenericType<PageObservation>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
