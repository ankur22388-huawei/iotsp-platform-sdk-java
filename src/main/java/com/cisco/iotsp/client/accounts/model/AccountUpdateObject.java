package com.cisco.iotsp.client.accounts.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Model for updating an account.
 */
@ApiModel(description = "Model for updating an account.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:12.363-07:00")
public class AccountUpdateObject   {
  
  private String name = null;

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
  private String adminUserUid = null;

  
  /**
   * Name of the account to be created..
   **/
  public AccountUpdateObject name(String name) {
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
   * Type of the account to be created.
   **/
  public AccountUpdateObject accountType(AccountTypeEnum accountType) {
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
   * UID of the admin user to be associated with the account.
   **/
  public AccountUpdateObject adminUserUid(String adminUserUid) {
    this.adminUserUid = adminUserUid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "UID of the admin user to be associated with the account.")
  @JsonProperty("adminUserUid")
  public String getAdminUserUid() {
    return adminUserUid;
  }
  public void setAdminUserUid(String adminUserUid) {
    this.adminUserUid = adminUserUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountUpdateObject accountUpdateObject = (AccountUpdateObject) o;
    return Objects.equals(this.name, accountUpdateObject.name) &&
        Objects.equals(this.accountType, accountUpdateObject.accountType) &&
        Objects.equals(this.adminUserUid, accountUpdateObject.adminUserUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, accountType, adminUserUid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountUpdateObject {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    adminUserUid: ").append(toIndentedString(adminUserUid)).append("\n");
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

