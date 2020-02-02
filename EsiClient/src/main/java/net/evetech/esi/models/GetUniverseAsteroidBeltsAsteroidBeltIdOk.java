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
import net.evetech.esi.models.GetUniverseAsteroidBeltsAsteroidBeltIdPosition;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-01T20:01:07.682-05:00")
public class GetUniverseAsteroidBeltsAsteroidBeltIdOk {
  @SerializedName("name")
  private String name = null;

  @SerializedName("position")
  private GetUniverseAsteroidBeltsAsteroidBeltIdPosition position = null;

  @SerializedName("system_id")
  private Integer systemId = null;

  public GetUniverseAsteroidBeltsAsteroidBeltIdOk name(String name) {
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

  public GetUniverseAsteroidBeltsAsteroidBeltIdOk position(GetUniverseAsteroidBeltsAsteroidBeltIdPosition position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetUniverseAsteroidBeltsAsteroidBeltIdPosition getPosition() {
    return position;
  }

  public void setPosition(GetUniverseAsteroidBeltsAsteroidBeltIdPosition position) {
    this.position = position;
  }

  public GetUniverseAsteroidBeltsAsteroidBeltIdOk systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

   /**
   * The solar system this asteroid belt is in
   * @return systemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The solar system this asteroid belt is in")
  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseAsteroidBeltsAsteroidBeltIdOk getUniverseAsteroidBeltsAsteroidBeltIdOk = (GetUniverseAsteroidBeltsAsteroidBeltIdOk) o;
    return Objects.equals(this.name, getUniverseAsteroidBeltsAsteroidBeltIdOk.name) &&
        Objects.equals(this.position, getUniverseAsteroidBeltsAsteroidBeltIdOk.position) &&
        Objects.equals(this.systemId, getUniverseAsteroidBeltsAsteroidBeltIdOk.systemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, position, systemId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseAsteroidBeltsAsteroidBeltIdOk {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
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

