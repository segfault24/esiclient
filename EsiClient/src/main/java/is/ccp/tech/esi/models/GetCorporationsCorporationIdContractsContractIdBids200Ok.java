/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.2
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
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-25T15:34:30.466-04:00")
public class GetCorporationsCorporationIdContractsContractIdBids200Ok {
  @SerializedName("amount")
  private Float amount = null;

  @SerializedName("bid_id")
  private Integer bidId = null;

  @SerializedName("bidder_id")
  private Integer bidderId = null;

  @SerializedName("date_bid")
  private DateTime dateBid = null;

  public GetCorporationsCorporationIdContractsContractIdBids200Ok amount(Float amount) {
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

  public GetCorporationsCorporationIdContractsContractIdBids200Ok bidId(Integer bidId) {
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

  public GetCorporationsCorporationIdContractsContractIdBids200Ok bidderId(Integer bidderId) {
    this.bidderId = bidderId;
    return this;
  }

   /**
   * Character ID of the bidder
   * @return bidderId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Character ID of the bidder")
  public Integer getBidderId() {
    return bidderId;
  }

  public void setBidderId(Integer bidderId) {
    this.bidderId = bidderId;
  }

  public GetCorporationsCorporationIdContractsContractIdBids200Ok dateBid(DateTime dateBid) {
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
    GetCorporationsCorporationIdContractsContractIdBids200Ok getCorporationsCorporationIdContractsContractIdBids200Ok = (GetCorporationsCorporationIdContractsContractIdBids200Ok) o;
    return Objects.equals(this.amount, getCorporationsCorporationIdContractsContractIdBids200Ok.amount) &&
        Objects.equals(this.bidId, getCorporationsCorporationIdContractsContractIdBids200Ok.bidId) &&
        Objects.equals(this.bidderId, getCorporationsCorporationIdContractsContractIdBids200Ok.bidderId) &&
        Objects.equals(this.dateBid, getCorporationsCorporationIdContractsContractIdBids200Ok.dateBid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bidId, bidderId, dateBid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdContractsContractIdBids200Ok {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bidId: ").append(toIndentedString(bidId)).append("\n");
    sb.append("    bidderId: ").append(toIndentedString(bidderId)).append("\n");
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

