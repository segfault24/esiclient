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
import is.ccp.tech.esi.models.GetAlliancesAllianceIdIconsNotFound;
import is.ccp.tech.esi.models.GetAlliancesAllianceIdIconsOk;
import is.ccp.tech.esi.models.GetAlliancesAllianceIdNotFound;
import is.ccp.tech.esi.models.GetAlliancesAllianceIdOk;
import is.ccp.tech.esi.models.GetAlliancesNames200Ok;
import is.ccp.tech.esi.models.InternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AllianceApi
 */
@Ignore
public class AllianceApiTest {

    private final AllianceApi api = new AllianceApi();

    
    /**
     * List all alliances
     *
     * List all active player alliances  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getAlliances(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get alliance information
     *
     * Public information about an alliance  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdTest() throws ApiException {
        Integer allianceId = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        GetAlliancesAllianceIdOk response = api.getAlliancesAllianceId(allianceId, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * List alliance&#39;s corporations
     *
     * List all current member corporations of an alliance  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdCorporationsTest() throws ApiException {
        Integer allianceId = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<Integer> response = api.getAlliancesAllianceIdCorporations(allianceId, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get alliance icon
     *
     * Get the icon urls for a alliance  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesAllianceIdIconsTest() throws ApiException {
        Integer allianceId = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        GetAlliancesAllianceIdIconsOk response = api.getAlliancesAllianceIdIcons(allianceId, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
    /**
     * Get alliance names
     *
     * Resolve a set of alliance IDs to alliance names  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAlliancesNamesTest() throws ApiException {
        List<Integer> allianceIds = null;
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetAlliancesNames200Ok> response = api.getAlliancesNames(allianceIds, datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}
