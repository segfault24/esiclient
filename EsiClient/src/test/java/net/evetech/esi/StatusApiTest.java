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
import net.evetech.esi.models.GatewayTimeout;
import net.evetech.esi.models.GetStatusOk;
import net.evetech.esi.models.InternalServerError;
import net.evetech.esi.models.ServiceUnavailable;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StatusApi
 */
@Ignore
public class StatusApiTest {

    private final StatusApi api = new StatusApi();

    
    /**
     * Retrieve the uptime and player counts
     *
     * EVE Server status  ---  This route is cached for up to 30 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getStatusTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        GetStatusOk response = api.getStatus(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
}
