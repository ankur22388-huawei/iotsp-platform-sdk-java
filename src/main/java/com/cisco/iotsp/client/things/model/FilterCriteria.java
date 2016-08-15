//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.things.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * FilterCriteria
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:33.656-07:00")
public class FilterCriteria   {
  
  private String key = null;
  private String value = null;

  /**
   * Gets or Sets valueFilterType
   */
  public enum ValueFilterTypeEnum {
    EXACT("EXACT"),
    STARTSWITH("STARTSWITH");

    private String value;

    ValueFilterTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ValueFilterTypeEnum valueFilterType = null;

  
  /**
   **/
  public FilterCriteria key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }


  /**
   **/
  public FilterCriteria value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   **/
  public FilterCriteria valueFilterType(ValueFilterTypeEnum valueFilterType) {
    this.valueFilterType = valueFilterType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("valueFilterType")
  public ValueFilterTypeEnum getValueFilterType() {
    return valueFilterType;
  }
  public void setValueFilterType(ValueFilterTypeEnum valueFilterType) {
    this.valueFilterType = valueFilterType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterCriteria filterCriteria = (FilterCriteria) o;
    return Objects.equals(this.key, filterCriteria.key) &&
        Objects.equals(this.value, filterCriteria.value) &&
        Objects.equals(this.valueFilterType, filterCriteria.valueFilterType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, valueFilterType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterCriteria {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueFilterType: ").append(toIndentedString(valueFilterType)).append("\n");
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

