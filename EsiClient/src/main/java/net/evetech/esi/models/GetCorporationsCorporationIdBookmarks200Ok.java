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
import net.evetech.esi.models.GetCorporationsCorporationIdBookmarksCoordinates;
import net.evetech.esi.models.GetCorporationsCorporationIdBookmarksItem;
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:37:36.420-05:00")
public class GetCorporationsCorporationIdBookmarks200Ok {
  @SerializedName("bookmark_id")
  private Integer bookmarkId = null;

  @SerializedName("coordinates")
  private GetCorporationsCorporationIdBookmarksCoordinates coordinates = null;

  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("creator_id")
  private Integer creatorId = null;

  @SerializedName("folder_id")
  private Integer folderId = null;

  @SerializedName("item")
  private GetCorporationsCorporationIdBookmarksItem item = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("location_id")
  private Integer locationId = null;

  @SerializedName("notes")
  private String notes = null;

  public GetCorporationsCorporationIdBookmarks200Ok bookmarkId(Integer bookmarkId) {
    this.bookmarkId = bookmarkId;
    return this;
  }

   /**
   * bookmark_id integer
   * @return bookmarkId
  **/
  @ApiModelProperty(example = "null", required = true, value = "bookmark_id integer")
  public Integer getBookmarkId() {
    return bookmarkId;
  }

  public void setBookmarkId(Integer bookmarkId) {
    this.bookmarkId = bookmarkId;
  }

  public GetCorporationsCorporationIdBookmarks200Ok coordinates(GetCorporationsCorporationIdBookmarksCoordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Get coordinates
   * @return coordinates
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetCorporationsCorporationIdBookmarksCoordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(GetCorporationsCorporationIdBookmarksCoordinates coordinates) {
    this.coordinates = coordinates;
  }

  public GetCorporationsCorporationIdBookmarks200Ok created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * created string
   * @return created
  **/
  @ApiModelProperty(example = "null", required = true, value = "created string")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public GetCorporationsCorporationIdBookmarks200Ok creatorId(Integer creatorId) {
    this.creatorId = creatorId;
    return this;
  }

   /**
   * creator_id integer
   * @return creatorId
  **/
  @ApiModelProperty(example = "null", required = true, value = "creator_id integer")
  public Integer getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(Integer creatorId) {
    this.creatorId = creatorId;
  }

  public GetCorporationsCorporationIdBookmarks200Ok folderId(Integer folderId) {
    this.folderId = folderId;
    return this;
  }

   /**
   * folder_id integer
   * @return folderId
  **/
  @ApiModelProperty(example = "null", value = "folder_id integer")
  public Integer getFolderId() {
    return folderId;
  }

  public void setFolderId(Integer folderId) {
    this.folderId = folderId;
  }

  public GetCorporationsCorporationIdBookmarks200Ok item(GetCorporationsCorporationIdBookmarksItem item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(example = "null", value = "")
  public GetCorporationsCorporationIdBookmarksItem getItem() {
    return item;
  }

  public void setItem(GetCorporationsCorporationIdBookmarksItem item) {
    this.item = item;
  }

  public GetCorporationsCorporationIdBookmarks200Ok label(String label) {
    this.label = label;
    return this;
  }

   /**
   * label string
   * @return label
  **/
  @ApiModelProperty(example = "null", required = true, value = "label string")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public GetCorporationsCorporationIdBookmarks200Ok locationId(Integer locationId) {
    this.locationId = locationId;
    return this;
  }

   /**
   * location_id integer
   * @return locationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "location_id integer")
  public Integer getLocationId() {
    return locationId;
  }

  public void setLocationId(Integer locationId) {
    this.locationId = locationId;
  }

  public GetCorporationsCorporationIdBookmarks200Ok notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * notes string
   * @return notes
  **/
  @ApiModelProperty(example = "null", required = true, value = "notes string")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdBookmarks200Ok getCorporationsCorporationIdBookmarks200Ok = (GetCorporationsCorporationIdBookmarks200Ok) o;
    return Objects.equals(this.bookmarkId, getCorporationsCorporationIdBookmarks200Ok.bookmarkId) &&
        Objects.equals(this.coordinates, getCorporationsCorporationIdBookmarks200Ok.coordinates) &&
        Objects.equals(this.created, getCorporationsCorporationIdBookmarks200Ok.created) &&
        Objects.equals(this.creatorId, getCorporationsCorporationIdBookmarks200Ok.creatorId) &&
        Objects.equals(this.folderId, getCorporationsCorporationIdBookmarks200Ok.folderId) &&
        Objects.equals(this.item, getCorporationsCorporationIdBookmarks200Ok.item) &&
        Objects.equals(this.label, getCorporationsCorporationIdBookmarks200Ok.label) &&
        Objects.equals(this.locationId, getCorporationsCorporationIdBookmarks200Ok.locationId) &&
        Objects.equals(this.notes, getCorporationsCorporationIdBookmarks200Ok.notes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmarkId, coordinates, created, creatorId, folderId, item, label, locationId, notes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdBookmarks200Ok {\n");
    
    sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    folderId: ").append(toIndentedString(folderId)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
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

