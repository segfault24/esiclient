/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.8.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package is.ccp.tech.esi;

import is.ccp.tech.ApiException;
import is.ccp.tech.esi.models.BadGateway;
import is.ccp.tech.esi.models.BadRequest;
import is.ccp.tech.esi.models.ErrorLimited;
import is.ccp.tech.esi.models.GetWarsWarIdKillmails200Ok;
import is.ccp.tech.esi.models.GetWarsWarIdKillmailsUnprocessableEntity;
import is.ccp.tech.esi.models.GetWarsWarIdOk;
import is.ccp.tech.esi.models.GetWarsWarIdUnprocessableEntity;
import is.ccp.tech.esi.models.InternalServerError;
import is.ccp.tech.esi.models.ServiceUnavailable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WarsApi
 */
@Ignore
public class WarsApiTest {

    private final WarsApi api = new WarsApi();

    
    /**
     * List wars
     *
     * Return a list of wars  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWarsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        Integer maxWarId = null;
        List<Integer> response = api.getWars(datasource, ifNoneMatch, maxWarId);

        // TODO: test validations
    }
    
    /**
     * Get war information
     *
     * Return details about a war  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWarsWarIdTest() throws ApiException {
        Integer warId = null;
        String datasource = null;
        String ifNoneMatch = null;
        GetWarsWarIdOk response = api.getWarsWarId(warId, datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * List kills for a war
     *
     * Return a list of kills related to a war  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWarsWarIdKillmailsTest() throws ApiException {
        Integer warId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        List<GetWarsWarIdKillmails200Ok> response = api.getWarsWarIdKillmails(warId, datasource, ifNoneMatch, page);

        // TODO: test validations
    }
    
}
