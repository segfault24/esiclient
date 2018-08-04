/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.5
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
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-04T12:18:31.101-04:00")
public class GetSearchOk {
  @SerializedName("agent")
  private List<Integer> agent = new ArrayList<Integer>();

  @SerializedName("alliance")
  private List<Integer> alliance = new ArrayList<Integer>();

  @SerializedName("character")
  private List<Integer> character = new ArrayList<Integer>();

  @SerializedName("constellation")
  private List<Integer> constellation = new ArrayList<Integer>();

  @SerializedName("corporation")
  private List<Integer> corporation = new ArrayList<Integer>();

  @SerializedName("faction")
  private List<Integer> faction = new ArrayList<Integer>();

  @SerializedName("inventory_type")
  private List<Integer> inventoryType = new ArrayList<Integer>();

  @SerializedName("region")
  private List<Integer> region = new ArrayList<Integer>();

  @SerializedName("solar_system")
  private List<Integer> solarSystem = new ArrayList<Integer>();

  @SerializedName("station")
  private List<Integer> station = new ArrayList<Integer>();

  public GetSearchOk agent(List<Integer> agent) {
    this.agent = agent;
    return this;
  }

  public GetSearchOk addAgentItem(Integer agentItem) {
    this.agent.add(agentItem);
    return this;
  }

   /**
   * agent array
   * @return agent
  **/
  @ApiModelProperty(example = "null", value = "agent array")
  public List<Integer> getAgent() {
    return agent;
  }

  public void setAgent(List<Integer> agent) {
    this.agent = agent;
  }

  public GetSearchOk alliance(List<Integer> alliance) {
    this.alliance = alliance;
    return this;
  }

  public GetSearchOk addAllianceItem(Integer allianceItem) {
    this.alliance.add(allianceItem);
    return this;
  }

   /**
   * alliance array
   * @return alliance
  **/
  @ApiModelProperty(example = "null", value = "alliance array")
  public List<Integer> getAlliance() {
    return alliance;
  }

  public void setAlliance(List<Integer> alliance) {
    this.alliance = alliance;
  }

  public GetSearchOk character(List<Integer> character) {
    this.character = character;
    return this;
  }

  public GetSearchOk addCharacterItem(Integer characterItem) {
    this.character.add(characterItem);
    return this;
  }

   /**
   * character array
   * @return character
  **/
  @ApiModelProperty(example = "null", value = "character array")
  public List<Integer> getCharacter() {
    return character;
  }

  public void setCharacter(List<Integer> character) {
    this.character = character;
  }

  public GetSearchOk constellation(List<Integer> constellation) {
    this.constellation = constellation;
    return this;
  }

  public GetSearchOk addConstellationItem(Integer constellationItem) {
    this.constellation.add(constellationItem);
    return this;
  }

   /**
   * constellation array
   * @return constellation
  **/
  @ApiModelProperty(example = "null", value = "constellation array")
  public List<Integer> getConstellation() {
    return constellation;
  }

  public void setConstellation(List<Integer> constellation) {
    this.constellation = constellation;
  }

  public GetSearchOk corporation(List<Integer> corporation) {
    this.corporation = corporation;
    return this;
  }

  public GetSearchOk addCorporationItem(Integer corporationItem) {
    this.corporation.add(corporationItem);
    return this;
  }

   /**
   * corporation array
   * @return corporation
  **/
  @ApiModelProperty(example = "null", value = "corporation array")
  public List<Integer> getCorporation() {
    return corporation;
  }

  public void setCorporation(List<Integer> corporation) {
    this.corporation = corporation;
  }

  public GetSearchOk faction(List<Integer> faction) {
    this.faction = faction;
    return this;
  }

  public GetSearchOk addFactionItem(Integer factionItem) {
    this.faction.add(factionItem);
    return this;
  }

   /**
   * faction array
   * @return faction
  **/
  @ApiModelProperty(example = "null", value = "faction array")
  public List<Integer> getFaction() {
    return faction;
  }

  public void setFaction(List<Integer> faction) {
    this.faction = faction;
  }

  public GetSearchOk inventoryType(List<Integer> inventoryType) {
    this.inventoryType = inventoryType;
    return this;
  }

  public GetSearchOk addInventoryTypeItem(Integer inventoryTypeItem) {
    this.inventoryType.add(inventoryTypeItem);
    return this;
  }

   /**
   * inventory_type array
   * @return inventoryType
  **/
  @ApiModelProperty(example = "null", value = "inventory_type array")
  public List<Integer> getInventoryType() {
    return inventoryType;
  }

  public void setInventoryType(List<Integer> inventoryType) {
    this.inventoryType = inventoryType;
  }

  public GetSearchOk region(List<Integer> region) {
    this.region = region;
    return this;
  }

  public GetSearchOk addRegionItem(Integer regionItem) {
    this.region.add(regionItem);
    return this;
  }

   /**
   * region array
   * @return region
  **/
  @ApiModelProperty(example = "null", value = "region array")
  public List<Integer> getRegion() {
    return region;
  }

  public void setRegion(List<Integer> region) {
    this.region = region;
  }

  public GetSearchOk solarSystem(List<Integer> solarSystem) {
    this.solarSystem = solarSystem;
    return this;
  }

  public GetSearchOk addSolarSystemItem(Integer solarSystemItem) {
    this.solarSystem.add(solarSystemItem);
    return this;
  }

   /**
   * solar_system array
   * @return solarSystem
  **/
  @ApiModelProperty(example = "null", value = "solar_system array")
  public List<Integer> getSolarSystem() {
    return solarSystem;
  }

  public void setSolarSystem(List<Integer> solarSystem) {
    this.solarSystem = solarSystem;
  }

  public GetSearchOk station(List<Integer> station) {
    this.station = station;
    return this;
  }

  public GetSearchOk addStationItem(Integer stationItem) {
    this.station.add(stationItem);
    return this;
  }

   /**
   * station array
   * @return station
  **/
  @ApiModelProperty(example = "null", value = "station array")
  public List<Integer> getStation() {
    return station;
  }

  public void setStation(List<Integer> station) {
    this.station = station;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSearchOk getSearchOk = (GetSearchOk) o;
    return Objects.equals(this.agent, getSearchOk.agent) &&
        Objects.equals(this.alliance, getSearchOk.alliance) &&
        Objects.equals(this.character, getSearchOk.character) &&
        Objects.equals(this.constellation, getSearchOk.constellation) &&
        Objects.equals(this.corporation, getSearchOk.corporation) &&
        Objects.equals(this.faction, getSearchOk.faction) &&
        Objects.equals(this.inventoryType, getSearchOk.inventoryType) &&
        Objects.equals(this.region, getSearchOk.region) &&
        Objects.equals(this.solarSystem, getSearchOk.solarSystem) &&
        Objects.equals(this.station, getSearchOk.station);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agent, alliance, character, constellation, corporation, faction, inventoryType, region, solarSystem, station);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSearchOk {\n");
    
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    alliance: ").append(toIndentedString(alliance)).append("\n");
    sb.append("    character: ").append(toIndentedString(character)).append("\n");
    sb.append("    constellation: ").append(toIndentedString(constellation)).append("\n");
    sb.append("    corporation: ").append(toIndentedString(corporation)).append("\n");
    sb.append("    faction: ").append(toIndentedString(faction)).append("\n");
    sb.append("    inventoryType: ").append(toIndentedString(inventoryType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    solarSystem: ").append(toIndentedString(solarSystem)).append("\n");
    sb.append("    station: ").append(toIndentedString(station)).append("\n");
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
