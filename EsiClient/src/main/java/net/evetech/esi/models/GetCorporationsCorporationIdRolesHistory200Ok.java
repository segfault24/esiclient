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
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-30T13:35:06.976-04:00")
public class GetCorporationsCorporationIdRolesHistory200Ok {
  @SerializedName("changed_at")
  private DateTime changedAt = null;

  @SerializedName("character_id")
  private Integer characterId = null;

  @SerializedName("issuer_id")
  private Integer issuerId = null;

  /**
   * new_role string
   */
  public enum NewRolesEnum {
    @SerializedName("Account_Take_1")
    ACCOUNT_TAKE_1("Account_Take_1"),
    
    @SerializedName("Account_Take_2")
    ACCOUNT_TAKE_2("Account_Take_2"),
    
    @SerializedName("Account_Take_3")
    ACCOUNT_TAKE_3("Account_Take_3"),
    
    @SerializedName("Account_Take_4")
    ACCOUNT_TAKE_4("Account_Take_4"),
    
    @SerializedName("Account_Take_5")
    ACCOUNT_TAKE_5("Account_Take_5"),
    
    @SerializedName("Account_Take_6")
    ACCOUNT_TAKE_6("Account_Take_6"),
    
    @SerializedName("Account_Take_7")
    ACCOUNT_TAKE_7("Account_Take_7"),
    
    @SerializedName("Accountant")
    ACCOUNTANT("Accountant"),
    
    @SerializedName("Auditor")
    AUDITOR("Auditor"),
    
    @SerializedName("Communications_Officer")
    COMMUNICATIONS_OFFICER("Communications_Officer"),
    
    @SerializedName("Config_Equipment")
    CONFIG_EQUIPMENT("Config_Equipment"),
    
    @SerializedName("Config_Starbase_Equipment")
    CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),
    
    @SerializedName("Container_Take_1")
    CONTAINER_TAKE_1("Container_Take_1"),
    
    @SerializedName("Container_Take_2")
    CONTAINER_TAKE_2("Container_Take_2"),
    
    @SerializedName("Container_Take_3")
    CONTAINER_TAKE_3("Container_Take_3"),
    
    @SerializedName("Container_Take_4")
    CONTAINER_TAKE_4("Container_Take_4"),
    
    @SerializedName("Container_Take_5")
    CONTAINER_TAKE_5("Container_Take_5"),
    
    @SerializedName("Container_Take_6")
    CONTAINER_TAKE_6("Container_Take_6"),
    
    @SerializedName("Container_Take_7")
    CONTAINER_TAKE_7("Container_Take_7"),
    
    @SerializedName("Contract_Manager")
    CONTRACT_MANAGER("Contract_Manager"),
    
    @SerializedName("Diplomat")
    DIPLOMAT("Diplomat"),
    
    @SerializedName("Director")
    DIRECTOR("Director"),
    
    @SerializedName("Factory_Manager")
    FACTORY_MANAGER("Factory_Manager"),
    
    @SerializedName("Fitting_Manager")
    FITTING_MANAGER("Fitting_Manager"),
    
    @SerializedName("Hangar_Query_1")
    HANGAR_QUERY_1("Hangar_Query_1"),
    
    @SerializedName("Hangar_Query_2")
    HANGAR_QUERY_2("Hangar_Query_2"),
    
    @SerializedName("Hangar_Query_3")
    HANGAR_QUERY_3("Hangar_Query_3"),
    
    @SerializedName("Hangar_Query_4")
    HANGAR_QUERY_4("Hangar_Query_4"),
    
    @SerializedName("Hangar_Query_5")
    HANGAR_QUERY_5("Hangar_Query_5"),
    
    @SerializedName("Hangar_Query_6")
    HANGAR_QUERY_6("Hangar_Query_6"),
    
    @SerializedName("Hangar_Query_7")
    HANGAR_QUERY_7("Hangar_Query_7"),
    
    @SerializedName("Hangar_Take_1")
    HANGAR_TAKE_1("Hangar_Take_1"),
    
    @SerializedName("Hangar_Take_2")
    HANGAR_TAKE_2("Hangar_Take_2"),
    
    @SerializedName("Hangar_Take_3")
    HANGAR_TAKE_3("Hangar_Take_3"),
    
