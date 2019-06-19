/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.6
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
 * Summary of victory points gained by the given corporation for the enlisted faction
 */
@ApiModel(description = "Summary of victory points gained by the given corporation for the enlisted faction")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-18T22:16:15.536-04:00")
public class GetCorporationsCorporationIdFwStatsVictoryPoints {
  @SerializedName("last_week")
  private Integer lastWeek = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("yesterday")
  private Integer yesterday = null;

  public GetCorporationsCorporationIdFwStatsVictoryPoints lastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

   /**
   * Last week's victory points gained by members of the given corporation
   * @return lastWeek
  **/
  @ApiModelProperty(example = "null", required = true, value = "Last week's victory points gained by members of the given corporation")
  public Integer getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetCorporationsCorporationIdFwStatsVictoryPoints total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total victory points gained since the given corporation enlisted
   * @return total
  **/
  @ApiModelProperty(example = "null", required = true, value = "Total victory points gained since the given corporation enlisted")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public GetCorporationsCorporationIdFwStatsVictoryPoints yesterday(Integer yesterday) {
    this.yesterday = yesterday;
    return this;
  }

   /**
   * Yesterday's victory points gained by members of the given corporation
   * @return yesterday
  **/
  @ApiModelProperty(example = "null", required = true, value = "Yesterday's victory points gained by members of the given corporation")
  public Integer getYesterday() {
    return yesterday;
  }

  public void setYesterday(Integer yesterday) {
    this.yesterday = yesterday;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdFwStatsVictoryPoints getCorporationsCorporationIdFwStatsVictoryPoints = (GetCorporationsCorporationIdFwStatsVictoryPoints) o;
    return Objects.equals(this.lastWeek, getCorporationsCorporationIdFwStatsVictoryPoints.lastWeek) &&
        Objects.equals(this.total, getCorporationsCorporationIdFwStatsVictoryPoints.total) &&
        Objects.equals(this.yesterday, getCorporationsCorporationIdFwStatsVictoryPoints.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastWeek, total, yesterday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdFwStatsVictoryPoints {\n");
    
    sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
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

