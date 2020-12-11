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
public class GetCorporationsCorporationIdCustomsOffices200Ok {
  @SerializedName("alliance_tax_rate")
  private Float allianceTaxRate = null;

  @SerializedName("allow_access_with_standings")
  private Boolean allowAccessWithStandings = null;

  @SerializedName("allow_alliance_access")
  private Boolean allowAllianceAccess = null;

  @SerializedName("bad_standing_tax_rate")
  private Float badStandingTaxRate = null;

  @SerializedName("corporation_tax_rate")
  private Float corporationTaxRate = null;

  @SerializedName("excellent_standing_tax_rate")
  private Float excellentStandingTaxRate = null;

  @SerializedName("good_standing_tax_rate")
  private Float goodStandingTaxRate = null;

  @SerializedName("neutral_standing_tax_rate")
  private Float neutralStandingTaxRate = null;

  @SerializedName("office_id")
  private Long officeId = null;

  @SerializedName("reinforce_exit_end")
  private Integer reinforceExitEnd = null;

  @SerializedName("reinforce_exit_start")
  private Integer reinforceExitStart = null;

  /**
   * Access is allowed only for entities with this level of standing or better
   */
  public enum StandingLevelEnum {
    @SerializedName("bad")
    BAD("bad"),
    
    @SerializedName("excellent")
    EXCELLENT("excellent"),
    
    @SerializedName("good")
    GOOD("good"),
    
    @SerializedName("neutral")
    NEUTRAL("neutral"),
    
    @SerializedName("terrible")
    TERRIBLE("terrible");

    private String value;

    StandingLevelEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("standing_level")
  private StandingLevelEnum standingLevel = null;

  @SerializedName("system_id")
  private Integer systemId = null;

  @SerializedName("terrible_standing_tax_rate")
  private Float terribleStandingTaxRate = null;

  public GetCorporationsCorporationIdCustomsOffices200Ok allianceTaxRate(Float allianceTaxRate) {
    this.allianceTaxRate = allianceTaxRate;
    return this;
  }

   /**
   * Only present if alliance access is allowed
   * @return allianceTaxRate
  **/
  @ApiModelProperty(example = "null", value = "Only present if alliance access is allowed")
  public Float getAllianceTaxRate() {
    return allianceTaxRate;
  }

