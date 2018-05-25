/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.2
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
 * travel object
 */
@ApiModel(description = "travel object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-25T15:34:30.466-04:00")
public class GetCharactersCharacterIdStatsTravel {
  @SerializedName("acceleration_gate_activations")
  private Long accelerationGateActivations = null;

  @SerializedName("align_to")
  private Long alignTo = null;

  @SerializedName("distance_warped_high_sec")
  private Long distanceWarpedHighSec = null;

  @SerializedName("distance_warped_low_sec")
  private Long distanceWarpedLowSec = null;

  @SerializedName("distance_warped_null_sec")
  private Long distanceWarpedNullSec = null;

  @SerializedName("distance_warped_wormhole")
  private Long distanceWarpedWormhole = null;

  @SerializedName("docks_high_sec")
  private Long docksHighSec = null;

  @SerializedName("docks_low_sec")
  private Long docksLowSec = null;

  @SerializedName("docks_null_sec")
  private Long docksNullSec = null;

  @SerializedName("jumps_stargate_high_sec")
  private Long jumpsStargateHighSec = null;

  @SerializedName("jumps_stargate_low_sec")
  private Long jumpsStargateLowSec = null;

  @SerializedName("jumps_stargate_null_sec")
  private Long jumpsStargateNullSec = null;

  @SerializedName("jumps_wormhole")
  private Long jumpsWormhole = null;

  @SerializedName("warps_high_sec")
  private Long warpsHighSec = null;

  @SerializedName("warps_low_sec")
  private Long warpsLowSec = null;

  @SerializedName("warps_null_sec")
  private Long warpsNullSec = null;

  @SerializedName("warps_to_bookmark")
  private Long warpsToBookmark = null;

  @SerializedName("warps_to_celestial")
  private Long warpsToCelestial = null;

  @SerializedName("warps_to_fleet_member")
  private Long warpsToFleetMember = null;

  @SerializedName("warps_to_scan_result")
  private Long warpsToScanResult = null;

  @SerializedName("warps_wormhole")
  private Long warpsWormhole = null;

  public GetCharactersCharacterIdStatsTravel accelerationGateActivations(Long accelerationGateActivations) {
    this.accelerationGateActivations = accelerationGateActivations;
    return this;
  }

   /**
   * acceleration_gate_activations integer
   * @return accelerationGateActivations
  **/
  @ApiModelProperty(example = "null", value = "acceleration_gate_activations integer")
  public Long getAccelerationGateActivations() {
    return accelerationGateActivations;
  }

  public void setAccelerationGateActivations(Long accelerationGateActivations) {
    this.accelerationGateActivations = accelerationGateActivations;
  }

  public GetCharactersCharacterIdStatsTravel alignTo(Long alignTo) {
    this.alignTo = alignTo;
    return this;
  }

   /**
   * align_to integer
   * @return alignTo
  **/
  @ApiModelProperty(example = "null", value = "align_to integer")
  public Long getAlignTo() {
    return alignTo;
  }

  public void setAlignTo(Long alignTo) {
    this.alignTo = alignTo;
  }

  public GetCharactersCharacterIdStatsTravel distanceWarpedHighSec(Long distanceWarpedHighSec) {
    this.distanceWarpedHighSec = distanceWarpedHighSec;
    return this;
  }

   /**
   * distance_warped_high_sec integer
   * @return distanceWarpedHighSec
  **/
  @ApiModelProperty(example = "null", value = "distance_warped_high_sec integer")
  public Long getDistanceWarpedHighSec() {
    return distanceWarpedHighSec;
  }

  public void setDistanceWarpedHighSec(Long distanceWarpedHighSec) {
    this.distanceWarpedHighSec = distanceWarpedHighSec;
  }

  public GetCharactersCharacterIdStatsTravel distanceWarpedLowSec(Long distanceWarpedLowSec) {
    this.distanceWarpedLowSec = distanceWarpedLowSec;
    return this;
  }

