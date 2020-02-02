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
import net.evetech.esi.models.GetCharactersCharacterIdFwStatsOk;
import net.evetech.esi.models.GetCorporationsCorporationIdFwStatsOk;
import net.evetech.esi.models.GetFwLeaderboardsCharactersOk;
import net.evetech.esi.models.GetFwLeaderboardsCorporationsOk;
import net.evetech.esi.models.GetFwLeaderboardsOk;
import net.evetech.esi.models.GetFwStats200Ok;
import net.evetech.esi.models.GetFwSystems200Ok;
import net.evetech.esi.models.GetFwWars200Ok;
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
 * API tests for FactionWarfareApi
 */
@Ignore
public class FactionWarfareApiTest {

    private final FactionWarfareApi api = new FactionWarfareApi();

    
    /**
     * Overview of a character involved in faction warfare
     *
     * Statistical overview of a character involved in faction warfare  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdFwStatsTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetCharactersCharacterIdFwStatsOk response = api.getCharactersCharacterIdFwStats(characterId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * Overview of a corporation involved in faction warfare
     *
     * Statistics about a corporation involved in faction warfare  ---  This route expires daily at 11:05  --- [Diff of the upcoming changes](https://esi.evetech.net/diff/latest/dev/#GET-/corporations/{corporation_id}/fw/stats/)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdFwStatsTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        String token = null;
        GetCorporationsCorporationIdFwStatsOk response = api.getCorporationsCorporationIdFwStats(corporationId, datasource, ifNoneMatch, token);

        // TODO: test validations
    }
    
    /**
     * List of the top factions in faction warfare
     *
     * Top 4 leaderboard of factions for kills and victory points separated by total, last week and yesterday  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwLeaderboardsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        GetFwLeaderboardsOk response = api.getFwLeaderboards(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * List of the top pilots in faction warfare
     *
     * Top 100 leaderboard of pilots for kills and victory points separated by total, last week and yesterday  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwLeaderboardsCharactersTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        GetFwLeaderboardsCharactersOk response = api.getFwLeaderboardsCharacters(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * List of the top corporations in faction warfare
     *
     * Top 10 leaderboard of corporations for kills and victory points separated by total, last week and yesterday  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwLeaderboardsCorporationsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        GetFwLeaderboardsCorporationsOk response = api.getFwLeaderboardsCorporations(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * An overview of statistics about factions involved in faction warfare
     *
     * Statistical overviews of factions involved in faction warfare  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwStatsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        List<GetFwStats200Ok> response = api.getFwStats(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Ownership of faction warfare systems
     *
     * An overview of the current ownership of faction warfare solar systems  ---  This route is cached for up to 1800 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwSystemsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        List<GetFwSystems200Ok> response = api.getFwSystems(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
    /**
     * Data about which NPC factions are at war
     *
     * Data about which NPC factions are at war  ---  This route expires daily at 11:05
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFwWarsTest() throws ApiException {
        String datasource = null;
        String ifNoneMatch = null;
        List<GetFwWars200Ok> response = api.getFwWars(datasource, ifNoneMatch);

        // TODO: test validations
    }
    
}
