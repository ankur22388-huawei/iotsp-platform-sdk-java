//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.accounts.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Account
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:12.363-07:00")
public class Account   {
  
  private String uid = null;
  private String name = null;
  private String alias = null;

  /**
   * Gets or Sets accountType
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
  private String adminUserUid = null;
  private Boolean active = false;

  
  /**
   **/
  public Account uid(String uid) {
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
  public Account name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public Account alias(String alias) {
    this.alias = alias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }
  public void setAlias(String alias) {
    this.alias = alias;
  }


  /**
   **/
  public Account accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("accountType")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  /**
   **/
  public Account adminUserUid(String adminUserUid) {
    this.adminUserUid = adminUserUid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("adminUserUid")
  public String getAdminUserUid() {
    return adminUserUid;
  }
  public void setAdminUserUid(String adminUserUid) {
    this.adminUserUid = adminUserUid;
  }


  /**
   **/
  public Account active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.uid, account.uid) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.alias, account.alias) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.adminUserUid, account.adminUserUid) &&
        Objects.equals(this.active, account.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, name, alias, accountType, adminUserUid, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    adminUserUid: ").append(toIndentedString(adminUserUid)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

