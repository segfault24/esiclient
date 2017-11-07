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
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-07T00:36:23.258-05:00")
public class GetCorporationsCorporationIdMedals200Ok {
  @SerializedName("medal_id")
  private Integer medalId = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("creator_id")
  private Integer creatorId = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  public GetCorporationsCorporationIdMedals200Ok medalId(Integer medalId) {
    this.medalId = medalId;
    return this;
  }

   /**
   * medal_id integer
   * @return medalId
  **/
  @ApiModelProperty(example = "null", required = true, value = "medal_id integer")
  public Integer getMedalId() {
    return medalId;
  }

  public void setMedalId(Integer medalId) {
    this.medalId = medalId;
  }

  public GetCorporationsCorporationIdMedals200Ok title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title string
   * @return title
  **/
  @ApiModelProperty(example = "null", required = true, value = "title string")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GetCorporationsCorporationIdMedals200Ok description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description string
   * @return description
  **/
  @ApiModelProperty(example = "null", required = true, value = "description string")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetCorporationsCorporationIdMedals200Ok creatorId(Integer creatorId) {
    this.creatorId = creatorId;
    return this;
  }

   /**
   * ID of the character who created this medal
   * @return creatorId
  **/
  @ApiModelProperty(example = "null", required = true, value = "ID of the character who created this medal")
  public Integer getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }

  public GetCorporationsCorporationIdMedals200Ok createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * created_at string
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", required = true, value = "created_at string")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdMedals200Ok getCorporationsCorporationIdMedals200Ok = (GetCorporationsCorporationIdMedals200Ok) o;
    return Objects.equals(this.medalId, getCorporationsCorporationIdMedals200Ok.medalId) &&
        Objects.equals(this.title, getCorporationsCorporationIdMedals200Ok.title) &&
        Objects.equals(this.description, getCorporationsCorporationIdMedals200Ok.description) &&
        Objects.equals(this.creatorId, getCorporationsCorporationIdMedals200Ok.creatorId) &&
        Objects.equals(this.createdAt, getCorporationsCorporationIdMedals200Ok.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(medalId, title, description, creatorId, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdMedals200Ok {\n");
    
    sb.append("    medalId: ").append(toIndentedString(medalId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