   /**
   * distance_warped_low_sec integer
   * @return distanceWarpedLowSec
  **/
  @ApiModelProperty(example = "null", value = "distance_warped_low_sec integer")
  public Long getDistanceWarpedLowSec() {
    return distanceWarpedLowSec;
  }

  public void setDistanceWarpedLowSec(Long distanceWarpedLowSec) {
    this.distanceWarpedLowSec = distanceWarpedLowSec;
  }

  public GetCharactersCharacterIdStatsTravel distanceWarpedNullSec(Long distanceWarpedNullSec) {
    this.distanceWarpedNullSec = distanceWarpedNullSec;
    return this;
  }

   /**
   * distance_warped_null_sec integer
   * @return distanceWarpedNullSec
  **/
  @ApiModelProperty(example = "null", value = "distance_warped_null_sec integer")
  public Long getDistanceWarpedNullSec() {
    return distanceWarpedNullSec;
  }

  public void setDistanceWarpedNullSec(Long distanceWarpedNullSec) {
    this.distanceWarpedNullSec = distanceWarpedNullSec;
  }

  public GetCharactersCharacterIdStatsTravel distanceWarpedWormhole(Long distanceWarpedWormhole) {
    this.distanceWarpedWormhole = distanceWarpedWormhole;
    return this;
  }

   /**
   * distance_warped_wormhole integer
   * @return distanceWarpedWormhole
  **/
  @ApiModelProperty(example = "null", value = "distance_warped_wormhole integer")
  public Long getDistanceWarpedWormhole() {
    return distanceWarpedWormhole;
  }

  public void setDistanceWarpedWormhole(Long distanceWarpedWormhole) {
    this.distanceWarpedWormhole = distanceWarpedWormhole;
  }

  public GetCharactersCharacterIdStatsTravel docksHighSec(Long docksHighSec) {
    this.docksHighSec = docksHighSec;
    return this;
  }

   /**
   * docks_high_sec integer
   * @return docksHighSec
  **/
  @ApiModelProperty(example = "null", value = "docks_high_sec integer")
  public Long getDocksHighSec() {
    return docksHighSec;
  }

  public void setDocksHighSec(Long docksHighSec) {
    this.docksHighSec = docksHighSec;
  }

  public GetCharactersCharacterIdStatsTravel docksLowSec(Long docksLowSec) {
    this.docksLowSec = docksLowSec;
    return this;
  }

   /**
   * docks_low_sec integer
   * @return docksLowSec
  **/
  @ApiModelProperty(example = "null", value = "docks_low_sec integer")
  public Long getDocksLowSec() {
    return docksLowSec;
  }

  public void setDocksLowSec(Long docksLowSec) {
    this.docksLowSec = docksLowSec;
  }

  public GetCharactersCharacterIdStatsTravel docksNullSec(Long docksNullSec) {
    this.docksNullSec = docksNullSec;
    return this;
  }

   /**
   * docks_null_sec integer
   * @return docksNullSec
  **/
  @ApiModelProperty(example = "null", value = "docks_null_sec integer")
  public Long getDocksNullSec() {
    return docksNullSec;
  }

  public void setDocksNullSec(Long docksNullSec) {
    this.docksNullSec = docksNullSec;
  }

  public GetCharactersCharacterIdStatsTravel jumpsStargateHighSec(Long jumpsStargateHighSec) {
    this.jumpsStargateHighSec = jumpsStargateHighSec;
    return this;
  }

   /**
   * jumps_stargate_high_sec integer
   * @return jumpsStargateHighSec
  **/
  @ApiModelProperty(example = "null", value = "jumps_stargate_high_sec integer")
  public Long getJumpsStargateHighSec() {
    return jumpsStargateHighSec;
  }

  public void setJumpsStargateHighSec(Long jumpsStargateHighSec) {
    this.jumpsStargateHighSec = jumpsStargateHighSec;
  }

