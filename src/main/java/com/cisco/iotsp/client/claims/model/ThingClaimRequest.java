//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.claims.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.claims.model.ThingDescriptor;
import com.cisco.iotsp.client.claims.model.UniqueIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Thing Claim
 */
@ApiModel(description = "Thing Claim")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:36.313-07:00")
public class ThingClaimRequest   {
  
  private String uid = null;
  private String make = null;
  private String model = null;
  private UniqueIdentifier uniqueIdentifiers = null;
  private ThingDescriptor thingDetails = null;
  private List<String> tags = new ArrayList<String>();

  
  /**
   **/
  public ThingClaimRequest uid(String uid) {
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
  public ThingClaimRequest make(String make) {
    this.make = make;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("make")
  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }


  /**
   **/
  public ThingClaimRequest model(String model) {
    this.model = model;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }


  /**
   **/
  public ThingClaimRequest uniqueIdentifiers(UniqueIdentifier uniqueIdentifiers) {
    this.uniqueIdentifiers = uniqueIdentifiers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("uniqueIdentifiers")
  public UniqueIdentifier getUniqueIdentifiers() {
    return uniqueIdentifiers;
  }
  public void setUniqueIdentifiers(UniqueIdentifier uniqueIdentifiers) {
    this.uniqueIdentifiers = uniqueIdentifiers;
  }


  /**
   **/
  public ThingClaimRequest thingDetails(ThingDescriptor thingDetails) {
    this.thingDetails = thingDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thingDetails")
  public ThingDescriptor getThingDetails() {
    return thingDetails;
  }
  public void setThingDetails(ThingDescriptor thingDetails) {
    this.thingDetails = thingDetails;
  }


  /**
   **/
  public ThingClaimRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThingClaimRequest thingClaimRequest = (ThingClaimRequest) o;
    return Objects.equals(this.uid, thingClaimRequest.uid) &&
        Objects.equals(this.make, thingClaimRequest.make) &&
        Objects.equals(this.model, thingClaimRequest.model) &&
        Objects.equals(this.uniqueIdentifiers, thingClaimRequest.uniqueIdentifiers) &&
        Objects.equals(this.thingDetails, thingClaimRequest.thingDetails) &&
        Objects.equals(this.tags, thingClaimRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, make, model, uniqueIdentifiers, thingDetails, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingClaimRequest {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    uniqueIdentifiers: ").append(toIndentedString(uniqueIdentifiers)).append("\n");
    sb.append("    thingDetails: ").append(toIndentedString(thingDetails)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

