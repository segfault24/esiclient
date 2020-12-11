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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:37:36.420-05:00")
public class GetCorporationsCorporationIdBlueprints200Ok {
  @SerializedName("item_id")
  private Long itemId = null;

  /**
   * Type of the location_id
   */
  public enum LocationFlagEnum {
    @SerializedName("AssetSafety")
    ASSETSAFETY("AssetSafety"),
    
    @SerializedName("AutoFit")
    AUTOFIT("AutoFit"),
    
    @SerializedName("Bonus")
    BONUS("Bonus"),
    
    @SerializedName("Booster")
    BOOSTER("Booster"),
    
    @SerializedName("BoosterBay")
    BOOSTERBAY("BoosterBay"),
    
    @SerializedName("Capsule")
    CAPSULE("Capsule"),
    
    @SerializedName("Cargo")
    CARGO("Cargo"),
    
    @SerializedName("CorpDeliveries")
    CORPDELIVERIES("CorpDeliveries"),
    
    @SerializedName("CorpSAG1")
    CORPSAG1("CorpSAG1"),
    
    @SerializedName("CorpSAG2")
    CORPSAG2("CorpSAG2"),
    
    @SerializedName("CorpSAG3")
    CORPSAG3("CorpSAG3"),
    
    @SerializedName("CorpSAG4")
    CORPSAG4("CorpSAG4"),
    
    @SerializedName("CorpSAG5")
    CORPSAG5("CorpSAG5"),
    
    @SerializedName("CorpSAG6")
    CORPSAG6("CorpSAG6"),
    
    @SerializedName("CorpSAG7")
    CORPSAG7("CorpSAG7"),
    
    @SerializedName("CrateLoot")
    CRATELOOT("CrateLoot"),
    
    @SerializedName("Deliveries")
    DELIVERIES("Deliveries"),
    
    @SerializedName("DroneBay")
    DRONEBAY("DroneBay"),
    
    @SerializedName("DustBattle")
    DUSTBATTLE("DustBattle"),
    
    @SerializedName("DustDatabank")
    DUSTDATABANK("DustDatabank"),
    
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
    
    @SerializedName("FrigateEscapeBay")
    FRIGATEESCAPEBAY("FrigateEscapeBay"),
    
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
    
    @SerializedName("Impounded")
    IMPOUNDED("Impounded"),
    
    @SerializedName("JunkyardReprocessed")
    JUNKYARDREPROCESSED("JunkyardReprocessed"),
    
    @SerializedName("JunkyardTrashed")
    JUNKYARDTRASHED("JunkyardTrashed"),
    
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
    
    @SerializedName("OfficeFolder")
    OFFICEFOLDER("OfficeFolder"),
    
    @SerializedName("Pilot")
    PILOT("Pilot"),
    
    @SerializedName("PlanetSurface")
    PLANETSURFACE("PlanetSurface"),
    
    @SerializedName("QuafeBay")
    QUAFEBAY("QuafeBay"),
    
    @SerializedName("Reward")
    REWARD("Reward"),
    
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
    
    @SerializedName("SecondaryStorage")
    SECONDARYSTORAGE("SecondaryStorage"),
    
    @SerializedName("ServiceSlot0")
    SERVICESLOT0("ServiceSlot0"),
    
    @SerializedName("ServiceSlot1")
    SERVICESLOT1("ServiceSlot1"),
    
    @SerializedName("ServiceSlot2")
    SERVICESLOT2("ServiceSlot2"),
    
    @SerializedName("ServiceSlot3")
    SERVICESLOT3("ServiceSlot3"),
    
    @SerializedName("ServiceSlot4")
    SERVICESLOT4("ServiceSlot4"),
    
    @SerializedName("ServiceSlot5")
    SERVICESLOT5("ServiceSlot5"),
    
    @SerializedName("ServiceSlot6")
    SERVICESLOT6("ServiceSlot6"),
    
    @SerializedName("ServiceSlot7")
    SERVICESLOT7("ServiceSlot7"),
    
    @SerializedName("ShipHangar")
    SHIPHANGAR("ShipHangar"),
    
    @SerializedName("ShipOffline")
    SHIPOFFLINE("ShipOffline"),
    
    @SerializedName("Skill")
    SKILL("Skill"),
    
    @SerializedName("SkillInTraining")
    SKILLINTRAINING("SkillInTraining"),
    
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
    
    @SerializedName("StructureActive")
    STRUCTUREACTIVE("StructureActive"),
    
    @SerializedName("StructureFuel")
    STRUCTUREFUEL("StructureFuel"),
    
    @SerializedName("StructureInactive")
    STRUCTUREINACTIVE("StructureInactive"),
    
    @SerializedName("StructureOffline")
    STRUCTUREOFFLINE("StructureOffline"),
    
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
    
    @SerializedName("Wallet")
    WALLET("Wallet"),
    
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

