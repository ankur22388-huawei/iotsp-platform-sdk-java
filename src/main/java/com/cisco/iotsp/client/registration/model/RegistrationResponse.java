package com.cisco.iotsp.client.registration.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.cisco.iotsp.client.registration.model.Thing;
import com.cisco.iotsp.client.registration.model.ThingService;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * RegistrationResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-10T17:08:35.034-07:00")
public class RegistrationResponse   {
  
  private Thing thing = null;
  private ThingService service = null;

  
  /**
   **/
  public RegistrationResponse thing(Thing thing) {
    this.thing = thing;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thing")
  public Thing getThing() {
    return thing;
  }
  public void setThing(Thing thing) {
    this.thing = thing;
  }


  /**
   **/
  public RegistrationResponse service(ThingService service) {
    this.service = service;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("service")
  public ThingService getService() {
    return service;
  }
  public void setService(ThingService service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistrationResponse registrationResponse = (RegistrationResponse) o;
    return Objects.equals(this.thing, registrationResponse.thing) &&
        Objects.equals(this.service, registrationResponse.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thing, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistrationResponse {\n");
    
    sb.append("    thing: ").append(toIndentedString(thing)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

