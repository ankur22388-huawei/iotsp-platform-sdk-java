//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.accounts.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.accounts.model.AccountAdminUser;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Model for creating a new account.
 */
@ApiModel(description = "Model for creating a new account.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:12.363-07:00")
public class AccountCreateObject   {
  
  private String uid = null;
  private String name = null;
  private String alias = null;

  /**
   * Type of the account to be created.
   */
  public enum AccountTypeEnum {
    TRIAL("TRIAL"),
    PAID("PAID");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private AccountTypeEnum accountType = null;
  private AccountAdminUser accountAdminUser = null;

  
  /**
   **/
  public AccountCreateObject uid(String uid) {
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
   * Name of the account to be created..
   **/
  public AccountCreateObject name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the account to be created..")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Alias of the account to be created. This alias is a unique, URL friendly name to be given to the account.
   **/
  public AccountCreateObject alias(String alias) {
    this.alias = alias;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Alias of the account to be created. This alias is a unique, URL friendly name to be given to the account.")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }
  public void setAlias(String alias) {
    this.alias = alias;
  }


  /**
   * Type of the account to be created.
   **/
  public AccountCreateObject accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of the account to be created.")
  @JsonProperty("accountType")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  /**
   **/
  public AccountCreateObject accountAdminUser(AccountAdminUser accountAdminUser) {
    this.accountAdminUser = accountAdminUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("accountAdminUser")
  public AccountAdminUser getAccountAdminUser() {
    return accountAdminUser;
  }
  public void setAccountAdminUser(AccountAdminUser accountAdminUser) {
    this.accountAdminUser = accountAdminUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountCreateObject accountCreateObject = (AccountCreateObject) o;
    return Objects.equals(this.uid, accountCreateObject.uid) &&
        Objects.equals(this.name, accountCreateObject.name) &&
        Objects.equals(this.alias, accountCreateObject.alias) &&
        Objects.equals(this.accountType, accountCreateObject.accountType) &&
        Objects.equals(this.accountAdminUser, accountCreateObject.accountAdminUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, name, alias, accountType, accountAdminUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountCreateObject {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountAdminUser: ").append(toIndentedString(accountAdminUser)).append("\n");
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

