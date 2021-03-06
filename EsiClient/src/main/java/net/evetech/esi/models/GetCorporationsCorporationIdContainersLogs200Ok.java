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
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:41:27.859-05:00")
public class GetCorporationsCorporationIdContainersLogs200Ok {
  /**
   * action string
   */
  public enum ActionEnum {
    @SerializedName("add")
    ADD("add"),
    
    @SerializedName("assemble")
    ASSEMBLE("assemble"),
    
    @SerializedName("configure")
    CONFIGURE("configure"),
    
    @SerializedName("enter_password")
    ENTER_PASSWORD("enter_password"),
    
    @SerializedName("lock")
    LOCK("lock"),
    
    @SerializedName("move")
    MOVE("move"),
    
    @SerializedName("repackage")
    REPACKAGE("repackage"),
    
    @SerializedName("set_name")
    SET_NAME("set_name"),
    
    @SerializedName("set_password")
    SET_PASSWORD("set_password"),
    
    @SerializedName("unlock")
    UNLOCK("unlock");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("action")
  private ActionEnum action = null;

  @SerializedName("character_id")
  private Integer characterId = null;

  @SerializedName("container_id")
  private Long containerId = null;

  @SerializedName("container_type_id")
  private Integer containerTypeId = null;

  /**
   * location_flag string
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

  @SerializedName("logged_at")
  private DateTime loggedAt = null;

  @SerializedName("new_config_bitmask")
  private Integer newConfigBitmask = null;

  @SerializedName("old_config_bitmask")
  private Integer oldConfigBitmask = null;

  /**
   * Type of password set if action is of type SetPassword or EnterPassword
   */
  public enum PasswordTypeEnum {
    @SerializedName("config")
    CONFIG("config"),
    
    @SerializedName("general")
    GENERAL("general");

    private String value;

    PasswordTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("password_type")
  private PasswordTypeEnum passwordType = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetCorporationsCorporationIdContainersLogs200Ok action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * action string
   * @return action
  **/
  @ApiModelProperty(example = "null", required = true, value = "action string")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public GetCorporationsCorporationIdContainersLogs200Ok characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * ID of the character who performed the action.
   * @return characterId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID of the character who performed the action.")
  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetCorporationsCorporationIdContainersLogs200Ok containerId(Long containerId) {
    this.containerId = containerId;
    return this;
  }

   /**
   * ID of the container
   * @return containerId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID of the container")
  public Long getContainerId() {
    return containerId;
  }

  public void setContainerId(Long containerId) {
    this.containerId = containerId;
  }

  public GetCorporationsCorporationIdContainersLogs200Ok containerTypeId(Integer containerTypeId) {
    this.containerTypeId = containerTypeId;
    return this;
  }

   /**
   * Type ID of the container
   * @return containerTypeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Type ID of the container")
  public Integer getContainerTypeId() {
    return containerTypeId;
  }

  public void setContainerTypeId(Integer containerTypeId) {
    this.containerTypeId = containerTypeId;
  }

  public GetCorporationsCorporationIdContainersLogs200Ok locationFlag(LocationFlagEnum locationFlag) {
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

  public GetCorporationsCorporationIdContainersLogs200Ok locationId(Long locationId) {
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

  public GetCorporationsCorporationIdContainersLogs200Ok loggedAt(DateTime loggedAt) {
    this.loggedAt = loggedAt;
    return this;
  }

   /**
   * Timestamp when this log was created
   * @return loggedAt
  **/
  @ApiModelProperty(example = "null", required = true, value = "Timestamp when this log was created")
  public DateTime getLoggedAt() {
    return loggedAt;
  }

  public void setLoggedAt(DateTime loggedAt) {
    this.loggedAt = loggedAt;
  }

  public GetCorporationsCorporationIdContainersLogs200Ok newConfigBitmask(Integer newConfigBitmask) {
    this.newConfigBitmask = newConfigBitmask;
    return this;
  }

