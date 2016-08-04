package com.cisco.iotsp.client.claims.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ThingClaimedDetail
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:36.313-07:00")
public class ThingClaimedDetail   {
  
  private String thingUid = null;
  private String claimedOn = null;

  
  /**
   **/
  public ThingClaimedDetail thingUid(String thingUid) {
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


  /**
   **/
  public ThingClaimedDetail claimedOn(String claimedOn) {
    this.claimedOn = claimedOn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("claimedOn")
  public String getClaimedOn() {
    return claimedOn;
  }
  public void setClaimedOn(String claimedOn) {
    this.claimedOn = claimedOn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThingClaimedDetail thingClaimedDetail = (ThingClaimedDetail) o;
    return Objects.equals(this.thingUid, thingClaimedDetail.thingUid) &&
        Objects.equals(this.claimedOn, thingClaimedDetail.claimedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thingUid, claimedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingClaimedDetail {\n");
    
    sb.append("    thingUid: ").append(toIndentedString(thingUid)).append("\n");
    sb.append("    claimedOn: ").append(toIndentedString(claimedOn)).append("\n");
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

