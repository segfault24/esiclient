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


package net.evetech.esi;

import net.evetech.ApiException;
import net.evetech.esi.models.BadRequest;
import net.evetech.esi.models.ErrorLimited;
import net.evetech.esi.models.Forbidden;
import net.evetech.esi.models.GatewayTimeout;
import net.evetech.esi.models.GetCharactersCharacterIdSearchOk;
import net.evetech.esi.models.GetSearchOk;
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
 * API tests for SearchApi
 */
@Ignore
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    
    /**
     * Search on a string
     *
     * Search for entities that match a given sub-string.  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdSearchTest() throws ApiException {
        List<String> categories = null;
        Integer characterId = null;
        String search = null;
        String acceptLanguage = null;
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        Boolean strict = null;
        String token = null;
        GetCharactersCharacterIdSearchOk response = api.getCharactersCharacterIdSearch(categories, characterId, search, acceptLanguage, datasource, ifNoneMatch, language, strict, token);

        // TODO: test validations
    }
    
    /**
     * Search on a string
     *
     * Search for entities that match a given sub-string.  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSearchTest() throws ApiException {
        List<String> categories = null;
        String search = null;
        String acceptLanguage = null;
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        Boolean strict = null;
        GetSearchOk response = api.getSearch(categories, search, acceptLanguage, datasource, ifNoneMatch, language, strict);

        // TODO: test validations
    }
    
}
