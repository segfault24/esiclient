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
import is.ccp.tech.esi.models.PostCharactersCharacterIdAssetsLocationsPosition;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class PostCharactersCharacterIdAssetsLocations200Ok {
  @SerializedName("item_id")
  private Long itemId = null;

  @SerializedName("position")
  private PostCharactersCharacterIdAssetsLocationsPosition position = null;

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

  public PostCharactersCharacterIdAssetsLocations200Ok position(PostCharactersCharacterIdAssetsLocationsPosition position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "")
  public PostCharactersCharacterIdAssetsLocationsPosition getPosition() {
    return position;
  }

  public void setPosition(PostCharactersCharacterIdAssetsLocationsPosition position) {
    this.position = position;
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
        Objects.equals(this.position, postCharactersCharacterIdAssetsLocations200Ok.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, position);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdAssetsLocations200Ok {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
