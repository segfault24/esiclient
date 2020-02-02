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
import net.evetech.esi.models.GetFwLeaderboardsKills;
import net.evetech.esi.models.GetFwLeaderboardsVictoryPoints;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-01T20:01:07.682-05:00")
public class GetFwLeaderboardsOk {
  @SerializedName("kills")
  private GetFwLeaderboardsKills kills = null;

  @SerializedName("victory_points")
  private GetFwLeaderboardsVictoryPoints victoryPoints = null;

  public GetFwLeaderboardsOk kills(GetFwLeaderboardsKills kills) {
    this.kills = kills;
    return this;
  }

   /**
   * Get kills
   * @return kills
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetFwLeaderboardsKills getKills() {
    return kills;
  }

  public void setKills(GetFwLeaderboardsKills kills) {
    this.kills = kills;
  }

  public GetFwLeaderboardsOk victoryPoints(GetFwLeaderboardsVictoryPoints victoryPoints) {
    this.victoryPoints = victoryPoints;
    return this;
  }

   /**
   * Get victoryPoints
   * @return victoryPoints
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetFwLeaderboardsVictoryPoints getVictoryPoints() {
    return victoryPoints;
  }

  public void setVictoryPoints(GetFwLeaderboardsVictoryPoints victoryPoints) {
    this.victoryPoints = victoryPoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwLeaderboardsOk getFwLeaderboardsOk = (GetFwLeaderboardsOk) o;
    return Objects.equals(this.kills, getFwLeaderboardsOk.kills) &&
        Objects.equals(this.victoryPoints, getFwLeaderboardsOk.victoryPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kills, victoryPoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsOk {\n");
    
    sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
    sb.append("    victoryPoints: ").append(toIndentedString(victoryPoints)).append("\n");
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

