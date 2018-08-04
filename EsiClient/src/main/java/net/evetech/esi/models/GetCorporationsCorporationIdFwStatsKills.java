/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.5
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
 * Summary of kills done by the given corporation against enemy factions
 */
@ApiModel(description = "Summary of kills done by the given corporation against enemy factions")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-04T12:18:31.101-04:00")
public class GetCorporationsCorporationIdFwStatsKills {
  @SerializedName("last_week")
  private Integer lastWeek = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("yesterday")
  private Integer yesterday = null;

  public GetCorporationsCorporationIdFwStatsKills lastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

   /**
   * Last week's total number of kills by members of the given corporation against enemy factions
   * @return lastWeek
  **/
  @ApiModelProperty(example = "null", required = true, value = "Last week's total number of kills by members of the given corporation against enemy factions")
  public Integer getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(Integer lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetCorporationsCorporationIdFwStatsKills total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of kills by members of the given corporation against enemy factions since the corporation enlisted
   * @return total
  **/
  @ApiModelProperty(example = "null", required = true, value = "Total number of kills by members of the given corporation against enemy factions since the corporation enlisted")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public GetCorporationsCorporationIdFwStatsKills yesterday(Integer yesterday) {
    this.yesterday = yesterday;
    return this;
  }

   /**
   * Yesterday's total number of kills by members of the given corporation against enemy factions
   * @return yesterday
  **/
  @ApiModelProperty(example = "null", required = true, value = "Yesterday's total number of kills by members of the given corporation against enemy factions")
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
    GetCorporationsCorporationIdFwStatsKills getCorporationsCorporationIdFwStatsKills = (GetCorporationsCorporationIdFwStatsKills) o;
    return Objects.equals(this.lastWeek, getCorporationsCorporationIdFwStatsKills.lastWeek) &&
        Objects.equals(this.total, getCorporationsCorporationIdFwStatsKills.total) &&
        Objects.equals(this.yesterday, getCorporationsCorporationIdFwStatsKills.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastWeek, total, yesterday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdFwStatsKills {\n");
    
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
