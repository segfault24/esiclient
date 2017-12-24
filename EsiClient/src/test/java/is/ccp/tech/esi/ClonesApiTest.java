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


package is.ccp.tech.esi;

import is.ccp.tech.ApiException;
import is.ccp.tech.esi.models.Forbidden;
import is.ccp.tech.esi.models.GetCharactersCharacterIdClonesOk;
import is.ccp.tech.esi.models.InternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClonesApi
 */
@Ignore
public class ClonesApiTest {

    private final ClonesApi api = new ClonesApi();

    
    /**
     * Get clones
     *
     * A list of the character&#39;s clones  ---  This route is cached for up to 120 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdClonesTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        GetCharactersCharacterIdClonesOk response = api.getCharactersCharacterIdClones(characterId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get active implants
     *
     * Return implants on the active clone of a character  ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdImplantsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String token = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getCharactersCharacterIdImplants(characterId, datasource, token, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
