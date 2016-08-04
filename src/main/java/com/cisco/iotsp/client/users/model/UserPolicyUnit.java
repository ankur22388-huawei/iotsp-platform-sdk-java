package com.cisco.iotsp.client.users.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.users.model.FilterCriteria;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * UserPolicyUnit
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:07:36.534-07:00")
public class UserPolicyUnit   {
  
  private List<String> allowedPermissions = new ArrayList<String>();
  private List<String> resourceCrns = new ArrayList<String>();
  private List<FilterCriteria> conditions = new ArrayList<FilterCriteria>();

  
  /**
   **/
  public UserPolicyUnit allowedPermissions(List<String> allowedPermissions) {
    this.allowedPermissions = allowedPermissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("allowedPermissions")
  public List<String> getAllowedPermissions() {
    return allowedPermissions;
  }
  public void setAllowedPermissions(List<String> allowedPermissions) {
    this.allowedPermissions = allowedPermissions;
  }


  /**
   **/
  public UserPolicyUnit resourceCrns(List<String> resourceCrns) {
    this.resourceCrns = resourceCrns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceCrns")
  public List<String> getResourceCrns() {
    return resourceCrns;
  }
  public void setResourceCrns(List<String> resourceCrns) {
    this.resourceCrns = resourceCrns;
  }


  /**
   **/
  public UserPolicyUnit conditions(List<FilterCriteria> conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conditions")
  public List<FilterCriteria> getConditions() {
    return conditions;
  }
  public void setConditions(List<FilterCriteria> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPolicyUnit userPolicyUnit = (UserPolicyUnit) o;
    return Objects.equals(this.allowedPermissions, userPolicyUnit.allowedPermissions) &&
        Objects.equals(this.resourceCrns, userPolicyUnit.resourceCrns) &&
        Objects.equals(this.conditions, userPolicyUnit.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedPermissions, resourceCrns, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPolicyUnit {\n");
    
    sb.append("    allowedPermissions: ").append(toIndentedString(allowedPermissions)).append("\n");
    sb.append("    resourceCrns: ").append(toIndentedString(resourceCrns)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

