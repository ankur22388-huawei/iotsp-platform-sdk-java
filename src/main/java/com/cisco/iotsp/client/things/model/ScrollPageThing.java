//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.things.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.things.model.Thing;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ScrollPageThing
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:33.656-07:00")
public class ScrollPageThing   {
  
  private List<Thing> items = new ArrayList<Thing>();
  private String nextScrollId = null;

  
  /**
   **/
  public ScrollPageThing items(List<Thing> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("items")
  public List<Thing> getItems() {
    return items;
  }
  public void setItems(List<Thing> items) {
    this.items = items;
  }


  /**
   **/
  public ScrollPageThing nextScrollId(String nextScrollId) {
    this.nextScrollId = nextScrollId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextScrollId")
  public String getNextScrollId() {
    return nextScrollId;
  }
  public void setNextScrollId(String nextScrollId) {
    this.nextScrollId = nextScrollId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScrollPageThing scrollPageThing = (ScrollPageThing) o;
    return Objects.equals(this.items, scrollPageThing.items) &&
        Objects.equals(this.nextScrollId, scrollPageThing.nextScrollId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextScrollId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScrollPageThing {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    nextScrollId: ").append(toIndentedString(nextScrollId)).append("\n");
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

