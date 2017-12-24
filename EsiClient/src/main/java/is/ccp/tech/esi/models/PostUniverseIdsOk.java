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
import is.ccp.tech.esi.models.PostUniverseIdsAgent;
import is.ccp.tech.esi.models.PostUniverseIdsAlliance;
import is.ccp.tech.esi.models.PostUniverseIdsCharacter;
import is.ccp.tech.esi.models.PostUniverseIdsConstellation;
import is.ccp.tech.esi.models.PostUniverseIdsCorporation;
import is.ccp.tech.esi.models.PostUniverseIdsFaction;
import is.ccp.tech.esi.models.PostUniverseIdsInventoryType;
import is.ccp.tech.esi.models.PostUniverseIdsRegion;
import is.ccp.tech.esi.models.PostUniverseIdsStation;
import is.ccp.tech.esi.models.PostUniverseIdsSystem;
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class PostUniverseIdsOk {
  @SerializedName("agents")
  private List<PostUniverseIdsAgent> agents = new ArrayList<PostUniverseIdsAgent>();

  @SerializedName("alliances")
  private List<PostUniverseIdsAlliance> alliances = new ArrayList<PostUniverseIdsAlliance>();

  @SerializedName("characters")
  private List<PostUniverseIdsCharacter> characters = new ArrayList<PostUniverseIdsCharacter>();

  @SerializedName("constellations")
  private List<PostUniverseIdsConstellation> constellations = new ArrayList<PostUniverseIdsConstellation>();

  @SerializedName("corporations")
  private List<PostUniverseIdsCorporation> corporations = new ArrayList<PostUniverseIdsCorporation>();

  @SerializedName("factions")
  private List<PostUniverseIdsFaction> factions = new ArrayList<PostUniverseIdsFaction>();

  @SerializedName("inventory_types")
  private List<PostUniverseIdsInventoryType> inventoryTypes = new ArrayList<PostUniverseIdsInventoryType>();

  @SerializedName("regions")
  private List<PostUniverseIdsRegion> regions = new ArrayList<PostUniverseIdsRegion>();

  @SerializedName("systems")
  private List<PostUniverseIdsSystem> systems = new ArrayList<PostUniverseIdsSystem>();

  @SerializedName("stations")
  private List<PostUniverseIdsStation> stations = new ArrayList<PostUniverseIdsStation>();

  public PostUniverseIdsOk agents(List<PostUniverseIdsAgent> agents) {
    this.agents = agents;
    return this;
  }

  public PostUniverseIdsOk addAgentsItem(PostUniverseIdsAgent agentsItem) {
    this.agents.add(agentsItem);
    return this;
  }

   /**
   * agents array
   * @return agents
  **/
  @ApiModelProperty(example = "null", value = "agents array")
  public List<PostUniverseIdsAgent> getAgents() {
    return agents;
  }

  public void setAgents(List<PostUniverseIdsAgent> agents) {
    this.agents = agents;
  }

  public PostUniverseIdsOk alliances(List<PostUniverseIdsAlliance> alliances) {
    this.alliances = alliances;
    return this;
  }

  public PostUniverseIdsOk addAlliancesItem(PostUniverseIdsAlliance alliancesItem) {
    this.alliances.add(alliancesItem);
    return this;
  }

   /**
   * alliances array
   * @return alliances
  **/
  @ApiModelProperty(example = "null", value = "alliances array")
  public List<PostUniverseIdsAlliance> getAlliances() {
    return alliances;
  }

  public void setAlliances(List<PostUniverseIdsAlliance> alliances) {
    this.alliances = alliances;
  }

  public PostUniverseIdsOk characters(List<PostUniverseIdsCharacter> characters) {
    this.characters = characters;
    return this;
  }

  public PostUniverseIdsOk addCharactersItem(PostUniverseIdsCharacter charactersItem) {
    this.characters.add(charactersItem);
    return this;
  }

   /**
   * characters array
   * @return characters
  **/
  @ApiModelProperty(example = "null", value = "characters array")
  public List<PostUniverseIdsCharacter> getCharacters() {
    return characters;
  }

  public void setCharacters(List<PostUniverseIdsCharacter> characters) {
    this.characters = characters;
  }

  public PostUniverseIdsOk constellations(List<PostUniverseIdsConstellation> constellations) {
    this.constellations = constellations;
    return this;
  }

  public PostUniverseIdsOk addConstellationsItem(PostUniverseIdsConstellation constellationsItem) {
    this.constellations.add(constellationsItem);
    return this;
  }

   /**
   * constellations array
   * @return constellations
  **/
  @ApiModelProperty(example = "null", value = "constellations array")
  public List<PostUniverseIdsConstellation> getConstellations() {
    return constellations;
  }

  public void setConstellations(List<PostUniverseIdsConstellation> constellations) {
    this.constellations = constellations;
  }

  public PostUniverseIdsOk corporations(List<PostUniverseIdsCorporation> corporations) {
    this.corporations = corporations;
    return this;
  }

  public PostUniverseIdsOk addCorporationsItem(PostUniverseIdsCorporation corporationsItem) {
    this.corporations.add(corporationsItem);
    return this;
  }

   /**
   * corporations array
   * @return corporations
  **/
  @ApiModelProperty(example = "null", value = "corporations array")
  public List<PostUniverseIdsCorporation> getCorporations() {
    return corporations;
  }

  public void setCorporations(List<PostUniverseIdsCorporation> corporations) {
    this.corporations = corporations;
  }

  public PostUniverseIdsOk factions(List<PostUniverseIdsFaction> factions) {
    this.factions = factions;
    return this;
  }

  public PostUniverseIdsOk addFactionsItem(PostUniverseIdsFaction factionsItem) {
    this.factions.add(factionsItem);
    return this;
  }

   /**
   * factions array
   * @return factions
  **/
  @ApiModelProperty(example = "null", value = "factions array")
  public List<PostUniverseIdsFaction> getFactions() {
    return factions;
  }

  public void setFactions(List<PostUniverseIdsFaction> factions) {
    this.factions = factions;
  }

  public PostUniverseIdsOk inventoryTypes(List<PostUniverseIdsInventoryType> inventoryTypes) {
    this.inventoryTypes = inventoryTypes;
    return this;
  }

  public PostUniverseIdsOk addInventoryTypesItem(PostUniverseIdsInventoryType inventoryTypesItem) {
    this.inventoryTypes.add(inventoryTypesItem);
    return this;
  }

   /**
   * inventory_types array
   * @return inventoryTypes
  **/
  @ApiModelProperty(example = "null", value = "inventory_types array")
  public List<PostUniverseIdsInventoryType> getInventoryTypes() {
    return inventoryTypes;
  }

  public void setInventoryTypes(List<PostUniverseIdsInventoryType> inventoryTypes) {
    this.inventoryTypes = inventoryTypes;
  }

  public PostUniverseIdsOk regions(List<PostUniverseIdsRegion> regions) {
    this.regions = regions;
    return this;
  }

  public PostUniverseIdsOk addRegionsItem(PostUniverseIdsRegion regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * regions array
   * @return regions
  **/
  @ApiModelProperty(example = "null", value = "regions array")
  public List<PostUniverseIdsRegion> getRegions() {
    return regions;
  }

  public void setRegions(List<PostUniverseIdsRegion> regions) {
    this.regions = regions;
  }

  public PostUniverseIdsOk systems(List<PostUniverseIdsSystem> systems) {
    this.systems = systems;
    return this;
  }

  public PostUniverseIdsOk addSystemsItem(PostUniverseIdsSystem systemsItem) {
    this.systems.add(systemsItem);
    return this;
  }

   /**
   * systems array
   * @return systems
  **/
  @ApiModelProperty(example = "null", value = "systems array")
  public List<PostUniverseIdsSystem> getSystems() {
    return systems;
  }

  public void setSystems(List<PostUniverseIdsSystem> systems) {
    this.systems = systems;
  }

  public PostUniverseIdsOk stations(List<PostUniverseIdsStation> stations) {
    this.stations = stations;
    return this;
  }

  public PostUniverseIdsOk addStationsItem(PostUniverseIdsStation stationsItem) {
    this.stations.add(stationsItem);
    return this;
  }

   /**
   * stations array
   * @return stations
  **/
  @ApiModelProperty(example = "null", value = "stations array")
  public List<PostUniverseIdsStation> getStations() {
    return stations;
  }

  public void setStations(List<PostUniverseIdsStation> stations) {
    this.stations = stations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostUniverseIdsOk postUniverseIdsOk = (PostUniverseIdsOk) o;
    return Objects.equals(this.agents, postUniverseIdsOk.agents) &&
        Objects.equals(this.alliances, postUniverseIdsOk.alliances) &&
        Objects.equals(this.characters, postUniverseIdsOk.characters) &&
        Objects.equals(this.constellations, postUniverseIdsOk.constellations) &&
        Objects.equals(this.corporations, postUniverseIdsOk.corporations) &&
        Objects.equals(this.factions, postUniverseIdsOk.factions) &&
        Objects.equals(this.inventoryTypes, postUniverseIdsOk.inventoryTypes) &&
        Objects.equals(this.regions, postUniverseIdsOk.regions) &&
        Objects.equals(this.systems, postUniverseIdsOk.systems) &&
        Objects.equals(this.stations, postUniverseIdsOk.stations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agents, alliances, characters, constellations, corporations, factions, inventoryTypes, regions, systems, stations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostUniverseIdsOk {\n");
    
    sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
    sb.append("    alliances: ").append(toIndentedString(alliances)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    constellations: ").append(toIndentedString(constellations)).append("\n");
    sb.append("    corporations: ").append(toIndentedString(corporations)).append("\n");
    sb.append("    factions: ").append(toIndentedString(factions)).append("\n");
    sb.append("    inventoryTypes: ").append(toIndentedString(inventoryTypes)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    systems: ").append(toIndentedString(systems)).append("\n");
    sb.append("    stations: ").append(toIndentedString(stations)).append("\n");
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

