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
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-30T13:35:06.976-04:00")
public class GetCharactersCharacterIdOrdersHistory200Ok {
  @SerializedName("duration")
  private Integer duration = null;

  @SerializedName("escrow")
  private Double escrow = null;

  @SerializedName("is_buy_order")
  private Boolean isBuyOrder = null;

  @SerializedName("is_corporation")
  private Boolean isCorporation = null;

  @SerializedName("issued")
  private DateTime issued = null;

  @SerializedName("location_id")
  private Long locationId = null;

  @SerializedName("min_volume")
  private Integer minVolume = null;

  @SerializedName("order_id")
  private Long orderId = null;

  @SerializedName("price")
  private Double price = null;

  /**
   * Valid order range, numbers are ranges in jumps
   */
  public enum RangeEnum {
    @SerializedName("1")
    _1("1"),
    
    @SerializedName("10")
    _10("10"),
    
    @SerializedName("2")
    _2("2"),
    
    @SerializedName("20")
    _20("20"),
    
    @SerializedName("3")
    _3("3"),
    
    @SerializedName("30")
    _30("30"),
    
    @SerializedName("4")
    _4("4"),
    
    @SerializedName("40")
    _40("40"),
    
    @SerializedName("5")
    _5("5"),
    
    @SerializedName("region")
    REGION("region"),
    
    @SerializedName("solarsystem")
    SOLARSYSTEM("solarsystem"),
    
    @SerializedName("station")
    STATION("station");

    private String value;

    RangeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("range")
  private RangeEnum range = null;

  @SerializedName("region_id")
  private Integer regionId = null;

  /**
   * Current order state
   */
  public enum StateEnum {
    @SerializedName("cancelled")
    CANCELLED("cancelled"),
    
    @SerializedName("expired")
    EXPIRED("expired");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  @SerializedName("volume_remain")
  private Integer volumeRemain = null;

  @SerializedName("volume_total")
  private Integer volumeTotal = null;

  public GetCharactersCharacterIdOrdersHistory200Ok duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Number of days the order was valid for (starting from the issued date). An order expires at time issued + duration
   * @return duration
  **/
  @ApiModelProperty(example = "null", required = true, value = "Number of days the order was valid for (starting from the issued date). An order expires at time issued + duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok escrow(Double escrow) {
    this.escrow = escrow;
    return this;
  }

   /**
   * For buy orders, the amount of ISK in escrow
   * @return escrow
  **/
  @ApiModelProperty(example = "null", value = "For buy orders, the amount of ISK in escrow")
  public Double getEscrow() {
    return escrow;
  }

