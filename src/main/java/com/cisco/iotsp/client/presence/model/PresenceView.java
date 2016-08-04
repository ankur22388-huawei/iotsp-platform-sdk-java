package com.cisco.iotsp.client.presence.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * PresenceView
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-29T16:35:05.563-07:00")
public class PresenceView   {
  
  private String thingUid = null;
  private Long keepAliveReceiveTs = null;
  private Long observationReceiveTs = null;

  
  /**
   **/
  public PresenceView thingUid(String thingUid) {
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
  public PresenceView keepAliveReceiveTs(Long keepAliveReceiveTs) {
    this.keepAliveReceiveTs = keepAliveReceiveTs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("keepAliveReceiveTs")
  public Long getKeepAliveReceiveTs() {
    return keepAliveReceiveTs;
  }
  public void setKeepAliveReceiveTs(Long keepAliveReceiveTs) {
    this.keepAliveReceiveTs = keepAliveReceiveTs;
  }


  /**
   **/
  public PresenceView observationReceiveTs(Long observationReceiveTs) {
    this.observationReceiveTs = observationReceiveTs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("observationReceiveTs")
  public Long getObservationReceiveTs() {
    return observationReceiveTs;
  }
  public void setObservationReceiveTs(Long observationReceiveTs) {
    this.observationReceiveTs = observationReceiveTs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresenceView presenceView = (PresenceView) o;
    return Objects.equals(this.thingUid, presenceView.thingUid) &&
        Objects.equals(this.keepAliveReceiveTs, presenceView.keepAliveReceiveTs) &&
        Objects.equals(this.observationReceiveTs, presenceView.observationReceiveTs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thingUid, keepAliveReceiveTs, observationReceiveTs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenceView {\n");
    
    sb.append("    thingUid: ").append(toIndentedString(thingUid)).append("\n");
    sb.append("    keepAliveReceiveTs: ").append(toIndentedString(keepAliveReceiveTs)).append("\n");
    sb.append("    observationReceiveTs: ").append(toIndentedString(observationReceiveTs)).append("\n");
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

