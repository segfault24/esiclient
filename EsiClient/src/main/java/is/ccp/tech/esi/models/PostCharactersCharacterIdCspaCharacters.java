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
import java.util.ArrayList;
import java.util.List;

/**
 * characters object
 */
@ApiModel(description = "characters object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-07T00:36:23.258-05:00")
public class PostCharactersCharacterIdCspaCharacters {
  @SerializedName("characters")
  private List<Integer> characters = new ArrayList<Integer>();

  public PostCharactersCharacterIdCspaCharacters characters(List<Integer> characters) {
    this.characters = characters;
    return this;
  }

  public PostCharactersCharacterIdCspaCharacters addCharactersItem(Integer charactersItem) {
    this.characters.add(charactersItem);
    return this;
  }

   /**
   * characters array
   * @return characters
  **/
  @ApiModelProperty(example = "null", required = true, value = "characters array")
  public List<Integer> getCharacters() {
    return characters;
  }

  public void setCharacters(List<Integer> characters) {
    this.characters = characters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostCharactersCharacterIdCspaCharacters postCharactersCharacterIdCspaCharacters = (PostCharactersCharacterIdCspaCharacters) o;
    return Objects.equals(this.characters, postCharactersCharacterIdCspaCharacters.characters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(characters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCharactersCharacterIdCspaCharacters {\n");
    
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
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

