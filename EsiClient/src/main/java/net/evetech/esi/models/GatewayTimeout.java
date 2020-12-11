/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 1.7.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.evetech.esi.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Gateway timeout model
 */
@ApiModel(description = "Gateway timeout model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:37:36.420-05:00")
public class GatewayTimeout {
  @SerializedName("error")
  private String error = null;

  @SerializedName("timeout")
  private Integer timeout = null;

  public GatewayTimeout error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Gateway timeout message
   * @return error
  **/
  @ApiModelProperty(example = "null", required = true, value = "Gateway timeout message")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public GatewayTimeout timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

   /**
   * number of seconds the request was given
   * @return timeout
  **/
  @ApiModelProperty(example = "null", value = "number of seconds the request was given")
  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayTimeout gatewayTimeout = (GatewayTimeout) o;
    return Objects.equals(this.error, gatewayTimeout.error) &&
        Objects.equals(this.timeout, gatewayTimeout.timeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, timeout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayTimeout {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