  public GetCharactersCharacterIdStatsTravel jumpsStargateLowSec(Long jumpsStargateLowSec) {
    this.jumpsStargateLowSec = jumpsStargateLowSec;
    return this;
  }

   /**
   * jumps_stargate_low_sec integer
   * @return jumpsStargateLowSec
  **/
  @ApiModelProperty(example = "null", value = "jumps_stargate_low_sec integer")
  public Long getJumpsStargateLowSec() {
    return jumpsStargateLowSec;
  }

  public void setJumpsStargateLowSec(Long jumpsStargateLowSec) {
    this.jumpsStargateLowSec = jumpsStargateLowSec;
  }

  public GetCharactersCharacterIdStatsTravel jumpsStargateNullSec(Long jumpsStargateNullSec) {
    this.jumpsStargateNullSec = jumpsStargateNullSec;
    return this;
  }

   /**
   * jumps_stargate_null_sec integer
   * @return jumpsStargateNullSec
  **/
  @ApiModelProperty(example = "null", value = "jumps_stargate_null_sec integer")
  public Long getJumpsStargateNullSec() {
    return jumpsStargateNullSec;
  }

  public void setJumpsStargateNullSec(Long jumpsStargateNullSec) {
    this.jumpsStargateNullSec = jumpsStargateNullSec;
  }

  public GetCharactersCharacterIdStatsTravel jumpsWormhole(Long jumpsWormhole) {
    this.jumpsWormhole = jumpsWormhole;
    return this;
  }

   /**
   * jumps_wormhole integer
   * @return jumpsWormhole
  **/
  @ApiModelProperty(example = "null", value = "jumps_wormhole integer")
  public Long getJumpsWormhole() {
    return jumpsWormhole;
  }

  public void setJumpsWormhole(Long jumpsWormhole) {
    this.jumpsWormhole = jumpsWormhole;
  }

  public GetCharactersCharacterIdStatsTravel warpsHighSec(Long warpsHighSec) {
    this.warpsHighSec = warpsHighSec;
    return this;
  }

   /**
   * warps_high_sec integer
   * @return warpsHighSec
  **/
  @ApiModelProperty(example = "null", value = "warps_high_sec integer")
  public Long getWarpsHighSec() {
    return warpsHighSec;
  }

  public void setWarpsHighSec(Long warpsHighSec) {
    this.warpsHighSec = warpsHighSec;
  }

  public GetCharactersCharacterIdStatsTravel warpsLowSec(Long warpsLowSec) {
    this.warpsLowSec = warpsLowSec;
    return this;
  }

   /**
   * warps_low_sec integer
   * @return warpsLowSec
  **/
  @ApiModelProperty(example = "null", value = "warps_low_sec integer")
  public Long getWarpsLowSec() {
    return warpsLowSec;
  }

  public void setWarpsLowSec(Long warpsLowSec) {
    this.warpsLowSec = warpsLowSec;
  }

  public GetCharactersCharacterIdStatsTravel warpsNullSec(Long warpsNullSec) {
    this.warpsNullSec = warpsNullSec;
    return this;
  }

   /**
   * warps_null_sec integer
   * @return warpsNullSec
  **/
  @ApiModelProperty(example = "null", value = "warps_null_sec integer")
  public Long getWarpsNullSec() {
    return warpsNullSec;
  }

  public void setWarpsNullSec(Long warpsNullSec) {
    this.warpsNullSec = warpsNullSec;
  }

  public GetCharactersCharacterIdStatsTravel warpsToBookmark(Long warpsToBookmark) {
    this.warpsToBookmark = warpsToBookmark;
    return this;
  }

   /**
   * warps_to_bookmark integer
   * @return warpsToBookmark
  **/
  @ApiModelProperty(example = "null", value = "warps_to_bookmark integer")
  public Long getWarpsToBookmark() {
    return warpsToBookmark;
  }

  public void setWarpsToBookmark(Long warpsToBookmark) {
    this.warpsToBookmark = warpsToBookmark;
  }

