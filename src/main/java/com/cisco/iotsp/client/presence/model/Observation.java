package com.cisco.iotsp.client.presence.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Observation
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-29T16:35:05.563-07:00")
public class Observation   {
  
  private Map<String, Object> header = new HashMap<String, Object>();
  private String payload = null;

  
  /**
   **/
  public Observation header(Map<String, Object> header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("header")
  public Map<String, Object> getHeader() {
    return header;
  }
  public void setHeader(Map<String, Object> header) {
    this.header = header;
  }


  /**
   **/
  public Observation payload(String payload) {
    this.payload = payload;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("payload")
  public String getPayload() {
    return payload;
  }
  public void setPayload(String payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Observation observation = (Observation) o;
    return Objects.equals(this.header, observation.header) &&
        Objects.equals(this.payload, observation.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Observation {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

