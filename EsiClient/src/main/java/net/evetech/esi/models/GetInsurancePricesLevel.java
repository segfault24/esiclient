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

/**
 * level object
 */
@ApiModel(description = "level object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-01T20:01:07.682-05:00")
public class GetInsurancePricesLevel {
  @SerializedName("cost")
  private Float cost = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("payout")
  private Float payout = null;

  public GetInsurancePricesLevel cost(Float cost) {
    this.cost = cost;
    return this;
  }

   /**
   * cost number
   * @return cost
  **/
  @ApiModelProperty(example = "null", required = true, value = "cost number")
  public Float getCost() {
    return cost;
  }

  public void setCost(Float cost) {
    this.cost = cost;
  }

  public GetInsurancePricesLevel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Localized insurance level
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "Localized insurance level")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetInsurancePricesLevel payout(Float payout) {
    this.payout = payout;
    return this;
  }

   /**
   * payout number
   * @return payout
  **/
  @ApiModelProperty(example = "null", required = true, value = "payout number")
  public Float getPayout() {
    return payout;
  }

  public void setPayout(Float payout) {
    this.payout = payout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetInsurancePricesLevel getInsurancePricesLevel = (GetInsurancePricesLevel) o;
    return Objects.equals(this.cost, getInsurancePricesLevel.cost) &&
        Objects.equals(this.name, getInsurancePricesLevel.name) &&
        Objects.equals(this.payout, getInsurancePricesLevel.payout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, name, payout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetInsurancePricesLevel {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payout: ").append(toIndentedString(payout)).append("\n");
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

