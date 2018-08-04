/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.5
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
import net.evetech.esi.models.GetCharactersCharacterIdLocationOk;
import net.evetech.esi.models.GetCharactersCharacterIdOnlineOk;
import net.evetech.esi.models.GetCharactersCharacterIdShipOk;
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
 * API tests for LocationApi
 */
@Ignore
public class LocationApiTest {

    private final LocationApi api = new LocationApi();

    
    /**
     * Get character location
     *
     * Information about the characters current location. Returns the current solar system id, and also the current station or structure ID if applicable.  ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdLocationTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetCharactersCharacterIdLocationOk response = api.getCharactersCharacterIdLocation(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get character online
     *
     * Checks if the character is currently online  ---  This route is cached for up to 60 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdOnlineTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetCharactersCharacterIdOnlineOk response = api.getCharactersCharacterIdOnline(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get current ship
     *
     * Get the current ship type, name and id  ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdShipTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetCharactersCharacterIdShipOk response = api.getCharactersCharacterIdShip(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
}