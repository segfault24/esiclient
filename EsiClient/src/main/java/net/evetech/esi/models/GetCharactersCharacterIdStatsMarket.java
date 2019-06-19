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
 * market object
 */
@ApiModel(description = "market object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-18T22:16:15.536-04:00")
public class GetCharactersCharacterIdStatsMarket {
  @SerializedName("accept_contracts_courier")
  private Long acceptContractsCourier = null;

  @SerializedName("accept_contracts_item_exchange")
  private Long acceptContractsItemExchange = null;

  @SerializedName("buy_orders_placed")
  private Long buyOrdersPlaced = null;

  @SerializedName("cancel_market_order")
  private Long cancelMarketOrder = null;

  @SerializedName("create_contracts_auction")
  private Long createContractsAuction = null;

  @SerializedName("create_contracts_courier")
  private Long createContractsCourier = null;

  @SerializedName("create_contracts_item_exchange")
  private Long createContractsItemExchange = null;

  @SerializedName("deliver_courier_contract")
  private Long deliverCourierContract = null;

  @SerializedName("isk_gained")
  private Long iskGained = null;

  @SerializedName("isk_spent")
  private Long iskSpent = null;

  @SerializedName("modify_market_order")
  private Long modifyMarketOrder = null;

  @SerializedName("search_contracts")
  private Long searchContracts = null;

  @SerializedName("sell_orders_placed")
  private Long sellOrdersPlaced = null;

  public GetCharactersCharacterIdStatsMarket acceptContractsCourier(Long acceptContractsCourier) {
    this.acceptContractsCourier = acceptContractsCourier;
    return this;
  }

   /**
   * accept_contracts_courier integer
   * @return acceptContractsCourier
  **/
  @ApiModelProperty(example = "null", value = "accept_contracts_courier integer")
  public Long getAcceptContractsCourier() {
    return acceptContractsCourier;
  }

  public void setAcceptContractsCourier(Long acceptContractsCourier) {
    this.acceptContractsCourier = acceptContractsCourier;
  }

  public GetCharactersCharacterIdStatsMarket acceptContractsItemExchange(Long acceptContractsItemExchange) {
    this.acceptContractsItemExchange = acceptContractsItemExchange;
    return this;
  }

   /**
   * accept_contracts_item_exchange integer
   * @return acceptContractsItemExchange
  **/
  @ApiModelProperty(example = "null", value = "accept_contracts_item_exchange integer")
  public Long getAcceptContractsItemExchange() {
    return acceptContractsItemExchange;
  }

  public void setAcceptContractsItemExchange(Long acceptContractsItemExchange) {
    this.acceptContractsItemExchange = acceptContractsItemExchange;
  }

  public GetCharactersCharacterIdStatsMarket buyOrdersPlaced(Long buyOrdersPlaced) {
    this.buyOrdersPlaced = buyOrdersPlaced;
    return this;
  }

   /**
   * buy_orders_placed integer
   * @return buyOrdersPlaced
  **/
  @ApiModelProperty(example = "null", value = "buy_orders_placed integer")
  public Long getBuyOrdersPlaced() {
    return buyOrdersPlaced;
  }

  public void setBuyOrdersPlaced(Long buyOrdersPlaced) {
    this.buyOrdersPlaced = buyOrdersPlaced;
  }

  public GetCharactersCharacterIdStatsMarket cancelMarketOrder(Long cancelMarketOrder) {
    this.cancelMarketOrder = cancelMarketOrder;
    return this;
  }

   /**
   * cancel_market_order integer
   * @return cancelMarketOrder
  **/
  @ApiModelProperty(example = "null", value = "cancel_market_order integer")
  public Long getCancelMarketOrder() {
    return cancelMarketOrder;
  }

  public void setCancelMarketOrder(Long cancelMarketOrder) {
    this.cancelMarketOrder = cancelMarketOrder;
  }

  public GetCharactersCharacterIdStatsMarket createContractsAuction(Long createContractsAuction) {
    this.createContractsAuction = createContractsAuction;
    return this;
  }

