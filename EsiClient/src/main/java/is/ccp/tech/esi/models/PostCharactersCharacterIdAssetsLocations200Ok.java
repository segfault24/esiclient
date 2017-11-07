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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-07T00:36:23.258-05:00")
public class PostCharactersCharacterIdAssetsLocations200Ok {
  @SerializedName("item_id")
  private Long itemId = null;

  @SerializedName("x")
  private Double x = null;

  @SerializedName("y")
  private Double y = null;

  @SerializedName("z")
  private Double z = null;

  public PostCharactersCharacterIdAssetsLocations200Ok itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * item_id integer
   * @return itemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "item_id integer")
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public PostCharactersCharacterIdAssetsLocations200Ok x(Double x) {
    this.x = x;
    return this;
  }

   /**
   * x number
   * @return x
  **/
  @ApiModelProperty(example = "null", required = true, value = "x number")
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public PostCharactersCharacterIdAssetsLocations200Ok y(Double y) {
    this.y = y;
    return this;
  }

   /**
   * y number
   * @return y
  **/
  @ApiModelProperty(example = "null", required = true, value = "y number")
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public PostCharactersCharacterIdAssetsLocations200Ok z(Double z) {
    this.z = z;
    return this;
  }

   /**
   * z number
   * @return z
  **/
  @ApiModelProperty(example = "null", required = true, value = "z number")
  public Double getZ() {
    return z;
  }

  public void setZ(Double z) {
    this.z = z;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersCharacterIdAssetsLocations200Ok postCharactersCharacterIdAssetsLocations200Ok = (PostCharactersCharacterIdAssetsLocations200Ok) o;
    return Objects.equals(this.itemId, postCharactersCharacterIdAssetsLocations200Ok.itemId) &&
        Objects.equals(this.x, postCharactersCharacterIdAssetsLocations200Ok.x) &&
        Objects.equals(this.y, postCharactersCharacterIdAssetsLocations200Ok.y) &&
        Objects.equals(this.z, postCharactersCharacterIdAssetsLocations200Ok.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, x, y, z);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdAssetsLocations200Ok {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

