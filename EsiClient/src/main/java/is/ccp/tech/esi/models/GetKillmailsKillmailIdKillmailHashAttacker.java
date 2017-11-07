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
 * attacker object
 */
@ApiModel(description = "attacker object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-07T00:36:23.258-05:00")
public class GetKillmailsKillmailIdKillmailHashAttacker {
  @SerializedName("character_id")
  private Integer characterId = null;

  @SerializedName("corporation_id")
  private Integer corporationId = null;

  @SerializedName("alliance_id")
  private Integer allianceId = null;

  @SerializedName("faction_id")
  private Integer factionId = null;

  @SerializedName("security_status")
  private Float securityStatus = null;

  @SerializedName("final_blow")
  private Boolean finalBlow = null;

  @SerializedName("damage_done")
  private Integer damageDone = null;

  @SerializedName("ship_type_id")
  private Integer shipTypeId = null;

  @SerializedName("weapon_type_id")
  private Integer weaponTypeId = null;

  public GetKillmailsKillmailIdKillmailHashAttacker characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * character_id integer
   * @return characterId
  **/
  @ApiModelProperty(example = "null", value = "character_id integer")
  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

   /**
   * corporation_id integer
   * @return corporationId
  **/
  @ApiModelProperty(example = "null", value = "corporation_id integer")
  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker allianceId(Integer allianceId) {
    this.allianceId = allianceId;
    return this;
  }

   /**
   * alliance_id integer
   * @return allianceId
  **/
  @ApiModelProperty(example = "null", value = "alliance_id integer")
  public Integer getAllianceId() {
    return allianceId;
  }

  public void setAllianceId(Integer allianceId) {
    this.allianceId = allianceId;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

   /**
   * faction_id integer
   * @return factionId
  **/
  @ApiModelProperty(example = "null", value = "faction_id integer")
  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker securityStatus(Float securityStatus) {
    this.securityStatus = securityStatus;
    return this;
  }

   /**
   * Security status for the attacker 
   * @return securityStatus
  **/
  @ApiModelProperty(example = "null", required = true, value = "Security status for the attacker ")
  public Float getSecurityStatus() {
    return securityStatus;
  }

  public void setSecurityStatus(Float securityStatus) {
    this.securityStatus = securityStatus;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker finalBlow(Boolean finalBlow) {
    this.finalBlow = finalBlow;
    return this;
  }

   /**
   * Was the attacker the one to achieve the final blow 
   * @return finalBlow
  **/
  @ApiModelProperty(example = "null", required = true, value = "Was the attacker the one to achieve the final blow ")
  public Boolean getFinalBlow() {
    return finalBlow;
  }

  public void setFinalBlow(Boolean finalBlow) {
    this.finalBlow = finalBlow;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker damageDone(Integer damageDone) {
    this.damageDone = damageDone;
    return this;
  }

   /**
   * damage_done integer
   * @return damageDone
  **/
  @ApiModelProperty(example = "null", required = true, value = "damage_done integer")
  public Integer getDamageDone() {
    return damageDone;
  }

  public void setDamageDone(Integer damageDone) {
    this.damageDone = damageDone;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker shipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
    return this;
  }

   /**
   * What ship was the attacker flying 
   * @return shipTypeId
  **/
  @ApiModelProperty(example = "null", value = "What ship was the attacker flying ")
  public Integer getShipTypeId() {
    return shipTypeId;
  }

  public void setShipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
  }

  public GetKillmailsKillmailIdKillmailHashAttacker weaponTypeId(Integer weaponTypeId) {
    this.weaponTypeId = weaponTypeId;
    return this;
  }

   /**
   * What weapon was used by the attacker for the kill 
   * @return weaponTypeId
  **/
  @ApiModelProperty(example = "null", value = "What weapon was used by the attacker for the kill ")
  public Integer getWeaponTypeId() {
    return weaponTypeId;
  }

  public void setWeaponTypeId(Integer weaponTypeId) {
    this.weaponTypeId = weaponTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKillmailsKillmailIdKillmailHashAttacker getKillmailsKillmailIdKillmailHashAttacker = (GetKillmailsKillmailIdKillmailHashAttacker) o;
    return Objects.equals(this.characterId, getKillmailsKillmailIdKillmailHashAttacker.characterId) &&
        Objects.equals(this.corporationId, getKillmailsKillmailIdKillmailHashAttacker.corporationId) &&
        Objects.equals(this.allianceId, getKillmailsKillmailIdKillmailHashAttacker.allianceId) &&
        Objects.equals(this.factionId, getKillmailsKillmailIdKillmailHashAttacker.factionId) &&
        Objects.equals(this.securityStatus, getKillmailsKillmailIdKillmailHashAttacker.securityStatus) &&
        Objects.equals(this.finalBlow, getKillmailsKillmailIdKillmailHashAttacker.finalBlow) &&
        Objects.equals(this.damageDone, getKillmailsKillmailIdKillmailHashAttacker.damageDone) &&
        Objects.equals(this.shipTypeId, getKillmailsKillmailIdKillmailHashAttacker.shipTypeId) &&
        Objects.equals(this.weaponTypeId, getKillmailsKillmailIdKillmailHashAttacker.weaponTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterId, corporationId, allianceId, factionId, securityStatus, finalBlow, damageDone, shipTypeId, weaponTypeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKillmailsKillmailIdKillmailHashAttacker {\n");
    
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    securityStatus: ").append(toIndentedString(securityStatus)).append("\n");
    sb.append("    finalBlow: ").append(toIndentedString(finalBlow)).append("\n");
    sb.append("    damageDone: ").append(toIndentedString(damageDone)).append("\n");
    sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
    sb.append("    weaponTypeId: ").append(toIndentedString(weaponTypeId)).append("\n");
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

