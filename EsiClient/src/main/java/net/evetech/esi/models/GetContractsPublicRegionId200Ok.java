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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:37:36.420-05:00")
public class GetContractsPublicRegionId200Ok {
  @SerializedName("buyout")
  private Double buyout = null;

  @SerializedName("collateral")
  private Double collateral = null;

  @SerializedName("contract_id")
  private Integer contractId = null;

  @SerializedName("date_expired")
  private DateTime dateExpired = null;

  @SerializedName("date_issued")
  private DateTime dateIssued = null;

  @SerializedName("days_to_complete")
  private Integer daysToComplete = null;

  @SerializedName("end_location_id")
  private Long endLocationId = null;

  @SerializedName("for_corporation")
  private Boolean forCorporation = null;

  @SerializedName("issuer_corporation_id")
  private Integer issuerCorporationId = null;

  @SerializedName("issuer_id")
  private Integer issuerId = null;

  @SerializedName("price")
  private Double price = null;

  @SerializedName("reward")
  private Double reward = null;

  @SerializedName("start_location_id")
  private Long startLocationId = null;

  @SerializedName("title")
  private String title = null;

  /**
   * Type of the contract
   */
  public enum TypeEnum {
    @SerializedName("unknown")
    UNKNOWN("unknown"),
    
    @SerializedName("item_exchange")
    ITEM_EXCHANGE("item_exchange"),
    
    @SerializedName("auction")
    AUCTION("auction"),
    
    @SerializedName("courier")
    COURIER("courier"),
    
    @SerializedName("loan")
    LOAN("loan");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("volume")
  private Double volume = null;

  public GetContractsPublicRegionId200Ok buyout(Double buyout) {
    this.buyout = buyout;
    return this;
  }

   /**
   * Buyout price (for Auctions only)
   * @return buyout
  **/
  @ApiModelProperty(example = "null", value = "Buyout price (for Auctions only)")
  public Double getBuyout() {
    return buyout;
  }

  public void setBuyout(Double buyout) {
    this.buyout = buyout;
  }

  public GetContractsPublicRegionId200Ok collateral(Double collateral) {
    this.collateral = collateral;
    return this;
  }

   /**
   * Collateral price (for Couriers only)
   * @return collateral
  **/
  @ApiModelProperty(example = "null", value = "Collateral price (for Couriers only)")
  public Double getCollateral() {
    return collateral;
  }

  public void setCollateral(Double collateral) {
    this.collateral = collateral;
  }