  public void setEscrow(Double escrow) {
    this.escrow = escrow;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok isBuyOrder(Boolean isBuyOrder) {
    this.isBuyOrder = isBuyOrder;
    return this;
  }

   /**
   * True if the order is a bid (buy) order
   * @return isBuyOrder
  **/
  @ApiModelProperty(example = "null", value = "True if the order is a bid (buy) order")
  public Boolean getIsBuyOrder() {
    return isBuyOrder;
  }

  public void setIsBuyOrder(Boolean isBuyOrder) {
    this.isBuyOrder = isBuyOrder;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok isCorporation(Boolean isCorporation) {
    this.isCorporation = isCorporation;
    return this;
  }

   /**
   * Signifies whether the buy/sell order was placed on behalf of a corporation.
   * @return isCorporation
  **/
  @ApiModelProperty(example = "null", required = true, value = "Signifies whether the buy/sell order was placed on behalf of a corporation.")
  public Boolean getIsCorporation() {
    return isCorporation;
  }

  public void setIsCorporation(Boolean isCorporation) {
    this.isCorporation = isCorporation;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok issued(DateTime issued) {
    this.issued = issued;
    return this;
  }

   /**
   * Date and time when this order was issued
   * @return issued
  **/
  @ApiModelProperty(example = "null", required = true, value = "Date and time when this order was issued")
  public DateTime getIssued() {
    return issued;
  }

  public void setIssued(DateTime issued) {
    this.issued = issued;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * ID of the location where order was placed
   * @return locationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID of the location where order was placed")
  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok minVolume(Integer minVolume) {
    this.minVolume = minVolume;
    return this;
  }

   /**
   * For buy orders, the minimum quantity that will be accepted in a matching sell order
   * @return minVolume
  **/
  @ApiModelProperty(example = "null", value = "For buy orders, the minimum quantity that will be accepted in a matching sell order")
  public Integer getMinVolume() {
    return minVolume;
  }

  public void setMinVolume(Integer minVolume) {
    this.minVolume = minVolume;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Unique order ID
   * @return orderId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Unique order ID")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Cost per unit for this order
   * @return price
  **/
  @ApiModelProperty(example = "null", required = true, value = "Cost per unit for this order")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok range(RangeEnum range) {
    this.range = range;
    return this;
  }

   /**
   * Valid order range, numbers are ranges in jumps
   * @return range
  **/
  @ApiModelProperty(example = "null", required = true, value = "Valid order range, numbers are ranges in jumps")
  public RangeEnum getRange() {
    return range;
  }

  public void setRange(RangeEnum range) {
    this.range = range;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok regionId(Integer regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * ID of the region where order was placed
   * @return regionId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID of the region where order was placed")
  public Integer getRegionId() {
    return regionId;
  }

  public void setRegionId(Integer regionId) {
    this.regionId = regionId;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Current order state
   * @return state
  **/
  @ApiModelProperty(example = "null", required = true, value = "Current order state")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * The type ID of the item transacted in this order
   * @return typeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type ID of the item transacted in this order")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok volumeRemain(Integer volumeRemain) {
    this.volumeRemain = volumeRemain;
    return this;
  }

   /**
   * Quantity of items still required or offered
   * @return volumeRemain
  **/
  @ApiModelProperty(example = "null", required = true, value = "Quantity of items still required or offered")
  public Integer getVolumeRemain() {
    return volumeRemain;
  }

  public void setVolumeRemain(Integer volumeRemain) {
    this.volumeRemain = volumeRemain;
  }

  public GetCharactersCharacterIdOrdersHistory200Ok volumeTotal(Integer volumeTotal) {
    this.volumeTotal = volumeTotal;
    return this;
  }

   /**
   * Quantity of items required or offered at time order was placed
   * @return volumeTotal
  **/
  @ApiModelProperty(example = "null", required = true, value = "Quantity of items required or offered at time order was placed")
  public Integer getVolumeTotal() {
    return volumeTotal;
  }

  public void setVolumeTotal(Integer volumeTotal) {
    this.volumeTotal = volumeTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdOrdersHistory200Ok getCharactersCharacterIdOrdersHistory200Ok = (GetCharactersCharacterIdOrdersHistory200Ok) o;
    return Objects.equals(this.duration, getCharactersCharacterIdOrdersHistory200Ok.duration) &&
        Objects.equals(this.escrow, getCharactersCharacterIdOrdersHistory200Ok.escrow) &&
        Objects.equals(this.isBuyOrder, getCharactersCharacterIdOrdersHistory200Ok.isBuyOrder) &&
        Objects.equals(this.isCorporation, getCharactersCharacterIdOrdersHistory200Ok.isCorporation) &&
        Objects.equals(this.issued, getCharactersCharacterIdOrdersHistory200Ok.issued) &&
        Objects.equals(this.locationId, getCharactersCharacterIdOrdersHistory200Ok.locationId) &&
        Objects.equals(this.minVolume, getCharactersCharacterIdOrdersHistory200Ok.minVolume) &&
        Objects.equals(this.orderId, getCharactersCharacterIdOrdersHistory200Ok.orderId) &&
        Objects.equals(this.price, getCharactersCharacterIdOrdersHistory200Ok.price) &&
        Objects.equals(this.range, getCharactersCharacterIdOrdersHistory200Ok.range) &&
        Objects.equals(this.regionId, getCharactersCharacterIdOrdersHistory200Ok.regionId) &&
        Objects.equals(this.state, getCharactersCharacterIdOrdersHistory200Ok.state) &&
        Objects.equals(this.typeId, getCharactersCharacterIdOrdersHistory200Ok.typeId) &&
        Objects.equals(this.volumeRemain, getCharactersCharacterIdOrdersHistory200Ok.volumeRemain) &&
        Objects.equals(this.volumeTotal, getCharactersCharacterIdOrdersHistory200Ok.volumeTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, escrow, isBuyOrder, isCorporation, issued, locationId, minVolume, orderId, price, range, regionId, state, typeId, volumeRemain, volumeTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdOrdersHistory200Ok {\n");
    
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    escrow: ").append(toIndentedString(escrow)).append("\n");
    sb.append("    isBuyOrder: ").append(toIndentedString(isBuyOrder)).append("\n");
    sb.append("    isCorporation: ").append(toIndentedString(isCorporation)).append("\n");
    sb.append("    issued: ").append(toIndentedString(issued)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    minVolume: ").append(toIndentedString(minVolume)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    volumeRemain: ").append(toIndentedString(volumeRemain)).append("\n");
    sb.append("    volumeTotal: ").append(toIndentedString(volumeTotal)).append("\n");
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

