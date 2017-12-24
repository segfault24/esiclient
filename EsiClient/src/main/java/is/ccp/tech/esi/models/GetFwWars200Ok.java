/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.7.3
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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class GetFwWars200Ok {
  @SerializedName("faction_id")
  private Integer factionId = null;

  @SerializedName("against_id")
  private Integer againstId = null;

  public GetFwWars200Ok factionId(Integer factionId) {
    this.factionId = factionId;
    return this;
  }

   /**
   * faction_id integer
   * @return factionId
  **/
  @ApiModelProperty(example = "null", required = true, value = "faction_id integer")
  public Integer getFactionId() {
    return factionId;
  }

  public void setFactionId(Integer factionId) {
    this.factionId = factionId;
  }

  public GetFwWars200Ok againstId(Integer againstId) {
    this.againstId = againstId;
    return this;
  }

   /**
   * The faction ID of the enemy faction.
   * @return againstId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The faction ID of the enemy faction.")
  public Integer getAgainstId() {
    return againstId;
  }

  public void setAgainstId(Integer againstId) {
    this.againstId = againstId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwWars200Ok getFwWars200Ok = (GetFwWars200Ok) o;
    return Objects.equals(this.factionId, getFwWars200Ok.factionId) &&
        Objects.equals(this.againstId, getFwWars200Ok.againstId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factionId, againstId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwWars200Ok {\n");
    
    sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
    sb.append("    againstId: ").append(toIndentedString(againstId)).append("\n");
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

