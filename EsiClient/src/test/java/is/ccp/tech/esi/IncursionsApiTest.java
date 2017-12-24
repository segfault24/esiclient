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
import is.ccp.tech.esi.models.GetIncursions200Ok;
import is.ccp.tech.esi.models.InternalServerError;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IncursionsApi
 */
@Ignore
public class IncursionsApiTest {

    private final IncursionsApi api = new IncursionsApi();

    
    /**
     * List incursions
     *
     * Return a list of current incursions  ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncursionsTest() throws ApiException {
        String datasource = null;
        String userAgent = null;
        String xUserAgent = null;
        List<GetIncursions200Ok> response = api.getIncursions(datasource, userAgent, xUserAgent);

        // TODO: test validations
    }
    
}