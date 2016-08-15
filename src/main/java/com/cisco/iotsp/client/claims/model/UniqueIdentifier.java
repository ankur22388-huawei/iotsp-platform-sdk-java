//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.claims.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * UniqueIdentifier
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:36.313-07:00")
public class UniqueIdentifier   {
  
  private String macAddress = null;
  private String serialNumber = null;
  private String manufacturingId = null;

  
  /**
   **/
  public UniqueIdentifier macAddress(String macAddress) {
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
  public UniqueIdentifier serialNumber(String serialNumber) {
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


  /**
   **/
  public UniqueIdentifier manufacturingId(String manufacturingId) {
    this.manufacturingId = manufacturingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("manufacturingId")
  public String getManufacturingId() {
    return manufacturingId;
  }
  public void setManufacturingId(String manufacturingId) {
    this.manufacturingId = manufacturingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniqueIdentifier uniqueIdentifier = (UniqueIdentifier) o;
    return Objects.equals(this.macAddress, uniqueIdentifier.macAddress) &&
        Objects.equals(this.serialNumber, uniqueIdentifier.serialNumber) &&
        Objects.equals(this.manufacturingId, uniqueIdentifier.manufacturingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(macAddress, serialNumber, manufacturingId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniqueIdentifier {\n");
    
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    manufacturingId: ").append(toIndentedString(manufacturingId)).append("\n");
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

