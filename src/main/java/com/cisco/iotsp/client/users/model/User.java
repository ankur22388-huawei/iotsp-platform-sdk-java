//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.users.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.users.model.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * User
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:36.534-07:00")
public class User   {
  
  private String uid = null;
  private String firstName = null;
  private String lastName = null;
  private String emailAddress = null;
  private Address address = null;
  private String userPolicyUid = null;

  
  /**
   **/
  public User uid(String uid) {
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
  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   **/
  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   **/
  public User emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   **/
  public User address(Address address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }


  /**
   **/
  public User userPolicyUid(String userPolicyUid) {
    this.userPolicyUid = userPolicyUid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userPolicyUid")
  public String getUserPolicyUid() {
    return userPolicyUid;
  }
  public void setUserPolicyUid(String userPolicyUid) {
    this.userPolicyUid = userPolicyUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.uid, user.uid) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.emailAddress, user.emailAddress) &&
        Objects.equals(this.address, user.address) &&
        Objects.equals(this.userPolicyUid, user.userPolicyUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, firstName, lastName, emailAddress, address, userPolicyUid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    userPolicyUid: ").append(toIndentedString(userPolicyUid)).append("\n");
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

