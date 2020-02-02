/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 1.2.9
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
 * item object
 */
@ApiModel(description = "item object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-01T20:01:07.682-05:00")
public class GetKillmailsKillmailIdKillmailHashItemsItem {
  @SerializedName("flag")
  private Integer flag = null;

  @SerializedName("item_type_id")
  private Integer itemTypeId = null;

  @SerializedName("quantity_destroyed")
  private Long quantityDestroyed = null;

  @SerializedName("quantity_dropped")
  private Long quantityDropped = null;

  @SerializedName("singleton")
  private Integer singleton = null;

  public GetKillmailsKillmailIdKillmailHashItemsItem flag(Integer flag) {
    this.flag = flag;
    return this;
  }

   /**
   * flag integer
   * @return flag
  **/
  @ApiModelProperty(example = "null", required = true, value = "flag integer")
  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public GetKillmailsKillmailIdKillmailHashItemsItem itemTypeId(Integer itemTypeId) {
    this.itemTypeId = itemTypeId;
    return this;
  }

   /**
   * item_type_id integer
   * @return itemTypeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "item_type_id integer")
  public Integer getItemTypeId() {
    return itemTypeId;
  }

  public void setItemTypeId(Integer itemTypeId) {
    this.itemTypeId = itemTypeId;
  }

  public GetKillmailsKillmailIdKillmailHashItemsItem quantityDestroyed(Long quantityDestroyed) {
    this.quantityDestroyed = quantityDestroyed;
    return this;
  }

   /**
   * quantity_destroyed integer
   * @return quantityDestroyed
  **/
  @ApiModelProperty(example = "null", value = "quantity_destroyed integer")
  public Long getQuantityDestroyed() {
    return quantityDestroyed;
  }

  public void setQuantityDestroyed(Long quantityDestroyed) {
    this.quantityDestroyed = quantityDestroyed;
  }

  public GetKillmailsKillmailIdKillmailHashItemsItem quantityDropped(Long quantityDropped) {
    this.quantityDropped = quantityDropped;
    return this;
  }

   /**
   * quantity_dropped integer
   * @return quantityDropped
  **/
  @ApiModelProperty(example = "null", value = "quantity_dropped integer")
  public Long getQuantityDropped() {
    return quantityDropped;
  }

  public void setQuantityDropped(Long quantityDropped) {
    this.quantityDropped = quantityDropped;
  }

  public GetKillmailsKillmailIdKillmailHashItemsItem singleton(Integer singleton) {
    this.singleton = singleton;
    return this;
  }

   /**
   * singleton integer
   * @return singleton
  **/
  @ApiModelProperty(example = "null", required = true, value = "singleton integer")
  public Integer getSingleton() {
    return singleton;
  }

  public void setSingleton(Integer singleton) {
    this.singleton = singleton;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKillmailsKillmailIdKillmailHashItemsItem getKillmailsKillmailIdKillmailHashItemsItem = (GetKillmailsKillmailIdKillmailHashItemsItem) o;
    return Objects.equals(this.flag, getKillmailsKillmailIdKillmailHashItemsItem.flag) &&
        Objects.equals(this.itemTypeId, getKillmailsKillmailIdKillmailHashItemsItem.itemTypeId) &&
        Objects.equals(this.quantityDestroyed, getKillmailsKillmailIdKillmailHashItemsItem.quantityDestroyed) &&
        Objects.equals(this.quantityDropped, getKillmailsKillmailIdKillmailHashItemsItem.quantityDropped) &&
        Objects.equals(this.singleton, getKillmailsKillmailIdKillmailHashItemsItem.singleton);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag, itemTypeId, quantityDestroyed, quantityDropped, singleton);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKillmailsKillmailIdKillmailHashItemsItem {\n");
    
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
    sb.append("    itemTypeId: ").append(toIndentedString(itemTypeId)).append("\n");
    sb.append("    quantityDestroyed: ").append(toIndentedString(quantityDestroyed)).append("\n");
    sb.append("    quantityDropped: ").append(toIndentedString(quantityDropped)).append("\n");
    sb.append("    singleton: ").append(toIndentedString(singleton)).append("\n");
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

