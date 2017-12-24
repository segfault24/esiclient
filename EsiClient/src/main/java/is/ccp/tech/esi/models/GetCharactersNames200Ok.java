/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.7.3
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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class GetCharactersNames200Ok {
  @SerializedName("character_id")
  private Long characterId = null;

  @SerializedName("character_name")
  private String characterName = null;

  public GetCharactersNames200Ok characterId(Long characterId) {
    this.characterId = characterId;
    return this;
  }

   /**
   * character_id integer
   * @return characterId
  **/
  @ApiModelProperty(example = "null", required = true, value = "character_id integer")
  public Long getCharacterId() {
    return characterId;
  }

  public void setCharacterId(Long characterId) {
    this.characterId = characterId;
  }

  public GetCharactersNames200Ok characterName(String characterName) {
    this.characterName = characterName;
    return this;
  }

   /**
   * character_name string
   * @return characterName
  **/
  @ApiModelProperty(example = "null", required = true, value = "character_name string")
  public String getCharacterName() {
    return characterName;
  }

  public void setCharacterName(String characterName) {
    this.characterName = characterName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersNames200Ok getCharactersNames200Ok = (GetCharactersNames200Ok) o;
    return Objects.equals(this.characterId, getCharactersNames200Ok.characterId) &&
        Objects.equals(this.characterName, getCharactersNames200Ok.characterName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characterId, characterName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersNames200Ok {\n");
    
    sb.append("    characterId: ").append(toIndentedString(characterId)).append("\n");
    sb.append("    characterName: ").append(toIndentedString(characterName)).append("\n");
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

