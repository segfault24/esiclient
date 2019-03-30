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
import net.evetech.esi.models.GetCharactersCharacterIdSkillsSkill;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-30T13:35:06.976-04:00")
public class GetCharactersCharacterIdSkillsOk {
  @SerializedName("skills")
  private List<GetCharactersCharacterIdSkillsSkill> skills = new ArrayList<GetCharactersCharacterIdSkillsSkill>();

  @SerializedName("total_sp")
  private Long totalSp = null;

  @SerializedName("unallocated_sp")
  private Integer unallocatedSp = null;

  public GetCharactersCharacterIdSkillsOk skills(List<GetCharactersCharacterIdSkillsSkill> skills) {
    this.skills = skills;
    return this;
  }

  public GetCharactersCharacterIdSkillsOk addSkillsItem(GetCharactersCharacterIdSkillsSkill skillsItem) {
    this.skills.add(skillsItem);
    return this;
  }

   /**
   * skills array
   * @return skills
  **/
  @ApiModelProperty(example = "null", required = true, value = "skills array")
  public List<GetCharactersCharacterIdSkillsSkill> getSkills() {
    return skills;
  }

  public void setSkills(List<GetCharactersCharacterIdSkillsSkill> skills) {
    this.skills = skills;
  }

  public GetCharactersCharacterIdSkillsOk totalSp(Long totalSp) {
    this.totalSp = totalSp;
    return this;
  }

   /**
   * total_sp integer
   * @return totalSp
  **/
  @ApiModelProperty(example = "null", required = true, value = "total_sp integer")
  public Long getTotalSp() {
    return totalSp;
  }

  public void setTotalSp(Long totalSp) {
    this.totalSp = totalSp;
  }

  public GetCharactersCharacterIdSkillsOk unallocatedSp(Integer unallocatedSp) {
    this.unallocatedSp = unallocatedSp;
    return this;
  }

   /**
   * Skill points available to be assigned
   * @return unallocatedSp
  **/
  @ApiModelProperty(example = "null", value = "Skill points available to be assigned")
  public Integer getUnallocatedSp() {
    return unallocatedSp;
  }

  public void setUnallocatedSp(Integer unallocatedSp) {
    this.unallocatedSp = unallocatedSp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdSkillsOk getCharactersCharacterIdSkillsOk = (GetCharactersCharacterIdSkillsOk) o;
    return Objects.equals(this.skills, getCharactersCharacterIdSkillsOk.skills) &&
        Objects.equals(this.totalSp, getCharactersCharacterIdSkillsOk.totalSp) &&
        Objects.equals(this.unallocatedSp, getCharactersCharacterIdSkillsOk.unallocatedSp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skills, totalSp, unallocatedSp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdSkillsOk {\n");
    
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    totalSp: ").append(toIndentedString(totalSp)).append("\n");
    sb.append("    unallocatedSp: ").append(toIndentedString(unallocatedSp)).append("\n");
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

