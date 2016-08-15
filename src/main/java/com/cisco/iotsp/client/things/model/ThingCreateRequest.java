//Copyright (c) 2016 by Cisco Systems, Inc. All rights reserved.
package com.cisco.iotsp.client.things.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.things.model.SectionSchemaPair;
import com.cisco.iotsp.client.things.model.ThingIdentifier;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * ThingCreateRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:33.656-07:00")
public class ThingCreateRequest   {
  
  private String uid = null;
  private List<SectionSchemaPair> sectionSchemas = new ArrayList<SectionSchemaPair>();
  private Map<String, Object> sections = new HashMap<String, Object>();
  private ThingIdentifier uniqueIdentifiers = null;
  private String dataPathProfileUid = null;

  
  /**
   **/
  public ThingCreateRequest uid(String uid) {
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
  public ThingCreateRequest sectionSchemas(List<SectionSchemaPair> sectionSchemas) {
    this.sectionSchemas = sectionSchemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sectionSchemas")
  public List<SectionSchemaPair> getSectionSchemas() {
    return sectionSchemas;
  }
  public void setSectionSchemas(List<SectionSchemaPair> sectionSchemas) {
    this.sectionSchemas = sectionSchemas;
  }


  /**
   **/
  public ThingCreateRequest sections(Map<String, Object> sections) {
    this.sections = sections;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sections")
  public Map<String, Object> getSections() {
    return sections;
  }
  public void setSections(Map<String, Object> sections) {
    this.sections = sections;
  }


  /**
   **/
  public ThingCreateRequest uniqueIdentifiers(ThingIdentifier uniqueIdentifiers) {
    this.uniqueIdentifiers = uniqueIdentifiers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("uniqueIdentifiers")
  public ThingIdentifier getUniqueIdentifiers() {
    return uniqueIdentifiers;
  }
  public void setUniqueIdentifiers(ThingIdentifier uniqueIdentifiers) {
    this.uniqueIdentifiers = uniqueIdentifiers;
  }


  /**
   **/
  public ThingCreateRequest dataPathProfileUid(String dataPathProfileUid) {
    this.dataPathProfileUid = dataPathProfileUid;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataPathProfileUid")
  public String getDataPathProfileUid() {
    return dataPathProfileUid;
  }
  public void setDataPathProfileUid(String dataPathProfileUid) {
    this.dataPathProfileUid = dataPathProfileUid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThingCreateRequest thingCreateRequest = (ThingCreateRequest) o;
    return Objects.equals(this.uid, thingCreateRequest.uid) &&
        Objects.equals(this.sectionSchemas, thingCreateRequest.sectionSchemas) &&
        Objects.equals(this.sections, thingCreateRequest.sections) &&
        Objects.equals(this.uniqueIdentifiers, thingCreateRequest.uniqueIdentifiers) &&
        Objects.equals(this.dataPathProfileUid, thingCreateRequest.dataPathProfileUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uid, sectionSchemas, sections, uniqueIdentifiers, dataPathProfileUid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingCreateRequest {\n");
    
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    sectionSchemas: ").append(toIndentedString(sectionSchemas)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    uniqueIdentifiers: ").append(toIndentedString(uniqueIdentifiers)).append("\n");
    sb.append("    dataPathProfileUid: ").append(toIndentedString(dataPathProfileUid)).append("\n");
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

