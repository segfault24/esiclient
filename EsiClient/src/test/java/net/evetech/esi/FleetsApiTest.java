/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 1.7.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.evetech.esi;

import net.evetech.ApiException;
import net.evetech.esi.models.BadRequest;
import net.evetech.esi.models.DeleteFleetsFleetIdMembersMemberIdNotFound;
import net.evetech.esi.models.DeleteFleetsFleetIdSquadsSquadIdNotFound;
import net.evetech.esi.models.DeleteFleetsFleetIdWingsWingIdNotFound;
import net.evetech.esi.models.ErrorLimited;
import net.evetech.esi.models.Forbidden;
import net.evetech.esi.models.GatewayTimeout;
import net.evetech.esi.models.GetCharactersCharacterIdFleetNotFound;
import net.evetech.esi.models.GetCharactersCharacterIdFleetOk;
import net.evetech.esi.models.GetFleetsFleetIdMembers200Ok;
import net.evetech.esi.models.GetFleetsFleetIdMembersNotFound;
import net.evetech.esi.models.GetFleetsFleetIdNotFound;
import net.evetech.esi.models.GetFleetsFleetIdOk;
import net.evetech.esi.models.GetFleetsFleetIdWings200Ok;
import net.evetech.esi.models.GetFleetsFleetIdWingsNotFound;
import net.evetech.esi.models.InternalServerError;
import net.evetech.esi.models.PostFleetsFleetIdMembersInvitation;
import net.evetech.esi.models.PostFleetsFleetIdMembersNotFound;
import net.evetech.esi.models.PostFleetsFleetIdMembersUnprocessableEntity;
import net.evetech.esi.models.PostFleetsFleetIdWingsCreated;
import net.evetech.esi.models.PostFleetsFleetIdWingsNotFound;
import net.evetech.esi.models.PostFleetsFleetIdWingsWingIdSquadsCreated;
import net.evetech.esi.models.PostFleetsFleetIdWingsWingIdSquadsNotFound;
import net.evetech.esi.models.PutFleetsFleetIdMembersMemberIdMovement;
import net.evetech.esi.models.PutFleetsFleetIdMembersMemberIdNotFound;
import net.evetech.esi.models.PutFleetsFleetIdMembersMemberIdUnprocessableEntity;
import net.evetech.esi.models.PutFleetsFleetIdNewSettings;
import net.evetech.esi.models.PutFleetsFleetIdNotFound;
import net.evetech.esi.models.PutFleetsFleetIdSquadsSquadIdNaming;
import net.evetech.esi.models.PutFleetsFleetIdSquadsSquadIdNotFound;
import net.evetech.esi.models.PutFleetsFleetIdWingsWingIdNaming;
import net.evetech.esi.models.PutFleetsFleetIdWingsWingIdNotFound;
import net.evetech.esi.models.ServiceUnavailable;
import net.evetech.esi.models.Unauthorized;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FleetsApi
 */
@Ignore
public class FleetsApiTest {

