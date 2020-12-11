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

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:37:36.420-05:00")
public class GetIndustryFacilities200Ok {
  @SerializedName("facility_id")
  private Long facilityId = null;

  @SerializedName("owner_id")
  private Integer ownerId = null;

  @SerializedName("region_id")
  private Integer regionId = null;

  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  @SerializedName("tax")
  private Float tax = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetIndustryFacilities200Ok facilityId(Long facilityId) {
    this.facilityId = facilityId;
    return this;
  }

   /**
   * ID of the facility
   * @return facilityId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID of the facility")
  public Long getFacilityId() {
    return facilityId;
  }

  public void setFacilityId(Long facilityId) {
    this.facilityId = facilityId;
  }

  public GetIndustryFacilities200Ok ownerId(Integer ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * Owner of the facility
   * @return ownerId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Owner of the facility")
  public Integer getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Integer ownerId) {
    this.ownerId = ownerId;
  }

  public GetIndustryFacilities200Ok regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * Region ID where the facility is
   * @return regionId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Region ID where the facility is")
  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public GetIndustryFacilities200Ok solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * Solar system ID where the facility is
   * @return solarSystemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Solar system ID where the facility is")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetIndustryFacilities200Ok tax(Float tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Tax imposed by the facility
   * @return tax
  **/
  @ApiModelProperty(example = "null", value = "Tax imposed by the facility")
  public Float getTax() {
    return tax;
  }

  public void setTax(Float tax) {
    this.tax = tax;
  }

  public GetIndustryFacilities200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Type ID of the facility
   * @return typeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Type ID of the facility")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetIndustryFacilities200Ok getIndustryFacilities200Ok = (GetIndustryFacilities200Ok) o;
    return Objects.equals(this.facilityId, getIndustryFacilities200Ok.facilityId) &&
        Objects.equals(this.ownerId, getIndustryFacilities200Ok.ownerId) &&
        Objects.equals(this.regionId, getIndustryFacilities200Ok.regionId) &&
        Objects.equals(this.solarSystemId, getIndustryFacilities200Ok.solarSystemId) &&
        Objects.equals(this.tax, getIndustryFacilities200Ok.tax) &&
        Objects.equals(this.typeId, getIndustryFacilities200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facilityId, ownerId, regionId, solarSystemId, tax, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetIndustryFacilities200Ok {\n");
    
    sb.append("    facilityId: ").append(toIndentedString(facilityId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