   /**
   * create_contracts_auction integer
   * @return createContractsAuction
  **/
  @ApiModelProperty(example = "null", value = "create_contracts_auction integer")
  public Long getCreateContractsAuction() {
    return createContractsAuction;
  }

  public void setCreateContractsAuction(Long createContractsAuction) {
    this.createContractsAuction = createContractsAuction;
  }

  public GetCharactersCharacterIdStatsMarket createContractsCourier(Long createContractsCourier) {
    this.createContractsCourier = createContractsCourier;
    return this;
  }

   /**
   * create_contracts_courier integer
   * @return createContractsCourier
  **/
  @ApiModelProperty(example = "null", value = "create_contracts_courier integer")
  public Long getCreateContractsCourier() {
    return createContractsCourier;
  }

  public void setCreateContractsCourier(Long createContractsCourier) {
    this.createContractsCourier = createContractsCourier;
  }

  public GetCharactersCharacterIdStatsMarket createContractsItemExchange(Long createContractsItemExchange) {
    this.createContractsItemExchange = createContractsItemExchange;
    return this;
  }

   /**
   * create_contracts_item_exchange integer
   * @return createContractsItemExchange
  **/
  @ApiModelProperty(example = "null", value = "create_contracts_item_exchange integer")
  public Long getCreateContractsItemExchange() {
    return createContractsItemExchange;
  }

  public void setCreateContractsItemExchange(Long createContractsItemExchange) {
    this.createContractsItemExchange = createContractsItemExchange;
  }

  public GetCharactersCharacterIdStatsMarket deliverCourierContract(Long deliverCourierContract) {
    this.deliverCourierContract = deliverCourierContract;
    return this;
  }

   /**
   * deliver_courier_contract integer
   * @return deliverCourierContract
  **/
  @ApiModelProperty(example = "null", value = "deliver_courier_contract integer")
  public Long getDeliverCourierContract() {
    return deliverCourierContract;
  }

  public void setDeliverCourierContract(Long deliverCourierContract) {
    this.deliverCourierContract = deliverCourierContract;
  }

  public GetCharactersCharacterIdStatsMarket iskGained(Long iskGained) {
    this.iskGained = iskGained;
    return this;
  }

   /**
   * isk_gained integer
   * @return iskGained
  **/
  @ApiModelProperty(example = "null", value = "isk_gained integer")
  public Long getIskGained() {
    return iskGained;
  }

  public void setIskGained(Long iskGained) {
    this.iskGained = iskGained;
  }

  public GetCharactersCharacterIdStatsMarket iskSpent(Long iskSpent) {
    this.iskSpent = iskSpent;
    return this;
  }

   /**
   * isk_spent integer
   * @return iskSpent
  **/
  @ApiModelProperty(example = "null", value = "isk_spent integer")
  public Long getIskSpent() {
    return iskSpent;
  }

  public void setIskSpent(Long iskSpent) {
    this.iskSpent = iskSpent;
  }

  public GetCharactersCharacterIdStatsMarket modifyMarketOrder(Long modifyMarketOrder) {
    this.modifyMarketOrder = modifyMarketOrder;
    return this;
  }

   /**
   * modify_market_order integer
   * @return modifyMarketOrder
  **/
  @ApiModelProperty(example = "null", value = "modify_market_order integer")
  public Long getModifyMarketOrder() {
    return modifyMarketOrder;
  }

  public void setModifyMarketOrder(Long modifyMarketOrder) {
    this.modifyMarketOrder = modifyMarketOrder;
  }

  public GetCharactersCharacterIdStatsMarket searchContracts(Long searchContracts) {
    this.searchContracts = searchContracts;
    return this;
  }

   /**
   * search_contracts integer
   * @return searchContracts
  **/
  @ApiModelProperty(example = "null", value = "search_contracts integer")
  public Long getSearchContracts() {
    return searchContracts;
  }

  public void setSearchContracts(Long searchContracts) {
    this.searchContracts = searchContracts;
  }