  public void setAllianceTaxRate(Float allianceTaxRate) {
    this.allianceTaxRate = allianceTaxRate;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok allowAccessWithStandings(Boolean allowAccessWithStandings) {
    this.allowAccessWithStandings = allowAccessWithStandings;
    return this;
  }

   /**
   * standing_level and any standing related tax rate only present when this is true
   * @return allowAccessWithStandings
  **/
  @ApiModelProperty(example = "null", required = true, value = "standing_level and any standing related tax rate only present when this is true")
  public Boolean getAllowAccessWithStandings() {
    return allowAccessWithStandings;
  }

  public void setAllowAccessWithStandings(Boolean allowAccessWithStandings) {
    this.allowAccessWithStandings = allowAccessWithStandings;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok allowAllianceAccess(Boolean allowAllianceAccess) {
    this.allowAllianceAccess = allowAllianceAccess;
    return this;
  }

   /**
   * allow_alliance_access boolean
   * @return allowAllianceAccess
  **/
  @ApiModelProperty(example = "null", required = true, value = "allow_alliance_access boolean")
  public Boolean getAllowAllianceAccess() {
    return allowAllianceAccess;
  }

  public void setAllowAllianceAccess(Boolean allowAllianceAccess) {
    this.allowAllianceAccess = allowAllianceAccess;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok badStandingTaxRate(Float badStandingTaxRate) {
    this.badStandingTaxRate = badStandingTaxRate;
    return this;
  }

   /**
   * bad_standing_tax_rate number
   * @return badStandingTaxRate
  **/
  @ApiModelProperty(example = "null", value = "bad_standing_tax_rate number")
  public Float getBadStandingTaxRate() {
    return badStandingTaxRate;
  }

  public void setBadStandingTaxRate(Float badStandingTaxRate) {
    this.badStandingTaxRate = badStandingTaxRate;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok corporationTaxRate(Float corporationTaxRate) {
    this.corporationTaxRate = corporationTaxRate;
    return this;
  }

   /**
   * corporation_tax_rate number
   * @return corporationTaxRate
  **/
  @ApiModelProperty(example = "null", value = "corporation_tax_rate number")
  public Float getCorporationTaxRate() {
    return corporationTaxRate;
  }

  public void setCorporationTaxRate(Float corporationTaxRate) {
    this.corporationTaxRate = corporationTaxRate;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok excellentStandingTaxRate(Float excellentStandingTaxRate) {
    this.excellentStandingTaxRate = excellentStandingTaxRate;
    return this;
  }

   /**
   * Tax rate for entities with excellent level of standing, only present if this level is allowed, same for all other standing related tax rates
   * @return excellentStandingTaxRate
  **/
  @ApiModelProperty(example = "null", value = "Tax rate for entities with excellent level of standing, only present if this level is allowed, same for all other standing related tax rates")
  public Float getExcellentStandingTaxRate() {
    return excellentStandingTaxRate;
  }

  public void setExcellentStandingTaxRate(Float excellentStandingTaxRate) {
    this.excellentStandingTaxRate = excellentStandingTaxRate;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok goodStandingTaxRate(Float goodStandingTaxRate) {
    this.goodStandingTaxRate = goodStandingTaxRate;
    return this;
  }

   /**
   * good_standing_tax_rate number
   * @return goodStandingTaxRate
  **/
  @ApiModelProperty(example = "null", value = "good_standing_tax_rate number")
  public Float getGoodStandingTaxRate() {
    return goodStandingTaxRate;
  }

  public void setGoodStandingTaxRate(Float goodStandingTaxRate) {
    this.goodStandingTaxRate = goodStandingTaxRate;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok neutralStandingTaxRate(Float neutralStandingTaxRate) {
    this.neutralStandingTaxRate = neutralStandingTaxRate;
    return this;
  }

   /**
   * neutral_standing_tax_rate number
   * @return neutralStandingTaxRate
  **/
  @ApiModelProperty(example = "null", value = "neutral_standing_tax_rate number")
  public Float getNeutralStandingTaxRate() {
    return neutralStandingTaxRate;
  }

  public void setNeutralStandingTaxRate(Float neutralStandingTaxRate) {
    this.neutralStandingTaxRate = neutralStandingTaxRate;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok officeId(Long officeId) {
    this.officeId = officeId;
    return this;
  }

   /**
   * unique ID of this customs office
   * @return officeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "unique ID of this customs office")
  public Long getOfficeId() {
    return officeId;
  }

  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok reinforceExitEnd(Integer reinforceExitEnd) {
    this.reinforceExitEnd = reinforceExitEnd;
    return this;
  }

   /**
   * reinforce_exit_end integer
   * minimum: 0
   * maximum: 23
   * @return reinforceExitEnd
  **/
  @ApiModelProperty(example = "null", required = true, value = "reinforce_exit_end integer")
  public Integer getReinforceExitEnd() {
    return reinforceExitEnd;
  }

  public void setReinforceExitEnd(Integer reinforceExitEnd) {
    this.reinforceExitEnd = reinforceExitEnd;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok reinforceExitStart(Integer reinforceExitStart) {
    this.reinforceExitStart = reinforceExitStart;
    return this;
  }

   /**
   * Together with reinforce_exit_end, marks a 2-hour period where this customs office could exit reinforcement mode during the day after initial attack
   * minimum: 0
   * maximum: 23
   * @return reinforceExitStart
  **/
  @ApiModelProperty(example = "null", required = true, value = "Together with reinforce_exit_end, marks a 2-hour period where this customs office could exit reinforcement mode during the day after initial attack")
  public Integer getReinforceExitStart() {
    return reinforceExitStart;
  }

  public void setReinforceExitStart(Integer reinforceExitStart) {
    this.reinforceExitStart = reinforceExitStart;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok standingLevel(StandingLevelEnum standingLevel) {
    this.standingLevel = standingLevel;
    return this;
  }

   /**
   * Access is allowed only for entities with this level of standing or better
   * @return standingLevel
  **/
  @ApiModelProperty(example = "null", value = "Access is allowed only for entities with this level of standing or better")
  public StandingLevelEnum getStandingLevel() {
    return standingLevel;
  }

  public void setStandingLevel(StandingLevelEnum standingLevel) {
    this.standingLevel = standingLevel;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

   /**
   * ID of the solar system this customs office is located in
   * @return systemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID of the solar system this customs office is located in")
  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }

  public GetCorporationsCorporationIdCustomsOffices200Ok terribleStandingTaxRate(Float terribleStandingTaxRate) {
    this.terribleStandingTaxRate = terribleStandingTaxRate;
    return this;
  }

   /**
   * terrible_standing_tax_rate number
   * @return terribleStandingTaxRate
  **/
  @ApiModelProperty(example = "null", value = "terrible_standing_tax_rate number")
  public Float getTerribleStandingTaxRate() {
    return terribleStandingTaxRate;
  }

  public void setTerribleStandingTaxRate(Float terribleStandingTaxRate) {
    this.terribleStandingTaxRate = terribleStandingTaxRate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdCustomsOffices200Ok getCorporationsCorporationIdCustomsOffices200Ok = (GetCorporationsCorporationIdCustomsOffices200Ok) o;
    return Objects.equals(this.allianceTaxRate, getCorporationsCorporationIdCustomsOffices200Ok.allianceTaxRate) &&
        Objects.equals(this.allowAccessWithStandings, getCorporationsCorporationIdCustomsOffices200Ok.allowAccessWithStandings) &&
        Objects.equals(this.allowAllianceAccess, getCorporationsCorporationIdCustomsOffices200Ok.allowAllianceAccess) &&
        Objects.equals(this.badStandingTaxRate, getCorporationsCorporationIdCustomsOffices200Ok.badStandingTaxRate) &&
        Objects.equals(this.corporationTaxRate, getCorporationsCorporationIdCustomsOffices200Ok.corporationTaxRate) &&
        Objects.equals(this.excellentStandingTaxRate, getCorporationsCorporationIdCustomsOffices200Ok.excellentStandingTaxRate) &&
        Objects.equals(this.goodStandingTaxRate, getCorporationsCorporationIdCustomsOffices200Ok.goodStandingTaxRate) &&
        Objects.equals(this.neutralStandingTaxRate, getCorporationsCorporationIdCustomsOffices200Ok.neutralStandingTaxRate) &&
        Objects.equals(this.officeId, getCorporationsCorporationIdCustomsOffices200Ok.officeId) &&
        Objects.equals(this.reinforceExitEnd, getCorporationsCorporationIdCustomsOffices200Ok.reinforceExitEnd) &&
        Objects.equals(this.reinforceExitStart, getCorporationsCorporationIdCustomsOffices200Ok.reinforceExitStart) &&
        Objects.equals(this.standingLevel, getCorporationsCorporationIdCustomsOffices200Ok.standingLevel) &&
        Objects.equals(this.systemId, getCorporationsCorporationIdCustomsOffices200Ok.systemId) &&
        Objects.equals(this.terribleStandingTaxRate, getCorporationsCorporationIdCustomsOffices200Ok.terribleStandingTaxRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allianceTaxRate, allowAccessWithStandings, allowAllianceAccess, badStandingTaxRate, corporationTaxRate, excellentStandingTaxRate, goodStandingTaxRate, neutralStandingTaxRate, officeId, reinforceExitEnd, reinforceExitStart, standingLevel, systemId, terribleStandingTaxRate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdCustomsOffices200Ok {\n");
    
    sb.append("    allianceTaxRate: ").append(toIndentedString(allianceTaxRate)).append("\n");
    sb.append("    allowAccessWithStandings: ").append(toIndentedString(allowAccessWithStandings)).append("\n");
    sb.append("    allowAllianceAccess: ").append(toIndentedString(allowAllianceAccess)).append("\n");
    sb.append("    badStandingTaxRate: ").append(toIndentedString(badStandingTaxRate)).append("\n");
    sb.append("    corporationTaxRate: ").append(toIndentedString(corporationTaxRate)).append("\n");
    sb.append("    excellentStandingTaxRate: ").append(toIndentedString(excellentStandingTaxRate)).append("\n");
    sb.append("    goodStandingTaxRate: ").append(toIndentedString(goodStandingTaxRate)).append("\n");
    sb.append("    neutralStandingTaxRate: ").append(toIndentedString(neutralStandingTaxRate)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    reinforceExitEnd: ").append(toIndentedString(reinforceExitEnd)).append("\n");
    sb.append("    reinforceExitStart: ").append(toIndentedString(reinforceExitStart)).append("\n");
    sb.append("    standingLevel: ").append(toIndentedString(standingLevel)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    terribleStandingTaxRate: ").append(toIndentedString(terribleStandingTaxRate)).append("\n");
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