    @SerializedName("Hangar_Take_4")
    HANGAR_TAKE_4("Hangar_Take_4"),
    
    @SerializedName("Hangar_Take_5")
    HANGAR_TAKE_5("Hangar_Take_5"),
    
    @SerializedName("Hangar_Take_6")
    HANGAR_TAKE_6("Hangar_Take_6"),
    
    @SerializedName("Hangar_Take_7")
    HANGAR_TAKE_7("Hangar_Take_7"),
    
    @SerializedName("Junior_Accountant")
    JUNIOR_ACCOUNTANT("Junior_Accountant"),
    
    @SerializedName("Personnel_Manager")
    PERSONNEL_MANAGER("Personnel_Manager"),
    
    @SerializedName("Rent_Factory_Facility")
    RENT_FACTORY_FACILITY("Rent_Factory_Facility"),
    
    @SerializedName("Rent_Office")
    RENT_OFFICE("Rent_Office"),
    
    @SerializedName("Rent_Research_Facility")
    RENT_RESEARCH_FACILITY("Rent_Research_Facility"),
    
    @SerializedName("Security_Officer")
    SECURITY_OFFICER("Security_Officer"),
    
    @SerializedName("Starbase_Defense_Operator")
    STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),
    
    @SerializedName("Starbase_Fuel_Technician")
    STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),
    
    @SerializedName("Station_Manager")
    STATION_MANAGER("Station_Manager"),
    
    @SerializedName("Terrestrial_Combat_Officer")
    TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),
    
    @SerializedName("Terrestrial_Logistics_Officer")
    TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer"),
    
    @SerializedName("Trader")
    TRADER("Trader");

    private String value;

    NewRolesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("new_roles")
  private List<NewRolesEnum> newRoles = new ArrayList<NewRolesEnum>();

  /**
   * old_role string
   */
  public enum OldRolesEnum {
    @SerializedName("Account_Take_1")
    ACCOUNT_TAKE_1("Account_Take_1"),
    
    @SerializedName("Account_Take_2")
    ACCOUNT_TAKE_2("Account_Take_2"),
    
    @SerializedName("Account_Take_3")
    ACCOUNT_TAKE_3("Account_Take_3"),
    
    @SerializedName("Account_Take_4")
    ACCOUNT_TAKE_4("Account_Take_4"),
    
    @SerializedName("Account_Take_5")
    ACCOUNT_TAKE_5("Account_Take_5"),
    
    @SerializedName("Account_Take_6")
    ACCOUNT_TAKE_6("Account_Take_6"),
    
    @SerializedName("Account_Take_7")
    ACCOUNT_TAKE_7("Account_Take_7"),
    
    @SerializedName("Accountant")
    ACCOUNTANT("Accountant"),
    
    @SerializedName("Auditor")
    AUDITOR("Auditor"),
    
    @SerializedName("Communications_Officer")
    COMMUNICATIONS_OFFICER("Communications_Officer"),
    
    @SerializedName("Config_Equipment")
    CONFIG_EQUIPMENT("Config_Equipment"),
    
    @SerializedName("Config_Starbase_Equipment")
    CONFIG_STARBASE_EQUIPMENT("Config_Starbase_Equipment"),
    
    @SerializedName("Container_Take_1")
    CONTAINER_TAKE_1("Container_Take_1"),
    
    @SerializedName("Container_Take_2")
    CONTAINER_TAKE_2("Container_Take_2"),
    
    @SerializedName("Container_Take_3")
    CONTAINER_TAKE_3("Container_Take_3"),
    
    @SerializedName("Container_Take_4")
    CONTAINER_TAKE_4("Container_Take_4"),
    
    @SerializedName("Container_Take_5")
    CONTAINER_TAKE_5("Container_Take_5"),
    
    @SerializedName("Container_Take_6")
    CONTAINER_TAKE_6("Container_Take_6"),
    
    @SerializedName("Container_Take_7")
    CONTAINER_TAKE_7("Container_Take_7"),
    
    @SerializedName("Contract_Manager")
    CONTRACT_MANAGER("Contract_Manager"),
    
    @SerializedName("Diplomat")
    DIPLOMAT("Diplomat"),
    
    @SerializedName("Director")
    DIRECTOR("Director"),
    
    @SerializedName("Factory_Manager")
    FACTORY_MANAGER("Factory_Manager"),
    
    @SerializedName("Fitting_Manager")
    FITTING_MANAGER("Fitting_Manager"),
    
    @SerializedName("Hangar_Query_1")
    HANGAR_QUERY_1("Hangar_Query_1"),
    
    @SerializedName("Hangar_Query_2")
    HANGAR_QUERY_2("Hangar_Query_2"),
    
    @SerializedName("Hangar_Query_3")
    HANGAR_QUERY_3("Hangar_Query_3"),
    
    @SerializedName("Hangar_Query_4")
    HANGAR_QUERY_4("Hangar_Query_4"),
    
    @SerializedName("Hangar_Query_5")
    HANGAR_QUERY_5("Hangar_Query_5"),
    
    @SerializedName("Hangar_Query_6")
    HANGAR_QUERY_6("Hangar_Query_6"),
    
    @SerializedName("Hangar_Query_7")
    HANGAR_QUERY_7("Hangar_Query_7"),
    
    @SerializedName("Hangar_Take_1")
    HANGAR_TAKE_1("Hangar_Take_1"),
    
    @SerializedName("Hangar_Take_2")
    HANGAR_TAKE_2("Hangar_Take_2"),
    
    @SerializedName("Hangar_Take_3")
    HANGAR_TAKE_3("Hangar_Take_3"),
    
    @SerializedName("Hangar_Take_4")
    HANGAR_TAKE_4("Hangar_Take_4"),
    
    @SerializedName("Hangar_Take_5")
    HANGAR_TAKE_5("Hangar_Take_5"),
    
    @SerializedName("Hangar_Take_6")
    HANGAR_TAKE_6("Hangar_Take_6"),
    
    @SerializedName("Hangar_Take_7")
    HANGAR_TAKE_7("Hangar_Take_7"),
    
    @SerializedName("Junior_Accountant")
    JUNIOR_ACCOUNTANT("Junior_Accountant"),
    
    @SerializedName("Personnel_Manager")
    PERSONNEL_MANAGER("Personnel_Manager"),
    
    @SerializedName("Rent_Factory_Facility")
    RENT_FACTORY_FACILITY("Rent_Factory_Facility"),
    
    @SerializedName("Rent_Office")
    RENT_OFFICE("Rent_Office"),
    
    @SerializedName("Rent_Research_Facility")
    RENT_RESEARCH_FACILITY("Rent_Research_Facility"),
    
    @SerializedName("Security_Officer")
    SECURITY_OFFICER("Security_Officer"),
    
    @SerializedName("Starbase_Defense_Operator")
    STARBASE_DEFENSE_OPERATOR("Starbase_Defense_Operator"),
    
    @SerializedName("Starbase_Fuel_Technician")
    STARBASE_FUEL_TECHNICIAN("Starbase_Fuel_Technician"),
    
    @SerializedName("Station_Manager")
    STATION_MANAGER("Station_Manager"),
    
    @SerializedName("Terrestrial_Combat_Officer")
    TERRESTRIAL_COMBAT_OFFICER("Terrestrial_Combat_Officer"),
    
    @SerializedName("Terrestrial_Logistics_Officer")
    TERRESTRIAL_LOGISTICS_OFFICER("Terrestrial_Logistics_Officer"),
    
    @SerializedName("Trader")
    TRADER("Trader");

    private String value;

    OldRolesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("old_roles")
  private List<OldRolesEnum> oldRoles = new ArrayList<OldRolesEnum>();

  /**
   * role_type string
   */
  public enum RoleTypeEnum {
    @SerializedName("grantable_roles")
    GRANTABLE_ROLES("grantable_roles"),
    
    @SerializedName("grantable_roles_at_base")
    GRANTABLE_ROLES_AT_BASE("grantable_roles_at_base"),
    
    @SerializedName("grantable_roles_at_hq")
    GRANTABLE_ROLES_AT_HQ("grantable_roles_at_hq"),
    
    @SerializedName("grantable_roles_at_other")
    GRANTABLE_ROLES_AT_OTHER("grantable_roles_at_other"),
    
    @SerializedName("roles")
    ROLES("roles"),
    
    @SerializedName("roles_at_base")
    ROLES_AT_BASE("roles_at_base"),
    
    @SerializedName("roles_at_hq")
    ROLES_AT_HQ("roles_at_hq"),
    
    @SerializedName("roles_at_other")
    ROLES_AT_OTHER("roles_at_other");

    private String value;

    RoleTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("role_type")
  private RoleTypeEnum roleType = null;

  public GetCorporationsCorporationIdRolesHistory200Ok changedAt(DateTime changedAt) {
    this.changedAt = changedAt;
    return this;
  }

   /**
   * changed_at string
   * @return changedAt
  **/
  @ApiModelProperty(example = "null", required = true, value = "changed_at string")
  public DateTime getChangedAt() {
    return changedAt;
  }

  public void setChangedAt(DateTime changedAt) {
    this.changedAt = changedAt;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok characterId(Integer characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * The character whose roles are changed
   * @return characterId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The character whose roles are changed")
  public Integer getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Integer characterId) {
    this.characterId = characterId;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok issuerId(Integer issuerId) {
    this.issuerId = issuerId;
    return this;
  }

   /**
   * ID of the character who issued this change
   * @return issuerId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID of the character who issued this change")
  public Integer getIssuerId() {
    return issuerId;
  }

  public void setIssuerId(Integer issuerId) {
    this.issuerId = issuerId;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok newRoles(List<NewRolesEnum> newRoles) {
    this.newRoles = newRoles;
    return this;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok addNewRolesItem(NewRolesEnum newRolesItem) {
    this.newRoles.add(newRolesItem);
    return this;
  }

   /**
   * new_roles array
   * @return newRoles
  **/
  @ApiModelProperty(example = "null", required = true, value = "new_roles array")
  public List<NewRolesEnum> getNewRoles() {
    return newRoles;
  }

  public void setNewRoles(List<NewRolesEnum> newRoles) {
    this.newRoles = newRoles;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok oldRoles(List<OldRolesEnum> oldRoles) {
    this.oldRoles = oldRoles;
    return this;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok addOldRolesItem(OldRolesEnum oldRolesItem) {
    this.oldRoles.add(oldRolesItem);
    return this;
  }

   /**
   * old_roles array
   * @return oldRoles
  **/
  @ApiModelProperty(example = "null", required = true, value = "old_roles array")
  public List<OldRolesEnum> getOldRoles() {
    return oldRoles;
  }

  public void setOldRoles(List<OldRolesEnum> oldRoles) {
    this.oldRoles = oldRoles;
  }

  public GetCorporationsCorporationIdRolesHistory200Ok roleType(RoleTypeEnum roleType) {
    this.roleType = roleType;
    return this;
  }

   /**
   * role_type string
   * @return roleType
  **/
  @ApiModelProperty(example = "null", required = true, value = "role_type string")
  public RoleTypeEnum getRoleType() {
    return roleType;
  }

  public void setRoleType(RoleTypeEnum roleType) {
    this.roleType = roleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdRolesHistory200Ok getCorporationsCorporationIdRolesHistory200Ok = (GetCorporationsCorporationIdRolesHistory200Ok) o;
    return Objects.equals(this.changedAt, getCorporationsCorporationIdRolesHistory200Ok.changedAt) &&
        Objects.equals(this.characterId, getCorporationsCorporationIdRolesHistory200Ok.characterId) &&
        Objects.equals(this.issuerId, getCorporationsCorporationIdRolesHistory200Ok.issuerId) &&
        Objects.equals(this.newRoles, getCorporationsCorporationIdRolesHistory200Ok.newRoles) &&
        Objects.equals(this.oldRoles, getCorporationsCorporationIdRolesHistory200Ok.oldRoles) &&
        Objects.equals(this.roleType, getCorporationsCorporationIdRolesHistory200Ok.roleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedAt, characterId, issuerId, newRoles, oldRoles, roleType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdRolesHistory200Ok {\n");
    
    sb.append("    changedAt: ").append(toIndentedString(changedAt)).append("\n");
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    newRoles: ").append(toIndentedString(newRoles)).append("\n");
    sb.append("    oldRoles: ").append(toIndentedString(oldRoles)).append("\n");
    sb.append("    roleType: ").append(toIndentedString(roleType)).append("\n");
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

