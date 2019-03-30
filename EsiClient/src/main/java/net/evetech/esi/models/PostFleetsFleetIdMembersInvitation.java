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
 * invitation object
 */
@ApiModel(description = "invitation object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-30T13:35:06.976-04:00")
public class PostFleetsFleetIdMembersInvitation {
  @SerializedName("character_id")
  private Integer characterId = null;

  /**
   * If a character is invited with the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is invited with the `wing_commander` role, only `wing_id` should be specified. If a character is invited with the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is invited with the `squad_member` role, `wing_id` and `squad_id` should either both be specified or not specified at all. If they aren’t specified, the invited character will join any squad with available positions.
   */
  public enum RoleEnum {
    @SerializedName("fleet_commander")
    FLEET_COMMANDER("fleet_commander"),
    
    @SerializedName("wing_commander")
    WING_COMMANDER("wing_commander"),
    
    @SerializedName("squad_commander")
    SQUAD_COMMANDER("squad_commander"),
    
    @SerializedName("squad_member")
    SQUAD_MEMBER("squad_member");

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

  public PostFleetsFleetIdMembersInvitation characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * The character you want to invite
   * @return characterId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The character you want to invite")
  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public PostFleetsFleetIdMembersInvitation role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * If a character is invited with the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is invited with the `wing_commander` role, only `wing_id` should be specified. If a character is invited with the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is invited with the `squad_member` role, `wing_id` and `squad_id` should either both be specified or not specified at all. If they aren’t specified, the invited character will join any squad with available positions.
   * @return role
  **/
  @ApiModelProperty(example = "null", required = true, value = "If a character is invited with the `fleet_commander` role, neither `wing_id` or `squad_id` should be specified. If a character is invited with the `wing_commander` role, only `wing_id` should be specified. If a character is invited with the `squad_commander` role, both `wing_id` and `squad_id` should be specified. If a character is invited with the `squad_member` role, `wing_id` and `squad_id` should either both be specified or not specified at all. If they aren’t specified, the invited character will join any squad with available positions.")
  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public PostFleetsFleetIdMembersInvitation squadId(Long squadId) {
    this.squadId = squadId;
    return this;
  }

   /**
   * squad_id integer
   * minimum: 0
   * @return squadId
  **/
  @ApiModelProperty(example = "null", value = "squad_id integer")
  public Long getSquadId() {
    return squadId;
  }

  public void setSquadId(Long squadId) {
    this.squadId = squadId;
  }

  public PostFleetsFleetIdMembersInvitation wingId(Long wingId) {
    this.wingId = wingId;
    return this;
  }

   /**
   * wing_id integer
   * minimum: 0
   * @return wingId
  **/
  @ApiModelProperty(example = "null", value = "wing_id integer")
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
    PostFleetsFleetIdMembersInvitation postFleetsFleetIdMembersInvitation = (PostFleetsFleetIdMembersInvitation) o;
    return Objects.equals(this.characterId, postFleetsFleetIdMembersInvitation.characterId) &&
        Objects.equals(this.role, postFleetsFleetIdMembersInvitation.role) &&
        Objects.equals(this.squadId, postFleetsFleetIdMembersInvitation.squadId) &&
        Objects.equals(this.wingId, postFleetsFleetIdMembersInvitation.wingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterId, role, squadId, wingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFleetsFleetIdMembersInvitation {\n");
    
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
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

