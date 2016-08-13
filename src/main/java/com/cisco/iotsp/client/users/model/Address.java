//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.users.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * A model representing postal address of the user.
 */
@ApiModel(description = "A model representing postal address of the user.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:36.534-07:00")
public class Address   {
  
  private String addressLine1 = null;
  private String addressLine2 = null;
  private Integer zip5 = null;
  private Integer zip4 = null;
  private String city = null;
  private String state = null;
  private String country = null;

  
  /**
   **/
  public Address addressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressLine1")
  public String getAddressLine1() {
    return addressLine1;
  }
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  /**
   **/
  public Address addressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressLine2")
  public String getAddressLine2() {
    return addressLine2;
  }
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  /**
   **/
  public Address zip5(Integer zip5) {
    this.zip5 = zip5;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("zip5")
  public Integer getZip5() {
    return zip5;
  }
  public void setZip5(Integer zip5) {
    this.zip5 = zip5;
  }


  /**
   **/
  public Address zip4(Integer zip4) {
    this.zip4 = zip4;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("zip4")
  public Integer getZip4() {
    return zip4;
  }
  public void setZip4(Integer zip4) {
    this.zip4 = zip4;
  }


  /**
   **/
  public Address city(String city) {
    this.city = city;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("city")
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = city;
  }


  /**
   **/
  public Address state(String state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }


  /**
   **/
  public Address country(String country) {
    this.country = country;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("country")
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressLine1, address.addressLine1) &&
        Objects.equals(this.addressLine2, address.addressLine2) &&
        Objects.equals(this.zip5, address.zip5) &&
        Objects.equals(this.zip4, address.zip4) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.country, address.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine1, addressLine2, zip5, zip4, city, state, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    zip5: ").append(toIndentedString(zip5)).append("\n");
    sb.append("    zip4: ").append(toIndentedString(zip4)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

