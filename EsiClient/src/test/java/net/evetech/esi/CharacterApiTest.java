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
import net.evetech.esi.models.GetCharactersCharacterIdAgentsResearch200Ok;
import net.evetech.esi.models.GetCharactersCharacterIdBlueprints200Ok;
import net.evetech.esi.models.GetCharactersCharacterIdCorporationhistory200Ok;
import net.evetech.esi.models.GetCharactersCharacterIdFatigueOk;
import net.evetech.esi.models.GetCharactersCharacterIdMedals200Ok;
import net.evetech.esi.models.GetCharactersCharacterIdNotFound;
import net.evetech.esi.models.GetCharactersCharacterIdNotifications200Ok;
import net.evetech.esi.models.GetCharactersCharacterIdNotificationsContacts200Ok;
import net.evetech.esi.models.GetCharactersCharacterIdOk;
import net.evetech.esi.models.GetCharactersCharacterIdPortraitNotFound;
import net.evetech.esi.models.GetCharactersCharacterIdPortraitOk;
import net.evetech.esi.models.GetCharactersCharacterIdRolesOk;
import net.evetech.esi.models.GetCharactersCharacterIdStandings200Ok;
import net.evetech.esi.models.GetCharactersCharacterIdStats200Ok;
import net.evetech.esi.models.GetCharactersCharacterIdTitles200Ok;
import net.evetech.esi.models.InternalServerError;
import net.evetech.esi.models.PostCharactersAffiliation200Ok;
import net.evetech.esi.models.PostCharactersAffiliationNotFound;
import net.evetech.esi.models.ServiceUnavailable;
import net.evetech.esi.models.Unauthorized;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CharacterApi
 */
@Ignore
public class CharacterApiTest {

    private final CharacterApi api = new CharacterApi();

    
    /**
     * Get character&#39;s public information
     *
     * Public information about a character  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        GetCharactersCharacterIdOk response = api.getCharactersCharacterId(characterId, datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get agents research
     *
     * Return a list of agents research information for a character. The formula for finding the current research points with an agent is: currentPoints &#x3D; remainderPoints + pointsPerDay * days(currentTime - researchStartDate)  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdAgentsResearchTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCharactersCharacterIdAgentsResearch200Ok> response = api.getCharactersCharacterIdAgentsResearch(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get blueprints
     *
     * Return a list of blueprints the character owns  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdBlueprintsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<GetCharactersCharacterIdBlueprints200Ok> response = api.getCharactersCharacterIdBlueprints(characterId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * Get corporation history
     *
     * Get a list of all the corporations a character has been a member of  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdCorporationhistoryTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        List<GetCharactersCharacterIdCorporationhistory200Ok> response = api.getCharactersCharacterIdCorporationhistory(characterId, datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get jump fatigue
     *
     * Return a character&#39;s jump activation and fatigue information  ---  This route is cached for up to 300 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdFatigueTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetCharactersCharacterIdFatigueOk response = api.getCharactersCharacterIdFatigue(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get medals
     *
     * Return a list of medals the character has  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdMedalsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCharactersCharacterIdMedals200Ok> response = api.getCharactersCharacterIdMedals(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get character notifications
     *
     * Return character notifications  ---  This route is cached for up to 600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdNotificationsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCharactersCharacterIdNotifications200Ok> response = api.getCharactersCharacterIdNotifications(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get new contact notifications
     *
     * Return notifications about having been added to someone&#39;s contact list  ---  This route is cached for up to 600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdNotificationsContactsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCharactersCharacterIdNotificationsContacts200Ok> response = api.getCharactersCharacterIdNotificationsContacts(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get character portraits
     *
     * Get portrait urls for a character  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdPortraitTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        GetCharactersCharacterIdPortraitOk response = api.getCharactersCharacterIdPortrait(characterId, datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Get character corporation roles
     *
     * Returns a character&#39;s corporation roles  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdRolesTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetCharactersCharacterIdRolesOk response = api.getCharactersCharacterIdRoles(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get standings
     *
     * Return character standings from agents, NPC corporations, and factions  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdStandingsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCharactersCharacterIdStandings200Ok> response = api.getCharactersCharacterIdStandings(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Yearly aggregate stats
     *
     * Returns aggregate yearly stats for a character  ---  This route is cached for up to 86400 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdStatsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCharactersCharacterIdStats200Ok> response = api.getCharactersCharacterIdStats(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Get character corporation titles
     *
     * Returns a character&#39;s titles  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdTitlesTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        List<GetCharactersCharacterIdTitles200Ok> response = api.getCharactersCharacterIdTitles(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Character affiliation
     *
     * Bulk lookup of character IDs to corporation, alliance and faction  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCharactersAffiliationTest() throws ApiException {
        List<Integer> characters = null;
        String datasource = null;
        List<PostCharactersAffiliation200Ok> response = api.postCharactersAffiliation(characters, datasource);

        // TODO: test validations
    }
    
    /**
     * Calculate a CSPA charge cost
     *
     * Takes a source character ID in the url and a set of target character ID&#39;s in the body, returns a CSPA charge cost  --- 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void postCharactersCharacterIdCspaTest() throws ApiException {
        Integer characterId = null;
        List<Integer> characters = null;
        String datasource = null;
        String token = null;
        Float response = api.postCharactersCharacterIdCspa(characterId, characters, datasource, token);

        // TODO: test validations
    }
    
}
