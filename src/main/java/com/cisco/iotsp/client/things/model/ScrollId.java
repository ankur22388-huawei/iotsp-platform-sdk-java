//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.things.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ScrollId
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:33.656-07:00")
public class ScrollId   {
  
  private String scrollId = null;

  
  /**
   **/
  public ScrollId scrollId(String scrollId) {
    this.scrollId = scrollId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("scrollId")
  public String getScrollId() {
    return scrollId;
  }
  public void setScrollId(String scrollId) {
    this.scrollId = scrollId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScrollId scrollId = (ScrollId) o;
    return Objects.equals(this.scrollId, scrollId.scrollId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scrollId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScrollId {\n");
    
    sb.append("    scrollId: ").append(toIndentedString(scrollId)).append("\n");
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

