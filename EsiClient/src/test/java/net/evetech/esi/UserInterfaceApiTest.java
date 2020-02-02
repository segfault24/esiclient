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
import net.evetech.esi.models.InternalServerError;
import net.evetech.esi.models.PostUiOpenwindowNewmailNewMail;
import net.evetech.esi.models.PostUiOpenwindowNewmailUnprocessableEntity;
import net.evetech.esi.models.ServiceUnavailable;
import net.evetech.esi.models.Unauthorized;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserInterfaceApi
 */
@Ignore
public class UserInterfaceApiTest {

    private final UserInterfaceApi api = new UserInterfaceApi();

    
    /**
     * Set Autopilot Waypoint
     *
     * Set a solar system as autopilot waypoint  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUiAutopilotWaypointTest() throws ApiException {
        Boolean addToBeginning = null;
        Boolean clearOtherWaypoints = null;
        Long destinationId = null;
        String datasource = null;
        String token = null;
        api.postUiAutopilotWaypoint(addToBeginning, clearOtherWaypoints, destinationId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Open Contract Window
     *
     * Open the contract window inside the client  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUiOpenwindowContractTest() throws ApiException {
        Integer contractId = null;
        String datasource = null;
        String token = null;
        api.postUiOpenwindowContract(contractId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Open Information Window
     *
     * Open the information window for a character, corporation or alliance inside the client  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUiOpenwindowInformationTest() throws ApiException {
        Integer targetId = null;
        String datasource = null;
        String token = null;
        api.postUiOpenwindowInformation(targetId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Open Market Details
     *
     * Open the market details window for a specific typeID inside the client  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUiOpenwindowMarketdetailsTest() throws ApiException {
        Integer typeId = null;
        String datasource = null;
        String token = null;
        api.postUiOpenwindowMarketdetails(typeId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Open New Mail Window
     *
     * Open the New Mail window, according to settings from the request if applicable  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postUiOpenwindowNewmailTest() throws ApiException {
        PostUiOpenwindowNewmailNewMail newMail = null;
        String datasource = null;
        String token = null;
        api.postUiOpenwindowNewmail(newMail, datasource, token);

        // TODO: test validations
    }
    
}
