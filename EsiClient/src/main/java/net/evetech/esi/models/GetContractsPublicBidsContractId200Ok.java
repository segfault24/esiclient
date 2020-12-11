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
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:41:27.859-05:00")
public class GetContractsPublicBidsContractId200Ok {
  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("bid_id")
  private Integer bidId = null;

  @SerializedName("date_bid")
  private DateTime dateBid = null;

  public GetContractsPublicBidsContractId200Ok amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount bid, in ISK
   * @return amount
  **/
  @ApiModelProperty(example = "null", required = true, value = "The amount bid, in ISK")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public GetContractsPublicBidsContractId200Ok bidId(Integer bidId) {
    this.bidId = bidId;
    return this;
  }

   /**
   * Unique ID for the bid
   * @return bidId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Unique ID for the bid")
  public Integer getBidId() {
    return bidId;
  }

  public void setBidId(Integer bidId) {
    this.bidId = bidId;
  }

  public GetContractsPublicBidsContractId200Ok dateBid(DateTime dateBid) {
    this.dateBid = dateBid;
    return this;
  }

   /**
   * Datetime when the bid was placed
   * @return dateBid
  **/
  @ApiModelProperty(example = "null", required = true, value = "Datetime when the bid was placed")
  public DateTime getDateBid() {
    return dateBid;
  }

  public void setDateBid(DateTime dateBid) {
    this.dateBid = dateBid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractsPublicBidsContractId200Ok getContractsPublicBidsContractId200Ok = (GetContractsPublicBidsContractId200Ok) o;
    return Objects.equals(this.amount, getContractsPublicBidsContractId200Ok.amount) &&
        Objects.equals(this.bidId, getContractsPublicBidsContractId200Ok.bidId) &&
        Objects.equals(this.dateBid, getContractsPublicBidsContractId200Ok.dateBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bidId, dateBid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractsPublicBidsContractId200Ok {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bidId: ").append(toIndentedString(bidId)).append("\n");
    sb.append("    dateBid: ").append(toIndentedString(dateBid)).append("\n");
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

