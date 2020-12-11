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
import java.util.ArrayList;
import java.util.List;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:20:13.441-05:00")
public class GetCharactersCharacterIdRolesOk {
  /**
   * role string
   */
  public enum RolesEnum {
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
    
    @SerializedName("Trader")
    TRADER("Trader");

    private String value;

    RolesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("roles")
  private List<RolesEnum> roles = new ArrayList<RolesEnum>();

  /**
   * roles_at_base string
   */
  public enum RolesAtBaseEnum {
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
    
    @SerializedName("Trader")
    TRADER("Trader");

    private String value;

    RolesAtBaseEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("roles_at_base")
  private List<RolesAtBaseEnum> rolesAtBase = new ArrayList<RolesAtBaseEnum>();

  /**
   * roles_at_hq string
   */
  public enum RolesAtHqEnum {
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
    
    @SerializedName("Trader")
    TRADER("Trader");

    private String value;

    RolesAtHqEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("roles_at_hq")
  private List<RolesAtHqEnum> rolesAtHq = new ArrayList<RolesAtHqEnum>();

  /**
   * roles_at_other string
   */
  public enum RolesAtOtherEnum {
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
    
    @SerializedName("Trader")
    TRADER("Trader");

    private String value;

    RolesAtOtherEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("roles_at_other")
  private List<RolesAtOtherEnum> rolesAtOther = new ArrayList<RolesAtOtherEnum>();

  public GetCharactersCharacterIdRolesOk roles(List<RolesEnum> roles) {
    this.roles = roles;
    return this;
  }

  public GetCharactersCharacterIdRolesOk addRolesItem(RolesEnum rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * roles array
   * @return roles
  **/
  @ApiModelProperty(example = "null", value = "roles array")
  public List<RolesEnum> getRoles() {
    return roles;
  }

  public void setRoles(List<RolesEnum> roles) {
    this.roles = roles;
  }

  public GetCharactersCharacterIdRolesOk rolesAtBase(List<RolesAtBaseEnum> rolesAtBase) {
    this.rolesAtBase = rolesAtBase;
    return this;
  }

  public GetCharactersCharacterIdRolesOk addRolesAtBaseItem(RolesAtBaseEnum rolesAtBaseItem) {
    this.rolesAtBase.add(rolesAtBaseItem);
    return this;
  }

   /**
   * roles_at_base array
   * @return rolesAtBase
  **/
  @ApiModelProperty(example = "null", value = "roles_at_base array")
  public List<RolesAtBaseEnum> getRolesAtBase() {
    return rolesAtBase;
  }

  public void setRolesAtBase(List<RolesAtBaseEnum> rolesAtBase) {
    this.rolesAtBase = rolesAtBase;
  }

  public GetCharactersCharacterIdRolesOk rolesAtHq(List<RolesAtHqEnum> rolesAtHq) {
    this.rolesAtHq = rolesAtHq;
    return this;
  }

  public GetCharactersCharacterIdRolesOk addRolesAtHqItem(RolesAtHqEnum rolesAtHqItem) {
    this.rolesAtHq.add(rolesAtHqItem);
    return this;
  }

   /**
   * roles_at_hq array
   * @return rolesAtHq
  **/
  @ApiModelProperty(example = "null", value = "roles_at_hq array")
  public List<RolesAtHqEnum> getRolesAtHq() {
    return rolesAtHq;
  }

  public void setRolesAtHq(List<RolesAtHqEnum> rolesAtHq) {
    this.rolesAtHq = rolesAtHq;
  }

  public GetCharactersCharacterIdRolesOk rolesAtOther(List<RolesAtOtherEnum> rolesAtOther) {
    this.rolesAtOther = rolesAtOther;
    return this;
  }

  public GetCharactersCharacterIdRolesOk addRolesAtOtherItem(RolesAtOtherEnum rolesAtOtherItem) {
    this.rolesAtOther.add(rolesAtOtherItem);
    return this;
  }

   /**
   * roles_at_other array
   * @return rolesAtOther
  **/
  @ApiModelProperty(example = "null", value = "roles_at_other array")
  public List<RolesAtOtherEnum> getRolesAtOther() {
    return rolesAtOther;
  }

  public void setRolesAtOther(List<RolesAtOtherEnum> rolesAtOther) {
    this.rolesAtOther = rolesAtOther;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdRolesOk getCharactersCharacterIdRolesOk = (GetCharactersCharacterIdRolesOk) o;
    return Objects.equals(this.roles, getCharactersCharacterIdRolesOk.roles) &&
        Objects.equals(this.rolesAtBase, getCharactersCharacterIdRolesOk.rolesAtBase) &&
        Objects.equals(this.rolesAtHq, getCharactersCharacterIdRolesOk.rolesAtHq) &&
        Objects.equals(this.rolesAtOther, getCharactersCharacterIdRolesOk.rolesAtOther);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles, rolesAtBase, rolesAtHq, rolesAtOther);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdRolesOk {\n");
    
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    rolesAtBase: ").append(toIndentedString(rolesAtBase)).append("\n");
    sb.append("    rolesAtHq: ").append(toIndentedString(rolesAtHq)).append("\n");
    sb.append("    rolesAtOther: ").append(toIndentedString(rolesAtOther)).append("\n");
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

