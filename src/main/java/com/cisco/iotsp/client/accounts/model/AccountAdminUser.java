//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.accounts.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Model representing admin user for an account.
 */
@ApiModel(description = "Model representing admin user for an account.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:12.363-07:00")
public class AccountAdminUser   {
  
  private String firstName = null;
  private String lastName = null;
  private String emailAddress = null;
  private String password = null;

  
  /**
   **/
  public AccountAdminUser firstName(String firstName) {
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
  public AccountAdminUser lastName(String lastName) {
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
   * Email address of the admin user to be created while creating a new account. The email address must be a valid email address.
   **/
  public AccountAdminUser emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Email address of the admin user to be created while creating a new account. The email address must be a valid email address.")
  @JsonProperty("emailAddress")
  public String getEmailAddress() {
    return emailAddress;
  }
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   * Password of the admin user.
   **/
  public AccountAdminUser password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Password of the admin user.")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAdminUser accountAdminUser = (AccountAdminUser) o;
    return Objects.equals(this.firstName, accountAdminUser.firstName) &&
        Objects.equals(this.lastName, accountAdminUser.lastName) &&
        Objects.equals(this.emailAddress, accountAdminUser.emailAddress) &&
        Objects.equals(this.password, accountAdminUser.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, emailAddress, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAdminUser {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