  public GetCharactersCharacterIdStatsTravel warpsToCelestial(Long warpsToCelestial) {
    this.warpsToCelestial = warpsToCelestial;
    return this;
  }

   /**
   * warps_to_celestial integer
   * @return warpsToCelestial
  **/
  @ApiModelProperty(example = "null", value = "warps_to_celestial integer")
  public Long getWarpsToCelestial() {
    return warpsToCelestial;
  }

  public void setWarpsToCelestial(Long warpsToCelestial) {
    this.warpsToCelestial = warpsToCelestial;
  }

  public GetCharactersCharacterIdStatsTravel warpsToFleetMember(Long warpsToFleetMember) {
    this.warpsToFleetMember = warpsToFleetMember;
    return this;
  }

   /**
   * warps_to_fleet_member integer
   * @return warpsToFleetMember
  **/
  @ApiModelProperty(example = "null", value = "warps_to_fleet_member integer")
  public Long getWarpsToFleetMember() {
    return warpsToFleetMember;
  }

  public void setWarpsToFleetMember(Long warpsToFleetMember) {
    this.warpsToFleetMember = warpsToFleetMember;
  }

  public GetCharactersCharacterIdStatsTravel warpsToScanResult(Long warpsToScanResult) {
    this.warpsToScanResult = warpsToScanResult;
    return this;
  }

   /**
   * warps_to_scan_result integer
   * @return warpsToScanResult
  **/
  @ApiModelProperty(example = "null", value = "warps_to_scan_result integer")
  public Long getWarpsToScanResult() {
    return warpsToScanResult;
  }

  public void setWarpsToScanResult(Long warpsToScanResult) {
    this.warpsToScanResult = warpsToScanResult;
  }

  public GetCharactersCharacterIdStatsTravel warpsWormhole(Long warpsWormhole) {
    this.warpsWormhole = warpsWormhole;
    return this;
  }

   /**
   * warps_wormhole integer
   * @return warpsWormhole
  **/
  @ApiModelProperty(example = "null", value = "warps_wormhole integer")
  public Long getWarpsWormhole() {
    return warpsWormhole;
  }

