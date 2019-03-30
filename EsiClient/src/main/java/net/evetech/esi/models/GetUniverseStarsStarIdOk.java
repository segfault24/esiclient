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

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-30T13:35:06.976-04:00")
public class GetUniverseStarsStarIdOk {
  @SerializedName("age")
  private Long age = null;

  @SerializedName("luminosity")
  private Float luminosity = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("radius")
  private Long radius = null;

  @SerializedName("solar_system_id")
  private Integer solarSystemId = null;

  /**
   * spectral_class string
   */
  public enum SpectralClassEnum {
    @SerializedName("K2 V")
    K2_V("K2 V"),
    
    @SerializedName("K4 V")
    K4_V("K4 V"),
    
    @SerializedName("G2 V")
    G2_V("G2 V"),
    
    @SerializedName("G8 V")
    G8_V("G8 V"),
    
    @SerializedName("M7 V")
    M7_V("M7 V"),
    
    @SerializedName("K7 V")
    K7_V("K7 V"),
    
    @SerializedName("M2 V")
    M2_V("M2 V"),
    
    @SerializedName("K5 V")
    K5_V("K5 V"),
    
    @SerializedName("M3 V")
    M3_V("M3 V"),
    
    @SerializedName("G0 V")
    G0_V("G0 V"),
    
    @SerializedName("G7 V")
    G7_V("G7 V"),
    
    @SerializedName("G3 V")
    G3_V("G3 V"),
    
    @SerializedName("F9 V")
    F9_V("F9 V"),
    
    @SerializedName("G5 V")
    G5_V("G5 V"),
    
    @SerializedName("F6 V")
    F6_V("F6 V"),
    
    @SerializedName("K8 V")
    K8_V("K8 V"),
    
    @SerializedName("K9 V")
    K9_V("K9 V"),
    
    @SerializedName("K6 V")
    K6_V("K6 V"),
    
    @SerializedName("G9 V")
    G9_V("G9 V"),
    
    @SerializedName("G6 V")
    G6_V("G6 V"),
    
    @SerializedName("G4 VI")
    G4_VI("G4 VI"),
    
    @SerializedName("G4 V")
    G4_V("G4 V"),
    
    @SerializedName("F8 V")
    F8_V("F8 V"),
    
    @SerializedName("F2 V")
    F2_V("F2 V"),
    
    @SerializedName("F1 V")
    F1_V("F1 V"),
    
    @SerializedName("K3 V")
    K3_V("K3 V"),
    
    @SerializedName("F0 VI")
    F0_VI("F0 VI"),
    
    @SerializedName("G1 VI")
    G1_VI("G1 VI"),
    
    @SerializedName("G0 VI")
    G0_VI("G0 VI"),
    
    @SerializedName("K1 V")
    K1_V("K1 V"),
    
    @SerializedName("M4 V")
    M4_V("M4 V"),
    
    @SerializedName("M1 V")
    M1_V("M1 V"),
    
    @SerializedName("M6 V")
    M6_V("M6 V"),
    
    @SerializedName("M0 V")
    M0_V("M0 V"),
    
    @SerializedName("K2 IV")
    K2_IV("K2 IV"),
    
    @SerializedName("G2 VI")
    G2_VI("G2 VI"),
    
    @SerializedName("K0 V")
    K0_V("K0 V"),
    
    @SerializedName("K5 IV")
    K5_IV("K5 IV"),
    
    @SerializedName("F5 VI")
    F5_VI("F5 VI"),
    
    @SerializedName("G6 VI")
    G6_VI("G6 VI"),
    
    @SerializedName("F6 VI")
    F6_VI("F6 VI"),
    
    @SerializedName("F2 IV")
    F2_IV("F2 IV"),
    
    @SerializedName("G3 VI")
    G3_VI("G3 VI"),
    
    @SerializedName("M8 V")
    M8_V("M8 V"),
    
    @SerializedName("F1 VI")
    F1_VI("F1 VI"),
    
    @SerializedName("K1 IV")
    K1_IV("K1 IV"),
    
    @SerializedName("F7 V")
    F7_V("F7 V"),
    
    @SerializedName("G5 VI")
    G5_VI("G5 VI"),
    
    @SerializedName("M5 V")
    M5_V("M5 V"),
    
    @SerializedName("G7 VI")
    G7_VI("G7 VI"),
    
    @SerializedName("F5 V")
    F5_V("F5 V"),
    
    @SerializedName("F4 VI")
    F4_VI("F4 VI"),
    
    @SerializedName("F8 VI")
    F8_VI("F8 VI"),
    
    @SerializedName("K3 IV")
    K3_IV("K3 IV"),
    
    @SerializedName("F4 IV")
    F4_IV("F4 IV"),
    
    @SerializedName("F0 V")
    F0_V("F0 V"),
    
    @SerializedName("G7 IV")
    G7_IV("G7 IV"),
    
    @SerializedName("G8 VI")
    G8_VI("G8 VI"),
    
    @SerializedName("F2 VI")
    F2_VI("F2 VI"),
    
    @SerializedName("F4 V")
    F4_V("F4 V"),
    
    @SerializedName("F7 VI")
    F7_VI("F7 VI"),
    
    @SerializedName("F3 V")
    F3_V("F3 V"),
    
    @SerializedName("G1 V")
    G1_V("G1 V"),
    
    @SerializedName("G9 VI")
    G9_VI("G9 VI"),
    
    @SerializedName("F3 IV")
    F3_IV("F3 IV"),
    
    @SerializedName("F9 VI")
    F9_VI("F9 VI"),
    
    @SerializedName("M9 V")
    M9_V("M9 V"),
    
    @SerializedName("K0 IV")
    K0_IV("K0 IV"),
    
