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
import java.util.ArrayList;
import java.util.List;
import net.evetech.esi.models.GetFwLeaderboardsCharactersActiveTotalActiveTotal1;
import net.evetech.esi.models.GetFwLeaderboardsCharactersLastWeekLastWeek1;
import net.evetech.esi.models.GetFwLeaderboardsCharactersYesterdayYesterday1;

/**
 * Top 100 rankings of pilots by victory points from yesterday, last week and in total
 */
@ApiModel(description = "Top 100 rankings of pilots by victory points from yesterday, last week and in total")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-04T12:18:31.101-04:00")
public class GetFwLeaderboardsCharactersVictoryPoints {
  @SerializedName("active_total")
  private List<GetFwLeaderboardsCharactersActiveTotalActiveTotal1> activeTotal = new ArrayList<GetFwLeaderboardsCharactersActiveTotalActiveTotal1>();

  @SerializedName("last_week")
  private List<GetFwLeaderboardsCharactersLastWeekLastWeek1> lastWeek = new ArrayList<GetFwLeaderboardsCharactersLastWeekLastWeek1>();

  @SerializedName("yesterday")
  private List<GetFwLeaderboardsCharactersYesterdayYesterday1> yesterday = new ArrayList<GetFwLeaderboardsCharactersYesterdayYesterday1>();

  public GetFwLeaderboardsCharactersVictoryPoints activeTotal(List<GetFwLeaderboardsCharactersActiveTotalActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsCharactersVictoryPoints addActiveTotalItem(GetFwLeaderboardsCharactersActiveTotalActiveTotal1 activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

   /**
   * Top 100 ranking of pilots active in faction warfare by total victory points. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days.
   * @return activeTotal
  **/
  @ApiModelProperty(example = "null", required = true, value = "Top 100 ranking of pilots active in faction warfare by total victory points. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days.")
  public List<GetFwLeaderboardsCharactersActiveTotalActiveTotal1> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsCharactersActiveTotalActiveTotal1> activeTotal) {
    this.activeTotal = activeTotal;
  }

  public GetFwLeaderboardsCharactersVictoryPoints lastWeek(List<GetFwLeaderboardsCharactersLastWeekLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsCharactersVictoryPoints addLastWeekItem(GetFwLeaderboardsCharactersLastWeekLastWeek1 lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

   /**
   * Top 100 ranking of pilots by victory points in the past week
   * @return lastWeek
  **/
  @ApiModelProperty(example = "null", required = true, value = "Top 100 ranking of pilots by victory points in the past week")
  public List<GetFwLeaderboardsCharactersLastWeekLastWeek1> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsCharactersLastWeekLastWeek1> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsCharactersVictoryPoints yesterday(List<GetFwLeaderboardsCharactersYesterdayYesterday1> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsCharactersVictoryPoints addYesterdayItem(GetFwLeaderboardsCharactersYesterdayYesterday1 yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

   /**
   * Top 100 ranking of pilots by victory points in the past day
   * @return yesterday
  **/
  @ApiModelProperty(example = "null", required = true, value = "Top 100 ranking of pilots by victory points in the past day")
  public List<GetFwLeaderboardsCharactersYesterdayYesterday1> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsCharactersYesterdayYesterday1> yesterday) {
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
    GetFwLeaderboardsCharactersVictoryPoints getFwLeaderboardsCharactersVictoryPoints = (GetFwLeaderboardsCharactersVictoryPoints) o;
    return Objects.equals(this.activeTotal, getFwLeaderboardsCharactersVictoryPoints.activeTotal) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsCharactersVictoryPoints.lastWeek) &&
        Objects.equals(this.yesterday, getFwLeaderboardsCharactersVictoryPoints.yesterday);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTotal, lastWeek, yesterday);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCharactersVictoryPoints {\n");
    
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
