/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.7.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package is.ccp.tech.esi.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class GetCharactersCharacterIdPortraitOk {
  @SerializedName("px64x64")
  private String px64x64 = null;

  @SerializedName("px128x128")
  private String px128x128 = null;

  @SerializedName("px256x256")
  private String px256x256 = null;

  @SerializedName("px512x512")
  private String px512x512 = null;

  public GetCharactersCharacterIdPortraitOk px64x64(String px64x64) {
    this.px64x64 = px64x64;
    return this;
  }

   /**
   * px64x64 string
   * @return px64x64
  **/
  @ApiModelProperty(example = "null", value = "px64x64 string")
  public String getPx64x64() {
    return px64x64;
  }

  public void setPx64x64(String px64x64) {
    this.px64x64 = px64x64;
  }

  public GetCharactersCharacterIdPortraitOk px128x128(String px128x128) {
    this.px128x128 = px128x128;
    return this;
  }

   /**
   * px128x128 string
   * @return px128x128
  **/
  @ApiModelProperty(example = "null", value = "px128x128 string")
  public String getPx128x128() {
    return px128x128;
  }

  public void setPx128x128(String px128x128) {
    this.px128x128 = px128x128;
  }

  public GetCharactersCharacterIdPortraitOk px256x256(String px256x256) {
    this.px256x256 = px256x256;
    return this;
  }

   /**
   * px256x256 string
   * @return px256x256
  **/
  @ApiModelProperty(example = "null", value = "px256x256 string")
  public String getPx256x256() {
    return px256x256;
  }

  public void setPx256x256(String px256x256) {
    this.px256x256 = px256x256;
  }

  public GetCharactersCharacterIdPortraitOk px512x512(String px512x512) {
    this.px512x512 = px512x512;
    return this;
  }

   /**
   * px512x512 string
   * @return px512x512
  **/
  @ApiModelProperty(example = "null", value = "px512x512 string")
  public String getPx512x512() {
    return px512x512;
  }

  public void setPx512x512(String px512x512) {
    this.px512x512 = px512x512;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPortraitOk getCharactersCharacterIdPortraitOk = (GetCharactersCharacterIdPortraitOk) o;
    return Objects.equals(this.px64x64, getCharactersCharacterIdPortraitOk.px64x64) &&
        Objects.equals(this.px128x128, getCharactersCharacterIdPortraitOk.px128x128) &&
        Objects.equals(this.px256x256, getCharactersCharacterIdPortraitOk.px256x256) &&
        Objects.equals(this.px512x512, getCharactersCharacterIdPortraitOk.px512x512);
  }

  @Override
  public int hashCode() {
    return Objects.hash(px64x64, px128x128, px256x256, px512x512);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPortraitOk {\n");
    
    sb.append("    px64x64: ").append(toIndentedString(px64x64)).append("\n");
    sb.append("    px128x128: ").append(toIndentedString(px128x128)).append("\n");
    sb.append("    px256x256: ").append(toIndentedString(px256x256)).append("\n");
    sb.append("    px512x512: ").append(toIndentedString(px512x512)).append("\n");
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
