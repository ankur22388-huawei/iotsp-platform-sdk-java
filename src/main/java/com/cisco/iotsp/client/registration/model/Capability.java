package com.cisco.iotsp.client.registration.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Capability
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-09T22:25:35.845-07:00")
public class Capability   {
  

  /**
   * Gets or Sets dataConnector
   */
  public enum DataConnectorEnum {
    MQTT("mqtt"),
    WAMP("wamp"),
    HTTP("http");

    private String value;

    DataConnectorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private DataConnectorEnum dataConnector = null;

  
  /**
   **/
  public Capability dataConnector(DataConnectorEnum dataConnector) {
    this.dataConnector = dataConnector;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataConnector")
  public DataConnectorEnum getDataConnector() {
    return dataConnector;
  }
  public void setDataConnector(DataConnectorEnum dataConnector) {
    this.dataConnector = dataConnector;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Capability capability = (Capability) o;
    return Objects.equals(this.dataConnector, capability.dataConnector);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataConnector);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Capability {\n");
    
    sb.append("    dataConnector: ").append(toIndentedString(dataConnector)).append("\n");
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

