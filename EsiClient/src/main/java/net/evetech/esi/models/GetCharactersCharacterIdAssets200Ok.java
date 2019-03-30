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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-30T13:35:06.976-04:00")
public class GetCharactersCharacterIdAssets200Ok {
  @SerializedName("is_blueprint_copy")
  private Boolean isBlueprintCopy = null;

  @SerializedName("is_singleton")
  private Boolean isSingleton = null;

  @SerializedName("item_id")
  private Long itemId = null;

  /**
   * location_flag string
   */
  public enum LocationFlagEnum {
    @SerializedName("AssetSafety")
    ASSETSAFETY("AssetSafety"),
    
    @SerializedName("AutoFit")
    AUTOFIT("AutoFit"),
    
    @SerializedName("BoosterBay")
    BOOSTERBAY("BoosterBay"),
    
    @SerializedName("Cargo")
    CARGO("Cargo"),
    
    @SerializedName("CorpseBay")
    CORPSEBAY("CorpseBay"),
    
    @SerializedName("Deliveries")
    DELIVERIES("Deliveries"),
    
    @SerializedName("DroneBay")
    DRONEBAY("DroneBay"),
    
    @SerializedName("FighterBay")
    FIGHTERBAY("FighterBay"),
    
    @SerializedName("FighterTube0")
    FIGHTERTUBE0("FighterTube0"),
    
    @SerializedName("FighterTube1")
    FIGHTERTUBE1("FighterTube1"),
    
    @SerializedName("FighterTube2")
    FIGHTERTUBE2("FighterTube2"),
    
    @SerializedName("FighterTube3")
    FIGHTERTUBE3("FighterTube3"),
    
    @SerializedName("FighterTube4")
    FIGHTERTUBE4("FighterTube4"),
    
    @SerializedName("FleetHangar")
    FLEETHANGAR("FleetHangar"),
    
    @SerializedName("Hangar")
    HANGAR("Hangar"),
    
    @SerializedName("HangarAll")
    HANGARALL("HangarAll"),
    
    @SerializedName("HiSlot0")
    HISLOT0("HiSlot0"),
    
    @SerializedName("HiSlot1")
    HISLOT1("HiSlot1"),
    
    @SerializedName("HiSlot2")
    HISLOT2("HiSlot2"),
    
    @SerializedName("HiSlot3")
    HISLOT3("HiSlot3"),
    
    @SerializedName("HiSlot4")
    HISLOT4("HiSlot4"),
    
    @SerializedName("HiSlot5")
    HISLOT5("HiSlot5"),
    
    @SerializedName("HiSlot6")
    HISLOT6("HiSlot6"),
    
    @SerializedName("HiSlot7")
    HISLOT7("HiSlot7"),
    
    @SerializedName("HiddenModifiers")
    HIDDENMODIFIERS("HiddenModifiers"),
    
    @SerializedName("Implant")
    IMPLANT("Implant"),
    
    @SerializedName("LoSlot0")
    LOSLOT0("LoSlot0"),
    
    @SerializedName("LoSlot1")
    LOSLOT1("LoSlot1"),
    
    @SerializedName("LoSlot2")
    LOSLOT2("LoSlot2"),
    
    @SerializedName("LoSlot3")
    LOSLOT3("LoSlot3"),
    
    @SerializedName("LoSlot4")
    LOSLOT4("LoSlot4"),
    
    @SerializedName("LoSlot5")
    LOSLOT5("LoSlot5"),
    
    @SerializedName("LoSlot6")
    LOSLOT6("LoSlot6"),
    
    @SerializedName("LoSlot7")
    LOSLOT7("LoSlot7"),
    
    @SerializedName("Locked")
    LOCKED("Locked"),
    
    @SerializedName("MedSlot0")
    MEDSLOT0("MedSlot0"),
    
    @SerializedName("MedSlot1")
    MEDSLOT1("MedSlot1"),
    
    @SerializedName("MedSlot2")
    MEDSLOT2("MedSlot2"),
    
    @SerializedName("MedSlot3")
    MEDSLOT3("MedSlot3"),
    
    @SerializedName("MedSlot4")
    MEDSLOT4("MedSlot4"),
    
    @SerializedName("MedSlot5")
    MEDSLOT5("MedSlot5"),
    
    @SerializedName("MedSlot6")
    MEDSLOT6("MedSlot6"),
    
