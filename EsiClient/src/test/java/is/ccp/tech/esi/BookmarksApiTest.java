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
import is.ccp.tech.esi.models.Forbidden;
import is.ccp.tech.esi.models.GetCharactersCharacterIdBookmarks200Ok;
import is.ccp.tech.esi.models.GetCharactersCharacterIdBookmarksFolders200Ok;
import is.ccp.tech.esi.models.GetCorporationsCorporationIdBookmarks200Ok;
import is.ccp.tech.esi.models.GetCorporationsCorporationIdBookmarksFolders200Ok;
import is.ccp.tech.esi.models.InternalServerError;
import is.ccp.tech.esi.models.ServiceUnavailable;
import is.ccp.tech.esi.models.Unauthorized;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BookmarksApi
 */
@Ignore
public class BookmarksApiTest {

    private final BookmarksApi api = new BookmarksApi();

    
    /**
     * List bookmarks
     *
     * A list of your character&#39;s personal bookmarks  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdBookmarksTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<GetCharactersCharacterIdBookmarks200Ok> response = api.getCharactersCharacterIdBookmarks(characterId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * List bookmark folders
     *
     * A list of your character&#39;s personal bookmark folders  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdBookmarksFoldersTest() throws ApiException {
        Integer characterId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<GetCharactersCharacterIdBookmarksFolders200Ok> response = api.getCharactersCharacterIdBookmarksFolders(characterId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * List corporation bookmarks
     *
     * A list of your corporation&#39;s bookmarks  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdBookmarksTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<GetCorporationsCorporationIdBookmarks200Ok> response = api.getCorporationsCorporationIdBookmarks(corporationId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
    /**
     * List corporation bookmark folders
     *
     * A list of your corporation&#39;s bookmark folders  ---  This route is cached for up to 3600 seconds
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCorporationsCorporationIdBookmarksFoldersTest() throws ApiException {
        Integer corporationId = null;
        String datasource = null;
        String ifNoneMatch = null;
        Integer page = null;
        String token = null;
        List<GetCorporationsCorporationIdBookmarksFolders200Ok> response = api.getCorporationsCorporationIdBookmarksFolders(corporationId, datasource, ifNoneMatch, page, token);

        // TODO: test validations
    }
    
}
