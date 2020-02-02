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
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-01T20:01:07.682-05:00")
public class GetCorporationCorporationIdMiningExtractions200Ok {
  @SerializedName("chunk_arrival_time")
  private DateTime chunkArrivalTime = null;

  @SerializedName("extraction_start_time")
  private DateTime extractionStartTime = null;

  @SerializedName("moon_id")
  private Integer moonId = null;

  @SerializedName("natural_decay_time")
  private DateTime naturalDecayTime = null;

  @SerializedName("structure_id")
  private Long structureId = null;

  public GetCorporationCorporationIdMiningExtractions200Ok chunkArrivalTime(DateTime chunkArrivalTime) {
    this.chunkArrivalTime = chunkArrivalTime;
    return this;
  }

   /**
   * The time at which the chunk being extracted will arrive and can be fractured by the moon mining drill. 
   * @return chunkArrivalTime
  **/
  @ApiModelProperty(example = "null", required = true, value = "The time at which the chunk being extracted will arrive and can be fractured by the moon mining drill. ")
  public DateTime getChunkArrivalTime() {
    return chunkArrivalTime;
  }

  public void setChunkArrivalTime(DateTime chunkArrivalTime) {
    this.chunkArrivalTime = chunkArrivalTime;
  }

  public GetCorporationCorporationIdMiningExtractions200Ok extractionStartTime(DateTime extractionStartTime) {
    this.extractionStartTime = extractionStartTime;
    return this;
  }

   /**
   * The time at which the current extraction was initiated. 
   * @return extractionStartTime
  **/
  @ApiModelProperty(example = "null", required = true, value = "The time at which the current extraction was initiated. ")
  public DateTime getExtractionStartTime() {
    return extractionStartTime;
  }

  public void setExtractionStartTime(DateTime extractionStartTime) {
    this.extractionStartTime = extractionStartTime;
  }

  public GetCorporationCorporationIdMiningExtractions200Ok moonId(Integer moonId) {
    this.moonId = moonId;
    return this;
  }

   /**
   * moon_id integer
   * @return moonId
  **/
  @ApiModelProperty(example = "null", required = true, value = "moon_id integer")
  public Integer getMoonId() {
    return moonId;
  }

  public void setMoonId(Integer moonId) {
    this.moonId = moonId;
  }

  public GetCorporationCorporationIdMiningExtractions200Ok naturalDecayTime(DateTime naturalDecayTime) {
    this.naturalDecayTime = naturalDecayTime;
    return this;
  }

   /**
   * The time at which the chunk being extracted will naturally fracture if it is not first fractured by the moon mining drill. 
   * @return naturalDecayTime
  **/
  @ApiModelProperty(example = "null", required = true, value = "The time at which the chunk being extracted will naturally fracture if it is not first fractured by the moon mining drill. ")
  public DateTime getNaturalDecayTime() {
    return naturalDecayTime;
  }

  public void setNaturalDecayTime(DateTime naturalDecayTime) {
    this.naturalDecayTime = naturalDecayTime;
  }

  public GetCorporationCorporationIdMiningExtractions200Ok structureId(Long structureId) {
    this.structureId = structureId;
    return this;
  }

   /**
   * structure_id integer
   * @return structureId
  **/
  @ApiModelProperty(example = "null", required = true, value = "structure_id integer")
  public Long getStructureId() {
    return structureId;
  }

  public void setStructureId(Long structureId) {
    this.structureId = structureId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationCorporationIdMiningExtractions200Ok getCorporationCorporationIdMiningExtractions200Ok = (GetCorporationCorporationIdMiningExtractions200Ok) o;
    return Objects.equals(this.chunkArrivalTime, getCorporationCorporationIdMiningExtractions200Ok.chunkArrivalTime) &&
        Objects.equals(this.extractionStartTime, getCorporationCorporationIdMiningExtractions200Ok.extractionStartTime) &&
        Objects.equals(this.moonId, getCorporationCorporationIdMiningExtractions200Ok.moonId) &&
        Objects.equals(this.naturalDecayTime, getCorporationCorporationIdMiningExtractions200Ok.naturalDecayTime) &&
        Objects.equals(this.structureId, getCorporationCorporationIdMiningExtractions200Ok.structureId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkArrivalTime, extractionStartTime, moonId, naturalDecayTime, structureId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationCorporationIdMiningExtractions200Ok {\n");
    
    sb.append("    chunkArrivalTime: ").append(toIndentedString(chunkArrivalTime)).append("\n");
    sb.append("    extractionStartTime: ").append(toIndentedString(extractionStartTime)).append("\n");
    sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
    sb.append("    naturalDecayTime: ").append(toIndentedString(naturalDecayTime)).append("\n");
    sb.append("    structureId: ").append(toIndentedString(structureId)).append("\n");
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

