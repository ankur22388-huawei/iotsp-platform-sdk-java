package com.cisco.iotsp.client.users.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.users.model.Address;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Model for updating an existing user.
 */
@ApiModel(description = "Model for updating an existing user.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:36.534-07:00")
public class UserUpdateObject   {
  
  private String firstName = null;
  private String lastName = null;
  private String emailAddress = null;
  private Address address = null;
  private String userPolicyUid = null;

  
  /**
   **/
  public UserUpdateObject firstName(String firstName) {
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
  public UserUpdateObject lastName(String lastName) {
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
  public UserUpdateObject emailAddress(String emailAddress) {
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
   **/
  public UserUpdateObject address(Address address) {
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
  public UserUpdateObject userPolicyUid(String userPolicyUid) {
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
    UserUpdateObject userUpdateObject = (UserUpdateObject) o;
    return Objects.equals(this.firstName, userUpdateObject.firstName) &&
        Objects.equals(this.lastName, userUpdateObject.lastName) &&
        Objects.equals(this.emailAddress, userUpdateObject.emailAddress) &&
        Objects.equals(this.address, userUpdateObject.address) &&
        Objects.equals(this.userPolicyUid, userUpdateObject.userPolicyUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, emailAddress, address, userPolicyUid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateObject {\n");
    
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

