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

/**
 * Coordinates of the structure in Cartesian space relative to the Sun, in metres. 
 */
@ApiModel(description = "Coordinates of the structure in Cartesian space relative to the Sun, in metres. ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-24T17:41:45.557-05:00")
public class GetUniverseStructuresStructureIdPosition {
  @SerializedName("x")
  private Double x = null;

  @SerializedName("y")
  private Double y = null;

  @SerializedName("z")
  private Double z = null;

  public GetUniverseStructuresStructureIdPosition x(Double x) {
    this.x = x;
    return this;
  }

   /**
   * x number
   * @return x
  **/
  @ApiModelProperty(example = "null", required = true, value = "x number")
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public GetUniverseStructuresStructureIdPosition y(Double y) {
    this.y = y;
    return this;
  }

   /**
   * y number
   * @return y
  **/
  @ApiModelProperty(example = "null", required = true, value = "y number")
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public GetUniverseStructuresStructureIdPosition z(Double z) {
    this.z = z;
    return this;
  }

   /**
   * z number
   * @return z
  **/
  @ApiModelProperty(example = "null", required = true, value = "z number")
  public Double getZ() {
    return z;
  }

  public void setZ(Double z) {
    this.z = z;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseStructuresStructureIdPosition getUniverseStructuresStructureIdPosition = (GetUniverseStructuresStructureIdPosition) o;
    return Objects.equals(this.x, getUniverseStructuresStructureIdPosition.x) &&
        Objects.equals(this.y, getUniverseStructuresStructureIdPosition.y) &&
        Objects.equals(this.z, getUniverseStructuresStructureIdPosition.z);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, z);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseStructuresStructureIdPosition {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    z: ").append(toIndentedString(z)).append("\n");
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

