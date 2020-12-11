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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:37:36.420-05:00")
public class GetCharactersCharacterIdPlanets200Ok {
  @SerializedName("last_update")
  private DateTime lastUpdate = null;

  @SerializedName("num_pins")
  private Integer numPins = null;

  @SerializedName("owner_id")
  private Integer ownerId = null;

  @SerializedName("planet_id")
  private Integer planetId = null;

  /**
   * planet_type string
   */
  public enum PlanetTypeEnum {
    @SerializedName("temperate")
    TEMPERATE("temperate"),
    
    @SerializedName("barren")
    BARREN("barren"),
    
    @SerializedName("oceanic")
    OCEANIC("oceanic"),
    
    @SerializedName("ice")
    ICE("ice"),
    
    @SerializedName("gas")
    GAS("gas"),
    
    @SerializedName("lava")
    LAVA("lava"),
    
    @SerializedName("storm")
    STORM("storm"),
    
    @SerializedName("plasma")
    PLASMA("plasma");

    private String value;

    PlanetTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("planet_type")
  private PlanetTypeEnum planetType = null;

  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  @SerializedName("upgrade_level")
  private Integer upgradeLevel = null;

  public GetCharactersCharacterIdPlanets200Ok lastUpdate(DateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * last_update string
   * @return lastUpdate
  **/
  @ApiModelProperty(example = "null", required = true, value = "last_update string")
  public DateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(DateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public GetCharactersCharacterIdPlanets200Ok numPins(Integer numPins) {
    this.numPins = numPins;
    return this;
  }

   /**
   * num_pins integer
   * minimum: 1
   * @return numPins
  **/
  @ApiModelProperty(example = "null", required = true, value = "num_pins integer")
  public Integer getNumPins() {
    return numPins;
  }

  public void setNumPins(Integer numPins) {
    this.numPins = numPins;
  }

  public GetCharactersCharacterIdPlanets200Ok ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * owner_id integer
   * @return ownerId
  **/
  @ApiModelProperty(example = "null", required = true, value = "owner_id integer")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public GetCharactersCharacterIdPlanets200Ok planetId(Integer planetId) {
    this.planetId = planetId;
    return this;
  }

   /**
   * planet_id integer
   * @return planetId
  **/
  @ApiModelProperty(example = "null", required = true, value = "planet_id integer")
  public Integer getPlanetId() {
    return planetId;
  }

  public void setPlanetId(Integer planetId) {
    this.planetId = planetId;
  }

  public GetCharactersCharacterIdPlanets200Ok planetType(PlanetTypeEnum planetType) {
    this.planetType = planetType;
    return this;
  }

   /**
   * planet_type string
   * @return planetType
  **/
  @ApiModelProperty(example = "null", required = true, value = "planet_type string")
  public PlanetTypeEnum getPlanetType() {
    return planetType;
  }

  public void setPlanetType(PlanetTypeEnum planetType) {
    this.planetType = planetType;
  }

  public GetCharactersCharacterIdPlanets200Ok solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * solar_system_id integer
   * @return solarSystemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "solar_system_id integer")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetCharactersCharacterIdPlanets200Ok upgradeLevel(Integer upgradeLevel) {
    this.upgradeLevel = upgradeLevel;
    return this;
  }

   /**
   * upgrade_level integer
   * minimum: 0
   * maximum: 5
   * @return upgradeLevel
  **/
  @ApiModelProperty(example = "null", required = true, value = "upgrade_level integer")
  public Integer getUpgradeLevel() {
    return upgradeLevel;
  }

  public void setUpgradeLevel(Integer upgradeLevel) {
    this.upgradeLevel = upgradeLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanets200Ok getCharactersCharacterIdPlanets200Ok = (GetCharactersCharacterIdPlanets200Ok) o;
    return Objects.equals(this.lastUpdate, getCharactersCharacterIdPlanets200Ok.lastUpdate) &&
        Objects.equals(this.numPins, getCharactersCharacterIdPlanets200Ok.numPins) &&
        Objects.equals(this.ownerId, getCharactersCharacterIdPlanets200Ok.ownerId) &&
        Objects.equals(this.planetId, getCharactersCharacterIdPlanets200Ok.planetId) &&
        Objects.equals(this.planetType, getCharactersCharacterIdPlanets200Ok.planetType) &&
        Objects.equals(this.solarSystemId, getCharactersCharacterIdPlanets200Ok.solarSystemId) &&
        Objects.equals(this.upgradeLevel, getCharactersCharacterIdPlanets200Ok.upgradeLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdate, numPins, ownerId, planetId, planetType, solarSystemId, upgradeLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanets200Ok {\n");
    
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    numPins: ").append(toIndentedString(numPins)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    planetId: ").append(toIndentedString(planetId)).append("\n");
    sb.append("    planetType: ").append(toIndentedString(planetType)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    upgradeLevel: ").append(toIndentedString(upgradeLevel)).append("\n");
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

