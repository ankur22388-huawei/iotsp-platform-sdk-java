//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.claims.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.claims.model.ThingClaimedDetail;
import com.cisco.iotsp.client.claims.model.ThingDescriptor;
import com.cisco.iotsp.client.claims.model.UniqueIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Thing Claim Update Request
 */
@ApiModel(description = "Thing Claim Update Request")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:36.313-07:00")
public class ThingClaimUpdateRequest   {
  
  private String make = null;
  private String model = null;
  private UniqueIdentifier uniqueIdentifiers = null;
  private Boolean claimed = false;
  private ThingClaimedDetail claimedDetails = null;
  private ThingDescriptor thingDetails = null;
  private List<String> tags = new ArrayList<String>();

  
  /**
   **/
  public ThingClaimUpdateRequest make(String make) {
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
  public ThingClaimUpdateRequest model(String model) {
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
  public ThingClaimUpdateRequest uniqueIdentifiers(UniqueIdentifier uniqueIdentifiers) {
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
  public ThingClaimUpdateRequest claimed(Boolean claimed) {
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
  public ThingClaimUpdateRequest claimedDetails(ThingClaimedDetail claimedDetails) {
    this.claimedDetails = claimedDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("claimedDetails")
  public ThingClaimedDetail getClaimedDetails() {
    return claimedDetails;
  }
  public void setClaimedDetails(ThingClaimedDetail claimedDetails) {
    this.claimedDetails = claimedDetails;
  }


  /**
   **/
  public ThingClaimUpdateRequest thingDetails(ThingDescriptor thingDetails) {
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
  public ThingClaimUpdateRequest tags(List<String> tags) {
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
    ThingClaimUpdateRequest thingClaimUpdateRequest = (ThingClaimUpdateRequest) o;
    return Objects.equals(this.make, thingClaimUpdateRequest.make) &&
        Objects.equals(this.model, thingClaimUpdateRequest.model) &&
        Objects.equals(this.uniqueIdentifiers, thingClaimUpdateRequest.uniqueIdentifiers) &&
        Objects.equals(this.claimed, thingClaimUpdateRequest.claimed) &&
        Objects.equals(this.claimedDetails, thingClaimUpdateRequest.claimedDetails) &&
        Objects.equals(this.thingDetails, thingClaimUpdateRequest.thingDetails) &&
        Objects.equals(this.tags, thingClaimUpdateRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(make, model, uniqueIdentifiers, claimed, claimedDetails, thingDetails, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingClaimUpdateRequest {\n");
    
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    uniqueIdentifiers: ").append(toIndentedString(uniqueIdentifiers)).append("\n");
    sb.append("    claimed: ").append(toIndentedString(claimed)).append("\n");
    sb.append("    claimedDetails: ").append(toIndentedString(claimedDetails)).append("\n");
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

