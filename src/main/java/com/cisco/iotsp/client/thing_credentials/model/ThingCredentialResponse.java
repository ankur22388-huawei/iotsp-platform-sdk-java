package com.cisco.iotsp.client.thing_credentials.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.thing_credentials.model.Secret;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ThingCredentialResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-21T16:34:05.634-07:00")
public class ThingCredentialResponse   {
  
  private String uid = null;
  private String thingUid = null;
  private String credentialType = null;
  private Secret credential = null;

  
  /**
   **/
  public ThingCredentialResponse uid(String uid) {
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
  public ThingCredentialResponse thingUid(String thingUid) {
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
  public ThingCredentialResponse credentialType(String credentialType) {
    this.credentialType = credentialType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("credentialType")
  public String getCredentialType() {
    return credentialType;
  }
  public void setCredentialType(String credentialType) {
    this.credentialType = credentialType;
  }


  /**
   **/
  public ThingCredentialResponse credential(Secret credential) {
    this.credential = credential;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("credential")
  public Secret getCredential() {
    return credential;
  }
  public void setCredential(Secret credential) {
    this.credential = credential;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThingCredentialResponse thingCredentialResponse = (ThingCredentialResponse) o;
    return Objects.equals(this.uid, thingCredentialResponse.uid) &&
        Objects.equals(this.thingUid, thingCredentialResponse.thingUid) &&
        Objects.equals(this.credentialType, thingCredentialResponse.credentialType) &&
        Objects.equals(this.credential, thingCredentialResponse.credential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, thingUid, credentialType, credential);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingCredentialResponse {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    thingUid: ").append(toIndentedString(thingUid)).append("\n");
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
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

