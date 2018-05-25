/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package is.ccp.tech.esi.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-25T15:34:30.466-04:00")
public class GetFleetsFleetIdMembers200Ok {
  @SerializedName("character_id")
  private Integer characterId = null;

  @SerializedName("join_time")
  private DateTime joinTime = null;

  /**
   * Member’s role in fleet
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

  @SerializedName("role_name")
  private String roleName = null;

  @SerializedName("ship_type_id")
  private Integer shipTypeId = null;

  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  @SerializedName("squad_id")
  private Long squadId = null;

  @SerializedName("station_id")
  private Long stationId = null;

  @SerializedName("takes_fleet_warp")
  private Boolean takesFleetWarp = null;

  @SerializedName("wing_id")
  private Long wingId = null;

  public GetFleetsFleetIdMembers200Ok characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * character_id integer
   * @return characterId
  **/
  @ApiModelProperty(example = "null", required = true, value = "character_id integer")
  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetFleetsFleetIdMembers200Ok joinTime(DateTime joinTime) {
    this.joinTime = joinTime;
    return this;
  }

   /**
   * join_time string
   * @return joinTime
  **/
  @ApiModelProperty(example = "null", required = true, value = "join_time string")
  public DateTime getJoinTime() {
    return joinTime;
  }

  public void setJoinTime(DateTime joinTime) {
    this.joinTime = joinTime;
  }

  public GetFleetsFleetIdMembers200Ok role(RoleEnum role) {
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

  public GetFleetsFleetIdMembers200Ok roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

   /**
   * Localized role names
   * @return roleName
  **/
  @ApiModelProperty(example = "null", required = true, value = "Localized role names")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public GetFleetsFleetIdMembers200Ok shipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
    return this;
  }

   /**
   * ship_type_id integer
   * @return shipTypeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ship_type_id integer")
  public Integer getShipTypeId() {
    return shipTypeId;
  }

  public void setShipTypeId(Integer shipTypeId) {
    this.shipTypeId = shipTypeId;
  }

  public GetFleetsFleetIdMembers200Ok solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * Solar system the member is located in
   * @return solarSystemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "Solar system the member is located in")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetFleetsFleetIdMembers200Ok squadId(Long squadId) {
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

  public GetFleetsFleetIdMembers200Ok stationId(Long stationId) {
    this.stationId = stationId;
    return this;
  }

   /**
   * Station in which the member is docked in, if applicable
   * @return stationId
  **/
  @ApiModelProperty(example = "null", value = "Station in which the member is docked in, if applicable")
  public Long getStationId() {
    return stationId;
  }

  public void setStationId(Long stationId) {
    this.stationId = stationId;
  }

  public GetFleetsFleetIdMembers200Ok takesFleetWarp(Boolean takesFleetWarp) {
    this.takesFleetWarp = takesFleetWarp;
    return this;
  }

   /**
   * Whether the member take fleet warps
   * @return takesFleetWarp
  **/
  @ApiModelProperty(example = "null", required = true, value = "Whether the member take fleet warps")
  public Boolean getTakesFleetWarp() {
    return takesFleetWarp;
  }

  public void setTakesFleetWarp(Boolean takesFleetWarp) {
    this.takesFleetWarp = takesFleetWarp;
  }

  public GetFleetsFleetIdMembers200Ok wingId(Long wingId) {
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
    GetFleetsFleetIdMembers200Ok getFleetsFleetIdMembers200Ok = (GetFleetsFleetIdMembers200Ok) o;
    return Objects.equals(this.characterId, getFleetsFleetIdMembers200Ok.characterId) &&
        Objects.equals(this.joinTime, getFleetsFleetIdMembers200Ok.joinTime) &&
        Objects.equals(this.role, getFleetsFleetIdMembers200Ok.role) &&
        Objects.equals(this.roleName, getFleetsFleetIdMembers200Ok.roleName) &&
        Objects.equals(this.shipTypeId, getFleetsFleetIdMembers200Ok.shipTypeId) &&
        Objects.equals(this.solarSystemId, getFleetsFleetIdMembers200Ok.solarSystemId) &&
        Objects.equals(this.squadId, getFleetsFleetIdMembers200Ok.squadId) &&
        Objects.equals(this.stationId, getFleetsFleetIdMembers200Ok.stationId) &&
        Objects.equals(this.takesFleetWarp, getFleetsFleetIdMembers200Ok.takesFleetWarp) &&
        Objects.equals(this.wingId, getFleetsFleetIdMembers200Ok.wingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterId, joinTime, role, roleName, shipTypeId, solarSystemId, squadId, stationId, takesFleetWarp, wingId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFleetsFleetIdMembers200Ok {\n");
    
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    joinTime: ").append(toIndentedString(joinTime)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    shipTypeId: ").append(toIndentedString(shipTypeId)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    squadId: ").append(toIndentedString(squadId)).append("\n");
    sb.append("    stationId: ").append(toIndentedString(stationId)).append("\n");
    sb.append("    takesFleetWarp: ").append(toIndentedString(takesFleetWarp)).append("\n");
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