    @SerializedName("MedSlot7")
    MEDSLOT7("MedSlot7"),
    
    @SerializedName("QuafeBay")
    QUAFEBAY("QuafeBay"),
    
    @SerializedName("RigSlot0")
    RIGSLOT0("RigSlot0"),
    
    @SerializedName("RigSlot1")
    RIGSLOT1("RigSlot1"),
    
    @SerializedName("RigSlot2")
    RIGSLOT2("RigSlot2"),
    
    @SerializedName("RigSlot3")
    RIGSLOT3("RigSlot3"),
    
    @SerializedName("RigSlot4")
    RIGSLOT4("RigSlot4"),
    
    @SerializedName("RigSlot5")
    RIGSLOT5("RigSlot5"),
    
    @SerializedName("RigSlot6")
    RIGSLOT6("RigSlot6"),
    
    @SerializedName("RigSlot7")
    RIGSLOT7("RigSlot7"),
    
    @SerializedName("ShipHangar")
    SHIPHANGAR("ShipHangar"),
    
    @SerializedName("Skill")
    SKILL("Skill"),
    
    @SerializedName("SpecializedAmmoHold")
    SPECIALIZEDAMMOHOLD("SpecializedAmmoHold"),
    
    @SerializedName("SpecializedCommandCenterHold")
    SPECIALIZEDCOMMANDCENTERHOLD("SpecializedCommandCenterHold"),
    
    @SerializedName("SpecializedFuelBay")
    SPECIALIZEDFUELBAY("SpecializedFuelBay"),
    
    @SerializedName("SpecializedGasHold")
    SPECIALIZEDGASHOLD("SpecializedGasHold"),
    
    @SerializedName("SpecializedIndustrialShipHold")
    SPECIALIZEDINDUSTRIALSHIPHOLD("SpecializedIndustrialShipHold"),
    
    @SerializedName("SpecializedLargeShipHold")
    SPECIALIZEDLARGESHIPHOLD("SpecializedLargeShipHold"),
    
    @SerializedName("SpecializedMaterialBay")
    SPECIALIZEDMATERIALBAY("SpecializedMaterialBay"),
    
    @SerializedName("SpecializedMediumShipHold")
    SPECIALIZEDMEDIUMSHIPHOLD("SpecializedMediumShipHold"),
    
    @SerializedName("SpecializedMineralHold")
    SPECIALIZEDMINERALHOLD("SpecializedMineralHold"),
    
    @SerializedName("SpecializedOreHold")
    SPECIALIZEDOREHOLD("SpecializedOreHold"),
    
    @SerializedName("SpecializedPlanetaryCommoditiesHold")
    SPECIALIZEDPLANETARYCOMMODITIESHOLD("SpecializedPlanetaryCommoditiesHold"),
    
    @SerializedName("SpecializedSalvageHold")
    SPECIALIZEDSALVAGEHOLD("SpecializedSalvageHold"),
    
    @SerializedName("SpecializedShipHold")
    SPECIALIZEDSHIPHOLD("SpecializedShipHold"),
    
    @SerializedName("SpecializedSmallShipHold")
    SPECIALIZEDSMALLSHIPHOLD("SpecializedSmallShipHold"),
    
    @SerializedName("SubSystemBay")
    SUBSYSTEMBAY("SubSystemBay"),
    
    @SerializedName("SubSystemSlot0")
    SUBSYSTEMSLOT0("SubSystemSlot0"),
    
    @SerializedName("SubSystemSlot1")
    SUBSYSTEMSLOT1("SubSystemSlot1"),
    
    @SerializedName("SubSystemSlot2")
    SUBSYSTEMSLOT2("SubSystemSlot2"),
    
    @SerializedName("SubSystemSlot3")
    SUBSYSTEMSLOT3("SubSystemSlot3"),
    
    @SerializedName("SubSystemSlot4")
    SUBSYSTEMSLOT4("SubSystemSlot4"),
    
    @SerializedName("SubSystemSlot5")
    SUBSYSTEMSLOT5("SubSystemSlot5"),
    
    @SerializedName("SubSystemSlot6")
    SUBSYSTEMSLOT6("SubSystemSlot6"),
    
    @SerializedName("SubSystemSlot7")
    SUBSYSTEMSLOT7("SubSystemSlot7"),
    
