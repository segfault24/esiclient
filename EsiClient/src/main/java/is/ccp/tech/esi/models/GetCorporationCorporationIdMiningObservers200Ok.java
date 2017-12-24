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
import org.joda.time.LocalDate;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class GetCorporationCorporationIdMiningObservers200Ok {
  @SerializedName("last_updated")
  private LocalDate lastUpdated = null;

  @SerializedName("observer_id")
  private Long observerId = null;

  /**
   * The category of the observing entity
   */
  public enum ObserverTypeEnum {
    @SerializedName("structure")
    STRUCTURE("structure");

    private String value;

    ObserverTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("observer_type")
  private ObserverTypeEnum observerType = null;

  public GetCorporationCorporationIdMiningObservers200Ok lastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

   /**
   * last_updated string
   * @return lastUpdated
  **/
  @ApiModelProperty(example = "null", required = true, value = "last_updated string")
  public LocalDate getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(LocalDate lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public GetCorporationCorporationIdMiningObservers200Ok observerId(Long observerId) {
    this.observerId = observerId;
    return this;
  }

   /**
   * The entity that was observing the asteroid field when it was mined. 
   * @return observerId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The entity that was observing the asteroid field when it was mined. ")
  public Long getObserverId() {
    return observerId;
  }

  public void setObserverId(Long observerId) {
    this.observerId = observerId;
  }

  public GetCorporationCorporationIdMiningObservers200Ok observerType(ObserverTypeEnum observerType) {
    this.observerType = observerType;
    return this;
  }

   /**
   * The category of the observing entity
   * @return observerType
  **/
  @ApiModelProperty(example = "null", required = true, value = "The category of the observing entity")
  public ObserverTypeEnum getObserverType() {
    return observerType;
  }

  public void setObserverType(ObserverTypeEnum observerType) {
    this.observerType = observerType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationCorporationIdMiningObservers200Ok getCorporationCorporationIdMiningObservers200Ok = (GetCorporationCorporationIdMiningObservers200Ok) o;
    return Objects.equals(this.lastUpdated, getCorporationCorporationIdMiningObservers200Ok.lastUpdated) &&
        Objects.equals(this.observerId, getCorporationCorporationIdMiningObservers200Ok.observerId) &&
        Objects.equals(this.observerType, getCorporationCorporationIdMiningObservers200Ok.observerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdated, observerId, observerType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationCorporationIdMiningObservers200Ok {\n");
    
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    observerId: ").append(toIndentedString(observerId)).append("\n");
    sb.append("    observerType: ").append(toIndentedString(observerType)).append("\n");
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
