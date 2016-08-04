package com.cisco.iotsp.client.things.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ThingIdentifier
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:33.656-07:00")
public class ThingIdentifier   {
  
  private String macAddress = null;
  private String manufacturingId = null;
  private String serialNumber = null;

  
  /**
   **/
  public ThingIdentifier macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("macAddress")
  public String getMacAddress() {
    return macAddress;
  }
  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  /**
   **/
  public ThingIdentifier manufacturingId(String manufacturingId) {
    this.manufacturingId = manufacturingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("manufacturingId")
  public String getManufacturingId() {
    return manufacturingId;
  }
  public void setManufacturingId(String manufacturingId) {
    this.manufacturingId = manufacturingId;
  }


  /**
   **/
  public ThingIdentifier serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }
  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThingIdentifier thingIdentifier = (ThingIdentifier) o;
    return Objects.equals(this.macAddress, thingIdentifier.macAddress) &&
        Objects.equals(this.manufacturingId, thingIdentifier.manufacturingId) &&
        Objects.equals(this.serialNumber, thingIdentifier.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(macAddress, manufacturingId, serialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingIdentifier {\n");
    
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    manufacturingId: ").append(toIndentedString(manufacturingId)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

