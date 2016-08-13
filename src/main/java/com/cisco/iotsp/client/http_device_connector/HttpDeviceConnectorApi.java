//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.http_device_connector;

import com.cisco.iotsp.client.http_device_connector.ApiException;
import com.cisco.iotsp.client.http_device_connector.ApiClient;
import com.cisco.iotsp.client.http_device_connector.Configuration;
import com.cisco.iotsp.client.http_device_connector.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.http_device_connector.model.IoTExceptionModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-22T16:53:40.473-07:00")
public class HttpDeviceConnectorApi {
  private ApiClient apiClient;

  public HttpDeviceConnectorApi() {
    this(Configuration.getDefaultApiClient());
  }

  public HttpDeviceConnectorApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * post message into iotsp data pipeline
   * 
   * @param message message into iotsp data pipeline (required)
   * @param route route into iotsp data pipeline (optional)
   * @throws ApiException if fails to make API call
   */
  public void postMessage(byte[] message, String route) throws ApiException {
    Object localVarPostBody = message;
    
    // verify the required parameter 'message' is set
    if (message == null) {
      throw new ApiException(400, "Missing the required parameter 'message' when calling postMessage");
    }
    
    // create path and map variables
    String localVarPath = "/v1/observations/publish".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (route != null)
      localVarHeaderParams.put("route", apiClient.parameterToString(route));

    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json", "application/octet-stream"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "tokenAuthScheme" };


    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
