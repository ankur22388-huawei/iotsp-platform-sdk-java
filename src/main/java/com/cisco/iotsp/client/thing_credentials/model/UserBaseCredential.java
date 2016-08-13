//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.thing_credentials.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.thing_credentials.model.Secret;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * UserBaseCredential
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-21T16:34:05.634-07:00")
public class UserBaseCredential   {
  
  private String uid = null;

  /**
   * Gets or Sets credentialType
   */
  public enum CredentialTypeEnum {
    SECRET("secret");

    private String value;

    CredentialTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CredentialTypeEnum credentialType = null;
  private String userUid = null;
  private Secret credential = null;

  
  /**
   **/
  public UserBaseCredential uid(String uid) {
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
  public UserBaseCredential credentialType(CredentialTypeEnum credentialType) {
    this.credentialType = credentialType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("credentialType")
  public CredentialTypeEnum getCredentialType() {
    return credentialType;
  }
  public void setCredentialType(CredentialTypeEnum credentialType) {
    this.credentialType = credentialType;
  }


  /**
   **/
  public UserBaseCredential userUid(String userUid) {
    this.userUid = userUid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("userUid")
  public String getUserUid() {
    return userUid;
  }
  public void setUserUid(String userUid) {
    this.userUid = userUid;
  }


  /**
   **/
  public UserBaseCredential credential(Secret credential) {
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
    UserBaseCredential userBaseCredential = (UserBaseCredential) o;
    return Objects.equals(this.uid, userBaseCredential.uid) &&
        Objects.equals(this.credentialType, userBaseCredential.credentialType) &&
        Objects.equals(this.userUid, userBaseCredential.userUid) &&
        Objects.equals(this.credential, userBaseCredential.credential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, credentialType, userUid, credential);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBaseCredential {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    credentialType: ").append(toIndentedString(credentialType)).append("\n");
    sb.append("    userUid: ").append(toIndentedString(userUid)).append("\n");
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