    @SerializedName("Unlocked")
    UNLOCKED("Unlocked"),
    
    @SerializedName("Wardrobe")
    WARDROBE("Wardrobe");

    private String value;

    LocationFlagEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("location_flag")
  private LocationFlagEnum locationFlag = null;

  @SerializedName("location_id")
  private Long locationId = null;

  /**
   * location_type string
   */
  public enum LocationTypeEnum {
    @SerializedName("station")
    STATION("station"),
    
    @SerializedName("solar_system")
    SOLAR_SYSTEM("solar_system"),
    
    @SerializedName("other")
    OTHER("other");

    private String value;

    LocationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("location_type")
  private LocationTypeEnum locationType = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetCharactersCharacterIdAssets200Ok isBlueprintCopy(Boolean isBlueprintCopy) {
    this.isBlueprintCopy = isBlueprintCopy;
    return this;
  }

   /**
   * is_blueprint_copy boolean
   * @return isBlueprintCopy
  **/
  @ApiModelProperty(example = "null", value = "is_blueprint_copy boolean")
  public Boolean getIsBlueprintCopy() {
    return isBlueprintCopy;
  }

  public void setIsBlueprintCopy(Boolean isBlueprintCopy) {
    this.isBlueprintCopy = isBlueprintCopy;
  }

  public GetCharactersCharacterIdAssets200Ok isSingleton(Boolean isSingleton) {
    this.isSingleton = isSingleton;
    return this;
  }

   /**
   * is_singleton boolean
   * @return isSingleton
  **/
  @ApiModelProperty(example = "null", required = true, value = "is_singleton boolean")
  public Boolean getIsSingleton() {
    return isSingleton;
  }

  public void setIsSingleton(Boolean isSingleton) {
    this.isSingleton = isSingleton;
  }

  public GetCharactersCharacterIdAssets200Ok itemId(Long itemId) {
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

  public GetCharactersCharacterIdAssets200Ok locationFlag(LocationFlagEnum locationFlag) {
    this.locationFlag = locationFlag;
    return this;
  }

   /**
   * location_flag string
   * @return locationFlag
  **/
  @ApiModelProperty(example = "null", required = true, value = "location_flag string")
  public LocationFlagEnum getLocationFlag() {
    return locationFlag;
  }

  public void setLocationFlag(LocationFlagEnum locationFlag) {
    this.locationFlag = locationFlag;
  }

  public GetCharactersCharacterIdAssets200Ok locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * location_id integer
   * @return locationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "location_id integer")
  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCharactersCharacterIdAssets200Ok locationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * location_type string
   * @return locationType
  **/
  @ApiModelProperty(example = "null", required = true, value = "location_type string")
  public LocationTypeEnum getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }

  public GetCharactersCharacterIdAssets200Ok quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity integer
   * @return quantity
  **/
  @ApiModelProperty(example = "null", required = true, value = "quantity integer")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public GetCharactersCharacterIdAssets200Ok typeId(Integer typeId) {
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
    GetCharactersCharacterIdAssets200Ok getCharactersCharacterIdAssets200Ok = (GetCharactersCharacterIdAssets200Ok) o;
    return Objects.equals(this.isBlueprintCopy, getCharactersCharacterIdAssets200Ok.isBlueprintCopy) &&
        Objects.equals(this.isSingleton, getCharactersCharacterIdAssets200Ok.isSingleton) &&
        Objects.equals(this.itemId, getCharactersCharacterIdAssets200Ok.itemId) &&
        Objects.equals(this.locationFlag, getCharactersCharacterIdAssets200Ok.locationFlag) &&
        Objects.equals(this.locationId, getCharactersCharacterIdAssets200Ok.locationId) &&
        Objects.equals(this.locationType, getCharactersCharacterIdAssets200Ok.locationType) &&
        Objects.equals(this.quantity, getCharactersCharacterIdAssets200Ok.quantity) &&
        Objects.equals(this.typeId, getCharactersCharacterIdAssets200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBlueprintCopy, isSingleton, itemId, locationFlag, locationId, locationType, quantity, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdAssets200Ok {\n");
    
    sb.append("    isBlueprintCopy: ").append(toIndentedString(isBlueprintCopy)).append("\n");
    sb.append("    isSingleton: ").append(toIndentedString(isSingleton)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    locationFlag: ").append(toIndentedString(locationFlag)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
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

