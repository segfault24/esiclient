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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-18T22:16:15.536-04:00")
public class GetCorporationsCorporationIdStandings200Ok {
  @SerializedName("from_id")
  private Integer fromId = null;

  /**
   * from_type string
   */
  public enum FromTypeEnum {
    @SerializedName("agent")
    AGENT("agent"),
    
    @SerializedName("npc_corp")
    NPC_CORP("npc_corp"),
    
    @SerializedName("faction")
    FACTION("faction");

    private String value;

    FromTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("from_type")
  private FromTypeEnum fromType = null;

  @SerializedName("standing")
  private Float standing = null;

  public GetCorporationsCorporationIdStandings200Ok fromId(Integer fromId) {
    this.fromId = fromId;
    return this;
  }

   /**
   * from_id integer
   * @return fromId
  **/
  @ApiModelProperty(example = "null", required = true, value = "from_id integer")
  public Integer getFromId() {
    return fromId;
  }

  public void setFromId(Integer fromId) {
    this.fromId = fromId;
  }

  public GetCorporationsCorporationIdStandings200Ok fromType(FromTypeEnum fromType) {
    this.fromType = fromType;
    return this;
  }

   /**
   * from_type string
   * @return fromType
  **/
  @ApiModelProperty(example = "null", required = true, value = "from_type string")
  public FromTypeEnum getFromType() {
    return fromType;
  }

  public void setFromType(FromTypeEnum fromType) {
    this.fromType = fromType;
  }

  public GetCorporationsCorporationIdStandings200Ok standing(Float standing) {
    this.standing = standing;
    return this;
  }

   /**
   * standing number
   * @return standing
  **/
  @ApiModelProperty(example = "null", required = true, value = "standing number")
  public Float getStanding() {
    return standing;
  }

  public void setStanding(Float standing) {
    this.standing = standing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdStandings200Ok getCorporationsCorporationIdStandings200Ok = (GetCorporationsCorporationIdStandings200Ok) o;
    return Objects.equals(this.fromId, getCorporationsCorporationIdStandings200Ok.fromId) &&
        Objects.equals(this.fromType, getCorporationsCorporationIdStandings200Ok.fromType) &&
        Objects.equals(this.standing, getCorporationsCorporationIdStandings200Ok.standing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromId, fromType, standing);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdStandings200Ok {\n");
    
    sb.append("    fromId: ").append(toIndentedString(fromId)).append("\n");
    sb.append("    fromType: ").append(toIndentedString(fromType)).append("\n");
    sb.append("    standing: ").append(toIndentedString(standing)).append("\n");
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

