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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-06-18T22:16:15.536-04:00")
public class GetCharactersCharacterIdFatigueOk {
  @SerializedName("jump_fatigue_expire_date")
  private DateTime jumpFatigueExpireDate = null;

  @SerializedName("last_jump_date")
  private DateTime lastJumpDate = null;

  @SerializedName("last_update_date")
  private DateTime lastUpdateDate = null;

  public GetCharactersCharacterIdFatigueOk jumpFatigueExpireDate(DateTime jumpFatigueExpireDate) {
    this.jumpFatigueExpireDate = jumpFatigueExpireDate;
    return this;
  }

   /**
   * Character's jump fatigue expiry
   * @return jumpFatigueExpireDate
  **/
  @ApiModelProperty(example = "null", value = "Character's jump fatigue expiry")
  public DateTime getJumpFatigueExpireDate() {
    return jumpFatigueExpireDate;
  }

  public void setJumpFatigueExpireDate(DateTime jumpFatigueExpireDate) {
    this.jumpFatigueExpireDate = jumpFatigueExpireDate;
  }

  public GetCharactersCharacterIdFatigueOk lastJumpDate(DateTime lastJumpDate) {
    this.lastJumpDate = lastJumpDate;
    return this;
  }

   /**
   * Character's last jump activation
   * @return lastJumpDate
  **/
  @ApiModelProperty(example = "null", value = "Character's last jump activation")
  public DateTime getLastJumpDate() {
    return lastJumpDate;
  }

  public void setLastJumpDate(DateTime lastJumpDate) {
    this.lastJumpDate = lastJumpDate;
  }

  public GetCharactersCharacterIdFatigueOk lastUpdateDate(DateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
    return this;
  }

   /**
   * Character's last jump update
   * @return lastUpdateDate
  **/
  @ApiModelProperty(example = "null", value = "Character's last jump update")
  public DateTime getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(DateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdFatigueOk getCharactersCharacterIdFatigueOk = (GetCharactersCharacterIdFatigueOk) o;
    return Objects.equals(this.jumpFatigueExpireDate, getCharactersCharacterIdFatigueOk.jumpFatigueExpireDate) &&
        Objects.equals(this.lastJumpDate, getCharactersCharacterIdFatigueOk.lastJumpDate) &&
        Objects.equals(this.lastUpdateDate, getCharactersCharacterIdFatigueOk.lastUpdateDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jumpFatigueExpireDate, lastJumpDate, lastUpdateDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdFatigueOk {\n");
    
    sb.append("    jumpFatigueExpireDate: ").append(toIndentedString(jumpFatigueExpireDate)).append("\n");
    sb.append("    lastJumpDate: ").append(toIndentedString(lastJumpDate)).append("\n");
    sb.append("    lastUpdateDate: ").append(toIndentedString(lastUpdateDate)).append("\n");
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

