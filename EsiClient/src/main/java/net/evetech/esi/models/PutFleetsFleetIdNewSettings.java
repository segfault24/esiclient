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

/**
 * new_settings object
 */
@ApiModel(description = "new_settings object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:41:27.859-05:00")
public class PutFleetsFleetIdNewSettings {
  @SerializedName("is_free_move")
  private Boolean isFreeMove = null;

  @SerializedName("motd")
  private String motd = null;

  public PutFleetsFleetIdNewSettings isFreeMove(Boolean isFreeMove) {
    this.isFreeMove = isFreeMove;
    return this;
  }

   /**
   * Should free-move be enabled in the fleet
   * @return isFreeMove
  **/
  @ApiModelProperty(example = "null", value = "Should free-move be enabled in the fleet")
  public Boolean getIsFreeMove() {
    return isFreeMove;
  }

  public void setIsFreeMove(Boolean isFreeMove) {
    this.isFreeMove = isFreeMove;
  }

  public PutFleetsFleetIdNewSettings motd(String motd) {
    this.motd = motd;
    return this;
  }

   /**
   * New fleet MOTD in CCP flavoured HTML
   * @return motd
  **/
  @ApiModelProperty(example = "null", value = "New fleet MOTD in CCP flavoured HTML")
  public String getMotd() {
    return motd;
  }

  public void setMotd(String motd) {
    this.motd = motd;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutFleetsFleetIdNewSettings putFleetsFleetIdNewSettings = (PutFleetsFleetIdNewSettings) o;
    return Objects.equals(this.isFreeMove, putFleetsFleetIdNewSettings.isFreeMove) &&
        Objects.equals(this.motd, putFleetsFleetIdNewSettings.motd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isFreeMove, motd);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutFleetsFleetIdNewSettings {\n");
    
    sb.append("    isFreeMove: ").append(toIndentedString(isFreeMove)).append("\n");
    sb.append("    motd: ").append(toIndentedString(motd)).append("\n");
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

