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
 * ThingClaim
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:36.313-07:00")
public class ThingClaim   {
  
  private String uid = null;
  private String createdOn = null;
  private String make = null;
  private String model = null;
  private UniqueIdentifier uniqueIdentifiers = null;
  private Boolean claimed = false;
  private ThingClaimedDetail claimedDetails = null;
  private ThingDescriptor thingDetails = null;
  private List<String> tags = new ArrayList<String>();

  
  /**
   **/
  public ThingClaim uid(String uid) {
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
  public ThingClaim createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdOn")
  public String getCreatedOn() {
    return createdOn;
  }
  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }


  /**
   **/
  public ThingClaim make(String make) {
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
  public ThingClaim model(String model) {
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
  public ThingClaim uniqueIdentifiers(UniqueIdentifier uniqueIdentifiers) {
    this.uniqueIdentifiers = uniqueIdentifiers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uniqueIdentifiers")
  public UniqueIdentifier getUniqueIdentifiers() {
    return uniqueIdentifiers;
  }
  public void setUniqueIdentifiers(UniqueIdentifier uniqueIdentifiers) {
    this.uniqueIdentifiers = uniqueIdentifiers;
  }


  /**
   **/
  public ThingClaim claimed(Boolean claimed) {
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
  public ThingClaim claimedDetails(ThingClaimedDetail claimedDetails) {
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
  public ThingClaim thingDetails(ThingDescriptor thingDetails) {
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
  public ThingClaim tags(List<String> tags) {
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
    ThingClaim thingClaim = (ThingClaim) o;
    return Objects.equals(this.uid, thingClaim.uid) &&
        Objects.equals(this.createdOn, thingClaim.createdOn) &&
        Objects.equals(this.make, thingClaim.make) &&
        Objects.equals(this.model, thingClaim.model) &&
        Objects.equals(this.uniqueIdentifiers, thingClaim.uniqueIdentifiers) &&
        Objects.equals(this.claimed, thingClaim.claimed) &&
        Objects.equals(this.claimedDetails, thingClaim.claimedDetails) &&
        Objects.equals(this.thingDetails, thingClaim.thingDetails) &&
        Objects.equals(this.tags, thingClaim.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, createdOn, make, model, uniqueIdentifiers, claimed, claimedDetails, thingDetails, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingClaim {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

