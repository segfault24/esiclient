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
import java.util.ArrayList;
import java.util.List;

/**
 * planet object
 */
@ApiModel(description = "planet object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:37:36.420-05:00")
public class GetUniverseSystemsSystemIdPlanet {
  @SerializedName("asteroid_belts")
  private List<Integer> asteroidBelts = new ArrayList<Integer>();

  @SerializedName("moons")
  private List<Integer> moons = new ArrayList<Integer>();

  @SerializedName("planet_id")
  private Integer planetId = null;

  public GetUniverseSystemsSystemIdPlanet asteroidBelts(List<Integer> asteroidBelts) {
    this.asteroidBelts = asteroidBelts;
    return this;
  }

  public GetUniverseSystemsSystemIdPlanet addAsteroidBeltsItem(Integer asteroidBeltsItem) {
    this.asteroidBelts.add(asteroidBeltsItem);
    return this;
  }

   /**
   * asteroid_belts array
   * @return asteroidBelts
  **/
  @ApiModelProperty(example = "null", value = "asteroid_belts array")
  public List<Integer> getAsteroidBelts() {
    return asteroidBelts;
  }

  public void setAsteroidBelts(List<Integer> asteroidBelts) {
    this.asteroidBelts = asteroidBelts;
  }

  public GetUniverseSystemsSystemIdPlanet moons(List<Integer> moons) {
    this.moons = moons;
    return this;
  }

  public GetUniverseSystemsSystemIdPlanet addMoonsItem(Integer moonsItem) {
    this.moons.add(moonsItem);
    return this;
  }

   /**
   * moons array
   * @return moons
  **/
  @ApiModelProperty(example = "null", value = "moons array")
  public List<Integer> getMoons() {
    return moons;
  }

  public void setMoons(List<Integer> moons) {
    this.moons = moons;
  }

  public GetUniverseSystemsSystemIdPlanet planetId(Integer planetId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseSystemsSystemIdPlanet getUniverseSystemsSystemIdPlanet = (GetUniverseSystemsSystemIdPlanet) o;
    return Objects.equals(this.asteroidBelts, getUniverseSystemsSystemIdPlanet.asteroidBelts) &&
        Objects.equals(this.moons, getUniverseSystemsSystemIdPlanet.moons) &&
        Objects.equals(this.planetId, getUniverseSystemsSystemIdPlanet.planetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asteroidBelts, moons, planetId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseSystemsSystemIdPlanet {\n");
    
    sb.append("    asteroidBelts: ").append(toIndentedString(asteroidBelts)).append("\n");
    sb.append("    moons: ").append(toIndentedString(moons)).append("\n");
    sb.append("    planetId: ").append(toIndentedString(planetId)).append("\n");
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

