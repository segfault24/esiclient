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
import net.evetech.esi.models.GetCorporationsCorporationIdDivisionsHangarHangar;
import net.evetech.esi.models.GetCorporationsCorporationIdDivisionsWalletWallet;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-30T13:35:06.976-04:00")
public class GetCorporationsCorporationIdDivisionsOk {
  @SerializedName("hangar")
  private List<GetCorporationsCorporationIdDivisionsHangarHangar> hangar = new ArrayList<GetCorporationsCorporationIdDivisionsHangarHangar>();

  @SerializedName("wallet")
  private List<GetCorporationsCorporationIdDivisionsWalletWallet> wallet = new ArrayList<GetCorporationsCorporationIdDivisionsWalletWallet>();

  public GetCorporationsCorporationIdDivisionsOk hangar(List<GetCorporationsCorporationIdDivisionsHangarHangar> hangar) {
    this.hangar = hangar;
    return this;
  }

  public GetCorporationsCorporationIdDivisionsOk addHangarItem(GetCorporationsCorporationIdDivisionsHangarHangar hangarItem) {
    this.hangar.add(hangarItem);
    return this;
  }

   /**
   * hangar array
   * @return hangar
  **/
  @ApiModelProperty(example = "null", value = "hangar array")
  public List<GetCorporationsCorporationIdDivisionsHangarHangar> getHangar() {
    return hangar;
  }

  public void setHangar(List<GetCorporationsCorporationIdDivisionsHangarHangar> hangar) {
    this.hangar = hangar;
  }

  public GetCorporationsCorporationIdDivisionsOk wallet(List<GetCorporationsCorporationIdDivisionsWalletWallet> wallet) {
    this.wallet = wallet;
    return this;
  }

  public GetCorporationsCorporationIdDivisionsOk addWalletItem(GetCorporationsCorporationIdDivisionsWalletWallet walletItem) {
    this.wallet.add(walletItem);
    return this;
  }

   /**
   * wallet array
   * @return wallet
  **/
  @ApiModelProperty(example = "null", value = "wallet array")
  public List<GetCorporationsCorporationIdDivisionsWalletWallet> getWallet() {
    return wallet;
  }

  public void setWallet(List<GetCorporationsCorporationIdDivisionsWalletWallet> wallet) {
    this.wallet = wallet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCorporationsCorporationIdDivisionsOk getCorporationsCorporationIdDivisionsOk = (GetCorporationsCorporationIdDivisionsOk) o;
    return Objects.equals(this.hangar, getCorporationsCorporationIdDivisionsOk.hangar) &&
        Objects.equals(this.wallet, getCorporationsCorporationIdDivisionsOk.wallet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hangar, wallet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCorporationsCorporationIdDivisionsOk {\n");
    
    sb.append("    hangar: ").append(toIndentedString(hangar)).append("\n");
    sb.append("    wallet: ").append(toIndentedString(wallet)).append("\n");
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

