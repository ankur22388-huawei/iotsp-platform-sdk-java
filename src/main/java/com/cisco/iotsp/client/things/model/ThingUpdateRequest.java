package com.cisco.iotsp.client.things.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.things.model.SectionSchemaPair;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * ThingUpdateRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:33.656-07:00")
public class ThingUpdateRequest   {
  
  private List<SectionSchemaPair> sectionSchemas = new ArrayList<SectionSchemaPair>();
  private Map<String, Object> sections = new HashMap<String, Object>();
  private String dataPathProfileUid = null;

  
  /**
   **/
  public ThingUpdateRequest sectionSchemas(List<SectionSchemaPair> sectionSchemas) {
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
  public ThingUpdateRequest sections(Map<String, Object> sections) {
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
  public ThingUpdateRequest dataPathProfileUid(String dataPathProfileUid) {
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
    ThingUpdateRequest thingUpdateRequest = (ThingUpdateRequest) o;
    return Objects.equals(this.sectionSchemas, thingUpdateRequest.sectionSchemas) &&
        Objects.equals(this.sections, thingUpdateRequest.sections) &&
        Objects.equals(this.dataPathProfileUid, thingUpdateRequest.dataPathProfileUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sectionSchemas, sections, dataPathProfileUid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThingUpdateRequest {\n");
    
    sb.append("    sectionSchemas: ").append(toIndentedString(sectionSchemas)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

