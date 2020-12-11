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
import org.joda.time.DateTime;

/**
 * event
 */
@ApiModel(description = "event")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-11T14:37:36.420-05:00")
public class GetCharactersCharacterIdCalendar200Ok {
  @SerializedName("event_date")
  private DateTime eventDate = null;

  @SerializedName("event_id")
  private Integer eventId = null;

  /**
   * event_response string
   */
  public enum EventResponseEnum {
    @SerializedName("declined")
    DECLINED("declined"),
    
    @SerializedName("not_responded")
    NOT_RESPONDED("not_responded"),
    
    @SerializedName("accepted")
    ACCEPTED("accepted"),
    
    @SerializedName("tentative")
    TENTATIVE("tentative");

    private String value;

    EventResponseEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("event_response")
  private EventResponseEnum eventResponse = null;

  @SerializedName("importance")
  private Integer importance = null;

  @SerializedName("title")
  private String title = null;

  public GetCharactersCharacterIdCalendar200Ok eventDate(DateTime eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * event_date string
   * @return eventDate
  **/
  @ApiModelProperty(example = "null", value = "event_date string")
  public DateTime getEventDate() {
    return eventDate;
  }

  public void setEventDate(DateTime eventDate) {
    this.eventDate = eventDate;
  }

  public GetCharactersCharacterIdCalendar200Ok eventId(Integer eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * event_id integer
   * @return eventId
  **/
  @ApiModelProperty(example = "null", value = "event_id integer")
  public Integer getEventId() {
    return eventId;
  }

  public void setEventId(Integer eventId) {
    this.eventId = eventId;
  }

  public GetCharactersCharacterIdCalendar200Ok eventResponse(EventResponseEnum eventResponse) {
    this.eventResponse = eventResponse;
    return this;
  }

   /**
   * event_response string
   * @return eventResponse
  **/
  @ApiModelProperty(example = "null", value = "event_response string")
  public EventResponseEnum getEventResponse() {
    return eventResponse;
  }

  public void setEventResponse(EventResponseEnum eventResponse) {
    this.eventResponse = eventResponse;
  }

  public GetCharactersCharacterIdCalendar200Ok importance(Integer importance) {
    this.importance = importance;
    return this;
  }

   /**
   * importance integer
   * @return importance
  **/
  @ApiModelProperty(example = "null", value = "importance integer")
  public Integer getImportance() {
    return importance;
  }

  public void setImportance(Integer importance) {
    this.importance = importance;
  }

  public GetCharactersCharacterIdCalendar200Ok title(String title) {
    this.title = title;
    return this;
  }

   /**
   * title string
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "title string")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdCalendar200Ok getCharactersCharacterIdCalendar200Ok = (GetCharactersCharacterIdCalendar200Ok) o;
    return Objects.equals(this.eventDate, getCharactersCharacterIdCalendar200Ok.eventDate) &&
        Objects.equals(this.eventId, getCharactersCharacterIdCalendar200Ok.eventId) &&
        Objects.equals(this.eventResponse, getCharactersCharacterIdCalendar200Ok.eventResponse) &&
        Objects.equals(this.importance, getCharactersCharacterIdCalendar200Ok.importance) &&
        Objects.equals(this.title, getCharactersCharacterIdCalendar200Ok.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDate, eventId, eventResponse, importance, title);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdCalendar200Ok {\n");
    
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventResponse: ").append(toIndentedString(eventResponse)).append("\n");
    sb.append("    importance: ").append(toIndentedString(importance)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

