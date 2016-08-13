//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.things.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SortCriteria
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:33.656-07:00")
public class SortCriteria   {
  
  private String sortKey = null;

  /**
   * Gets or Sets sortOrder
   */
  public enum SortOrderEnum {
    ASCENDING("Ascending"),
    DESCENDING("Descending");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SortOrderEnum sortOrder = null;

  
  /**
   **/
  public SortCriteria sortKey(String sortKey) {
    this.sortKey = sortKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sortKey")
  public String getSortKey() {
    return sortKey;
  }
  public void setSortKey(String sortKey) {
    this.sortKey = sortKey;
  }


  /**
   **/
  public SortCriteria sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sortOrder")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }
  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortCriteria sortCriteria = (SortCriteria) o;
    return Objects.equals(this.sortKey, sortCriteria.sortKey) &&
        Objects.equals(this.sortOrder, sortCriteria.sortOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortKey, sortOrder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortCriteria {\n");
    
    sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

