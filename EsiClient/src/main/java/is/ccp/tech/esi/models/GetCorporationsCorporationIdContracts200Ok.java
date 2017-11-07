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
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-07T00:36:23.258-05:00")
public class GetCorporationsCorporationIdContracts200Ok {
  @SerializedName("contract_id")
  private Integer contractId = null;

  @SerializedName("issuer_id")
  private Integer issuerId = null;

  @SerializedName("issuer_corporation_id")
  private Integer issuerCorporationId = null;

  @SerializedName("assignee_id")
  private Integer assigneeId = null;

  @SerializedName("acceptor_id")
  private Integer acceptorId = null;

  @SerializedName("start_location_id")
  private Long startLocationId = null;

  @SerializedName("end_location_id")
  private Long endLocationId = null;

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

  /**
   * Status of the the contract
   */
  public enum StatusEnum {
    @SerializedName("outstanding")
    OUTSTANDING("outstanding"),
    
    @SerializedName("in_progress")
    IN_PROGRESS("in_progress"),
    
    @SerializedName("finished_issuer")
    FINISHED_ISSUER("finished_issuer"),
    
    @SerializedName("finished_contractor")
    FINISHED_CONTRACTOR("finished_contractor"),
    
    @SerializedName("finished")
    FINISHED("finished"),
    
    @SerializedName("cancelled")
    CANCELLED("cancelled"),
    
    @SerializedName("rejected")
    REJECTED("rejected"),
    
    @SerializedName("failed")
    FAILED("failed"),
    
    @SerializedName("deleted")
    DELETED("deleted"),
    
