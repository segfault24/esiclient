/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.6
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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-18T22:16:15.536-04:00")
public class GetCharactersCharacterIdTitles200Ok {
  @SerializedName("name")
  private String name = null;

  @SerializedName("title_id")
  private Integer titleId = null;

  public GetCharactersCharacterIdTitles200Ok name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCharactersCharacterIdTitles200Ok titleId(Integer titleId) {
    this.titleId = titleId;
    return this;
  }

   /**
   * title_id integer
   * @return titleId
  **/
  @ApiModelProperty(example = "null", value = "title_id integer")
  public Integer getTitleId() {
    return titleId;
  }

  public void setTitleId(Integer titleId) {
    this.titleId = titleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdTitles200Ok getCharactersCharacterIdTitles200Ok = (GetCharactersCharacterIdTitles200Ok) o;
    return Objects.equals(this.name, getCharactersCharacterIdTitles200Ok.name) &&
        Objects.equals(this.titleId, getCharactersCharacterIdTitles200Ok.titleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, titleId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdTitles200Ok {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    titleId: ").append(toIndentedString(titleId)).append("\n");
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

