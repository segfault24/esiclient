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
 * yesterday object
 */
@ApiModel(description = "yesterday object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-18T22:16:15.536-04:00")
public class GetFwLeaderboardsCorporationsYesterdayYesterday1 {
  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("corporation_id")
  private Integer corporationId = null;

  public GetFwLeaderboardsCorporationsYesterdayYesterday1 amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount of victory points
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Amount of victory points")
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public GetFwLeaderboardsCorporationsYesterdayYesterday1 corporationId(Integer corporationId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFwLeaderboardsCorporationsYesterdayYesterday1 getFwLeaderboardsCorporationsYesterdayYesterday1 = (GetFwLeaderboardsCorporationsYesterdayYesterday1) o;
    return Objects.equals(this.amount, getFwLeaderboardsCorporationsYesterdayYesterday1.amount) &&
        Objects.equals(this.corporationId, getFwLeaderboardsCorporationsYesterdayYesterday1.corporationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, corporationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFwLeaderboardsCorporationsYesterdayYesterday1 {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    corporationId: ").append(toIndentedString(corporationId)).append("\n");
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

