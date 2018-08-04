/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.5
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
import org.joda.time.LocalDate;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-04T12:18:31.101-04:00")
public class GetMarketsRegionIdHistory200Ok {
  @SerializedName("average")
  private Double average = null;

  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("highest")
  private Double highest = null;

  @SerializedName("lowest")
  private Double lowest = null;

  @SerializedName("order_count")
  private Long orderCount = null;

  @SerializedName("volume")
  private Long volume = null;

  public GetMarketsRegionIdHistory200Ok average(Double average) {
    this.average = average;
    return this;
  }

   /**
   * average number
   * @return average
  **/
  @ApiModelProperty(example = "null", required = true, value = "average number")
  public Double getAverage() {
    return average;
  }

  public void setAverage(Double average) {
    this.average = average;
  }

  public GetMarketsRegionIdHistory200Ok date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date of this historical statistic entry
   * @return date
  **/
  @ApiModelProperty(example = "null", required = true, value = "The date of this historical statistic entry")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public GetMarketsRegionIdHistory200Ok highest(Double highest) {
    this.highest = highest;
    return this;
  }

   /**
   * highest number
   * @return highest
  **/
  @ApiModelProperty(example = "null", required = true, value = "highest number")
  public Double getHighest() {
    return highest;
  }

  public void setHighest(Double highest) {
    this.highest = highest;
  }

  public GetMarketsRegionIdHistory200Ok lowest(Double lowest) {
    this.lowest = lowest;
    return this;
  }

   /**
   * lowest number
   * @return lowest
  **/
  @ApiModelProperty(example = "null", required = true, value = "lowest number")
  public Double getLowest() {
    return lowest;
  }

  public void setLowest(Double lowest) {
    this.lowest = lowest;
  }

  public GetMarketsRegionIdHistory200Ok orderCount(Long orderCount) {
    this.orderCount = orderCount;
    return this;
  }

   /**
   * Total number of orders happened that day
   * @return orderCount
  **/
  @ApiModelProperty(example = "null", required = true, value = "Total number of orders happened that day")
  public Long getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Long orderCount) {
    this.orderCount = orderCount;
  }

  public GetMarketsRegionIdHistory200Ok volume(Long volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Total
   * @return volume
  **/
  @ApiModelProperty(example = "null", required = true, value = "Total")
  public Long getVolume() {
    return volume;
  }

  public void setVolume(Long volume) {
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
    GetMarketsRegionIdHistory200Ok getMarketsRegionIdHistory200Ok = (GetMarketsRegionIdHistory200Ok) o;
    return Objects.equals(this.average, getMarketsRegionIdHistory200Ok.average) &&
        Objects.equals(this.date, getMarketsRegionIdHistory200Ok.date) &&
        Objects.equals(this.highest, getMarketsRegionIdHistory200Ok.highest) &&
        Objects.equals(this.lowest, getMarketsRegionIdHistory200Ok.lowest) &&
        Objects.equals(this.orderCount, getMarketsRegionIdHistory200Ok.orderCount) &&
        Objects.equals(this.volume, getMarketsRegionIdHistory200Ok.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, date, highest, lowest, orderCount, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMarketsRegionIdHistory200Ok {\n");
    
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    highest: ").append(toIndentedString(highest)).append("\n");
    sb.append("    lowest: ").append(toIndentedString(lowest)).append("\n");
    sb.append("    orderCount: ").append(toIndentedString(orderCount)).append("\n");
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
