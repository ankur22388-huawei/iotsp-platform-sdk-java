//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.schemas.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Schema
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:12.299-07:00")
public class Schema   {
  
  private String uid = null;
  private String name = null;

  /**
   * Gets or Sets schemaType
   */
  public enum SchemaTypeEnum {
    OBSERVATION("OBSERVATION"),
    THING("THING"),
    DATA_PATH_PROFILE("DATA_PATH_PROFILE");

    private String value;

    SchemaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SchemaTypeEnum schemaType = null;
  private String mandateSectionName = null;
  private String description = null;
  private String tag = null;
  private Map<String, Object> schema = new HashMap<String, Object>();

  
  /**
   **/
  public Schema uid(String uid) {
    this.uid = uid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uid")
  public String getUid() {
    return uid;
  }
  public void setUid(String uid) {
    this.uid = uid;
  }


  /**
   **/
  public Schema name(String name) {
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
  public Schema schemaType(SchemaTypeEnum schemaType) {
    this.schemaType = schemaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schemaType")
  public SchemaTypeEnum getSchemaType() {
    return schemaType;
  }
  public void setSchemaType(SchemaTypeEnum schemaType) {
    this.schemaType = schemaType;
  }


  /**
   **/
  public Schema mandateSectionName(String mandateSectionName) {
    this.mandateSectionName = mandateSectionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mandateSectionName")
  public String getMandateSectionName() {
    return mandateSectionName;
  }
  public void setMandateSectionName(String mandateSectionName) {
    this.mandateSectionName = mandateSectionName;
  }


  /**
   **/
  public Schema description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   **/
  public Schema tag(String tag) {
    this.tag = tag;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }


  /**
   **/
  public Schema schema(Map<String, Object> schema) {
    this.schema = schema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schema")
  public Map<String, Object> getSchema() {
    return schema;
  }
  public void setSchema(Map<String, Object> schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schema schema = (Schema) o;
    return Objects.equals(this.uid, schema.uid) &&
        Objects.equals(this.name, schema.name) &&
        Objects.equals(this.schemaType, schema.schemaType) &&
        Objects.equals(this.mandateSectionName, schema.mandateSectionName) &&
        Objects.equals(this.description, schema.description) &&
        Objects.equals(this.tag, schema.tag) &&
        Objects.equals(this.schema, schema.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, name, schemaType, mandateSectionName, description, tag, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schema {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schemaType: ").append(toIndentedString(schemaType)).append("\n");
    sb.append("    mandateSectionName: ").append(toIndentedString(mandateSectionName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

