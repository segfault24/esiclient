/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.7.1
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
 * graphic object
 */
@ApiModel(description = "graphic object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-07T00:36:23.258-05:00")
public class GetCharactersCharacterIdMedalsGraphic {
  @SerializedName("part")
  private Integer part = null;

  @SerializedName("layer")
  private Integer layer = null;

  @SerializedName("graphic")
  private String graphic = null;

  @SerializedName("color")
  private Integer color = null;

  public GetCharactersCharacterIdMedalsGraphic part(Integer part) {
    this.part = part;
    return this;
  }

   /**
   * part integer
   * @return part
  **/
  @ApiModelProperty(example = "null", required = true, value = "part integer")
  public Integer getPart() {
    return part;
  }

  public void setPart(Integer part) {
    this.part = part;
  }

  public GetCharactersCharacterIdMedalsGraphic layer(Integer layer) {
    this.layer = layer;
    return this;
  }

   /**
   * layer integer
   * @return layer
  **/
  @ApiModelProperty(example = "null", required = true, value = "layer integer")
  public Integer getLayer() {
    return layer;
  }

  public void setLayer(Integer layer) {
    this.layer = layer;
  }

  public GetCharactersCharacterIdMedalsGraphic graphic(String graphic) {
    this.graphic = graphic;
    return this;
  }

   /**
   * graphic string
   * @return graphic
  **/
  @ApiModelProperty(example = "null", required = true, value = "graphic string")
  public String getGraphic() {
    return graphic;
  }

  public void setGraphic(String graphic) {
    this.graphic = graphic;
  }

  public GetCharactersCharacterIdMedalsGraphic color(Integer color) {
    this.color = color;
    return this;
  }

   /**
   * color integer
   * @return color
  **/
  @ApiModelProperty(example = "null", value = "color integer")
  public Integer getColor() {
    return color;
  }

  public void setColor(Integer color) {
    this.color = color;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdMedalsGraphic getCharactersCharacterIdMedalsGraphic = (GetCharactersCharacterIdMedalsGraphic) o;
    return Objects.equals(this.part, getCharactersCharacterIdMedalsGraphic.part) &&
        Objects.equals(this.layer, getCharactersCharacterIdMedalsGraphic.layer) &&
        Objects.equals(this.graphic, getCharactersCharacterIdMedalsGraphic.graphic) &&
        Objects.equals(this.color, getCharactersCharacterIdMedalsGraphic.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(part, layer, graphic, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMedalsGraphic {\n");
    
    sb.append("    part: ").append(toIndentedString(part)).append("\n");
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
    sb.append("    graphic: ").append(toIndentedString(graphic)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