    @SerializedName("F1 IV")
    F1_IV("F1 IV"),
    
    @SerializedName("G4 IV")
    G4_IV("G4 IV"),
    
    @SerializedName("F3 VI")
    F3_VI("F3 VI"),
    
    @SerializedName("K4 IV")
    K4_IV("K4 IV"),
    
    @SerializedName("G5 IV")
    G5_IV("G5 IV"),
    
    @SerializedName("G3 IV")
    G3_IV("G3 IV"),
    
    @SerializedName("G1 IV")
    G1_IV("G1 IV"),
    
    @SerializedName("K7 IV")
    K7_IV("K7 IV"),
    
    @SerializedName("G0 IV")
    G0_IV("G0 IV"),
    
    @SerializedName("K6 IV")
    K6_IV("K6 IV"),
    
    @SerializedName("K9 IV")
    K9_IV("K9 IV"),
    
    @SerializedName("G2 IV")
    G2_IV("G2 IV"),
    
    @SerializedName("F9 IV")
    F9_IV("F9 IV"),
    
    @SerializedName("F0 IV")
    F0_IV("F0 IV"),
    
    @SerializedName("K8 IV")
    K8_IV("K8 IV"),
    
    @SerializedName("G8 IV")
    G8_IV("G8 IV"),
    
    @SerializedName("F6 IV")
    F6_IV("F6 IV"),
    
    @SerializedName("F5 IV")
    F5_IV("F5 IV"),
    
    @SerializedName("A0")
    A0("A0"),
    
    @SerializedName("A0IV")
    A0IV("A0IV"),
    
    @SerializedName("A0IV2")
    A0IV2("A0IV2");

    private String value;

    SpectralClassEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("spectral_class")
  private SpectralClassEnum spectralClass = null;

  @SerializedName("temperature")
  private Integer temperature = null;

  @SerializedName("type_id")
  private Integer typeId = null;

  public GetUniverseStarsStarIdOk age(Long age) {
    this.age = age;
    return this;
  }

   /**
   * Age of star in years
   * @return age
  **/
  @ApiModelProperty(example = "null", required = true, value = "Age of star in years")
  public Long getAge() {
    return age;
  }

  public void setAge(Long age) {
    this.age = age;
  }

  public GetUniverseStarsStarIdOk luminosity(Float luminosity) {
    this.luminosity = luminosity;
    return this;
  }

   /**
   * luminosity number
   * @return luminosity
  **/
  @ApiModelProperty(example = "null", required = true, value = "luminosity number")
  public Float getLuminosity() {
    return luminosity;
  }

  public void setLuminosity(Float luminosity) {
    this.luminosity = luminosity;
  }

  public GetUniverseStarsStarIdOk name(String name) {
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

  public GetUniverseStarsStarIdOk radius(Long radius) {
    this.radius = radius;
    return this;
  }

   /**
   * radius integer
   * @return radius
  **/
  @ApiModelProperty(example = "null", required = true, value = "radius integer")
  public Long getRadius() {
    return radius;
  }

  public void setRadius(Long radius) {
    this.radius = radius;
  }

  public GetUniverseStarsStarIdOk solarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
    return this;
  }

   /**
   * solar_system_id integer
   * @return solarSystemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "solar_system_id integer")
  public Integer getSolarSystemId() {
    return solarSystemId;
  }

  public void setSolarSystemId(Integer solarSystemId) {
    this.solarSystemId = solarSystemId;
  }

  public GetUniverseStarsStarIdOk spectralClass(SpectralClassEnum spectralClass) {
    this.spectralClass = spectralClass;
    return this;
  }

   /**
   * spectral_class string
   * @return spectralClass
  **/
  @ApiModelProperty(example = "null", required = true, value = "spectral_class string")
  public SpectralClassEnum getSpectralClass() {
    return spectralClass;
  }

  public void setSpectralClass(SpectralClassEnum spectralClass) {
    this.spectralClass = spectralClass;
  }

  public GetUniverseStarsStarIdOk temperature(Integer temperature) {
    this.temperature = temperature;
    return this;
  }

   /**
   * temperature integer
   * @return temperature
  **/
  @ApiModelProperty(example = "null", required = true, value = "temperature integer")
  public Integer getTemperature() {
    return temperature;
  }

  public void setTemperature(Integer temperature) {
    this.temperature = temperature;
  }

  public GetUniverseStarsStarIdOk typeId(Integer typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * type_id integer
   * @return typeId
  **/
  @ApiModelProperty(example = "null", required = true, value = "type_id integer")
  public Integer getTypeId() {
    return typeId;
  }

  public void setTypeId(Integer typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUniverseStarsStarIdOk getUniverseStarsStarIdOk = (GetUniverseStarsStarIdOk) o;
    return Objects.equals(this.age, getUniverseStarsStarIdOk.age) &&
        Objects.equals(this.luminosity, getUniverseStarsStarIdOk.luminosity) &&
        Objects.equals(this.name, getUniverseStarsStarIdOk.name) &&
        Objects.equals(this.radius, getUniverseStarsStarIdOk.radius) &&
        Objects.equals(this.solarSystemId, getUniverseStarsStarIdOk.solarSystemId) &&
        Objects.equals(this.spectralClass, getUniverseStarsStarIdOk.spectralClass) &&
        Objects.equals(this.temperature, getUniverseStarsStarIdOk.temperature) &&
        Objects.equals(this.typeId, getUniverseStarsStarIdOk.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, luminosity, name, radius, solarSystemId, spectralClass, temperature, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUniverseStarsStarIdOk {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    luminosity: ").append(toIndentedString(luminosity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
    sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
    sb.append("    spectralClass: ").append(toIndentedString(spectralClass)).append("\n");
    sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

