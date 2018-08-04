/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.5
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
 * isk object
 */
@ApiModel(description = "isk object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-04T12:18:31.101-04:00")
public class GetCharactersCharacterIdStatsIsk {
  @SerializedName("in")
  private Long in = null;

  @SerializedName("out")
  private Long out = null;

  public GetCharactersCharacterIdStatsIsk in(Long in) {
    this.in = in;
    return this;
  }

   /**
   * in integer
   * @return in
  **/
  @ApiModelProperty(example = "null", value = "in integer")
  public Long getIn() {
    return in;
  }

  public void setIn(Long in) {
    this.in = in;
  }

  public GetCharactersCharacterIdStatsIsk out(Long out) {
    this.out = out;
    return this;
  }

   /**
   * out integer
   * @return out
  **/
  @ApiModelProperty(example = "null", value = "out integer")
  public Long getOut() {
    return out;
  }

  public void setOut(Long out) {
    this.out = out;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsIsk getCharactersCharacterIdStatsIsk = (GetCharactersCharacterIdStatsIsk) o;
    return Objects.equals(this.in, getCharactersCharacterIdStatsIsk.in) &&
        Objects.equals(this.out, getCharactersCharacterIdStatsIsk.out);
  }

  @Override
  public int hashCode() {
    return Objects.hash(in, out);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsIsk {\n");
    
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    out: ").append(toIndentedString(out)).append("\n");
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
