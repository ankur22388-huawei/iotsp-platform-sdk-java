package com.cisco.iotsp.client.presence;

import com.cisco.iotsp.client.presence.ApiException;
import com.cisco.iotsp.client.presence.ApiClient;
import com.cisco.iotsp.client.presence.Configuration;
import com.cisco.iotsp.client.presence.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.presence.model.PresenceView;
import com.cisco.iotsp.client.presence.model.IoTExceptionModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-29T16:35:05.563-07:00")
public class PresenceApi {
  private ApiClient apiClient;

  public PresenceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PresenceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * delete presence by thingUid
   * 
   * @param thingUid Uid of Thing (required)
   * @return PresenceView
   * @throws ApiException if fails to make API call
   */
  public PresenceView deletePresence(String thingUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'thingUid' is set
    if (thingUid == null) {
      throw new ApiException(400, "Missing the required parameter 'thingUid' when calling deletePresence");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/{thingUid}/presence".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "thingUid" + "\\}", apiClient.escapeString(thingUid.toString()));

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

    GenericType<PresenceView> localVarReturnType = new GenericType<PresenceView>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * get presence by thingUid
   * 
   * @param thingUid Uid of Thing (required)
   * @return PresenceView
   * @throws ApiException if fails to make API call
   */
  public PresenceView getPresence(String thingUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'thingUid' is set
    if (thingUid == null) {
      throw new ApiException(400, "Missing the required parameter 'thingUid' when calling getPresence");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/{thingUid}/presence".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "thingUid" + "\\}", apiClient.escapeString(thingUid.toString()));

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

    GenericType<PresenceView> localVarReturnType = new GenericType<PresenceView>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * update keepAlive timestamp of thing
   * 
   * @param thingUid Uid of Thing (required)
   * @param keepAliveTs the keepAlive timestamp to update (required)
   * @return PresenceView
   * @throws ApiException if fails to make API call
   */
  public PresenceView updateKeepAliveTimestamp(String thingUid, Long keepAliveTs) throws ApiException {
    Object localVarPostBody = keepAliveTs;
    
    // verify the required parameter 'thingUid' is set
    if (thingUid == null) {
      throw new ApiException(400, "Missing the required parameter 'thingUid' when calling updateKeepAliveTimestamp");
    }
    
    // verify the required parameter 'keepAliveTs' is set
    if (keepAliveTs == null) {
      throw new ApiException(400, "Missing the required parameter 'keepAliveTs' when calling updateKeepAliveTimestamp");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/{thingUid}/presence/actions/keepAlive".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "thingUid" + "\\}", apiClient.escapeString(thingUid.toString()));

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

    GenericType<PresenceView> localVarReturnType = new GenericType<PresenceView>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
