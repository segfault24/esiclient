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
import net.evetech.esi.models.GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute;
import net.evetech.esi.models.GetDogmaDynamicItemsTypeIdItemIdDogmaEffect;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-30T13:35:06.976-04:00")
public class GetDogmaDynamicItemsTypeIdItemIdOk {
  @SerializedName("created_by")
  private Integer createdBy = null;

  @SerializedName("dogma_attributes")
  private List<GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute> dogmaAttributes = new ArrayList<GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute>();

  @SerializedName("dogma_effects")
  private List<GetDogmaDynamicItemsTypeIdItemIdDogmaEffect> dogmaEffects = new ArrayList<GetDogmaDynamicItemsTypeIdItemIdDogmaEffect>();

  @SerializedName("mutator_type_id")
  private Integer mutatorTypeId = null;

  @SerializedName("source_type_id")
  private Integer sourceTypeId = null;

  public GetDogmaDynamicItemsTypeIdItemIdOk createdBy(Integer createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The ID of the character who created the item
   * @return createdBy
  **/
  @ApiModelProperty(example = "null", required = true, value = "The ID of the character who created the item")
  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

  public GetDogmaDynamicItemsTypeIdItemIdOk dogmaAttributes(List<GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute> dogmaAttributes) {
    this.dogmaAttributes = dogmaAttributes;
    return this;
  }

  public GetDogmaDynamicItemsTypeIdItemIdOk addDogmaAttributesItem(GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute dogmaAttributesItem) {
    this.dogmaAttributes.add(dogmaAttributesItem);
    return this;
  }

   /**
   * dogma_attributes array
   * @return dogmaAttributes
  **/
  @ApiModelProperty(example = "null", required = true, value = "dogma_attributes array")
  public List<GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute> getDogmaAttributes() {
    return dogmaAttributes;
  }

  public void setDogmaAttributes(List<GetDogmaDynamicItemsTypeIdItemIdDogmaAttribute> dogmaAttributes) {
    this.dogmaAttributes = dogmaAttributes;
  }

  public GetDogmaDynamicItemsTypeIdItemIdOk dogmaEffects(List<GetDogmaDynamicItemsTypeIdItemIdDogmaEffect> dogmaEffects) {
    this.dogmaEffects = dogmaEffects;
    return this;
  }

  public GetDogmaDynamicItemsTypeIdItemIdOk addDogmaEffectsItem(GetDogmaDynamicItemsTypeIdItemIdDogmaEffect dogmaEffectsItem) {
    this.dogmaEffects.add(dogmaEffectsItem);
    return this;
  }

   /**
   * dogma_effects array
   * @return dogmaEffects
  **/
  @ApiModelProperty(example = "null", required = true, value = "dogma_effects array")
  public List<GetDogmaDynamicItemsTypeIdItemIdDogmaEffect> getDogmaEffects() {
    return dogmaEffects;
  }

  public void setDogmaEffects(List<GetDogmaDynamicItemsTypeIdItemIdDogmaEffect> dogmaEffects) {
    this.dogmaEffects = dogmaEffects;
  }

  public GetDogmaDynamicItemsTypeIdItemIdOk mutatorTypeId(Integer mutatorTypeId) {
    this.mutatorTypeId = mutatorTypeId;
    return this;
  }

   /**
   * The type ID of the mutator used to generate the dynamic item.
   * @return mutatorTypeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type ID of the mutator used to generate the dynamic item.")
  public Integer getMutatorTypeId() {
    return mutatorTypeId;
  }

  public void setMutatorTypeId(Integer mutatorTypeId) {
    this.mutatorTypeId = mutatorTypeId;
  }

  public GetDogmaDynamicItemsTypeIdItemIdOk sourceTypeId(Integer sourceTypeId) {
    this.sourceTypeId = sourceTypeId;
    return this;
  }

   /**
   * The type ID of the source item the mutator was applied to create the dynamic item.
   * @return sourceTypeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The type ID of the source item the mutator was applied to create the dynamic item.")
  public Integer getSourceTypeId() {
    return sourceTypeId;
  }

  public void setSourceTypeId(Integer sourceTypeId) {
    this.sourceTypeId = sourceTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetDogmaDynamicItemsTypeIdItemIdOk getDogmaDynamicItemsTypeIdItemIdOk = (GetDogmaDynamicItemsTypeIdItemIdOk) o;
    return Objects.equals(this.createdBy, getDogmaDynamicItemsTypeIdItemIdOk.createdBy) &&
        Objects.equals(this.dogmaAttributes, getDogmaDynamicItemsTypeIdItemIdOk.dogmaAttributes) &&
        Objects.equals(this.dogmaEffects, getDogmaDynamicItemsTypeIdItemIdOk.dogmaEffects) &&
        Objects.equals(this.mutatorTypeId, getDogmaDynamicItemsTypeIdItemIdOk.mutatorTypeId) &&
        Objects.equals(this.sourceTypeId, getDogmaDynamicItemsTypeIdItemIdOk.sourceTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, dogmaAttributes, dogmaEffects, mutatorTypeId, sourceTypeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetDogmaDynamicItemsTypeIdItemIdOk {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dogmaAttributes: ").append(toIndentedString(dogmaAttributes)).append("\n");
    sb.append("    dogmaEffects: ").append(toIndentedString(dogmaEffects)).append("\n");
    sb.append("    mutatorTypeId: ").append(toIndentedString(mutatorTypeId)).append("\n");
    sb.append("    sourceTypeId: ").append(toIndentedString(sourceTypeId)).append("\n");
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

