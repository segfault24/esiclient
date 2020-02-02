/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 1.2.9
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
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-01T20:01:07.682-05:00")
public class GetOpportunitiesGroupsGroupIdOk {
  @SerializedName("connected_groups")
  private List<Integer> connectedGroups = new ArrayList<Integer>();

  @SerializedName("description")
  private String description = null;

  @SerializedName("group_id")
  private Integer groupId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("notification")
  private String notification = null;

  @SerializedName("required_tasks")
  private List<Integer> requiredTasks = new ArrayList<Integer>();

  public GetOpportunitiesGroupsGroupIdOk connectedGroups(List<Integer> connectedGroups) {
    this.connectedGroups = connectedGroups;
    return this;
  }

  public GetOpportunitiesGroupsGroupIdOk addConnectedGroupsItem(Integer connectedGroupsItem) {
    this.connectedGroups.add(connectedGroupsItem);
    return this;
  }

   /**
   * The groups that are connected to this group on the opportunities map
   * @return connectedGroups
  **/
  @ApiModelProperty(example = "null", required = true, value = "The groups that are connected to this group on the opportunities map")
  public List<Integer> getConnectedGroups() {
    return connectedGroups;
  }

  public void setConnectedGroups(List<Integer> connectedGroups) {
    this.connectedGroups = connectedGroups;
  }

  public GetOpportunitiesGroupsGroupIdOk description(String description) {
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

  public GetOpportunitiesGroupsGroupIdOk groupId(Integer groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * group_id integer
   * @return groupId
  **/
  @ApiModelProperty(example = "null", required = true, value = "group_id integer")
  public Integer getGroupId() {
    return groupId;
  }

  public void setGroupId(Integer groupId) {
    this.groupId = groupId;
  }

  public GetOpportunitiesGroupsGroupIdOk name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name string
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "name string")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetOpportunitiesGroupsGroupIdOk notification(String notification) {
    this.notification = notification;
    return this;
  }

   /**
   * notification string
   * @return notification
  **/
  @ApiModelProperty(example = "null", required = true, value = "notification string")
  public String getNotification() {
    return notification;
  }

  public void setNotification(String notification) {
    this.notification = notification;
  }

  public GetOpportunitiesGroupsGroupIdOk requiredTasks(List<Integer> requiredTasks) {
    this.requiredTasks = requiredTasks;
    return this;
  }

  public GetOpportunitiesGroupsGroupIdOk addRequiredTasksItem(Integer requiredTasksItem) {
    this.requiredTasks.add(requiredTasksItem);
    return this;
  }

   /**
   * Tasks need to complete for this group
   * @return requiredTasks
  **/
  @ApiModelProperty(example = "null", required = true, value = "Tasks need to complete for this group")
  public List<Integer> getRequiredTasks() {
    return requiredTasks;
  }

  public void setRequiredTasks(List<Integer> requiredTasks) {
    this.requiredTasks = requiredTasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOpportunitiesGroupsGroupIdOk getOpportunitiesGroupsGroupIdOk = (GetOpportunitiesGroupsGroupIdOk) o;
    return Objects.equals(this.connectedGroups, getOpportunitiesGroupsGroupIdOk.connectedGroups) &&
        Objects.equals(this.description, getOpportunitiesGroupsGroupIdOk.description) &&
        Objects.equals(this.groupId, getOpportunitiesGroupsGroupIdOk.groupId) &&
        Objects.equals(this.name, getOpportunitiesGroupsGroupIdOk.name) &&
        Objects.equals(this.notification, getOpportunitiesGroupsGroupIdOk.notification) &&
        Objects.equals(this.requiredTasks, getOpportunitiesGroupsGroupIdOk.requiredTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectedGroups, description, groupId, name, notification, requiredTasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOpportunitiesGroupsGroupIdOk {\n");
    
    sb.append("    connectedGroups: ").append(toIndentedString(connectedGroups)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    requiredTasks: ").append(toIndentedString(requiredTasks)).append("\n");
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

