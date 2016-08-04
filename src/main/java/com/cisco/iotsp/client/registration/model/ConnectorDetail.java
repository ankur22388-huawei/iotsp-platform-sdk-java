package com.cisco.iotsp.client.registration.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ConnectorDetail
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-09T22:25:35.845-07:00")
public class ConnectorDetail   {
  

  /**
   * Gets or Sets connector
   */
  public enum ConnectorEnum {
    MQTT("mqtt"),
    WAMP("wamp"),
    HTTP("http");

    private String value;

    ConnectorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ConnectorEnum connector = null;
  private String protocol = null;
  private String host = null;
  private String port = null;
  private List<String> upstreamTopics = new ArrayList<String>();
  private List<String> downstreamTopics = new ArrayList<String>();

  
  /**
   **/
  public ConnectorDetail connector(ConnectorEnum connector) {
    this.connector = connector;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("connector")
  public ConnectorEnum getConnector() {
    return connector;
  }
  public void setConnector(ConnectorEnum connector) {
    this.connector = connector;
  }


  /**
   **/
  public ConnectorDetail protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("protocol")
  public String getProtocol() {
    return protocol;
  }
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }


  /**
   **/
  public ConnectorDetail host(String host) {
    this.host = host;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("host")
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }


  /**
   **/
  public ConnectorDetail port(String port) {
    this.port = port;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("port")
  public String getPort() {
    return port;
  }
  public void setPort(String port) {
    this.port = port;
  }


  /**
   **/
  public ConnectorDetail upstreamTopics(List<String> upstreamTopics) {
    this.upstreamTopics = upstreamTopics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("upstreamTopics")
  public List<String> getUpstreamTopics() {
    return upstreamTopics;
  }
  public void setUpstreamTopics(List<String> upstreamTopics) {
    this.upstreamTopics = upstreamTopics;
  }


  /**
   **/
  public ConnectorDetail downstreamTopics(List<String> downstreamTopics) {
    this.downstreamTopics = downstreamTopics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("downstreamTopics")
  public List<String> getDownstreamTopics() {
    return downstreamTopics;
  }
  public void setDownstreamTopics(List<String> downstreamTopics) {
    this.downstreamTopics = downstreamTopics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorDetail connectorDetail = (ConnectorDetail) o;
    return Objects.equals(this.connector, connectorDetail.connector) &&
        Objects.equals(this.protocol, connectorDetail.protocol) &&
        Objects.equals(this.host, connectorDetail.host) &&
        Objects.equals(this.port, connectorDetail.port) &&
        Objects.equals(this.upstreamTopics, connectorDetail.upstreamTopics) &&
        Objects.equals(this.downstreamTopics, connectorDetail.downstreamTopics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connector, protocol, host, port, upstreamTopics, downstreamTopics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorDetail {\n");
    
    sb.append("    connector: ").append(toIndentedString(connector)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    upstreamTopics: ").append(toIndentedString(upstreamTopics)).append("\n");
    sb.append("    downstreamTopics: ").append(toIndentedString(downstreamTopics)).append("\n");
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