    private final FleetsApi api = new FleetsApi();

    
    /**
     * Kick fleet member
     *
     * Kick a fleet member  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFleetsFleetIdMembersMemberIdTest() throws ApiException {
        Long fleetId = null;
        Integer memberId = null;
        String datasource = null;
        String token = null;
        api.deleteFleetsFleetIdMembersMemberId(fleetId, memberId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Delete fleet squad
     *
     * Delete a fleet squad, only empty squads can be deleted  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFleetsFleetIdSquadsSquadIdTest() throws ApiException {
        Long fleetId = null;
        Long squadId = null;
        String datasource = null;
        String token = null;
        api.deleteFleetsFleetIdSquadsSquadId(fleetId, squadId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Delete fleet wing
     *
     * Delete a fleet wing, only empty wings can be deleted. The wing may contain squads, but the squads must be empty  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFleetsFleetIdWingsWingIdTest() throws ApiException {
        Long fleetId = null;
        Long wingId = null;
        String datasource = null;
        String token = null;
        api.deleteFleetsFleetIdWingsWingId(fleetId, wingId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Get character fleet info
     *
     * Return the fleet ID the character is in, if any.  ---  This route is cached for up to 60 seconds  --- Warning: This route has an upgrade available  --- [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/characters/{character_id}/fleet/)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdFleetTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetCharactersCharacterIdFleetOk response = api.getCharactersCharacterIdFleet(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get fleet information
     *
     * Return details about a fleet  ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetsFleetIdTest() throws ApiException {
        Long fleetId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetFleetsFleetIdOk response = api.getFleetsFleetId(fleetId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get fleet members
     *
     * Return information about fleet members  ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetsFleetIdMembersTest() throws ApiException {
        Long fleetId = null;
        String acceptLanguage = null;
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        String token = null;
        List<GetFleetsFleetIdMembers200Ok> response = api.getFleetsFleetIdMembers(fleetId, acceptLanguage, datasource, ifNoneMatch, language, token);

        // TODO: test validations
    }
    
    /**
     * Get fleet wings
     *
     * Return information about wings in a fleet  ---  This route is cached for up to 5 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFleetsFleetIdWingsTest() throws ApiException {
        Long fleetId = null;
        String acceptLanguage = null;
        String datasource = null;
        String ifNoneMatch = null;
        String language = null;
        String token = null;
        List<GetFleetsFleetIdWings200Ok> response = api.getFleetsFleetIdWings(fleetId, acceptLanguage, datasource, ifNoneMatch, language, token);

        // TODO: test validations
    }
    
    /**
     * Create fleet invitation
     *
     * Invite a character into the fleet. If a character has a CSPA charge set it is not possible to invite them to the fleet using ESI  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFleetsFleetIdMembersTest() throws ApiException {
        Long fleetId = null;
        PostFleetsFleetIdMembersInvitation invitation = null;
        String datasource = null;
        String token = null;
        api.postFleetsFleetIdMembers(fleetId, invitation, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Create fleet wing
     *
     * Create a new wing in a fleet  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFleetsFleetIdWingsTest() throws ApiException {
        Long fleetId = null;
        String datasource = null;
        String token = null;
        PostFleetsFleetIdWingsCreated response = api.postFleetsFleetIdWings(fleetId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Create fleet squad
     *
     * Create a new squad in a fleet  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postFleetsFleetIdWingsWingIdSquadsTest() throws ApiException {
        Long fleetId = null;
        Long wingId = null;
        String datasource = null;
        String token = null;
        PostFleetsFleetIdWingsWingIdSquadsCreated response = api.postFleetsFleetIdWingsWingIdSquads(fleetId, wingId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Update fleet
     *
     * Update settings about a fleet  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFleetsFleetIdTest() throws ApiException {
        Long fleetId = null;
        PutFleetsFleetIdNewSettings newSettings = null;
        String datasource = null;
        String token = null;
        api.putFleetsFleetId(fleetId, newSettings, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Move fleet member
     *
     * Move a fleet member around  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFleetsFleetIdMembersMemberIdTest() throws ApiException {
        Long fleetId = null;
        Integer memberId = null;
        PutFleetsFleetIdMembersMemberIdMovement movement = null;
        String datasource = null;
        String token = null;
        api.putFleetsFleetIdMembersMemberId(fleetId, memberId, movement, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Rename fleet squad
     *
     * Rename a fleet squad  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFleetsFleetIdSquadsSquadIdTest() throws ApiException {
        Long fleetId = null;
        PutFleetsFleetIdSquadsSquadIdNaming naming = null;
        Long squadId = null;
        String datasource = null;
        String token = null;
        api.putFleetsFleetIdSquadsSquadId(fleetId, naming, squadId, datasource, token);

        // TODO: test validations
    }
    
    /**
     * Rename fleet wing
     *
     * Rename a fleet wing  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putFleetsFleetIdWingsWingIdTest() throws ApiException {
        Long fleetId = null;
        PutFleetsFleetIdWingsWingIdNaming naming = null;
        Long wingId = null;
        String datasource = null;
        String token = null;
        api.putFleetsFleetIdWingsWingId(fleetId, naming, wingId, datasource, token);

        // TODO: test validations
    }
    
}
