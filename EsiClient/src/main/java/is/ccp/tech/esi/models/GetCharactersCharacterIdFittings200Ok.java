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
import is.ccp.tech.esi.models.GetCharactersCharacterIdFittingsItem;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class GetCharactersCharacterIdFittings200Ok {
  @SerializedName("fitting_id")
  private Integer fittingId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("ship_type_id")
  private Integer shipTypeId = null;

  @SerializedName("items")
  private List<GetCharactersCharacterIdFittingsItem> items = new ArrayList<GetCharactersCharacterIdFittingsItem>();

  public GetCharactersCharacterIdFittings200Ok fittingId(Integer fittingId) {
    this.fittingId = fittingId;
    return this;
  }

   /**
   * fitting_id integer
   * @return fittingId
  **/
  @ApiModelProperty(example = "null", required = true, value = "fitting_id integer")
  public Integer getFittingId() {
    return fittingId;
  }

  public void setFittingId(Integer fittingId) {
    this.fittingId = fittingId;
  }

  public GetCharactersCharacterIdFittings200Ok name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetCharactersCharacterIdFittings200Ok description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description string
   * @return description
  **/
  @ApiModelProperty(example = "null", required = true, value = "description string")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetCharactersCharacterIdFittings200Ok shipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
    return this;
  }

   /**
   * ship_type_id integer
   * @return shipTypeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ship_type_id integer")
  public Integer getShipTypeId() {
    return shipTypeId;
  }

  public void setShipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
  }

  public GetCharactersCharacterIdFittings200Ok items(List<GetCharactersCharacterIdFittingsItem> items) {
    this.items = items;
    return this;
  }

  public GetCharactersCharacterIdFittings200Ok addItemsItem(GetCharactersCharacterIdFittingsItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * items array
   * @return items
  **/
  @ApiModelProperty(example = "null", required = true, value = "items array")
  public List<GetCharactersCharacterIdFittingsItem> getItems() {
    return items;
  }

  public void setItems(List<GetCharactersCharacterIdFittingsItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdFittings200Ok getCharactersCharacterIdFittings200Ok = (GetCharactersCharacterIdFittings200Ok) o;
    return Objects.equals(this.fittingId, getCharactersCharacterIdFittings200Ok.fittingId) &&
        Objects.equals(this.name, getCharactersCharacterIdFittings200Ok.name) &&
        Objects.equals(this.description, getCharactersCharacterIdFittings200Ok.description) &&
        Objects.equals(this.shipTypeId, getCharactersCharacterIdFittings200Ok.shipTypeId) &&
        Objects.equals(this.items, getCharactersCharacterIdFittings200Ok.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fittingId, name, description, shipTypeId, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdFittings200Ok {\n");
    
    sb.append("    fittingId: ").append(toIndentedString(fittingId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

