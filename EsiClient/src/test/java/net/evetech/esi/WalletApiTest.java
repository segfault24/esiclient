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


package net.evetech.esi;

import net.evetech.ApiException;
import net.evetech.esi.models.BadRequest;
import net.evetech.esi.models.ErrorLimited;
import net.evetech.esi.models.Forbidden;
import net.evetech.esi.models.GatewayTimeout;
import net.evetech.esi.models.GetCharactersCharacterIdWalletJournal200Ok;
import net.evetech.esi.models.GetCharactersCharacterIdWalletTransactions200Ok;
import net.evetech.esi.models.GetCorporationsCorporationIdWallets200Ok;
import net.evetech.esi.models.GetCorporationsCorporationIdWalletsDivisionJournal200Ok;
import net.evetech.esi.models.GetCorporationsCorporationIdWalletsDivisionTransactions200Ok;
import net.evetech.esi.models.InternalServerError;
import net.evetech.esi.models.ServiceUnavailable;
import net.evetech.esi.models.Unauthorized;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WalletApi
 */
@Ignore
public class WalletApiTest {

    private final WalletApi api = new WalletApi();

    
    /**
     * Get a character&#39;s wallet balance
     *
     * Returns a character&#39;s wallet balance  ---  This route is cached for up to 120 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdWalletTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        Double response = api.getCharactersCharacterIdWallet(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get character wallet journal
     *
     * Retrieve the given character&#39;s wallet journal going 30 days back  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdWalletJournalTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<GetCharactersCharacterIdWalletJournal200Ok> response = api.getCharactersCharacterIdWalletJournal(characterId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * Get wallet transactions
     *
     * Get wallet transactions of a character  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdWalletTransactionsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        Long fromId = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCharactersCharacterIdWalletTransactions200Ok> response = api.getCharactersCharacterIdWalletTransactions(characterId, datasource, fromId, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Returns a corporation&#39;s wallet balance
     *
     * Get a corporation&#39;s wallets  ---  This route is cached for up to 300 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdWalletsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCorporationsCorporationIdWallets200Ok> response = api.getCorporationsCorporationIdWallets(corporationId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get corporation wallet journal
     *
     * Retrieve the given corporation&#39;s wallet journal for the given division going 30 days back  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdWalletsDivisionJournalTest() throws ApiException {
        Integer corporationId = null;
        Integer division = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<GetCorporationsCorporationIdWalletsDivisionJournal200Ok> response = api.getCorporationsCorporationIdWalletsDivisionJournal(corporationId, division, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * Get corporation wallet transactions
     *
     * Get wallet transactions of a corporation  ---  This route is cached for up to 3600 seconds  --- Requires one of the following EVE corporation role(s): Accountant, Junior_Accountant
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdWalletsDivisionTransactionsTest() throws ApiException {
        Integer corporationId = null;
        Integer division = null;
        String datasource = null;
        Long fromId = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCorporationsCorporationIdWalletsDivisionTransactions200Ok> response = api.getCorporationsCorporationIdWalletsDivisionTransactions(corporationId, division, datasource, fromId, ifNoneMatch, token);

        // TODO: test validations
    }
    
}
