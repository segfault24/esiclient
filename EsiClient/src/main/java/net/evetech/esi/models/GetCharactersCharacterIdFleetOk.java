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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:41:27.859-05:00")
public class GetCharactersCharacterIdFleetOk {
  @SerializedName("fleet_id")
  private Long fleetId = null;

  /**
   * Member’s role in fleet
   */
  public enum RoleEnum {
    @SerializedName("fleet_commander")
    FLEET_COMMANDER("fleet_commander"),
    
    @SerializedName("squad_commander")
    SQUAD_COMMANDER("squad_commander"),
    
    @SerializedName("squad_member")
    SQUAD_MEMBER("squad_member"),
    
    @SerializedName("wing_commander")
    WING_COMMANDER("wing_commander");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("role")
  private RoleEnum role = null;

  @SerializedName("squad_id")
  private Long squadId = null;

  @SerializedName("wing_id")
  private Long wingId = null;

  public GetCharactersCharacterIdFleetOk fleetId(Long fleetId) {
    this.fleetId = fleetId;
    return this;
  }

   /**
   * The character's current fleet ID
   * @return fleetId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The character's current fleet ID")
  public Long getFleetId() {
    return fleetId;
  }

  public void setFleetId(Long fleetId) {
    this.fleetId = fleetId;
  }

  public GetCharactersCharacterIdFleetOk role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Member’s role in fleet
   * @return role
  **/
  @ApiModelProperty(example = "null", required = true, value = "Member’s role in fleet")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public GetCharactersCharacterIdFleetOk squadId(Long squadId) {
    this.squadId = squadId;
    return this;
  }

   /**
   * ID of the squad the member is in. If not applicable, will be set to -1
   * @return squadId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID of the squad the member is in. If not applicable, will be set to -1")
  public Long getSquadId() {
    return squadId;
  }

  public void setSquadId(Long squadId) {
    this.squadId = squadId;
  }

  public GetCharactersCharacterIdFleetOk wingId(Long wingId) {
    this.wingId = wingId;
    return this;
  }

   /**
   * ID of the wing the member is in. If not applicable, will be set to -1
   * @return wingId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID of the wing the member is in. If not applicable, will be set to -1")
  public Long getWingId() {
    return wingId;
  }

  public void setWingId(Long wingId) {
    this.wingId = wingId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdFleetOk getCharactersCharacterIdFleetOk = (GetCharactersCharacterIdFleetOk) o;
    return Objects.equals(this.fleetId, getCharactersCharacterIdFleetOk.fleetId) &&
        Objects.equals(this.role, getCharactersCharacterIdFleetOk.role) &&
        Objects.equals(this.squadId, getCharactersCharacterIdFleetOk.squadId) &&
        Objects.equals(this.wingId, getCharactersCharacterIdFleetOk.wingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fleetId, role, squadId, wingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdFleetOk {\n");
    
    sb.append("    fleetId: ").append(toIndentedString(fleetId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    squadId: ").append(toIndentedString(squadId)).append("\n");
    sb.append("    wingId: ").append(toIndentedString(wingId)).append("\n");
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