  public GetContractsPublicRegionId200Ok contractId(Integer contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * contract_id integer
   * @return contractId
  **/
  @ApiModelProperty(example = "null", required = true, value = "contract_id integer")
  public Integer getContractId() {
    return contractId;
  }

  public void setContractId(Integer contractId) {
    this.contractId = contractId;
  }

  public GetContractsPublicRegionId200Ok dateExpired(DateTime dateExpired) {
    this.dateExpired = dateExpired;
    return this;
  }

   /**
   * Expiration date of the contract
   * @return dateExpired
  **/
  @ApiModelProperty(example = "null", required = true, value = "Expiration date of the contract")
  public DateTime getDateExpired() {
    return dateExpired;
  }

  public void setDateExpired(DateTime dateExpired) {
    this.dateExpired = dateExpired;
  }

  public GetContractsPublicRegionId200Ok dateIssued(DateTime dateIssued) {
    this.dateIssued = dateIssued;
    return this;
  }

   /**
   * Сreation date of the contract
   * @return dateIssued
  **/
  @ApiModelProperty(example = "null", required = true, value = "Сreation date of the contract")
  public DateTime getDateIssued() {
    return dateIssued;
  }

  public void setDateIssued(DateTime dateIssued) {
    this.dateIssued = dateIssued;
  }

  public GetContractsPublicRegionId200Ok daysToComplete(Integer daysToComplete) {
    this.daysToComplete = daysToComplete;
    return this;
  }

   /**
   * Number of days to perform the contract
   * @return daysToComplete
  **/
  @ApiModelProperty(example = "null", value = "Number of days to perform the contract")
  public Integer getDaysToComplete() {
    return daysToComplete;
  }

  public void setDaysToComplete(Integer daysToComplete) {
    this.daysToComplete = daysToComplete;
  }

  public GetContractsPublicRegionId200Ok endLocationId(Long endLocationId) {
    this.endLocationId = endLocationId;
    return this;
  }

   /**
   * End location ID (for Couriers contract)
   * @return endLocationId
  **/
  @ApiModelProperty(example = "null", value = "End location ID (for Couriers contract)")
  public Long getEndLocationId() {
    return endLocationId;
  }

  public void setEndLocationId(Long endLocationId) {
    this.endLocationId = endLocationId;
  }

  public GetContractsPublicRegionId200Ok forCorporation(Boolean forCorporation) {
    this.forCorporation = forCorporation;
    return this;
  }

   /**
   * true if the contract was issued on behalf of the issuer's corporation
   * @return forCorporation
  **/
  @ApiModelProperty(example = "null", value = "true if the contract was issued on behalf of the issuer's corporation")
  public Boolean getForCorporation() {
    return forCorporation;
  }

  public void setForCorporation(Boolean forCorporation) {
    this.forCorporation = forCorporation;
  }

  public GetContractsPublicRegionId200Ok issuerCorporationId(Integer issuerCorporationId) {
    this.issuerCorporationId = issuerCorporationId;
    return this;
  }

   /**
   * Character's corporation ID for the issuer
   * @return issuerCorporationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Character's corporation ID for the issuer")
  public Integer getIssuerCorporationId() {
    return issuerCorporationId;
  }

  public void setIssuerCorporationId(Integer issuerCorporationId) {
    this.issuerCorporationId = issuerCorporationId;
  }

  public GetContractsPublicRegionId200Ok issuerId(Integer issuerId) {
    this.issuerId = issuerId;
    return this;
  }

   /**
   * Character ID for the issuer
   * @return issuerId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Character ID for the issuer")
  public Integer getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(Integer issuerId) {
    this.issuerId = issuerId;
  }

  public GetContractsPublicRegionId200Ok price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Price of contract (for ItemsExchange and Auctions)
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "Price of contract (for ItemsExchange and Auctions)")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public GetContractsPublicRegionId200Ok reward(Double reward) {
    this.reward = reward;
    return this;
  }

   /**
   * Remuneration for contract (for Couriers only)
   * @return reward
  **/
  @ApiModelProperty(example = "null", value = "Remuneration for contract (for Couriers only)")
  public Double getReward() {
    return reward;
  }

  public void setReward(Double reward) {
    this.reward = reward;
  }

  public GetContractsPublicRegionId200Ok startLocationId(Long startLocationId) {
    this.startLocationId = startLocationId;
    return this;
  }

   /**
   * Start location ID (for Couriers contract)
   * @return startLocationId
  **/
  @ApiModelProperty(example = "null", value = "Start location ID (for Couriers contract)")
  public Long getStartLocationId() {
    return startLocationId;
  }

  public void setStartLocationId(Long startLocationId) {
    this.startLocationId = startLocationId;
  }

  public GetContractsPublicRegionId200Ok title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of the contract
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "Title of the contract")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GetContractsPublicRegionId200Ok type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the contract
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "Type of the contract")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public GetContractsPublicRegionId200Ok volume(Double volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Volume of items in the contract
   * @return volume
  **/
  @ApiModelProperty(example = "null", value = "Volume of items in the contract")
  public Double getVolume() {
    return volume;
  }

  public void setVolume(Double volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContractsPublicRegionId200Ok getContractsPublicRegionId200Ok = (GetContractsPublicRegionId200Ok) o;
    return Objects.equals(this.buyout, getContractsPublicRegionId200Ok.buyout) &&
        Objects.equals(this.collateral, getContractsPublicRegionId200Ok.collateral) &&
        Objects.equals(this.contractId, getContractsPublicRegionId200Ok.contractId) &&
        Objects.equals(this.dateExpired, getContractsPublicRegionId200Ok.dateExpired) &&
        Objects.equals(this.dateIssued, getContractsPublicRegionId200Ok.dateIssued) &&
        Objects.equals(this.daysToComplete, getContractsPublicRegionId200Ok.daysToComplete) &&
        Objects.equals(this.endLocationId, getContractsPublicRegionId200Ok.endLocationId) &&
        Objects.equals(this.forCorporation, getContractsPublicRegionId200Ok.forCorporation) &&
        Objects.equals(this.issuerCorporationId, getContractsPublicRegionId200Ok.issuerCorporationId) &&
        Objects.equals(this.issuerId, getContractsPublicRegionId200Ok.issuerId) &&
        Objects.equals(this.price, getContractsPublicRegionId200Ok.price) &&
        Objects.equals(this.reward, getContractsPublicRegionId200Ok.reward) &&
        Objects.equals(this.startLocationId, getContractsPublicRegionId200Ok.startLocationId) &&
        Objects.equals(this.title, getContractsPublicRegionId200Ok.title) &&
        Objects.equals(this.type, getContractsPublicRegionId200Ok.type) &&
        Objects.equals(this.volume, getContractsPublicRegionId200Ok.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buyout, collateral, contractId, dateExpired, dateIssued, daysToComplete, endLocationId, forCorporation, issuerCorporationId, issuerId, price, reward, startLocationId, title, type, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContractsPublicRegionId200Ok {\n");
    
    sb.append("    buyout: ").append(toIndentedString(buyout)).append("\n");
    sb.append("    collateral: ").append(toIndentedString(collateral)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    dateExpired: ").append(toIndentedString(dateExpired)).append("\n");
    sb.append("    dateIssued: ").append(toIndentedString(dateIssued)).append("\n");
    sb.append("    daysToComplete: ").append(toIndentedString(daysToComplete)).append("\n");
    sb.append("    endLocationId: ").append(toIndentedString(endLocationId)).append("\n");
    sb.append("    forCorporation: ").append(toIndentedString(forCorporation)).append("\n");
    sb.append("    issuerCorporationId: ").append(toIndentedString(issuerCorporationId)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    startLocationId: ").append(toIndentedString(startLocationId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

