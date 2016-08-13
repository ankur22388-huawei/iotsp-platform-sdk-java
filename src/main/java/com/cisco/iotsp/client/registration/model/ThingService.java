//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.registration.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.registration.model.Secret;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * ThingService
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:35.034-07:00")
public class ThingService   {
  
  private Boolean claimed = false;
  private Boolean registered = false;
  private Map<String, String> request = new HashMap<String, String>();
  private Secret credentials = null;
  private String thingUid = null;

  
  /**
   **/
  public ThingService claimed(Boolean claimed) {
    this.claimed = claimed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("claimed")
  public Boolean getClaimed() {
    return claimed;
  }
  public void setClaimed(Boolean claimed) {
    this.claimed = claimed;
  }


  /**
   **/
  public ThingService registered(Boolean registered) {
    this.registered = registered;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("registered")
  public Boolean getRegistered() {
    return registered;
  }
  public void setRegistered(Boolean registered) {
    this.registered = registered;
  }


  /**
   **/
  public ThingService request(Map<String, String> request) {
    this.request = request;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("request")
  public Map<String, String> getRequest() {
    return request;
  }
  public void setRequest(Map<String, String> request) {
    this.request = request;
  }


  /**
   **/
  public ThingService credentials(Secret credentials) {
    this.credentials = credentials;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("credentials")
  public Secret getCredentials() {
    return credentials;
  }
  public void setCredentials(Secret credentials) {
    this.credentials = credentials;
  }


  /**
   **/
  public ThingService thingUid(String thingUid) {
    this.thingUid = thingUid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thingUid")
  public String getThingUid() {
    return thingUid;
  }
  public void setThingUid(String thingUid) {
    this.thingUid = thingUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThingService thingService = (ThingService) o;
    return Objects.equals(this.claimed, thingService.claimed) &&
        Objects.equals(this.registered, thingService.registered) &&
        Objects.equals(this.request, thingService.request) &&
        Objects.equals(this.credentials, thingService.credentials) &&
        Objects.equals(this.thingUid, thingService.thingUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimed, registered, request, credentials, thingUid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingService {\n");
    
    sb.append("    claimed: ").append(toIndentedString(claimed)).append("\n");
    sb.append("    registered: ").append(toIndentedString(registered)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    thingUid: ").append(toIndentedString(thingUid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

