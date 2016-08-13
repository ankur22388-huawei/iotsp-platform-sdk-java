//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.users.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.users.model.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Model for creating a new user.
 */
@ApiModel(description = "Model for creating a new user.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:36.534-07:00")
public class UserCreateObject   {
  
  private String uid = null;
  private String firstName = null;
  private String lastName = null;
  private String emailAddress = null;
  private String password = null;
  private Address address = null;
  private String userPolicyUid = null;

  
  /**
   **/
  public UserCreateObject uid(String uid) {
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
  public UserCreateObject firstName(String firstName) {
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
  public UserCreateObject lastName(String lastName) {
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
   * Email address of the user. The email address must be a valid email address.
   **/
  public UserCreateObject emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Email address of the user. The email address must be a valid email address.")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   * Password of the user.
   **/
  public UserCreateObject password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Password of the user.")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   **/
  public UserCreateObject address(Address address) {
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
   * UID of the user policy to be associated with the user.
   **/
  public UserCreateObject userPolicyUid(String userPolicyUid) {
    this.userPolicyUid = userPolicyUid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "UID of the user policy to be associated with the user.")
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
    UserCreateObject userCreateObject = (UserCreateObject) o;
    return Objects.equals(this.uid, userCreateObject.uid) &&
        Objects.equals(this.firstName, userCreateObject.firstName) &&
        Objects.equals(this.lastName, userCreateObject.lastName) &&
        Objects.equals(this.emailAddress, userCreateObject.emailAddress) &&
        Objects.equals(this.password, userCreateObject.password) &&
        Objects.equals(this.address, userCreateObject.address) &&
        Objects.equals(this.userPolicyUid, userCreateObject.userPolicyUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, firstName, lastName, emailAddress, password, address, userPolicyUid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserCreateObject {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

