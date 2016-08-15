//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.observations.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.observations.model.Observations;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * PageObservations
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-28T22:21:44.967-07:00")
public class PageObservations   {
  
  private Integer totalRows = null;
  private List<Observations> items = new ArrayList<Observations>();
  private Boolean nextPageExists = false;
  private Boolean previousPageExists = false;

  
  /**
   **/
  public PageObservations totalRows(Integer totalRows) {
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
  public PageObservations items(List<Observations> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("items")
  public List<Observations> getItems() {
    return items;
  }
  public void setItems(List<Observations> items) {
    this.items = items;
  }


  /**
   **/
  public PageObservations nextPageExists(Boolean nextPageExists) {
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
  public PageObservations previousPageExists(Boolean previousPageExists) {
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
    PageObservations pageObservations = (PageObservations) o;
    return Objects.equals(this.totalRows, pageObservations.totalRows) &&
        Objects.equals(this.items, pageObservations.items) &&
        Objects.equals(this.nextPageExists, pageObservations.nextPageExists) &&
        Objects.equals(this.previousPageExists, pageObservations.previousPageExists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRows, items, nextPageExists, previousPageExists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageObservations {\n");
    
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

