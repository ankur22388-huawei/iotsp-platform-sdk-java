//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.claims.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.claims.model.ThingClaim;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * PageThingClaim
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:36.313-07:00")
public class PageThingClaim   {
  
  private Integer totalRows = null;
  private List<ThingClaim> items = new ArrayList<ThingClaim>();
  private Boolean nextPageExists = false;
  private Boolean previousPageExists = false;

  
  /**
   **/
  public PageThingClaim totalRows(Integer totalRows) {
    this.totalRows = totalRows;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalRows")
  public Integer getTotalRows() {
    return totalRows;
  }
  public void setTotalRows(Integer totalRows) {
    this.totalRows = totalRows;
  }


  /**
   **/
  public PageThingClaim items(List<ThingClaim> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("items")
  public List<ThingClaim> getItems() {
    return items;
  }
  public void setItems(List<ThingClaim> items) {
    this.items = items;
  }


  /**
   **/
  public PageThingClaim nextPageExists(Boolean nextPageExists) {
    this.nextPageExists = nextPageExists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextPageExists")
  public Boolean getNextPageExists() {
    return nextPageExists;
  }
  public void setNextPageExists(Boolean nextPageExists) {
    this.nextPageExists = nextPageExists;
  }


  /**
   **/
  public PageThingClaim previousPageExists(Boolean previousPageExists) {
    this.previousPageExists = previousPageExists;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousPageExists")
  public Boolean getPreviousPageExists() {
    return previousPageExists;
  }
  public void setPreviousPageExists(Boolean previousPageExists) {
    this.previousPageExists = previousPageExists;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageThingClaim pageThingClaim = (PageThingClaim) o;
    return Objects.equals(this.totalRows, pageThingClaim.totalRows) &&
        Objects.equals(this.items, pageThingClaim.items) &&
        Objects.equals(this.nextPageExists, pageThingClaim.nextPageExists) &&
        Objects.equals(this.previousPageExists, pageThingClaim.previousPageExists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRows, items, nextPageExists, previousPageExists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageThingClaim {\n");
    
    sb.append("    totalRows: ").append(toIndentedString(totalRows)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    nextPageExists: ").append(toIndentedString(nextPageExists)).append("\n");
    sb.append("    previousPageExists: ").append(toIndentedString(previousPageExists)).append("\n");
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

