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
 * response object
 */
@ApiModel(description = "response object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:20:13.441-05:00")
public class PutCharactersCharacterIdCalendarEventIdResponse {
  /**
   * response string
   */
  public enum ResponseEnum {
    @SerializedName("accepted")
    ACCEPTED("accepted"),
    
    @SerializedName("declined")
    DECLINED("declined"),
    
    @SerializedName("tentative")
    TENTATIVE("tentative");

    private String value;

    ResponseEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("response")
  private ResponseEnum response = null;

  public PutCharactersCharacterIdCalendarEventIdResponse response(ResponseEnum response) {
    this.response = response;
    return this;
  }

   /**
   * response string
   * @return response
  **/
  @ApiModelProperty(example = "null", required = true, value = "response string")
  public ResponseEnum getResponse() {
    return response;
  }

  public void setResponse(ResponseEnum response) {
    this.response = response;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutCharactersCharacterIdCalendarEventIdResponse putCharactersCharacterIdCalendarEventIdResponse = (PutCharactersCharacterIdCalendarEventIdResponse) o;
    return Objects.equals(this.response, putCharactersCharacterIdCalendarEventIdResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutCharactersCharacterIdCalendarEventIdResponse {\n");
    
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

