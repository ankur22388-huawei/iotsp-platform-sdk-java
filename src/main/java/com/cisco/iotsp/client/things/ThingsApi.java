package com.cisco.iotsp.client.things;

import com.cisco.iotsp.client.things.ApiException;
import com.cisco.iotsp.client.things.ApiClient;
import com.cisco.iotsp.client.things.Configuration;
import com.cisco.iotsp.client.things.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.things.model.ThingCreateRequest;
import com.cisco.iotsp.client.things.model.Thing;
import com.cisco.iotsp.client.things.model.IoTExceptionModel;
import com.cisco.iotsp.client.things.model.ScrollPageThing;
import com.cisco.iotsp.client.things.model.ScrollId;
import com.cisco.iotsp.client.things.model.ThingScrollFilter;
import com.cisco.iotsp.client.things.model.PageThing;
import com.cisco.iotsp.client.things.model.ThingFilter;
import com.cisco.iotsp.client.things.model.ThingUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:33.656-07:00")
public class ThingsApi {
  private ApiClient apiClient;

  public ThingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ThingsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Create new thing
   * 
   * @param thingCreateRequest The thing to be created (required)
   * @return Thing
   * @throws ApiException if fails to make API call
   */
  public Thing createThing(ThingCreateRequest thingCreateRequest) throws ApiException {
    Object localVarPostBody = thingCreateRequest;
    
    // verify the required parameter 'thingCreateRequest' is set
    if (thingCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'thingCreateRequest' when calling createThing");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/things".replaceAll("\\{format\\}","json");

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

    GenericType<Thing> localVarReturnType = new GenericType<Thing>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete thing by thingUid
   * 
   * @param thingUid Uid of thing (required)
   * @return Thing
   * @throws ApiException if fails to make API call
   */
  public Thing deleteThing(String thingUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'thingUid' is set
    if (thingUid == null) {
      throw new ApiException(400, "Missing the required parameter 'thingUid' when calling deleteThing");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/things/{thingUid}".replaceAll("\\{format\\}","json")
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

    GenericType<Thing> localVarReturnType = new GenericType<Thing>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get the next scroll page by scroll id
   * 
   * @param nextScrollId the next scrollId to retrieve the next page (required)
   * @return ScrollPageThing
   * @throws ApiException if fails to make API call
   */
  public ScrollPageThing getNextScrollPage(String nextScrollId) throws ApiException {
    Object localVarPostBody = nextScrollId;
    
    // verify the required parameter 'nextScrollId' is set
    if (nextScrollId == null) {
      throw new ApiException(400, "Missing the required parameter 'nextScrollId' when calling getNextScrollPage");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/things/actions/getNextScrollPage".replaceAll("\\{format\\}","json");

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

    GenericType<ScrollPageThing> localVarReturnType = new GenericType<ScrollPageThing>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a scroll id for things by filter
   * 
   * @param filter The filter criteria on which to return scroll Id (required)
   * @return ScrollId
   * @throws ApiException if fails to make API call
   */
  public ScrollId getScrollIdByFilter(ThingScrollFilter filter) throws ApiException {
    Object localVarPostBody = filter;
    
    // verify the required parameter 'filter' is set
    if (filter == null) {
      throw new ApiException(400, "Missing the required parameter 'filter' when calling getScrollIdByFilter");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/things/actions/getScrollIdByFilter".replaceAll("\\{format\\}","json");

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

    GenericType<ScrollId> localVarReturnType = new GenericType<ScrollId>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get thing by thingUid
   * 
   * @param thingUid Uid of thing (required)
   * @return Thing
   * @throws ApiException if fails to make API call
   */
  public Thing getThing(String thingUid) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'thingUid' is set
    if (thingUid == null) {
      throw new ApiException(400, "Missing the required parameter 'thingUid' when calling getThing");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/things/{thingUid}".replaceAll("\\{format\\}","json")
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

    GenericType<Thing> localVarReturnType = new GenericType<Thing>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a page of things by query params
   * 
   * @param key a field key in thing. Nested fields can be . delimited (optional)
   * @param value value for the key parameter. (optional)
   * @param sortKey sort by a key in thing. Nested fields can be . delimited (optional)
   * @param sortOrder sort in ascending or descending order (optional)
   * @param limit maximum number of things to return (optional, default to 50)
   * @param offset starting index of things in return payload (optional, default to 0)
   * @return PageThing
   * @throws ApiException if fails to make API call
   */
  public PageThing getThings(String key, String value, String sortKey, String sortOrder, Integer limit, Integer offset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/things".replaceAll("\\{format\\}","json");

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

    GenericType<PageThing> localVarReturnType = new GenericType<PageThing>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a page of things by filter
   * 
   * @param filter The filter criteria on which to return paginated things (required)
   * @return PageThing
   * @throws ApiException if fails to make API call
   */
  public PageThing getThingsByFilter(ThingFilter filter) throws ApiException {
    Object localVarPostBody = filter;
    
    // verify the required parameter 'filter' is set
    if (filter == null) {
      throw new ApiException(400, "Missing the required parameter 'filter' when calling getThingsByFilter");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/things/actions/getPageByFilter".replaceAll("\\{format\\}","json");

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

    GenericType<PageThing> localVarReturnType = new GenericType<PageThing>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update thing by thingUid and partial input
   * 
   * @param thingUid Uid of thing (required)
   * @param thingUpdateRequest The fields in the referenced thing to be merged to the persisted thing (required)
   * @return Thing
   * @throws ApiException if fails to make API call
   */
  public Thing mergeThing(String thingUid, ThingUpdateRequest thingUpdateRequest) throws ApiException {
    Object localVarPostBody = thingUpdateRequest;
    
    // verify the required parameter 'thingUid' is set
    if (thingUid == null) {
      throw new ApiException(400, "Missing the required parameter 'thingUid' when calling mergeThing");
    }
    
    // verify the required parameter 'thingUpdateRequest' is set
    if (thingUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'thingUpdateRequest' when calling mergeThing");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/things/{thingUid}".replaceAll("\\{format\\}","json")
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

    GenericType<Thing> localVarReturnType = new GenericType<Thing>() {};
    return apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update thing by thingUid
   * 
   * @param thingUid Uid of thing (required)
   * @param thingUpdateRequest The complete list of field and their values to be updated (required)
   * @return Thing
   * @throws ApiException if fails to make API call
   */
  public Thing updateThing(String thingUid, ThingUpdateRequest thingUpdateRequest) throws ApiException {
    Object localVarPostBody = thingUpdateRequest;
    
    // verify the required parameter 'thingUid' is set
    if (thingUid == null) {
      throw new ApiException(400, "Missing the required parameter 'thingUid' when calling updateThing");
    }
    
    // verify the required parameter 'thingUpdateRequest' is set
    if (thingUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'thingUpdateRequest' when calling updateThing");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/things/{thingUid}".replaceAll("\\{format\\}","json")
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

    GenericType<Thing> localVarReturnType = new GenericType<Thing>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
