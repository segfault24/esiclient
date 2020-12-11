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
 * recipient object
 */
@ApiModel(description = "recipient object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:37:36.420-05:00")
public class GetCharactersCharacterIdMailMailIdRecipient {
  @SerializedName("recipient_id")
  private Integer recipientId = null;

  /**
   * recipient_type string
   */
  public enum RecipientTypeEnum {
    @SerializedName("alliance")
    ALLIANCE("alliance"),
    
    @SerializedName("character")
    CHARACTER("character"),
    
    @SerializedName("corporation")
    CORPORATION("corporation"),
    
    @SerializedName("mailing_list")
    MAILING_LIST("mailing_list");

    private String value;

    RecipientTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("recipient_type")
  private RecipientTypeEnum recipientType = null;

  public GetCharactersCharacterIdMailMailIdRecipient recipientId(Integer recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * recipient_id integer
   * @return recipientId
  **/
  @ApiModelProperty(example = "null", required = true, value = "recipient_id integer")
  public Integer getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(Integer recipientId) {
    this.recipientId = recipientId;
  }

  public GetCharactersCharacterIdMailMailIdRecipient recipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
    return this;
  }

   /**
   * recipient_type string
   * @return recipientType
  **/
  @ApiModelProperty(example = "null", required = true, value = "recipient_type string")
  public RecipientTypeEnum getRecipientType() {
    return recipientType;
  }

  public void setRecipientType(RecipientTypeEnum recipientType) {
    this.recipientType = recipientType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdMailMailIdRecipient getCharactersCharacterIdMailMailIdRecipient = (GetCharactersCharacterIdMailMailIdRecipient) o;
    return Objects.equals(this.recipientId, getCharactersCharacterIdMailMailIdRecipient.recipientId) &&
        Objects.equals(this.recipientType, getCharactersCharacterIdMailMailIdRecipient.recipientType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientId, recipientType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdMailMailIdRecipient {\n");
    
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
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

