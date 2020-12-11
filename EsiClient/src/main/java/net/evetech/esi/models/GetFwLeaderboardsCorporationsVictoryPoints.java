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
import net.evetech.esi.models.GetFwLeaderboardsCorporationsActiveTotalActiveTotal1;
import net.evetech.esi.models.GetFwLeaderboardsCorporationsLastWeekLastWeek1;
import net.evetech.esi.models.GetFwLeaderboardsCorporationsYesterdayYesterday1;

/**
 * Top 10 rankings of corporations by victory points from yesterday, last week and in total
 */
@ApiModel(description = "Top 10 rankings of corporations by victory points from yesterday, last week and in total")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:20:13.441-05:00")
public class GetFwLeaderboardsCorporationsVictoryPoints {
  @SerializedName("active_total")
  private List<GetFwLeaderboardsCorporationsActiveTotalActiveTotal1> activeTotal = new ArrayList<GetFwLeaderboardsCorporationsActiveTotalActiveTotal1>();

  @SerializedName("last_week")
  private List<GetFwLeaderboardsCorporationsLastWeekLastWeek1> lastWeek = new ArrayList<GetFwLeaderboardsCorporationsLastWeekLastWeek1>();

  @SerializedName("yesterday")
  private List<GetFwLeaderboardsCorporationsYesterdayYesterday1> yesterday = new ArrayList<GetFwLeaderboardsCorporationsYesterdayYesterday1>();

  public GetFwLeaderboardsCorporationsVictoryPoints activeTotal(List<GetFwLeaderboardsCorporationsActiveTotalActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints addActiveTotalItem(GetFwLeaderboardsCorporationsActiveTotalActiveTotal1 activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

   /**
   * Top 10 ranking of corporations active in faction warfare by total victory points. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days
   * @return activeTotal
  **/
  @ApiModelProperty(example = "null", required = true, value = "Top 10 ranking of corporations active in faction warfare by total victory points. A corporation is considered \"active\" if they have participated in faction warfare in the past 14 days")
  public List<GetFwLeaderboardsCorporationsActiveTotalActiveTotal1> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsCorporationsActiveTotalActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints lastWeek(List<GetFwLeaderboardsCorporationsLastWeekLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints addLastWeekItem(GetFwLeaderboardsCorporationsLastWeekLastWeek1 lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

   /**
   * Top 10 ranking of corporations by victory points in the past week
   * @return lastWeek
  **/
  @ApiModelProperty(example = "null", required = true, value = "Top 10 ranking of corporations by victory points in the past week")
  public List<GetFwLeaderboardsCorporationsLastWeekLastWeek1> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsCorporationsLastWeekLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints yesterday(List<GetFwLeaderboardsCorporationsYesterdayYesterday1> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsCorporationsVictoryPoints addYesterdayItem(GetFwLeaderboardsCorporationsYesterdayYesterday1 yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

   /**
   * Top 10 ranking of corporations by victory points in the past day
   * @return yesterday
  **/
  @ApiModelProperty(example = "null", required = true, value = "Top 10 ranking of corporations by victory points in the past day")
  public List<GetFwLeaderboardsCorporationsYesterdayYesterday1> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsCorporationsYesterdayYesterday1> yesterday) {
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
    GetFwLeaderboardsCorporationsVictoryPoints getFwLeaderboardsCorporationsVictoryPoints = (GetFwLeaderboardsCorporationsVictoryPoints) o;
    return Objects.equals(this.activeTotal, getFwLeaderboardsCorporationsVictoryPoints.activeTotal) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsCorporationsVictoryPoints.lastWeek) &&
        Objects.equals(this.yesterday, getFwLeaderboardsCorporationsVictoryPoints.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTotal, lastWeek, yesterday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCorporationsVictoryPoints {\n");
    
    sb.append("    activeTotal: ").append(toIndentedString(activeTotal)).append("\n");
    sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
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