  public GetCharactersCharacterIdStatsMarket sellOrdersPlaced(Long sellOrdersPlaced) {
    this.sellOrdersPlaced = sellOrdersPlaced;
    return this;
  }

   /**
   * sell_orders_placed integer
   * @return sellOrdersPlaced
  **/
  @ApiModelProperty(example = "null", value = "sell_orders_placed integer")
  public Long getSellOrdersPlaced() {
    return sellOrdersPlaced;
  }

  public void setSellOrdersPlaced(Long sellOrdersPlaced) {
    this.sellOrdersPlaced = sellOrdersPlaced;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdStatsMarket getCharactersCharacterIdStatsMarket = (GetCharactersCharacterIdStatsMarket) o;
    return Objects.equals(this.acceptContractsCourier, getCharactersCharacterIdStatsMarket.acceptContractsCourier) &&
        Objects.equals(this.acceptContractsItemExchange, getCharactersCharacterIdStatsMarket.acceptContractsItemExchange) &&
        Objects.equals(this.buyOrdersPlaced, getCharactersCharacterIdStatsMarket.buyOrdersPlaced) &&
        Objects.equals(this.cancelMarketOrder, getCharactersCharacterIdStatsMarket.cancelMarketOrder) &&
        Objects.equals(this.createContractsAuction, getCharactersCharacterIdStatsMarket.createContractsAuction) &&
        Objects.equals(this.createContractsCourier, getCharactersCharacterIdStatsMarket.createContractsCourier) &&
        Objects.equals(this.createContractsItemExchange, getCharactersCharacterIdStatsMarket.createContractsItemExchange) &&
        Objects.equals(this.deliverCourierContract, getCharactersCharacterIdStatsMarket.deliverCourierContract) &&
        Objects.equals(this.iskGained, getCharactersCharacterIdStatsMarket.iskGained) &&
        Objects.equals(this.iskSpent, getCharactersCharacterIdStatsMarket.iskSpent) &&
        Objects.equals(this.modifyMarketOrder, getCharactersCharacterIdStatsMarket.modifyMarketOrder) &&
        Objects.equals(this.searchContracts, getCharactersCharacterIdStatsMarket.searchContracts) &&
        Objects.equals(this.sellOrdersPlaced, getCharactersCharacterIdStatsMarket.sellOrdersPlaced);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptContractsCourier, acceptContractsItemExchange, buyOrdersPlaced, cancelMarketOrder, createContractsAuction, createContractsCourier, createContractsItemExchange, deliverCourierContract, iskGained, iskSpent, modifyMarketOrder, searchContracts, sellOrdersPlaced);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdStatsMarket {\n");
    
    sb.append("    acceptContractsCourier: ").append(toIndentedString(acceptContractsCourier)).append("\n");
    sb.append("    acceptContractsItemExchange: ").append(toIndentedString(acceptContractsItemExchange)).append("\n");
    sb.append("    buyOrdersPlaced: ").append(toIndentedString(buyOrdersPlaced)).append("\n");
    sb.append("    cancelMarketOrder: ").append(toIndentedString(cancelMarketOrder)).append("\n");
    sb.append("    createContractsAuction: ").append(toIndentedString(createContractsAuction)).append("\n");
    sb.append("    createContractsCourier: ").append(toIndentedString(createContractsCourier)).append("\n");
    sb.append("    createContractsItemExchange: ").append(toIndentedString(createContractsItemExchange)).append("\n");
    sb.append("    deliverCourierContract: ").append(toIndentedString(deliverCourierContract)).append("\n");
    sb.append("    iskGained: ").append(toIndentedString(iskGained)).append("\n");
    sb.append("    iskSpent: ").append(toIndentedString(iskSpent)).append("\n");
    sb.append("    modifyMarketOrder: ").append(toIndentedString(modifyMarketOrder)).append("\n");
    sb.append("    searchContracts: ").append(toIndentedString(searchContracts)).append("\n");
    sb.append("    sellOrdersPlaced: ").append(toIndentedString(sellOrdersPlaced)).append("\n");
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

