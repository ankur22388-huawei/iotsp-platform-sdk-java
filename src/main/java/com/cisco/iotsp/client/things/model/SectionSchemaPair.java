package com.cisco.iotsp.client.things.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SectionSchemaPair
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:33.656-07:00")
public class SectionSchemaPair   {
  
  private String sectionName = null;
  private String schemaUid = null;

  
  /**
   **/
  public SectionSchemaPair sectionName(String sectionName) {
    this.sectionName = sectionName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sectionName")
  public String getSectionName() {
    return sectionName;
  }
  public void setSectionName(String sectionName) {
    this.sectionName = sectionName;
  }


  /**
   **/
  public SectionSchemaPair schemaUid(String schemaUid) {
    this.schemaUid = schemaUid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("schemaUid")
  public String getSchemaUid() {
    return schemaUid;
  }
  public void setSchemaUid(String schemaUid) {
    this.schemaUid = schemaUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SectionSchemaPair sectionSchemaPair = (SectionSchemaPair) o;
    return Objects.equals(this.sectionName, sectionSchemaPair.sectionName) &&
        Objects.equals(this.schemaUid, sectionSchemaPair.schemaUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionName, schemaUid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SectionSchemaPair {\n");
    
    sb.append("    sectionName: ").append(toIndentedString(sectionName)).append("\n");
    sb.append("    schemaUid: ").append(toIndentedString(schemaUid)).append("\n");
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

