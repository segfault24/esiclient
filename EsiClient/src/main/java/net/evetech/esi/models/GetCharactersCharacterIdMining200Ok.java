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
public class GetCharactersCharacterIdMining200Ok {
  @SerializedName("date")
  private LocalDate date = null;

  @SerializedName("quantity")
  private Long quantity = null;

  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetCharactersCharacterIdMining200Ok date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * date string
   * @return date
  **/
  @ApiModelProperty(example = "null", required = true, value = "date string")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public GetCharactersCharacterIdMining200Ok quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity integer
   * @return quantity
  **/
  @ApiModelProperty(example = "null", required = true, value = "quantity integer")
  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public GetCharactersCharacterIdMining200Ok solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * solar_system_id integer
   * @return solarSystemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "solar_system_id integer")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetCharactersCharacterIdMining200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * type_id integer
   * @return typeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "type_id integer")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdMining200Ok getCharactersCharacterIdMining200Ok = (GetCharactersCharacterIdMining200Ok) o;
    return Objects.equals(this.date, getCharactersCharacterIdMining200Ok.date) &&
        Objects.equals(this.quantity, getCharactersCharacterIdMining200Ok.quantity) &&
        Objects.equals(this.solarSystemId, getCharactersCharacterIdMining200Ok.solarSystemId) &&
        Objects.equals(this.typeId, getCharactersCharacterIdMining200Ok.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, quantity, solarSystemId, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMining200Ok {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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
