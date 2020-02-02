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
import net.evetech.esi.models.GetCorporationsCorporationIdFwStatsKills;
import net.evetech.esi.models.GetCorporationsCorporationIdFwStatsVictoryPoints;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-01T20:01:07.682-05:00")
public class GetCorporationsCorporationIdFwStatsOk {
  @SerializedName("enlisted_on")
  private DateTime enlistedOn = null;

  @SerializedName("faction_id")
  private Integer factionId = null;

  @SerializedName("kills")
  private GetCorporationsCorporationIdFwStatsKills kills = null;

  @SerializedName("pilots")
  private Integer pilots = null;

  @SerializedName("victory_points")
  private GetCorporationsCorporationIdFwStatsVictoryPoints victoryPoints = null;

  public GetCorporationsCorporationIdFwStatsOk enlistedOn(DateTime enlistedOn) {
    this.enlistedOn = enlistedOn;
    return this;
  }

   /**
   * The enlistment date of the given corporation into faction warfare. Will not be included if corporation is not enlisted in faction warfare
   * @return enlistedOn
  **/
  @ApiModelProperty(example = "null", value = "The enlistment date of the given corporation into faction warfare. Will not be included if corporation is not enlisted in faction warfare")
  public DateTime getEnlistedOn() {
    return enlistedOn;
  }

  public void setEnlistedOn(DateTime enlistedOn) {
    this.enlistedOn = enlistedOn;
  }

  public GetCorporationsCorporationIdFwStatsOk factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

   /**
   * The faction the given corporation is enlisted to fight for. Will not be included if corporation is not enlisted in faction warfare
   * @return factionId
  **/
  @ApiModelProperty(example = "null", value = "The faction the given corporation is enlisted to fight for. Will not be included if corporation is not enlisted in faction warfare")
  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetCorporationsCorporationIdFwStatsOk kills(GetCorporationsCorporationIdFwStatsKills kills) {
    this.kills = kills;
    return this;
  }

   /**
   * Get kills
   * @return kills
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetCorporationsCorporationIdFwStatsKills getKills() {
    return kills;
  }

  public void setKills(GetCorporationsCorporationIdFwStatsKills kills) {
    this.kills = kills;
  }

  public GetCorporationsCorporationIdFwStatsOk pilots(Integer pilots) {
    this.pilots = pilots;
    return this;
  }

   /**
   * How many pilots the enlisted corporation has. Will not be included if corporation is not enlisted in faction warfare
   * @return pilots
  **/
  @ApiModelProperty(example = "null", value = "How many pilots the enlisted corporation has. Will not be included if corporation is not enlisted in faction warfare")
  public Integer getPilots() {
    return pilots;
  }

  public void setPilots(Integer pilots) {
    this.pilots = pilots;
  }

  public GetCorporationsCorporationIdFwStatsOk victoryPoints(GetCorporationsCorporationIdFwStatsVictoryPoints victoryPoints) {
    this.victoryPoints = victoryPoints;
    return this;
  }

   /**
   * Get victoryPoints
   * @return victoryPoints
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetCorporationsCorporationIdFwStatsVictoryPoints getVictoryPoints() {
    return victoryPoints;
  }

  public void setVictoryPoints(GetCorporationsCorporationIdFwStatsVictoryPoints victoryPoints) {
    this.victoryPoints = victoryPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdFwStatsOk getCorporationsCorporationIdFwStatsOk = (GetCorporationsCorporationIdFwStatsOk) o;
    return Objects.equals(this.enlistedOn, getCorporationsCorporationIdFwStatsOk.enlistedOn) &&
        Objects.equals(this.factionId, getCorporationsCorporationIdFwStatsOk.factionId) &&
        Objects.equals(this.kills, getCorporationsCorporationIdFwStatsOk.kills) &&
        Objects.equals(this.pilots, getCorporationsCorporationIdFwStatsOk.pilots) &&
        Objects.equals(this.victoryPoints, getCorporationsCorporationIdFwStatsOk.victoryPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enlistedOn, factionId, kills, pilots, victoryPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdFwStatsOk {\n");
    
    sb.append("    enlistedOn: ").append(toIndentedString(enlistedOn)).append("\n");
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
    sb.append("    pilots: ").append(toIndentedString(pilots)).append("\n");
    sb.append("    victoryPoints: ").append(toIndentedString(victoryPoints)).append("\n");
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

