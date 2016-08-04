package com.cisco.iotsp.client.claims.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.claims.model.FilterCriteria;
import com.cisco.iotsp.client.claims.model.PageInfo;
import com.cisco.iotsp.client.claims.model.SortCriteria;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ThingClaimFilter
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:36.313-07:00")
public class ThingClaimFilter   {
  
  private PageInfo pageInfo = null;
  private SortCriteria sortCriteria = null;
  private List<FilterCriteria> filterCriteria = new ArrayList<FilterCriteria>();

  /**
   * Gets or Sets filterOperatorEnum
   */
  public enum FilterOperatorEnumEnum {
    ALL("MATCH_ALL"),
    ANY("MATCH_ANY"),
    NONE("MATCH_NONE");

    private String value;

    FilterOperatorEnumEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private FilterOperatorEnumEnum filterOperatorEnum = null;

  
  /**
   **/
  public ThingClaimFilter pageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("pageInfo")
  public PageInfo getPageInfo() {
    return pageInfo;
  }
  public void setPageInfo(PageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  /**
   **/
  public ThingClaimFilter sortCriteria(SortCriteria sortCriteria) {
    this.sortCriteria = sortCriteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sortCriteria")
  public SortCriteria getSortCriteria() {
    return sortCriteria;
  }
  public void setSortCriteria(SortCriteria sortCriteria) {
    this.sortCriteria = sortCriteria;
  }


  /**
   **/
  public ThingClaimFilter filterCriteria(List<FilterCriteria> filterCriteria) {
    this.filterCriteria = filterCriteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("filterCriteria")
  public List<FilterCriteria> getFilterCriteria() {
    return filterCriteria;
  }
  public void setFilterCriteria(List<FilterCriteria> filterCriteria) {
    this.filterCriteria = filterCriteria;
  }


  /**
   **/
  public ThingClaimFilter filterOperatorEnum(FilterOperatorEnumEnum filterOperatorEnum) {
    this.filterOperatorEnum = filterOperatorEnum;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("filterOperatorEnum")
  public FilterOperatorEnumEnum getFilterOperatorEnum() {
    return filterOperatorEnum;
  }
  public void setFilterOperatorEnum(FilterOperatorEnumEnum filterOperatorEnum) {
    this.filterOperatorEnum = filterOperatorEnum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThingClaimFilter thingClaimFilter = (ThingClaimFilter) o;
    return Objects.equals(this.pageInfo, thingClaimFilter.pageInfo) &&
        Objects.equals(this.sortCriteria, thingClaimFilter.sortCriteria) &&
        Objects.equals(this.filterCriteria, thingClaimFilter.filterCriteria) &&
        Objects.equals(this.filterOperatorEnum, thingClaimFilter.filterOperatorEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, sortCriteria, filterCriteria, filterOperatorEnum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingClaimFilter {\n");
    
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    sortCriteria: ").append(toIndentedString(sortCriteria)).append("\n");
    sb.append("    filterCriteria: ").append(toIndentedString(filterCriteria)).append("\n");
    sb.append("    filterOperatorEnum: ").append(toIndentedString(filterOperatorEnum)).append("\n");
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

