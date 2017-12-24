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
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class GetUniverseRegionsRegionIdOk {
  @SerializedName("region_id")
  private Integer regionId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("constellations")
  private List<Integer> constellations = new ArrayList<Integer>();

  public GetUniverseRegionsRegionIdOk regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * region_id integer
   * @return regionId
  **/
  @ApiModelProperty(example = "null", required = true, value = "region_id integer")
  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public GetUniverseRegionsRegionIdOk name(String name) {
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

  public GetUniverseRegionsRegionIdOk description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description string
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "description string")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetUniverseRegionsRegionIdOk constellations(List<Integer> constellations) {
    this.constellations = constellations;
    return this;
  }

  public GetUniverseRegionsRegionIdOk addConstellationsItem(Integer constellationsItem) {
    this.constellations.add(constellationsItem);
    return this;
  }

   /**
   * constellations array
   * @return constellations
  **/
  @ApiModelProperty(example = "null", required = true, value = "constellations array")
  public List<Integer> getConstellations() {
    return constellations;
  }

  public void setConstellations(List<Integer> constellations) {
    this.constellations = constellations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseRegionsRegionIdOk getUniverseRegionsRegionIdOk = (GetUniverseRegionsRegionIdOk) o;
    return Objects.equals(this.regionId, getUniverseRegionsRegionIdOk.regionId) &&
        Objects.equals(this.name, getUniverseRegionsRegionIdOk.name) &&
        Objects.equals(this.description, getUniverseRegionsRegionIdOk.description) &&
        Objects.equals(this.constellations, getUniverseRegionsRegionIdOk.constellations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionId, name, description, constellations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseRegionsRegionIdOk {\n");
    
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    constellations: ").append(toIndentedString(constellations)).append("\n");
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

