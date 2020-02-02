/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 1.2.9
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
 * jump_clone object
 */
@ApiModel(description = "jump_clone object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-01T20:01:07.682-05:00")
public class GetCharactersCharacterIdClonesJumpClone {
  @SerializedName("implants")
  private List<Integer> implants = new ArrayList<Integer>();

  @SerializedName("jump_clone_id")
  private Integer jumpCloneId = null;

  @SerializedName("location_id")
  private Long locationId = null;

  /**
   * location_type string
   */
  public enum LocationTypeEnum {
    @SerializedName("station")
    STATION("station"),
    
    @SerializedName("structure")
    STRUCTURE("structure");

    private String value;

    LocationTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("location_type")
  private LocationTypeEnum locationType = null;

  @SerializedName("name")
  private String name = null;

  public GetCharactersCharacterIdClonesJumpClone implants(List<Integer> implants) {
    this.implants = implants;
    return this;
  }

  public GetCharactersCharacterIdClonesJumpClone addImplantsItem(Integer implantsItem) {
    this.implants.add(implantsItem);
    return this;
  }

   /**
   * implants array
   * @return implants
  **/
  @ApiModelProperty(example = "null", required = true, value = "implants array")
  public List<Integer> getImplants() {
    return implants;
  }

  public void setImplants(List<Integer> implants) {
    this.implants = implants;
  }

  public GetCharactersCharacterIdClonesJumpClone jumpCloneId(Integer jumpCloneId) {
    this.jumpCloneId = jumpCloneId;
    return this;
  }

   /**
   * jump_clone_id integer
   * @return jumpCloneId
  **/
  @ApiModelProperty(example = "null", required = true, value = "jump_clone_id integer")
  public Integer getJumpCloneId() {
    return jumpCloneId;
  }

  public void setJumpCloneId(Integer jumpCloneId) {
    this.jumpCloneId = jumpCloneId;
  }

  public GetCharactersCharacterIdClonesJumpClone locationId(Long locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * location_id integer
   * @return locationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "location_id integer")
  public Long getLocationId() {
    return locationId;
  }

  public void setLocationId(Long locationId) {
    this.locationId = locationId;
  }

  public GetCharactersCharacterIdClonesJumpClone locationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * location_type string
   * @return locationType
  **/
  @ApiModelProperty(example = "null", required = true, value = "location_type string")
  public LocationTypeEnum getLocationType() {
    return locationType;
  }

  public void setLocationType(LocationTypeEnum locationType) {
    this.locationType = locationType;
  }

  public GetCharactersCharacterIdClonesJumpClone name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdClonesJumpClone getCharactersCharacterIdClonesJumpClone = (GetCharactersCharacterIdClonesJumpClone) o;
    return Objects.equals(this.implants, getCharactersCharacterIdClonesJumpClone.implants) &&
        Objects.equals(this.jumpCloneId, getCharactersCharacterIdClonesJumpClone.jumpCloneId) &&
        Objects.equals(this.locationId, getCharactersCharacterIdClonesJumpClone.locationId) &&
        Objects.equals(this.locationType, getCharactersCharacterIdClonesJumpClone.locationType) &&
        Objects.equals(this.name, getCharactersCharacterIdClonesJumpClone.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(implants, jumpCloneId, locationId, locationType, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdClonesJumpClone {\n");
    
    sb.append("    implants: ").append(toIndentedString(implants)).append("\n");
    sb.append("    jumpCloneId: ").append(toIndentedString(jumpCloneId)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

