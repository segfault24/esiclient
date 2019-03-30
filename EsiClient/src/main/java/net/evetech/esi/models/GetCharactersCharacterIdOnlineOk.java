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
import org.joda.time.DateTime;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-30T13:35:06.976-04:00")
public class GetCharactersCharacterIdOnlineOk {
  @SerializedName("last_login")
  private DateTime lastLogin = null;

  @SerializedName("last_logout")
  private DateTime lastLogout = null;

  @SerializedName("logins")
  private Integer logins = null;

  @SerializedName("online")
  private Boolean online = null;

  public GetCharactersCharacterIdOnlineOk lastLogin(DateTime lastLogin) {
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Timestamp of the last login
   * @return lastLogin
  **/
  @ApiModelProperty(example = "null", value = "Timestamp of the last login")
  public DateTime getLastLogin() {
    return lastLogin;
  }

  public void setLastLogin(DateTime lastLogin) {
    this.lastLogin = lastLogin;
  }

  public GetCharactersCharacterIdOnlineOk lastLogout(DateTime lastLogout) {
    this.lastLogout = lastLogout;
    return this;
  }

   /**
   * Timestamp of the last logout
   * @return lastLogout
  **/
  @ApiModelProperty(example = "null", value = "Timestamp of the last logout")
  public DateTime getLastLogout() {
    return lastLogout;
  }

  public void setLastLogout(DateTime lastLogout) {
    this.lastLogout = lastLogout;
  }

  public GetCharactersCharacterIdOnlineOk logins(Integer logins) {
    this.logins = logins;
    return this;
  }

   /**
   * Total number of times the character has logged in
   * @return logins
  **/
  @ApiModelProperty(example = "null", value = "Total number of times the character has logged in")
  public Integer getLogins() {
    return logins;
  }

  public void setLogins(Integer logins) {
    this.logins = logins;
  }

  public GetCharactersCharacterIdOnlineOk online(Boolean online) {
    this.online = online;
    return this;
  }

   /**
   * If the character is online
   * @return online
  **/
  @ApiModelProperty(example = "null", required = true, value = "If the character is online")
  public Boolean getOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCharactersCharacterIdOnlineOk getCharactersCharacterIdOnlineOk = (GetCharactersCharacterIdOnlineOk) o;
    return Objects.equals(this.lastLogin, getCharactersCharacterIdOnlineOk.lastLogin) &&
        Objects.equals(this.lastLogout, getCharactersCharacterIdOnlineOk.lastLogout) &&
        Objects.equals(this.logins, getCharactersCharacterIdOnlineOk.logins) &&
        Objects.equals(this.online, getCharactersCharacterIdOnlineOk.online);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastLogin, lastLogout, logins, online);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCharactersCharacterIdOnlineOk {\n");
    
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    lastLogout: ").append(toIndentedString(lastLogout)).append("\n");
    sb.append("    logins: ").append(toIndentedString(logins)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
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