  @SerializedName("material_efficiency")
  private Integer materialEfficiency = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("runs")
  private Integer runs = null;

  @SerializedName("time_efficiency")
  private Integer timeEfficiency = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetCorporationsCorporationIdBlueprints200Ok itemId(Long itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Unique ID for this item.
   * @return itemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Unique ID for this item.")
  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  public GetCorporationsCorporationIdBlueprints200Ok locationFlag(LocationFlagEnum locationFlag) {
    this.locationFlag = locationFlag;
    return this;
  }

   /**
   * Type of the location_id
   * @return locationFlag
  **/
  @ApiModelProperty(example = "null", required = true, value = "Type of the location_id")
  public LocationFlagEnum getLocationFlag() {
    return locationFlag;
  }

  public void setLocationFlag(LocationFlagEnum locationFlag) {
    this.locationFlag = locationFlag;
  }

  public GetCorporationsCorporationIdBlueprints200Ok locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * References a station, a ship or an item_id if this blueprint is located within a container.
   * @return locationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "References a station, a ship or an item_id if this blueprint is located within a container.")
  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCorporationsCorporationIdBlueprints200Ok materialEfficiency(Integer materialEfficiency) {
    this.materialEfficiency = materialEfficiency;
    return this;
  }

   /**
   * Material Efficiency Level of the blueprint.
   * minimum: 0
   * maximum: 25
   * @return materialEfficiency
  **/
  @ApiModelProperty(example = "null", required = true, value = "Material Efficiency Level of the blueprint.")
  public Integer getMaterialEfficiency() {
    return materialEfficiency;
  }

  public void setMaterialEfficiency(Integer materialEfficiency) {
    this.materialEfficiency = materialEfficiency;
  }

  public GetCorporationsCorporationIdBlueprints200Ok quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * A range of numbers with a minimum of -2 and no maximum value where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (e.g. no activities performed on them yet).
   * minimum: -2
   * @return quantity
  **/
  @ApiModelProperty(example = "null", required = true, value = "A range of numbers with a minimum of -2 and no maximum value where -1 is an original and -2 is a copy. It can be a positive integer if it is a stack of blueprint originals fresh from the market (e.g. no activities performed on them yet).")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public GetCorporationsCorporationIdBlueprints200Ok runs(Integer runs) {
    this.runs = runs;
    return this;
  }

   /**
   * Number of runs remaining if the blueprint is a copy, -1 if it is an original.
   * minimum: -1
   * @return runs
  **/
  @ApiModelProperty(example = "null", required = true, value = "Number of runs remaining if the blueprint is a copy, -1 if it is an original.")
  public Integer getRuns() {
    return runs;
  }

  public void setRuns(Integer runs) {
    this.runs = runs;
  }

  public GetCorporationsCorporationIdBlueprints200Ok timeEfficiency(Integer timeEfficiency) {
    this.timeEfficiency = timeEfficiency;
    return this;
  }

   /**
   * Time Efficiency Level of the blueprint.
   * minimum: 0
   * maximum: 20
   * @return timeEfficiency
  **/
  @ApiModelProperty(example = "null", required = true, value = "Time Efficiency Level of the blueprint.")
  public Integer getTimeEfficiency() {
    return timeEfficiency;
  }

  public void setTimeEfficiency(Integer timeEfficiency) {
    this.timeEfficiency = timeEfficiency;
  }

  public GetCorporationsCorporationIdBlueprints200Ok typeId(Integer typeId) {
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
    GetCorporationsCorporationIdBlueprints200Ok getCorporationsCorporationIdBlueprints200Ok = (GetCorporationsCorporationIdBlueprints200Ok) o;
    return Objects.equals(this.itemId, getCorporationsCorporationIdBlueprints200Ok.itemId) &&
        Objects.equals(this.locationFlag, getCorporationsCorporationIdBlueprints200Ok.locationFlag) &&
        Objects.equals(this.locationId, getCorporationsCorporationIdBlueprints200Ok.locationId) &&
        Objects.equals(this.materialEfficiency, getCorporationsCorporationIdBlueprints200Ok.materialEfficiency) &&
        Objects.equals(this.quantity, getCorporationsCorporationIdBlueprints200Ok.quantity) &&
        Objects.equals(this.runs, getCorporationsCorporationIdBlueprints200Ok.runs) &&
        Objects.equals(this.timeEfficiency, getCorporationsCorporationIdBlueprints200Ok.timeEfficiency) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdBlueprints200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, locationFlag, locationId, materialEfficiency, quantity, runs, timeEfficiency, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdBlueprints200Ok {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    locationFlag: ").append(toIndentedString(locationFlag)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    materialEfficiency: ").append(toIndentedString(materialEfficiency)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    runs: ").append(toIndentedString(runs)).append("\n");
    sb.append("    timeEfficiency: ").append(toIndentedString(timeEfficiency)).append("\n");
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

