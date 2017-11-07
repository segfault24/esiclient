/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.7.1
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

/**
 * skill object
 */
@ApiModel(description = "skill object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-07T00:36:23.258-05:00")
public class GetCharactersCharacterIdSkillsSkill {
  @SerializedName("skill_id")
  private Integer skillId = null;

  @SerializedName("skillpoints_in_skill")
  private Long skillpointsInSkill = null;

  @SerializedName("current_skill_level")
  private Integer currentSkillLevel = null;

  public GetCharactersCharacterIdSkillsSkill skillId(Integer skillId) {
    this.skillId = skillId;
    return this;
  }

   /**
   * skill_id integer
   * @return skillId
  **/
  @ApiModelProperty(example = "null", value = "skill_id integer")
  public Integer getSkillId() {
    return skillId;
  }

  public void setSkillId(Integer skillId) {
    this.skillId = skillId;
  }

  public GetCharactersCharacterIdSkillsSkill skillpointsInSkill(Long skillpointsInSkill) {
    this.skillpointsInSkill = skillpointsInSkill;
    return this;
  }

   /**
   * skillpoints_in_skill integer
   * @return skillpointsInSkill
  **/
  @ApiModelProperty(example = "null", value = "skillpoints_in_skill integer")
  public Long getSkillpointsInSkill() {
    return skillpointsInSkill;
  }

  public void setSkillpointsInSkill(Long skillpointsInSkill) {
    this.skillpointsInSkill = skillpointsInSkill;
  }

  public GetCharactersCharacterIdSkillsSkill currentSkillLevel(Integer currentSkillLevel) {
    this.currentSkillLevel = currentSkillLevel;
    return this;
  }

   /**
   * current_skill_level integer
   * @return currentSkillLevel
  **/
  @ApiModelProperty(example = "null", value = "current_skill_level integer")
  public Integer getCurrentSkillLevel() {
    return currentSkillLevel;
  }

  public void setCurrentSkillLevel(Integer currentSkillLevel) {
    this.currentSkillLevel = currentSkillLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdSkillsSkill getCharactersCharacterIdSkillsSkill = (GetCharactersCharacterIdSkillsSkill) o;
    return Objects.equals(this.skillId, getCharactersCharacterIdSkillsSkill.skillId) &&
        Objects.equals(this.skillpointsInSkill, getCharactersCharacterIdSkillsSkill.skillpointsInSkill) &&
        Objects.equals(this.currentSkillLevel, getCharactersCharacterIdSkillsSkill.currentSkillLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillId, skillpointsInSkill, currentSkillLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdSkillsSkill {\n");
    
    sb.append("    skillId: ").append(toIndentedString(skillId)).append("\n");
    sb.append("    skillpointsInSkill: ").append(toIndentedString(skillpointsInSkill)).append("\n");
    sb.append("    currentSkillLevel: ").append(toIndentedString(currentSkillLevel)).append("\n");
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

