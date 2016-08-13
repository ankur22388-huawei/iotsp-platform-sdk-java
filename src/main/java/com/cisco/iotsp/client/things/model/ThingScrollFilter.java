//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.things.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.things.model.FilterCriteria;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ThingScrollFilter
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:33.656-07:00")
public class ThingScrollFilter   {
  
  private Integer scrollPageSize = null;
  private List<FilterCriteria> filterCriteria = new ArrayList<FilterCriteria>();

  /**
   * Gets or Sets filterOperator
   */
  public enum FilterOperatorEnum {
    ALL("MATCH_ALL"),
    ANY("MATCH_ANY"),
    NONE("MATCH_NONE");

    private String value;

    FilterOperatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private FilterOperatorEnum filterOperator = null;

  
  /**
   **/
  public ThingScrollFilter scrollPageSize(Integer scrollPageSize) {
    this.scrollPageSize = scrollPageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("scrollPageSize")
  public Integer getScrollPageSize() {
    return scrollPageSize;
  }
  public void setScrollPageSize(Integer scrollPageSize) {
    this.scrollPageSize = scrollPageSize;
  }


  /**
   **/
  public ThingScrollFilter filterCriteria(List<FilterCriteria> filterCriteria) {
    this.filterCriteria = filterCriteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("filterCriteria")
  public List<FilterCriteria> getFilterCriteria() {
    return filterCriteria;
  }
  public void setFilterCriteria(List<FilterCriteria> filterCriteria) {
    this.filterCriteria = filterCriteria;
  }


  /**
   **/
  public ThingScrollFilter filterOperator(FilterOperatorEnum filterOperator) {
    this.filterOperator = filterOperator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("filterOperator")
  public FilterOperatorEnum getFilterOperator() {
    return filterOperator;
  }
  public void setFilterOperator(FilterOperatorEnum filterOperator) {
    this.filterOperator = filterOperator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThingScrollFilter thingScrollFilter = (ThingScrollFilter) o;
    return Objects.equals(this.scrollPageSize, thingScrollFilter.scrollPageSize) &&
        Objects.equals(this.filterCriteria, thingScrollFilter.filterCriteria) &&
        Objects.equals(this.filterOperator, thingScrollFilter.filterOperator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scrollPageSize, filterCriteria, filterOperator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingScrollFilter {\n");
    
    sb.append("    scrollPageSize: ").append(toIndentedString(scrollPageSize)).append("\n");
    sb.append("    filterCriteria: ").append(toIndentedString(filterCriteria)).append("\n");
    sb.append("    filterOperator: ").append(toIndentedString(filterOperator)).append("\n");
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

