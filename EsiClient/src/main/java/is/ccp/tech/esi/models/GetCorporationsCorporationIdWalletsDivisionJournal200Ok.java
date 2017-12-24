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
import is.ccp.tech.esi.models.GetCorporationsCorporationIdWalletsDivisionJournalExtraInfo;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class GetCorporationsCorporationIdWalletsDivisionJournal200Ok {
  @SerializedName("date")
  private DateTime date = null;

  @SerializedName("ref_id")
  private Long refId = null;

  /**
   * Transaction type, different type of transaction will populate different fields in `extra_info` Note: If you have an existing XML API application that is using ref_types, you will need to know which string ESI ref_type maps to which integer. You can use the following gist to see string->int mappings: https://gist.github.com/ccp-zoetrope/c03db66d90c2148724c06171bc52e0ec
   */
  public enum RefTypeEnum {
    @SerializedName("acceleration_gate_fee")
    ACCELERATION_GATE_FEE("acceleration_gate_fee"),
    
    @SerializedName("advertisement_listing_fee")
    ADVERTISEMENT_LISTING_FEE("advertisement_listing_fee"),
    
    @SerializedName("agent_donation")
    AGENT_DONATION("agent_donation"),
    
    @SerializedName("agent_location_services")
    AGENT_LOCATION_SERVICES("agent_location_services"),
    
    @SerializedName("agent_miscellaneous")
    AGENT_MISCELLANEOUS("agent_miscellaneous"),
    
    @SerializedName("agent_mission_collateral_paid")
    AGENT_MISSION_COLLATERAL_PAID("agent_mission_collateral_paid"),
    
    @SerializedName("agent_mission_collateral_refunded")
    AGENT_MISSION_COLLATERAL_REFUNDED("agent_mission_collateral_refunded"),
    
    @SerializedName("agent_mission_reward")
    AGENT_MISSION_REWARD("agent_mission_reward"),
    
    @SerializedName("agent_mission_reward_corporation_tax")
    AGENT_MISSION_REWARD_CORPORATION_TAX("agent_mission_reward_corporation_tax"),
    
    @SerializedName("agent_mission_time_bonus_reward")
    AGENT_MISSION_TIME_BONUS_REWARD("agent_mission_time_bonus_reward"),
    
    @SerializedName("agent_mission_time_bonus_reward_corporation_tax")
    AGENT_MISSION_TIME_BONUS_REWARD_CORPORATION_TAX("agent_mission_time_bonus_reward_corporation_tax"),
    
    @SerializedName("agent_security_services")
    AGENT_SECURITY_SERVICES("agent_security_services"),
    
    @SerializedName("agent_services_rendered")
    AGENT_SERVICES_RENDERED("agent_services_rendered"),
    
    @SerializedName("agents_preward")
    AGENTS_PREWARD("agents_preward"),
    
    @SerializedName("alliance_maintainance_fee")
    ALLIANCE_MAINTAINANCE_FEE("alliance_maintainance_fee"),
    
    @SerializedName("alliance_registration_fee")
    ALLIANCE_REGISTRATION_FEE("alliance_registration_fee"),
    
    @SerializedName("asset_safety_recovery_tax")
    ASSET_SAFETY_RECOVERY_TAX("asset_safety_recovery_tax"),
    
    @SerializedName("bounty")
    BOUNTY("bounty"),
    
    @SerializedName("bounty_prize")
    BOUNTY_PRIZE("bounty_prize"),
    
    @SerializedName("bounty_prize_corporation_tax")
    BOUNTY_PRIZE_CORPORATION_TAX("bounty_prize_corporation_tax"),
    
    @SerializedName("bounty_prizes")
    BOUNTY_PRIZES("bounty_prizes"),
    
    @SerializedName("bounty_reimbursement")
    BOUNTY_REIMBURSEMENT("bounty_reimbursement"),
    
    @SerializedName("bounty_surcharge")
    BOUNTY_SURCHARGE("bounty_surcharge"),
    
    @SerializedName("brokers_fee")
    BROKERS_FEE("brokers_fee"),
    
    @SerializedName("clone_activation")
    CLONE_ACTIVATION("clone_activation"),
    
    @SerializedName("clone_transfer")
    CLONE_TRANSFER("clone_transfer"),
    
    @SerializedName("contraband_fine")
    CONTRABAND_FINE("contraband_fine"),
    
    @SerializedName("contract_auction_bid")
    CONTRACT_AUCTION_BID("contract_auction_bid"),
    
    @SerializedName("contract_auction_bid_corp")
    CONTRACT_AUCTION_BID_CORP("contract_auction_bid_corp"),
    
    @SerializedName("contract_auction_bid_refund")
    CONTRACT_AUCTION_BID_REFUND("contract_auction_bid_refund"),
    
    @SerializedName("contract_auction_sold")
    CONTRACT_AUCTION_SOLD("contract_auction_sold"),
    
    @SerializedName("contract_brokers_fee")
    CONTRACT_BROKERS_FEE("contract_brokers_fee"),
    
    @SerializedName("contract_brokers_fee_corp")
    CONTRACT_BROKERS_FEE_CORP("contract_brokers_fee_corp"),
    
    @SerializedName("contract_collateral")
    CONTRACT_COLLATERAL("contract_collateral"),
    
    @SerializedName("contract_collateral_deposited_corp")
    CONTRACT_COLLATERAL_DEPOSITED_CORP("contract_collateral_deposited_corp"),
    
    @SerializedName("contract_collateral_payout")
    CONTRACT_COLLATERAL_PAYOUT("contract_collateral_payout"),
    
    @SerializedName("contract_collateral_refund")
    CONTRACT_COLLATERAL_REFUND("contract_collateral_refund"),
    
    @SerializedName("contract_deposit")
    CONTRACT_DEPOSIT("contract_deposit"),
    
    @SerializedName("contract_deposit_corp")
    CONTRACT_DEPOSIT_CORP("contract_deposit_corp"),
    
    @SerializedName("contract_deposit_refund")
    CONTRACT_DEPOSIT_REFUND("contract_deposit_refund"),
    
    @SerializedName("contract_deposit_sales_tax")
    CONTRACT_DEPOSIT_SALES_TAX("contract_deposit_sales_tax"),
    
    @SerializedName("contract_price")
    CONTRACT_PRICE("contract_price"),
    
    @SerializedName("contract_price_payment_corp")
    CONTRACT_PRICE_PAYMENT_CORP("contract_price_payment_corp"),
    
    @SerializedName("contract_reversal")
    CONTRACT_REVERSAL("contract_reversal"),
    
    @SerializedName("contract_reward")
    CONTRACT_REWARD("contract_reward"),
    
    @SerializedName("contract_reward_deposited")
    CONTRACT_REWARD_DEPOSITED("contract_reward_deposited"),
    
    @SerializedName("contract_reward_deposited_corp")
    CONTRACT_REWARD_DEPOSITED_CORP("contract_reward_deposited_corp"),
    
    @SerializedName("contract_reward_refund")
    CONTRACT_REWARD_REFUND("contract_reward_refund"),
    
    @SerializedName("contract_sales_tax")
    CONTRACT_SALES_TAX("contract_sales_tax"),
    
    @SerializedName("copying")
    COPYING("copying"),
    
    @SerializedName("corporate_reward_payout")
    CORPORATE_REWARD_PAYOUT("corporate_reward_payout"),
    
    @SerializedName("corporate_reward_tax")
    CORPORATE_REWARD_TAX("corporate_reward_tax"),
    
    @SerializedName("corporation_account_withdrawal")
    CORPORATION_ACCOUNT_WITHDRAWAL("corporation_account_withdrawal"),
    
    @SerializedName("corporation_bulk_payment")
    CORPORATION_BULK_PAYMENT("corporation_bulk_payment"),
    
    @SerializedName("corporation_dividend_payment")
    CORPORATION_DIVIDEND_PAYMENT("corporation_dividend_payment"),
    
    @SerializedName("corporation_liquidation")
    CORPORATION_LIQUIDATION("corporation_liquidation"),
    
    @SerializedName("corporation_logo_change_cost")
    CORPORATION_LOGO_CHANGE_COST("corporation_logo_change_cost"),
    
    @SerializedName("corporation_payment")
    CORPORATION_PAYMENT("corporation_payment"),
    
    @SerializedName("corporation_registration_fee")
    CORPORATION_REGISTRATION_FEE("corporation_registration_fee"),
    
    @SerializedName("courier_mission_escrow")
    COURIER_MISSION_ESCROW("courier_mission_escrow"),
    
    @SerializedName("cspa")
    CSPA("cspa"),
    
    @SerializedName("cspaofflinerefund")
    CSPAOFFLINEREFUND("cspaofflinerefund"),
    
    @SerializedName("datacore_fee")
    DATACORE_FEE("datacore_fee"),
    
    @SerializedName("dna_modification_fee")
    DNA_MODIFICATION_FEE("dna_modification_fee"),
    
    @SerializedName("docking_fee")
    DOCKING_FEE("docking_fee"),
    
    @SerializedName("duel_wager_escrow")
    DUEL_WAGER_ESCROW("duel_wager_escrow"),
    
    @SerializedName("duel_wager_payment")
    DUEL_WAGER_PAYMENT("duel_wager_payment"),
    
    @SerializedName("duel_wager_refund")
    DUEL_WAGER_REFUND("duel_wager_refund"),
    
    @SerializedName("factory_slot_rental_fee")
    FACTORY_SLOT_RENTAL_FEE("factory_slot_rental_fee"),
    
    @SerializedName("gm_cash_transfer")
    GM_CASH_TRANSFER("gm_cash_transfer"),
    
    @SerializedName("industry_job_tax")
    INDUSTRY_JOB_TAX("industry_job_tax"),
    
    @SerializedName("infrastructure_hub_maintenance")
    INFRASTRUCTURE_HUB_MAINTENANCE("infrastructure_hub_maintenance"),
    
    @SerializedName("inheritance")
    INHERITANCE("inheritance"),
    
    @SerializedName("insurance")
    INSURANCE("insurance"),
    
    @SerializedName("jump_clone_activation_fee")
    JUMP_CLONE_ACTIVATION_FEE("jump_clone_activation_fee"),
    
    @SerializedName("jump_clone_installation_fee")
    JUMP_CLONE_INSTALLATION_FEE("jump_clone_installation_fee"),
    
    @SerializedName("kill_right_fee")
    KILL_RIGHT_FEE("kill_right_fee"),
    
    @SerializedName("lp_store")
    LP_STORE("lp_store"),
    
    @SerializedName("manufacturing")
    MANUFACTURING("manufacturing"),
    
    @SerializedName("market_escrow")
    MARKET_ESCROW("market_escrow"),
    
    @SerializedName("market_fine_paid")
    MARKET_FINE_PAID("market_fine_paid"),
    
    @SerializedName("market_transaction")
    MARKET_TRANSACTION("market_transaction"),
    
    @SerializedName("medal_creation")
    MEDAL_CREATION("medal_creation"),
    
    @SerializedName("medal_issued")
    MEDAL_ISSUED("medal_issued"),
    
    @SerializedName("mission_completion")
    MISSION_COMPLETION("mission_completion"),
    
    @SerializedName("mission_cost")
    MISSION_COST("mission_cost"),
    
    @SerializedName("mission_expiration")
    MISSION_EXPIRATION("mission_expiration"),
    
    @SerializedName("mission_reward")
    MISSION_REWARD("mission_reward"),
    
    @SerializedName("office_rental_fee")
    OFFICE_RENTAL_FEE("office_rental_fee"),
    
    @SerializedName("operation_bonus")
    OPERATION_BONUS("operation_bonus"),
    
    @SerializedName("opportunity_reward")
    OPPORTUNITY_REWARD("opportunity_reward"),
    
    @SerializedName("planetary_construction")
    PLANETARY_CONSTRUCTION("planetary_construction"),
    
    @SerializedName("planetary_export_tax")
    PLANETARY_EXPORT_TAX("planetary_export_tax"),
    
    @SerializedName("planetary_import_tax")
    PLANETARY_IMPORT_TAX("planetary_import_tax"),
    
    @SerializedName("player_donation")
    PLAYER_DONATION("player_donation"),
    
    @SerializedName("player_trading")
    PLAYER_TRADING("player_trading"),
    
    @SerializedName("project_discovery_reward")
    PROJECT_DISCOVERY_REWARD("project_discovery_reward"),
    
    @SerializedName("project_discovery_tax")
    PROJECT_DISCOVERY_TAX("project_discovery_tax"),
    
    @SerializedName("reaction")
    REACTION("reaction"),
    
    @SerializedName("release_of_impounded_property")
    RELEASE_OF_IMPOUNDED_PROPERTY("release_of_impounded_property"),
    
    @SerializedName("repair_bill")
    REPAIR_BILL("repair_bill"),
    
    @SerializedName("reprocessing_tax")
    REPROCESSING_TAX("reprocessing_tax"),
    
    @SerializedName("researching_material_productivity")
    RESEARCHING_MATERIAL_PRODUCTIVITY("researching_material_productivity"),
    
    @SerializedName("researching_technology")
    RESEARCHING_TECHNOLOGY("researching_technology"),
    
    @SerializedName("researching_time_productivity")
    RESEARCHING_TIME_PRODUCTIVITY("researching_time_productivity"),
    
    @SerializedName("resource_wars_reward")
    RESOURCE_WARS_REWARD("resource_wars_reward"),
    
    @SerializedName("reverse_engineering")
    REVERSE_ENGINEERING("reverse_engineering"),
    
    @SerializedName("security_processing_fee")
    SECURITY_PROCESSING_FEE("security_processing_fee"),
    
    @SerializedName("shares")
    SHARES("shares"),
    
    @SerializedName("sovereignity_bill")
    SOVEREIGNITY_BILL("sovereignity_bill"),
    
    @SerializedName("store_purchase")
    STORE_PURCHASE("store_purchase"),
    
    @SerializedName("store_purchase_refund")
    STORE_PURCHASE_REFUND("store_purchase_refund"),
    
    @SerializedName("transaction_tax")
    TRANSACTION_TAX("transaction_tax"),
    
    @SerializedName("upkeep_adjustment_fee")
    UPKEEP_ADJUSTMENT_FEE("upkeep_adjustment_fee"),
    
    @SerializedName("war_ally_contract")
    WAR_ALLY_CONTRACT("war_ally_contract"),
    
    @SerializedName("war_fee")
    WAR_FEE("war_fee"),
    
    @SerializedName("war_fee_surrender")
    WAR_FEE_SURRENDER("war_fee_surrender");

    private String value;

    RefTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("ref_type")
  private RefTypeEnum refType = null;

  @SerializedName("first_party_id")
  private Integer firstPartyId = null;

  /**
   * first_party_type string
   */
  public enum FirstPartyTypeEnum {
    @SerializedName("character")
    CHARACTER("character"),
    
    @SerializedName("corporation")
    CORPORATION("corporation"),
    
    @SerializedName("alliance")
    ALLIANCE("alliance"),
    
    @SerializedName("faction")
    FACTION("faction"),
    
    @SerializedName("system")
    SYSTEM("system");

    private String value;

    FirstPartyTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("first_party_type")
  private FirstPartyTypeEnum firstPartyType = null;

  @SerializedName("second_party_id")
  private Integer secondPartyId = null;

  /**
   * second_party_type string
   */
  public enum SecondPartyTypeEnum {
    @SerializedName("character")
    CHARACTER("character"),
    
    @SerializedName("corporation")
    CORPORATION("corporation"),
    
    @SerializedName("alliance")
    ALLIANCE("alliance"),
    
    @SerializedName("faction")
    FACTION("faction"),
    
    @SerializedName("system")
    SYSTEM("system");

    private String value;

    SecondPartyTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("second_party_type")
  private SecondPartyTypeEnum secondPartyType = null;

  @SerializedName("amount")
  private Double amount = null;

  @SerializedName("balance")
  private Double balance = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("tax_receiver_id")
  private Integer taxReceiverId = null;

  @SerializedName("tax")
  private Double tax = null;

  @SerializedName("extra_info")
  private GetCorporationsCorporationIdWalletsDivisionJournalExtraInfo extraInfo = null;

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Date and time of transaction
   * @return date
  **/
  @ApiModelProperty(example = "null", required = true, value = "Date and time of transaction")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok refId(Long refId) {
    this.refId = refId;
    return this;
  }

   /**
   * Unique journal reference ID
   * @return refId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Unique journal reference ID")
  public Long getRefId() {
    return refId;
  }

  public void setRefId(Long refId) {
    this.refId = refId;
  }

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok refType(RefTypeEnum refType) {
    this.refType = refType;
    return this;
  }

   /**
   * Transaction type, different type of transaction will populate different fields in `extra_info` Note: If you have an existing XML API application that is using ref_types, you will need to know which string ESI ref_type maps to which integer. You can use the following gist to see string->int mappings: https://gist.github.com/ccp-zoetrope/c03db66d90c2148724c06171bc52e0ec
   * @return refType
  **/
  @ApiModelProperty(example = "null", required = true, value = "Transaction type, different type of transaction will populate different fields in `extra_info` Note: If you have an existing XML API application that is using ref_types, you will need to know which string ESI ref_type maps to which integer. You can use the following gist to see string->int mappings: https://gist.github.com/ccp-zoetrope/c03db66d90c2148724c06171bc52e0ec")
  public RefTypeEnum getRefType() {
    return refType;
  }

  public void setRefType(RefTypeEnum refType) {
    this.refType = refType;
  }

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok firstPartyId(Integer firstPartyId) {
    this.firstPartyId = firstPartyId;
    return this;
  }

   /**
   * first_party_id integer
   * @return firstPartyId
  **/
  @ApiModelProperty(example = "null", value = "first_party_id integer")
  public Integer getFirstPartyId() {
    return firstPartyId;
  }

  public void setFirstPartyId(Integer firstPartyId) {
    this.firstPartyId = firstPartyId;
  }

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok firstPartyType(FirstPartyTypeEnum firstPartyType) {
    this.firstPartyType = firstPartyType;
    return this;
  }

   /**
   * first_party_type string
   * @return firstPartyType
  **/
  @ApiModelProperty(example = "null", value = "first_party_type string")
  public FirstPartyTypeEnum getFirstPartyType() {
    return firstPartyType;
  }

  public void setFirstPartyType(FirstPartyTypeEnum firstPartyType) {
    this.firstPartyType = firstPartyType;
  }

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok secondPartyId(Integer secondPartyId) {
    this.secondPartyId = secondPartyId;
    return this;
  }

   /**
   * second_party_id integer
   * @return secondPartyId
  **/
  @ApiModelProperty(example = "null", value = "second_party_id integer")
  public Integer getSecondPartyId() {
    return secondPartyId;
  }

  public void setSecondPartyId(Integer secondPartyId) {
    this.secondPartyId = secondPartyId;
  }

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok secondPartyType(SecondPartyTypeEnum secondPartyType) {
    this.secondPartyType = secondPartyType;
    return this;
  }

   /**
   * second_party_type string
   * @return secondPartyType
  **/
  @ApiModelProperty(example = "null", value = "second_party_type string")
  public SecondPartyTypeEnum getSecondPartyType() {
    return secondPartyType;
  }

  public void setSecondPartyType(SecondPartyTypeEnum secondPartyType) {
    this.secondPartyType = secondPartyType;
  }

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Transaction amount. Positive when value transferred to the first party. Negative otherwise
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Transaction amount. Positive when value transferred to the first party. Negative otherwise")
  public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok balance(Double balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Wallet balance after transaction occurred
   * @return balance
  **/
  @ApiModelProperty(example = "null", value = "Wallet balance after transaction occurred")
  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * reason string
   * @return reason
  **/
  @ApiModelProperty(example = "null", value = "reason string")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok taxReceiverId(Integer taxReceiverId) {
    this.taxReceiverId = taxReceiverId;
    return this;
  }

   /**
   * the corporation ID receiving any tax paid
   * @return taxReceiverId
  **/
  @ApiModelProperty(example = "null", value = "the corporation ID receiving any tax paid")
  public Integer getTaxReceiverId() {
    return taxReceiverId;
  }

  public void setTaxReceiverId(Integer taxReceiverId) {
    this.taxReceiverId = taxReceiverId;
  }

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok tax(Double tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Tax amount received for tax related transactions
   * @return tax
  **/
  @ApiModelProperty(example = "null", value = "Tax amount received for tax related transactions")
  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public GetCorporationsCorporationIdWalletsDivisionJournal200Ok extraInfo(GetCorporationsCorporationIdWalletsDivisionJournalExtraInfo extraInfo) {
    this.extraInfo = extraInfo;
    return this;
  }

   /**
   * Get extraInfo
   * @return extraInfo
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetCorporationsCorporationIdWalletsDivisionJournalExtraInfo getExtraInfo() {
    return extraInfo;
  }

  public void setExtraInfo(GetCorporationsCorporationIdWalletsDivisionJournalExtraInfo extraInfo) {
    this.extraInfo = extraInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdWalletsDivisionJournal200Ok getCorporationsCorporationIdWalletsDivisionJournal200Ok = (GetCorporationsCorporationIdWalletsDivisionJournal200Ok) o;
    return Objects.equals(this.date, getCorporationsCorporationIdWalletsDivisionJournal200Ok.date) &&
        Objects.equals(this.refId, getCorporationsCorporationIdWalletsDivisionJournal200Ok.refId) &&
        Objects.equals(this.refType, getCorporationsCorporationIdWalletsDivisionJournal200Ok.refType) &&
        Objects.equals(this.firstPartyId, getCorporationsCorporationIdWalletsDivisionJournal200Ok.firstPartyId) &&
        Objects.equals(this.firstPartyType, getCorporationsCorporationIdWalletsDivisionJournal200Ok.firstPartyType) &&
        Objects.equals(this.secondPartyId, getCorporationsCorporationIdWalletsDivisionJournal200Ok.secondPartyId) &&
        Objects.equals(this.secondPartyType, getCorporationsCorporationIdWalletsDivisionJournal200Ok.secondPartyType) &&
        Objects.equals(this.amount, getCorporationsCorporationIdWalletsDivisionJournal200Ok.amount) &&
        Objects.equals(this.balance, getCorporationsCorporationIdWalletsDivisionJournal200Ok.balance) &&
        Objects.equals(this.reason, getCorporationsCorporationIdWalletsDivisionJournal200Ok.reason) &&
        Objects.equals(this.taxReceiverId, getCorporationsCorporationIdWalletsDivisionJournal200Ok.taxReceiverId) &&
        Objects.equals(this.tax, getCorporationsCorporationIdWalletsDivisionJournal200Ok.tax) &&
        Objects.equals(this.extraInfo, getCorporationsCorporationIdWalletsDivisionJournal200Ok.extraInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, refId, refType, firstPartyId, firstPartyType, secondPartyId, secondPartyType, amount, balance, reason, taxReceiverId, tax, extraInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdWalletsDivisionJournal200Ok {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    refId: ").append(toIndentedString(refId)).append("\n");
    sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
    sb.append("    firstPartyId: ").append(toIndentedString(firstPartyId)).append("\n");
    sb.append("    firstPartyType: ").append(toIndentedString(firstPartyType)).append("\n");
    sb.append("    secondPartyId: ").append(toIndentedString(secondPartyId)).append("\n");
    sb.append("    secondPartyType: ").append(toIndentedString(secondPartyType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    taxReceiverId: ").append(toIndentedString(taxReceiverId)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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

