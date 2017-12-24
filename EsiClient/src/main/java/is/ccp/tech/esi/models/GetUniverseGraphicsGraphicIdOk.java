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

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class GetUniverseGraphicsGraphicIdOk {
  @SerializedName("graphic_id")
  private Integer graphicId = null;

  @SerializedName("graphic_file")
  private String graphicFile = null;

  @SerializedName("sof_race_name")
  private String sofRaceName = null;

  @SerializedName("sof_fation_name")
  private String sofFationName = null;

  @SerializedName("sof_dna")
  private String sofDna = null;

  @SerializedName("sof_hull_name")
  private String sofHullName = null;

  @SerializedName("collision_file")
  private String collisionFile = null;

  @SerializedName("icon_folder")
  private String iconFolder = null;

  public GetUniverseGraphicsGraphicIdOk graphicId(Integer graphicId) {
    this.graphicId = graphicId;
    return this;
  }

   /**
   * graphic_id integer
   * @return graphicId
  **/
  @ApiModelProperty(example = "null", required = true, value = "graphic_id integer")
  public Integer getGraphicId() {
    return graphicId;
  }

  public void setGraphicId(Integer graphicId) {
    this.graphicId = graphicId;
  }

  public GetUniverseGraphicsGraphicIdOk graphicFile(String graphicFile) {
    this.graphicFile = graphicFile;
    return this;
  }

   /**
   * graphic_file string
   * @return graphicFile
  **/
  @ApiModelProperty(example = "null", value = "graphic_file string")
  public String getGraphicFile() {
    return graphicFile;
  }

  public void setGraphicFile(String graphicFile) {
    this.graphicFile = graphicFile;
  }

  public GetUniverseGraphicsGraphicIdOk sofRaceName(String sofRaceName) {
    this.sofRaceName = sofRaceName;
    return this;
  }

   /**
   * sof_race_name string
   * @return sofRaceName
  **/
  @ApiModelProperty(example = "null", value = "sof_race_name string")
  public String getSofRaceName() {
    return sofRaceName;
  }

  public void setSofRaceName(String sofRaceName) {
    this.sofRaceName = sofRaceName;
  }

  public GetUniverseGraphicsGraphicIdOk sofFationName(String sofFationName) {
    this.sofFationName = sofFationName;
    return this;
  }

   /**
   * sof_fation_name string
   * @return sofFationName
  **/
  @ApiModelProperty(example = "null", value = "sof_fation_name string")
  public String getSofFationName() {
    return sofFationName;
  }

  public void setSofFationName(String sofFationName) {
    this.sofFationName = sofFationName;
  }

  public GetUniverseGraphicsGraphicIdOk sofDna(String sofDna) {
    this.sofDna = sofDna;
    return this;
  }

   /**
   * sof_dna string
   * @return sofDna
  **/
  @ApiModelProperty(example = "null", value = "sof_dna string")
  public String getSofDna() {
    return sofDna;
  }

  public void setSofDna(String sofDna) {
    this.sofDna = sofDna;
  }

  public GetUniverseGraphicsGraphicIdOk sofHullName(String sofHullName) {
    this.sofHullName = sofHullName;
    return this;
  }

   /**
   * sof_hull_name string
   * @return sofHullName
  **/
  @ApiModelProperty(example = "null", value = "sof_hull_name string")
  public String getSofHullName() {
    return sofHullName;
  }

  public void setSofHullName(String sofHullName) {
    this.sofHullName = sofHullName;
  }

  public GetUniverseGraphicsGraphicIdOk collisionFile(String collisionFile) {
    this.collisionFile = collisionFile;
    return this;
  }

   /**
   * collision_file string
   * @return collisionFile
  **/
  @ApiModelProperty(example = "null", value = "collision_file string")
  public String getCollisionFile() {
    return collisionFile;
  }

  public void setCollisionFile(String collisionFile) {
    this.collisionFile = collisionFile;
  }

  public GetUniverseGraphicsGraphicIdOk iconFolder(String iconFolder) {
    this.iconFolder = iconFolder;
    return this;
  }

   /**
   * icon_folder string
   * @return iconFolder
  **/
  @ApiModelProperty(example = "null", value = "icon_folder string")
  public String getIconFolder() {
    return iconFolder;
  }

  public void setIconFolder(String iconFolder) {
    this.iconFolder = iconFolder;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseGraphicsGraphicIdOk getUniverseGraphicsGraphicIdOk = (GetUniverseGraphicsGraphicIdOk) o;
    return Objects.equals(this.graphicId, getUniverseGraphicsGraphicIdOk.graphicId) &&
        Objects.equals(this.graphicFile, getUniverseGraphicsGraphicIdOk.graphicFile) &&
        Objects.equals(this.sofRaceName, getUniverseGraphicsGraphicIdOk.sofRaceName) &&
        Objects.equals(this.sofFationName, getUniverseGraphicsGraphicIdOk.sofFationName) &&
        Objects.equals(this.sofDna, getUniverseGraphicsGraphicIdOk.sofDna) &&
        Objects.equals(this.sofHullName, getUniverseGraphicsGraphicIdOk.sofHullName) &&
        Objects.equals(this.collisionFile, getUniverseGraphicsGraphicIdOk.collisionFile) &&
        Objects.equals(this.iconFolder, getUniverseGraphicsGraphicIdOk.iconFolder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(graphicId, graphicFile, sofRaceName, sofFationName, sofDna, sofHullName, collisionFile, iconFolder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseGraphicsGraphicIdOk {\n");
    
    sb.append("    graphicId: ").append(toIndentedString(graphicId)).append("\n");
    sb.append("    graphicFile: ").append(toIndentedString(graphicFile)).append("\n");
    sb.append("    sofRaceName: ").append(toIndentedString(sofRaceName)).append("\n");
    sb.append("    sofFationName: ").append(toIndentedString(sofFationName)).append("\n");
    sb.append("    sofDna: ").append(toIndentedString(sofDna)).append("\n");
    sb.append("    sofHullName: ").append(toIndentedString(sofHullName)).append("\n");
    sb.append("    collisionFile: ").append(toIndentedString(collisionFile)).append("\n");
    sb.append("    iconFolder: ").append(toIndentedString(iconFolder)).append("\n");
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
