/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.7.1
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
import is.ccp.tech.esi.models.GetFwLeaderboardsCharactersActiveTotal;
import is.ccp.tech.esi.models.GetFwLeaderboardsCharactersLastWeek;
import is.ccp.tech.esi.models.GetFwLeaderboardsCharactersYesterday;
import java.util.ArrayList;
import java.util.List;

/**
 * Top 100 rankings of pilots by number of kills from yesterday, last week and in total.
 */
@ApiModel(description = "Top 100 rankings of pilots by number of kills from yesterday, last week and in total.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-07T00:36:23.258-05:00")
public class GetFwLeaderboardsCharactersKills {
  @SerializedName("yesterday")
  private List<GetFwLeaderboardsCharactersYesterday> yesterday = new ArrayList<GetFwLeaderboardsCharactersYesterday>();

  @SerializedName("last_week")
  private List<GetFwLeaderboardsCharactersLastWeek> lastWeek = new ArrayList<GetFwLeaderboardsCharactersLastWeek>();

  @SerializedName("active_total")
  private List<GetFwLeaderboardsCharactersActiveTotal> activeTotal = new ArrayList<GetFwLeaderboardsCharactersActiveTotal>();

  public GetFwLeaderboardsCharactersKills yesterday(List<GetFwLeaderboardsCharactersYesterday> yesterday) {
    this.yesterday = yesterday;
    return this;
  }

  public GetFwLeaderboardsCharactersKills addYesterdayItem(GetFwLeaderboardsCharactersYesterday yesterdayItem) {
    this.yesterday.add(yesterdayItem);
    return this;
  }

   /**
   * Top 100 ranking of pilots by kills in the past day
   * @return yesterday
  **/
  @ApiModelProperty(example = "null", required = true, value = "Top 100 ranking of pilots by kills in the past day")
  public List<GetFwLeaderboardsCharactersYesterday> getYesterday() {
    return yesterday;
  }

  public void setYesterday(List<GetFwLeaderboardsCharactersYesterday> yesterday) {
    this.yesterday = yesterday;
  }

  public GetFwLeaderboardsCharactersKills lastWeek(List<GetFwLeaderboardsCharactersLastWeek> lastWeek) {
    this.lastWeek = lastWeek;
    return this;
  }

  public GetFwLeaderboardsCharactersKills addLastWeekItem(GetFwLeaderboardsCharactersLastWeek lastWeekItem) {
    this.lastWeek.add(lastWeekItem);
    return this;
  }

   /**
   * Top 100 ranking of pilots by kills in the past week
   * @return lastWeek
  **/
  @ApiModelProperty(example = "null", required = true, value = "Top 100 ranking of pilots by kills in the past week")
  public List<GetFwLeaderboardsCharactersLastWeek> getLastWeek() {
    return lastWeek;
  }

  public void setLastWeek(List<GetFwLeaderboardsCharactersLastWeek> lastWeek) {
    this.lastWeek = lastWeek;
  }

  public GetFwLeaderboardsCharactersKills activeTotal(List<GetFwLeaderboardsCharactersActiveTotal> activeTotal) {
    this.activeTotal = activeTotal;
    return this;
  }

  public GetFwLeaderboardsCharactersKills addActiveTotalItem(GetFwLeaderboardsCharactersActiveTotal activeTotalItem) {
    this.activeTotal.add(activeTotalItem);
    return this;
  }

   /**
   * Top 100 ranking of pilots active in faction warfare by total kills. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days.
   * @return activeTotal
  **/
  @ApiModelProperty(example = "null", required = true, value = "Top 100 ranking of pilots active in faction warfare by total kills. A pilot is considered \"active\" if they have participated in faction warfare in the past 14 days.")
  public List<GetFwLeaderboardsCharactersActiveTotal> getActiveTotal() {
    return activeTotal;
  }

  public void setActiveTotal(List<GetFwLeaderboardsCharactersActiveTotal> activeTotal) {
    this.activeTotal = activeTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwLeaderboardsCharactersKills getFwLeaderboardsCharactersKills = (GetFwLeaderboardsCharactersKills) o;
    return Objects.equals(this.yesterday, getFwLeaderboardsCharactersKills.yesterday) &&
        Objects.equals(this.lastWeek, getFwLeaderboardsCharactersKills.lastWeek) &&
        Objects.equals(this.activeTotal, getFwLeaderboardsCharactersKills.activeTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(yesterday, lastWeek, activeTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCharactersKills {\n");
    
    sb.append("    yesterday: ").append(toIndentedString(yesterday)).append("\n");
    sb.append("    lastWeek: ").append(toIndentedString(lastWeek)).append("\n");
    sb.append("    activeTotal: ").append(toIndentedString(activeTotal)).append("\n");
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