   /**
   * new_config_bitmask integer
   * @return newConfigBitmask
  **/
  @ApiModelProperty(example = "null", value = "new_config_bitmask integer")
  public Integer getNewConfigBitmask() {
    return newConfigBitmask;
  }

  public void setNewConfigBitmask(Integer newConfigBitmask) {
    this.newConfigBitmask = newConfigBitmask;
  }

  public GetCorporationsCorporationIdContainersLogs200Ok oldConfigBitmask(Integer oldConfigBitmask) {
    this.oldConfigBitmask = oldConfigBitmask;
    return this;
  }

   /**
   * old_config_bitmask integer
   * @return oldConfigBitmask
  **/
  @ApiModelProperty(example = "null", value = "old_config_bitmask integer")
  public Integer getOldConfigBitmask() {
    return oldConfigBitmask;
  }

  public void setOldConfigBitmask(Integer oldConfigBitmask) {
    this.oldConfigBitmask = oldConfigBitmask;
  }

  public GetCorporationsCorporationIdContainersLogs200Ok passwordType(PasswordTypeEnum passwordType) {
    this.passwordType = passwordType;
    return this;
  }

   /**
   * Type of password set if action is of type SetPassword or EnterPassword
   * @return passwordType
  **/
  @ApiModelProperty(example = "null", value = "Type of password set if action is of type SetPassword or EnterPassword")
  public PasswordTypeEnum getPasswordType() {
    return passwordType;
  }

  public void setPasswordType(PasswordTypeEnum passwordType) {
    this.passwordType = passwordType;
  }

  public GetCorporationsCorporationIdContainersLogs200Ok quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity of the item being acted upon
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "Quantity of the item being acted upon")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public GetCorporationsCorporationIdContainersLogs200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Type ID of the item being acted upon
   * @return typeId
  **/
  @ApiModelProperty(example = "null", value = "Type ID of the item being acted upon")
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
    GetCorporationsCorporationIdContainersLogs200Ok getCorporationsCorporationIdContainersLogs200Ok = (GetCorporationsCorporationIdContainersLogs200Ok) o;
    return Objects.equals(this.action, getCorporationsCorporationIdContainersLogs200Ok.action) &&
        Objects.equals(this.characterId, getCorporationsCorporationIdContainersLogs200Ok.characterId) &&
        Objects.equals(this.containerId, getCorporationsCorporationIdContainersLogs200Ok.containerId) &&
        Objects.equals(this.containerTypeId, getCorporationsCorporationIdContainersLogs200Ok.containerTypeId) &&
        Objects.equals(this.locationFlag, getCorporationsCorporationIdContainersLogs200Ok.locationFlag) &&
        Objects.equals(this.locationId, getCorporationsCorporationIdContainersLogs200Ok.locationId) &&
        Objects.equals(this.loggedAt, getCorporationsCorporationIdContainersLogs200Ok.loggedAt) &&
        Objects.equals(this.newConfigBitmask, getCorporationsCorporationIdContainersLogs200Ok.newConfigBitmask) &&
        Objects.equals(this.oldConfigBitmask, getCorporationsCorporationIdContainersLogs200Ok.oldConfigBitmask) &&
        Objects.equals(this.passwordType, getCorporationsCorporationIdContainersLogs200Ok.passwordType) &&
        Objects.equals(this.quantity, getCorporationsCorporationIdContainersLogs200Ok.quantity) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdContainersLogs200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, characterId, containerId, containerTypeId, locationFlag, locationId, loggedAt, newConfigBitmask, oldConfigBitmask, passwordType, quantity, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdContainersLogs200Ok {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    containerTypeId: ").append(toIndentedString(containerTypeId)).append("\n");
    sb.append("    locationFlag: ").append(toIndentedString(locationFlag)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    loggedAt: ").append(toIndentedString(loggedAt)).append("\n");
    sb.append("    newConfigBitmask: ").append(toIndentedString(newConfigBitmask)).append("\n");
    sb.append("    oldConfigBitmask: ").append(toIndentedString(oldConfigBitmask)).append("\n");
    sb.append("    passwordType: ").append(toIndentedString(passwordType)).append("\n");
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

