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

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:20:13.441-05:00")
public class GetCharactersCharacterIdContactsLabels200Ok {
  @SerializedName("label_id")
  private Long labelId = null;

  @SerializedName("label_name")
  private String labelName = null;

  public GetCharactersCharacterIdContactsLabels200Ok labelId(Long labelId) {
    this.labelId = labelId;
    return this;
  }

   /**
   * label_id integer
   * @return labelId
  **/
  @ApiModelProperty(example = "null", required = true, value = "label_id integer")
  public Long getLabelId() {
    return labelId;
  }

  public void setLabelId(Long labelId) {
    this.labelId = labelId;
  }

  public GetCharactersCharacterIdContactsLabels200Ok labelName(String labelName) {
    this.labelName = labelName;
    return this;
  }

   /**
   * label_name string
   * @return labelName
  **/
  @ApiModelProperty(example = "null", required = true, value = "label_name string")
  public String getLabelName() {
    return labelName;
  }

  public void setLabelName(String labelName) {
    this.labelName = labelName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdContactsLabels200Ok getCharactersCharacterIdContactsLabels200Ok = (GetCharactersCharacterIdContactsLabels200Ok) o;
    return Objects.equals(this.labelId, getCharactersCharacterIdContactsLabels200Ok.labelId) &&
        Objects.equals(this.labelName, getCharactersCharacterIdContactsLabels200Ok.labelName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelId, labelName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdContactsLabels200Ok {\n");
    
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
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

