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
import java.util.ArrayList;
import java.util.List;

/**
 * route object
 */
@ApiModel(description = "route object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:37:36.420-05:00")
public class GetCharactersCharacterIdPlanetsPlanetIdRoute {
  @SerializedName("content_type_id")
  private Integer contentTypeId = null;

  @SerializedName("destination_pin_id")
  private Long destinationPinId = null;

  @SerializedName("quantity")
  private Float quantity = null;

  @SerializedName("route_id")
  private Long routeId = null;

  @SerializedName("source_pin_id")
  private Long sourcePinId = null;

  @SerializedName("waypoints")
  private List<Long> waypoints = new ArrayList<Long>();

  public GetCharactersCharacterIdPlanetsPlanetIdRoute contentTypeId(Integer contentTypeId) {
    this.contentTypeId = contentTypeId;
    return this;
  }

   /**
   * content_type_id integer
   * @return contentTypeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "content_type_id integer")
  public Integer getContentTypeId() {
    return contentTypeId;
  }

  public void setContentTypeId(Integer contentTypeId) {
    this.contentTypeId = contentTypeId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdRoute destinationPinId(Long destinationPinId) {
    this.destinationPinId = destinationPinId;
    return this;
  }

   /**
   * destination_pin_id integer
   * @return destinationPinId
  **/
  @ApiModelProperty(example = "null", required = true, value = "destination_pin_id integer")
  public Long getDestinationPinId() {
    return destinationPinId;
  }

  public void setDestinationPinId(Long destinationPinId) {
    this.destinationPinId = destinationPinId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdRoute quantity(Float quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * quantity number
   * @return quantity
  **/
  @ApiModelProperty(example = "null", required = true, value = "quantity number")
  public Float getQuantity() {
    return quantity;
  }

  public void setQuantity(Float quantity) {
    this.quantity = quantity;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdRoute routeId(Long routeId) {
    this.routeId = routeId;
    return this;
  }

   /**
   * route_id integer
   * @return routeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "route_id integer")
  public Long getRouteId() {
    return routeId;
  }

  public void setRouteId(Long routeId) {
    this.routeId = routeId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdRoute sourcePinId(Long sourcePinId) {
    this.sourcePinId = sourcePinId;
    return this;
  }

   /**
   * source_pin_id integer
   * @return sourcePinId
  **/
  @ApiModelProperty(example = "null", required = true, value = "source_pin_id integer")
  public Long getSourcePinId() {
    return sourcePinId;
  }

  public void setSourcePinId(Long sourcePinId) {
    this.sourcePinId = sourcePinId;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdRoute waypoints(List<Long> waypoints) {
    this.waypoints = waypoints;
    return this;
  }

  public GetCharactersCharacterIdPlanetsPlanetIdRoute addWaypointsItem(Long waypointsItem) {
    this.waypoints.add(waypointsItem);
    return this;
  }

   /**
   * list of pin ID waypoints
   * @return waypoints
  **/
  @ApiModelProperty(example = "null", value = "list of pin ID waypoints")
  public List<Long> getWaypoints() {
    return waypoints;
  }

  public void setWaypoints(List<Long> waypoints) {
    this.waypoints = waypoints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdPlanetsPlanetIdRoute getCharactersCharacterIdPlanetsPlanetIdRoute = (GetCharactersCharacterIdPlanetsPlanetIdRoute) o;
    return Objects.equals(this.contentTypeId, getCharactersCharacterIdPlanetsPlanetIdRoute.contentTypeId) &&
        Objects.equals(this.destinationPinId, getCharactersCharacterIdPlanetsPlanetIdRoute.destinationPinId) &&
        Objects.equals(this.quantity, getCharactersCharacterIdPlanetsPlanetIdRoute.quantity) &&
        Objects.equals(this.routeId, getCharactersCharacterIdPlanetsPlanetIdRoute.routeId) &&
        Objects.equals(this.sourcePinId, getCharactersCharacterIdPlanetsPlanetIdRoute.sourcePinId) &&
        Objects.equals(this.waypoints, getCharactersCharacterIdPlanetsPlanetIdRoute.waypoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentTypeId, destinationPinId, quantity, routeId, sourcePinId, waypoints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdPlanetsPlanetIdRoute {\n");
    
    sb.append("    contentTypeId: ").append(toIndentedString(contentTypeId)).append("\n");
    sb.append("    destinationPinId: ").append(toIndentedString(destinationPinId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    sourcePinId: ").append(toIndentedString(sourcePinId)).append("\n");
    sb.append("    waypoints: ").append(toIndentedString(waypoints)).append("\n");
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

