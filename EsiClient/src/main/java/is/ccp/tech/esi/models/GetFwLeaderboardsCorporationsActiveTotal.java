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
 * active_total object
 */
@ApiModel(description = "active_total object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class GetFwLeaderboardsCorporationsActiveTotal {
  @SerializedName("corporation_id")
  private Integer corporationId = null;

  @SerializedName("amount")
  private Integer amount = null;

  public GetFwLeaderboardsCorporationsActiveTotal corporationId(Integer corporationId) {
    this.corporationId = corporationId;
    return this;
  }

   /**
   * corporation_id integer
   * @return corporationId
  **/
  @ApiModelProperty(example = "null", value = "corporation_id integer")
  public Integer getCorporationId() {
    return corporationId;
  }

  public void setCorporationId(Integer corporationId) {
    this.corporationId = corporationId;
  }

  public GetFwLeaderboardsCorporationsActiveTotal amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of kills
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Amount of kills")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwLeaderboardsCorporationsActiveTotal getFwLeaderboardsCorporationsActiveTotal = (GetFwLeaderboardsCorporationsActiveTotal) o;
    return Objects.equals(this.corporationId, getFwLeaderboardsCorporationsActiveTotal.corporationId) &&
        Objects.equals(this.amount, getFwLeaderboardsCorporationsActiveTotal.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporationId, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCorporationsActiveTotal {\n");
    
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

