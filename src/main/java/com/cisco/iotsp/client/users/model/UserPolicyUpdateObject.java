package com.cisco.iotsp.client.users.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.users.model.UserPolicyUnit;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * UserPolicyUpdateObject
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:36.534-07:00")
public class UserPolicyUpdateObject   {
  
  private String name = null;
  private List<UserPolicyUnit> policyUnits = new ArrayList<UserPolicyUnit>();

  
  /**
   **/
  public UserPolicyUpdateObject name(String name) {
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
  public UserPolicyUpdateObject policyUnits(List<UserPolicyUnit> policyUnits) {
    this.policyUnits = policyUnits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("policyUnits")
  public List<UserPolicyUnit> getPolicyUnits() {
    return policyUnits;
  }
  public void setPolicyUnits(List<UserPolicyUnit> policyUnits) {
    this.policyUnits = policyUnits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPolicyUpdateObject userPolicyUpdateObject = (UserPolicyUpdateObject) o;
    return Objects.equals(this.name, userPolicyUpdateObject.name) &&
        Objects.equals(this.policyUnits, userPolicyUpdateObject.policyUnits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, policyUnits);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPolicyUpdateObject {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyUnits: ").append(toIndentedString(policyUnits)).append("\n");
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

