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
 * Optional object that is returned if a bookmark was made on a particular item.
 */
@ApiModel(description = "Optional object that is returned if a bookmark was made on a particular item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:37:36.420-05:00")
public class GetCorporationsCorporationIdBookmarksItem {
  @SerializedName("item_id")
  private Long itemId = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetCorporationsCorporationIdBookmarksItem itemId(Long itemId) {
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

  public GetCorporationsCorporationIdBookmarksItem typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * type_id integer
   * @return typeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "type_id integer")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdBookmarksItem getCorporationsCorporationIdBookmarksItem = (GetCorporationsCorporationIdBookmarksItem) o;
    return Objects.equals(this.itemId, getCorporationsCorporationIdBookmarksItem.itemId) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdBookmarksItem.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdBookmarksItem {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

