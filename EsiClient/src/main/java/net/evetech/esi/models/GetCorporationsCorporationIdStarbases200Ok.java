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
public class GetCorporationsCorporationIdStarbases200Ok {
  @SerializedName("moon_id")
  private Integer moonId = null;

  @SerializedName("onlined_since")
  private DateTime onlinedSince = null;

  @SerializedName("reinforced_until")
  private DateTime reinforcedUntil = null;

  @SerializedName("starbase_id")
  private Long starbaseId = null;

  /**
   * state string
   */
  public enum StateEnum {
    @SerializedName("offline")
    OFFLINE("offline"),
    
    @SerializedName("online")
    ONLINE("online"),
    
    @SerializedName("onlining")
    ONLINING("onlining"),
    
    @SerializedName("reinforced")
    REINFORCED("reinforced"),
    
    @SerializedName("unanchoring")
    UNANCHORING("unanchoring");

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

  @SerializedName("system_id")
  private Integer systemId = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  @SerializedName("unanchor_at")
  private DateTime unanchorAt = null;

  public GetCorporationsCorporationIdStarbases200Ok moonId(Integer moonId) {
    this.moonId = moonId;
    return this;
  }

   /**
   * The moon this starbase (POS) is anchored on, unanchored POSes do not have this information
   * @return moonId
  **/
  @ApiModelProperty(example = "null", value = "The moon this starbase (POS) is anchored on, unanchored POSes do not have this information")
  public Integer getMoonId() {
    return moonId;
  }

  public void setMoonId(Integer moonId) {
    this.moonId = moonId;
  }

  public GetCorporationsCorporationIdStarbases200Ok onlinedSince(DateTime onlinedSince) {
    this.onlinedSince = onlinedSince;
    return this;
  }

   /**
   * When the POS onlined, for starbases (POSes) in online state
   * @return onlinedSince
  **/
  @ApiModelProperty(example = "null", value = "When the POS onlined, for starbases (POSes) in online state")
  public DateTime getOnlinedSince() {
    return onlinedSince;
  }

  public void setOnlinedSince(DateTime onlinedSince) {
    this.onlinedSince = onlinedSince;
  }

  public GetCorporationsCorporationIdStarbases200Ok reinforcedUntil(DateTime reinforcedUntil) {
    this.reinforcedUntil = reinforcedUntil;
    return this;
  }

   /**
   * When the POS will be out of reinforcement, for starbases (POSes) in reinforced state
   * @return reinforcedUntil
  **/
  @ApiModelProperty(example = "null", value = "When the POS will be out of reinforcement, for starbases (POSes) in reinforced state")
  public DateTime getReinforcedUntil() {
    return reinforcedUntil;
  }

  public void setReinforcedUntil(DateTime reinforcedUntil) {
    this.reinforcedUntil = reinforcedUntil;
  }

  public GetCorporationsCorporationIdStarbases200Ok starbaseId(Long starbaseId) {
    this.starbaseId = starbaseId;
    return this;
  }

   /**
   * Unique ID for this starbase (POS)
   * @return starbaseId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Unique ID for this starbase (POS)")
  public Long getStarbaseId() {
    return starbaseId;
  }

  public void setStarbaseId(Long starbaseId) {
    this.starbaseId = starbaseId;
  }

  public GetCorporationsCorporationIdStarbases200Ok state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * state string
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "state string")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public GetCorporationsCorporationIdStarbases200Ok systemId(Integer systemId) {
    this.systemId = systemId;
    return this;
  }

   /**
   * The solar system this starbase (POS) is in, unanchored POSes have this information
   * @return systemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The solar system this starbase (POS) is in, unanchored POSes have this information")
  public Integer getSystemId() {
    return systemId;
  }

  public void setSystemId(Integer systemId) {
    this.systemId = systemId;
  }

  public GetCorporationsCorporationIdStarbases200Ok typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Starbase (POS) type
   * @return typeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Starbase (POS) type")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }

  public GetCorporationsCorporationIdStarbases200Ok unanchorAt(DateTime unanchorAt) {
    this.unanchorAt = unanchorAt;
    return this;
  }

   /**
   * When the POS started unanchoring, for starbases (POSes) in unanchoring state
   * @return unanchorAt
  **/
  @ApiModelProperty(example = "null", value = "When the POS started unanchoring, for starbases (POSes) in unanchoring state")
  public DateTime getUnanchorAt() {
    return unanchorAt;
  }

  public void setUnanchorAt(DateTime unanchorAt) {
    this.unanchorAt = unanchorAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdStarbases200Ok getCorporationsCorporationIdStarbases200Ok = (GetCorporationsCorporationIdStarbases200Ok) o;
    return Objects.equals(this.moonId, getCorporationsCorporationIdStarbases200Ok.moonId) &&
        Objects.equals(this.onlinedSince, getCorporationsCorporationIdStarbases200Ok.onlinedSince) &&
        Objects.equals(this.reinforcedUntil, getCorporationsCorporationIdStarbases200Ok.reinforcedUntil) &&
        Objects.equals(this.starbaseId, getCorporationsCorporationIdStarbases200Ok.starbaseId) &&
        Objects.equals(this.state, getCorporationsCorporationIdStarbases200Ok.state) &&
        Objects.equals(this.systemId, getCorporationsCorporationIdStarbases200Ok.systemId) &&
        Objects.equals(this.typeId, getCorporationsCorporationIdStarbases200Ok.typeId) &&
        Objects.equals(this.unanchorAt, getCorporationsCorporationIdStarbases200Ok.unanchorAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(moonId, onlinedSince, reinforcedUntil, starbaseId, state, systemId, typeId, unanchorAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdStarbases200Ok {\n");
    
    sb.append("    moonId: ").append(toIndentedString(moonId)).append("\n");
    sb.append("    onlinedSince: ").append(toIndentedString(onlinedSince)).append("\n");
    sb.append("    reinforcedUntil: ").append(toIndentedString(reinforcedUntil)).append("\n");
    sb.append("    starbaseId: ").append(toIndentedString(starbaseId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    unanchorAt: ").append(toIndentedString(unanchorAt)).append("\n");
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