    @SerializedName("reversed")
    REVERSED("reversed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("for_corporation")
  private Boolean forCorporation = null;

  /**
   * To whom the contract is available
   */
  public enum AvailabilityEnum {
    @SerializedName("public")
    PUBLIC("public"),
    
    @SerializedName("personal")
    PERSONAL("personal"),
    
    @SerializedName("corporation")
    CORPORATION("corporation"),
    
    @SerializedName("alliance")
    ALLIANCE("alliance");

    private String value;

    AvailabilityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("availability")
  private AvailabilityEnum availability = null;

  @SerializedName("date_issued")
  private DateTime dateIssued = null;

  @SerializedName("date_expired")
  private DateTime dateExpired = null;

  @SerializedName("date_accepted")
  private DateTime dateAccepted = null;

  @SerializedName("days_to_complete")
  private Integer daysToComplete = null;

  @SerializedName("date_completed")
  private DateTime dateCompleted = null;

  @SerializedName("price")
  private Float price = null;

  @SerializedName("reward")
  private Float reward = null;

  @SerializedName("collateral")
  private Float collateral = null;

  @SerializedName("buyout")
  private Float buyout = null;

  @SerializedName("volume")
  private Float volume = null;

  public GetCorporationsCorporationIdContracts200Ok contractId(Integer contractId) {
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

  public GetCorporationsCorporationIdContracts200Ok issuerId(Integer issuerId) {
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

  public GetCorporationsCorporationIdContracts200Ok issuerCorporationId(Integer issuerCorporationId) {
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

  public GetCorporationsCorporationIdContracts200Ok assigneeId(Integer assigneeId) {
    this.assigneeId = assigneeId;
    return this;
  }

   /**
   * ID to whom the contract is assigned, can be corporation or character ID
   * @return assigneeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID to whom the contract is assigned, can be corporation or character ID")
  public Integer getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(Integer assigneeId) {
    this.assigneeId = assigneeId;
  }

  public GetCorporationsCorporationIdContracts200Ok acceptorId(Integer acceptorId) {
    this.acceptorId = acceptorId;
    return this;
  }

   /**
   * Who will accept the contract
   * @return acceptorId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Who will accept the contract")
  public Integer getAcceptorId() {
    return acceptorId;
  }

  public void setAcceptorId(Integer acceptorId) {
    this.acceptorId = acceptorId;
  }

  public GetCorporationsCorporationIdContracts200Ok startLocationId(Long startLocationId) {
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

  public GetCorporationsCorporationIdContracts200Ok endLocationId(Long endLocationId) {
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

  public GetCorporationsCorporationIdContracts200Ok type(TypeEnum type) {
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

  public GetCorporationsCorporationIdContracts200Ok status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the the contract
   * @return status
  **/
  @ApiModelProperty(example = "null", required = true, value = "Status of the the contract")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public GetCorporationsCorporationIdContracts200Ok title(String title) {
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

  public GetCorporationsCorporationIdContracts200Ok forCorporation(Boolean forCorporation) {
    this.forCorporation = forCorporation;
    return this;
  }

   /**
   * true if the contract was issued on behalf of the issuer's corporation
   * @return forCorporation
  **/
  @ApiModelProperty(example = "null", required = true, value = "true if the contract was issued on behalf of the issuer's corporation")
  public Boolean getForCorporation() {
    return forCorporation;
  }

  public void setForCorporation(Boolean forCorporation) {
    this.forCorporation = forCorporation;
  }

  public GetCorporationsCorporationIdContracts200Ok availability(AvailabilityEnum availability) {
    this.availability = availability;
    return this;
  }

   /**
   * To whom the contract is available
   * @return availability
  **/
  @ApiModelProperty(example = "null", required = true, value = "To whom the contract is available")
  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }

  public GetCorporationsCorporationIdContracts200Ok dateIssued(DateTime dateIssued) {
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

  public GetCorporationsCorporationIdContracts200Ok dateExpired(DateTime dateExpired) {
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

  public GetCorporationsCorporationIdContracts200Ok dateAccepted(DateTime dateAccepted) {
    this.dateAccepted = dateAccepted;
    return this;
  }

   /**
   * Date of confirmation of contract
   * @return dateAccepted
  **/
  @ApiModelProperty(example = "null", value = "Date of confirmation of contract")
  public DateTime getDateAccepted() {
    return dateAccepted;
  }

  public void setDateAccepted(DateTime dateAccepted) {
    this.dateAccepted = dateAccepted;
  }

  public GetCorporationsCorporationIdContracts200Ok daysToComplete(Integer daysToComplete) {
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

  public GetCorporationsCorporationIdContracts200Ok dateCompleted(DateTime dateCompleted) {
    this.dateCompleted = dateCompleted;
    return this;
  }

   /**
   * Date of completed of contract
   * @return dateCompleted
  **/
  @ApiModelProperty(example = "null", value = "Date of completed of contract")
  public DateTime getDateCompleted() {
    return dateCompleted;
  }

  public void setDateCompleted(DateTime dateCompleted) {
    this.dateCompleted = dateCompleted;
  }

  public GetCorporationsCorporationIdContracts200Ok price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Price of contract (for ItemsExchange and Auctions)
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "Price of contract (for ItemsExchange and Auctions)")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public GetCorporationsCorporationIdContracts200Ok reward(Float reward) {
    this.reward = reward;
    return this;
  }

   /**
   * Remuneration for contract (for Couriers only)
   * @return reward
  **/
  @ApiModelProperty(example = "null", value = "Remuneration for contract (for Couriers only)")
  public Float getReward() {
    return reward;
  }

  public void setReward(Float reward) {
    this.reward = reward;
  }

  public GetCorporationsCorporationIdContracts200Ok collateral(Float collateral) {
    this.collateral = collateral;
    return this;
  }

   /**
   * Collateral price (for Couriers only)
   * @return collateral
  **/
  @ApiModelProperty(example = "null", value = "Collateral price (for Couriers only)")
  public Float getCollateral() {
    return collateral;
  }

  public void setCollateral(Float collateral) {
    this.collateral = collateral;
  }

  public GetCorporationsCorporationIdContracts200Ok buyout(Float buyout) {
    this.buyout = buyout;
    return this;
  }

   /**
   * Buyout price (for Auctions only)
   * @return buyout
  **/
  @ApiModelProperty(example = "null", value = "Buyout price (for Auctions only)")
  public Float getBuyout() {
    return buyout;
  }

  public void setBuyout(Float buyout) {
    this.buyout = buyout;
  }

  public GetCorporationsCorporationIdContracts200Ok volume(Float volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Volume of items in the contract
   * @return volume
  **/
  @ApiModelProperty(example = "null", value = "Volume of items in the contract")
  public Float getVolume() {
    return volume;
  }

  public void setVolume(Float volume) {
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
    GetCorporationsCorporationIdContracts200Ok getCorporationsCorporationIdContracts200Ok = (GetCorporationsCorporationIdContracts200Ok) o;
    return Objects.equals(this.contractId, getCorporationsCorporationIdContracts200Ok.contractId) &&
        Objects.equals(this.issuerId, getCorporationsCorporationIdContracts200Ok.issuerId) &&
        Objects.equals(this.issuerCorporationId, getCorporationsCorporationIdContracts200Ok.issuerCorporationId) &&
        Objects.equals(this.assigneeId, getCorporationsCorporationIdContracts200Ok.assigneeId) &&
        Objects.equals(this.acceptorId, getCorporationsCorporationIdContracts200Ok.acceptorId) &&
        Objects.equals(this.startLocationId, getCorporationsCorporationIdContracts200Ok.startLocationId) &&
        Objects.equals(this.endLocationId, getCorporationsCorporationIdContracts200Ok.endLocationId) &&
        Objects.equals(this.type, getCorporationsCorporationIdContracts200Ok.type) &&
        Objects.equals(this.status, getCorporationsCorporationIdContracts200Ok.status) &&
        Objects.equals(this.title, getCorporationsCorporationIdContracts200Ok.title) &&
        Objects.equals(this.forCorporation, getCorporationsCorporationIdContracts200Ok.forCorporation) &&
        Objects.equals(this.availability, getCorporationsCorporationIdContracts200Ok.availability) &&
        Objects.equals(this.dateIssued, getCorporationsCorporationIdContracts200Ok.dateIssued) &&
        Objects.equals(this.dateExpired, getCorporationsCorporationIdContracts200Ok.dateExpired) &&
        Objects.equals(this.dateAccepted, getCorporationsCorporationIdContracts200Ok.dateAccepted) &&
        Objects.equals(this.daysToComplete, getCorporationsCorporationIdContracts200Ok.daysToComplete) &&
        Objects.equals(this.dateCompleted, getCorporationsCorporationIdContracts200Ok.dateCompleted) &&
        Objects.equals(this.price, getCorporationsCorporationIdContracts200Ok.price) &&
        Objects.equals(this.reward, getCorporationsCorporationIdContracts200Ok.reward) &&
        Objects.equals(this.collateral, getCorporationsCorporationIdContracts200Ok.collateral) &&
        Objects.equals(this.buyout, getCorporationsCorporationIdContracts200Ok.buyout) &&
        Objects.equals(this.volume, getCorporationsCorporationIdContracts200Ok.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, issuerId, issuerCorporationId, assigneeId, acceptorId, startLocationId, endLocationId, type, status, title, forCorporation, availability, dateIssued, dateExpired, dateAccepted, daysToComplete, dateCompleted, price, reward, collateral, buyout, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdContracts200Ok {\n");
    
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    issuerCorporationId: ").append(toIndentedString(issuerCorporationId)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
    sb.append("    acceptorId: ").append(toIndentedString(acceptorId)).append("\n");
    sb.append("    startLocationId: ").append(toIndentedString(startLocationId)).append("\n");
    sb.append("    endLocationId: ").append(toIndentedString(endLocationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    forCorporation: ").append(toIndentedString(forCorporation)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    dateIssued: ").append(toIndentedString(dateIssued)).append("\n");
    sb.append("    dateExpired: ").append(toIndentedString(dateExpired)).append("\n");
    sb.append("    dateAccepted: ").append(toIndentedString(dateAccepted)).append("\n");
    sb.append("    daysToComplete: ").append(toIndentedString(daysToComplete)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    reward: ").append(toIndentedString(reward)).append("\n");
    sb.append("    collateral: ").append(toIndentedString(collateral)).append("\n");
    sb.append("    buyout: ").append(toIndentedString(buyout)).append("\n");
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

