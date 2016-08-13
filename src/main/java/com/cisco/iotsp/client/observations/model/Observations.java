//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.observations.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Observations
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T22:21:44.967-07:00")
public class Observations   {
  
  private String uid = null;
  private String deviceUid = null;
  private Long timestamp = null;
  private Map<String, Object> data = new HashMap<String, Object>();
  private Map<String, Object> info = new HashMap<String, Object>();

  
  /**
   **/
  public Observations uid(String uid) {
    this.uid = uid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }


  /**
   **/
  public Observations deviceUid(String deviceUid) {
    this.deviceUid = deviceUid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deviceUid")
  public String getDeviceUid() {
    return deviceUid;
  }
  public void setDeviceUid(String deviceUid) {
    this.deviceUid = deviceUid;
  }


  /**
   **/
  public Observations timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  /**
   **/
  public Observations data(Map<String, Object> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public Map<String, Object> getData() {
    return data;
  }
  public void setData(Map<String, Object> data) {
    this.data = data;
  }


  /**
   **/
  public Observations info(Map<String, Object> info) {
    this.info = info;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("info")
  public Map<String, Object> getInfo() {
    return info;
  }
  public void setInfo(Map<String, Object> info) {
    this.info = info;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Observations observations = (Observations) o;
    return Objects.equals(this.uid, observations.uid) &&
        Objects.equals(this.deviceUid, observations.deviceUid) &&
        Objects.equals(this.timestamp, observations.timestamp) &&
        Objects.equals(this.data, observations.data) &&
        Objects.equals(this.info, observations.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, deviceUid, timestamp, data, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Observations {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    deviceUid: ").append(toIndentedString(deviceUid)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

