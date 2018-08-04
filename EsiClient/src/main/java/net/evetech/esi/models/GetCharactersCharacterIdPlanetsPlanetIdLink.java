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
 * link object
 */
@ApiModel(description = "link object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-04T12:18:31.101-04:00")
public class GetCharactersCharacterIdPlanetsPlanetIdLink {
  @SerializedName("destination_pin_id")
  private Long destinationPinId = null;

  @SerializedName("link_level")
  private Integer linkLevel = null;

  @SerializedName("source_pin_id")
  private Long sourcePinId = null;

  public GetCharactersCharacterIdPlanetsPlanetIdLink destinationPinId(Long destinationPinId) {
    this.destinationPinId = destinationPinId;
    return this;
  }

   /**
   * destination_pin_id integer
   * @return destinationPinId
  **/
  @ApiModelProperty(example = "null", required = true, value = "destination_pin_id integer")
  public Long getDestinationPinId() {
    return destinationPinId;
  }

  public void setDestinationPinId(Long destinationPinId) {
    this.destinationPinId = destinationPinId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdLink linkLevel(Integer linkLevel) {
    this.linkLevel = linkLevel;
    return this;
  }

   /**
   * link_level integer
   * minimum: 0
   * maximum: 10
   * @return linkLevel
  **/
  @ApiModelProperty(example = "null", required = true, value = "link_level integer")
  public Integer getLinkLevel() {
    return linkLevel;
  }

  public void setLinkLevel(Integer linkLevel) {
    this.linkLevel = linkLevel;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdLink sourcePinId(Long sourcePinId) {
    this.sourcePinId = sourcePinId;
    return this;
  }

   /**
   * source_pin_id integer
   * @return sourcePinId
  **/
  @ApiModelProperty(example = "null", required = true, value = "source_pin_id integer")
  public Long getSourcePinId() {
    return sourcePinId;
  }

  public void setSourcePinId(Long sourcePinId) {
    this.sourcePinId = sourcePinId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanetsPlanetIdLink getCharactersCharacterIdPlanetsPlanetIdLink = (GetCharactersCharacterIdPlanetsPlanetIdLink) o;
    return Objects.equals(this.destinationPinId, getCharactersCharacterIdPlanetsPlanetIdLink.destinationPinId) &&
        Objects.equals(this.linkLevel, getCharactersCharacterIdPlanetsPlanetIdLink.linkLevel) &&
        Objects.equals(this.sourcePinId, getCharactersCharacterIdPlanetsPlanetIdLink.sourcePinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationPinId, linkLevel, sourcePinId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdLink {\n");
    
    sb.append("    destinationPinId: ").append(toIndentedString(destinationPinId)).append("\n");
    sb.append("    linkLevel: ").append(toIndentedString(linkLevel)).append("\n");
    sb.append("    sourcePinId: ").append(toIndentedString(sourcePinId)).append("\n");
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
