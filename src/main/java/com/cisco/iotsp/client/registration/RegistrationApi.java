package com.cisco.iotsp.client.registration;

import com.cisco.iotsp.client.registration.ApiException;
import com.cisco.iotsp.client.registration.ApiClient;
import com.cisco.iotsp.client.registration.Configuration;
import com.cisco.iotsp.client.registration.Pair;

import javax.ws.rs.core.GenericType;

import com.cisco.iotsp.client.registration.model.RegistrationResponse;
import com.cisco.iotsp.client.registration.model.RegistrationRequest;
import com.cisco.iotsp.client.registration.model.IoTExceptionModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:35.034-07:00")
public class RegistrationApi {
  private ApiClient apiClient;

  public RegistrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RegistrationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Register a thing
   * 
   * @param registrationRequest register thing (required)
   * @return RegistrationResponse
   * @throws ApiException if fails to make API call
   */
  public RegistrationResponse registerThing(RegistrationRequest registrationRequest) throws ApiException {
    Object localVarPostBody = registrationRequest;
    
    // verify the required parameter 'registrationRequest' is set
    if (registrationRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'registrationRequest' when calling registerThing");
    }
    
    // create path and map variables
    String localVarPath = "/v1/thing-services/things/actions/register".replaceAll("\\{format\\}","json");

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

    GenericType<RegistrationResponse> localVarReturnType = new GenericType<RegistrationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