  public void setWarpsWormhole(Long warpsWormhole) {
    this.warpsWormhole = warpsWormhole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsTravel getCharactersCharacterIdStatsTravel = (GetCharactersCharacterIdStatsTravel) o;
    return Objects.equals(this.accelerationGateActivations, getCharactersCharacterIdStatsTravel.accelerationGateActivations) &&
        Objects.equals(this.alignTo, getCharactersCharacterIdStatsTravel.alignTo) &&
        Objects.equals(this.distanceWarpedHighSec, getCharactersCharacterIdStatsTravel.distanceWarpedHighSec) &&
        Objects.equals(this.distanceWarpedLowSec, getCharactersCharacterIdStatsTravel.distanceWarpedLowSec) &&
        Objects.equals(this.distanceWarpedNullSec, getCharactersCharacterIdStatsTravel.distanceWarpedNullSec) &&
        Objects.equals(this.distanceWarpedWormhole, getCharactersCharacterIdStatsTravel.distanceWarpedWormhole) &&
        Objects.equals(this.docksHighSec, getCharactersCharacterIdStatsTravel.docksHighSec) &&
        Objects.equals(this.docksLowSec, getCharactersCharacterIdStatsTravel.docksLowSec) &&
        Objects.equals(this.docksNullSec, getCharactersCharacterIdStatsTravel.docksNullSec) &&
        Objects.equals(this.jumpsStargateHighSec, getCharactersCharacterIdStatsTravel.jumpsStargateHighSec) &&
        Objects.equals(this.jumpsStargateLowSec, getCharactersCharacterIdStatsTravel.jumpsStargateLowSec) &&
        Objects.equals(this.jumpsStargateNullSec, getCharactersCharacterIdStatsTravel.jumpsStargateNullSec) &&
        Objects.equals(this.jumpsWormhole, getCharactersCharacterIdStatsTravel.jumpsWormhole) &&
        Objects.equals(this.warpsHighSec, getCharactersCharacterIdStatsTravel.warpsHighSec) &&
        Objects.equals(this.warpsLowSec, getCharactersCharacterIdStatsTravel.warpsLowSec) &&
        Objects.equals(this.warpsNullSec, getCharactersCharacterIdStatsTravel.warpsNullSec) &&
        Objects.equals(this.warpsToBookmark, getCharactersCharacterIdStatsTravel.warpsToBookmark) &&
        Objects.equals(this.warpsToCelestial, getCharactersCharacterIdStatsTravel.warpsToCelestial) &&
        Objects.equals(this.warpsToFleetMember, getCharactersCharacterIdStatsTravel.warpsToFleetMember) &&
        Objects.equals(this.warpsToScanResult, getCharactersCharacterIdStatsTravel.warpsToScanResult) &&
        Objects.equals(this.warpsWormhole, getCharactersCharacterIdStatsTravel.warpsWormhole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accelerationGateActivations, alignTo, distanceWarpedHighSec, distanceWarpedLowSec, distanceWarpedNullSec, distanceWarpedWormhole, docksHighSec, docksLowSec, docksNullSec, jumpsStargateHighSec, jumpsStargateLowSec, jumpsStargateNullSec, jumpsWormhole, warpsHighSec, warpsLowSec, warpsNullSec, warpsToBookmark, warpsToCelestial, warpsToFleetMember, warpsToScanResult, warpsWormhole);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsTravel {\n");
    
    sb.append("    accelerationGateActivations: ").append(toIndentedString(accelerationGateActivations)).append("\n");
    sb.append("    alignTo: ").append(toIndentedString(alignTo)).append("\n");
    sb.append("    distanceWarpedHighSec: ").append(toIndentedString(distanceWarpedHighSec)).append("\n");
    sb.append("    distanceWarpedLowSec: ").append(toIndentedString(distanceWarpedLowSec)).append("\n");
    sb.append("    distanceWarpedNullSec: ").append(toIndentedString(distanceWarpedNullSec)).append("\n");
    sb.append("    distanceWarpedWormhole: ").append(toIndentedString(distanceWarpedWormhole)).append("\n");
    sb.append("    docksHighSec: ").append(toIndentedString(docksHighSec)).append("\n");
    sb.append("    docksLowSec: ").append(toIndentedString(docksLowSec)).append("\n");
    sb.append("    docksNullSec: ").append(toIndentedString(docksNullSec)).append("\n");
    sb.append("    jumpsStargateHighSec: ").append(toIndentedString(jumpsStargateHighSec)).append("\n");
    sb.append("    jumpsStargateLowSec: ").append(toIndentedString(jumpsStargateLowSec)).append("\n");
    sb.append("    jumpsStargateNullSec: ").append(toIndentedString(jumpsStargateNullSec)).append("\n");
    sb.append("    jumpsWormhole: ").append(toIndentedString(jumpsWormhole)).append("\n");
    sb.append("    warpsHighSec: ").append(toIndentedString(warpsHighSec)).append("\n");
    sb.append("    warpsLowSec: ").append(toIndentedString(warpsLowSec)).append("\n");
    sb.append("    warpsNullSec: ").append(toIndentedString(warpsNullSec)).append("\n");
    sb.append("    warpsToBookmark: ").append(toIndentedString(warpsToBookmark)).append("\n");
    sb.append("    warpsToCelestial: ").append(toIndentedString(warpsToCelestial)).append("\n");
    sb.append("    warpsToFleetMember: ").append(toIndentedString(warpsToFleetMember)).append("\n");
    sb.append("    warpsToScanResult: ").append(toIndentedString(warpsToScanResult)).append("\n");
    sb.append("    warpsWormhole: ").append(toIndentedString(warpsWormhole)).append("\n");
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

