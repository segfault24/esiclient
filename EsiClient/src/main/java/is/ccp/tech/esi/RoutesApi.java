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

import is.ccp.tech.ApiCallback;
import is.ccp.tech.ApiClient;
import is.ccp.tech.ApiException;
import is.ccp.tech.ApiResponse;
import is.ccp.tech.Configuration;
import is.ccp.tech.Pair;
import is.ccp.tech.ProgressRequestBody;
import is.ccp.tech.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import is.ccp.tech.esi.models.GetRouteOriginDestinationNotFound;
import is.ccp.tech.esi.models.InternalServerError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoutesApi {
    private ApiClient apiClient;

    public RoutesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public RoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getRouteOriginDestination */
    private com.squareup.okhttp.Call getRouteOriginDestinationCall(Integer destination, Integer origin, List<Integer> avoid, List<List<Integer>> connections, String datasource, String flag, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/route/{origin}/{destination}/".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "destination" + "\\}", apiClient.escapeString(destination.toString()))
        .replaceAll("\\{" + "origin" + "\\}", apiClient.escapeString(origin.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (avoid != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "avoid", avoid));
        if (connections != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "connections", connections));
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));
        if (flag != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "flag", flag));
        if (userAgent != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_agent", userAgent));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xUserAgent != null)
        localVarHeaderParams.put("X-User-Agent", apiClient.parameterToString(xUserAgent));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getRouteOriginDestinationValidateBeforeCall(Integer destination, Integer origin, List<Integer> avoid, List<List<Integer>> connections, String datasource, String flag, String userAgent, String xUserAgent, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'destination' is set
        if (destination == null) {
            throw new ApiException("Missing the required parameter 'destination' when calling getRouteOriginDestination(Async)");
        }
        
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new ApiException("Missing the required parameter 'origin' when calling getRouteOriginDestination(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getRouteOriginDestinationCall(destination, origin, avoid, connections, datasource, flag, userAgent, xUserAgent, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get route
     * Get the systems between origin and destination  ---  This route is cached for up to 86400 seconds
     * @param destination destination solar system ID (required)
     * @param origin origin solar system ID (required)
     * @param avoid avoid solar system ID(s) (optional)
     * @param connections connected solar system pairs (optional)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param flag route security preference (optional, default to shortest)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return List&lt;Integer&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Integer> getRouteOriginDestination(Integer destination, Integer origin, List<Integer> avoid, List<List<Integer>> connections, String datasource, String flag, String userAgent, String xUserAgent) throws ApiException {
        ApiResponse<List<Integer>> resp = getRouteOriginDestinationWithHttpInfo(destination, origin, avoid, connections, datasource, flag, userAgent, xUserAgent);
        return resp.getData();
    }

    /**
     * Get route
     * Get the systems between origin and destination  ---  This route is cached for up to 86400 seconds
     * @param destination destination solar system ID (required)
     * @param origin origin solar system ID (required)
     * @param avoid avoid solar system ID(s) (optional)
     * @param connections connected solar system pairs (optional)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param flag route security preference (optional, default to shortest)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @return ApiResponse&lt;List&lt;Integer&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Integer>> getRouteOriginDestinationWithHttpInfo(Integer destination, Integer origin, List<Integer> avoid, List<List<Integer>> connections, String datasource, String flag, String userAgent, String xUserAgent) throws ApiException {
        com.squareup.okhttp.Call call = getRouteOriginDestinationValidateBeforeCall(destination, origin, avoid, connections, datasource, flag, userAgent, xUserAgent, null, null);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get route (asynchronously)
     * Get the systems between origin and destination  ---  This route is cached for up to 86400 seconds
     * @param destination destination solar system ID (required)
     * @param origin origin solar system ID (required)
     * @param avoid avoid solar system ID(s) (optional)
     * @param connections connected solar system pairs (optional)
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param flag route security preference (optional, default to shortest)
     * @param userAgent Client identifier, takes precedence over headers (optional)
     * @param xUserAgent Client identifier, takes precedence over User-Agent (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getRouteOriginDestinationAsync(Integer destination, Integer origin, List<Integer> avoid, List<List<Integer>> connections, String datasource, String flag, String userAgent, String xUserAgent, final ApiCallback<List<Integer>> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getRouteOriginDestinationValidateBeforeCall(destination, origin, avoid, connections, datasource, flag, userAgent, xUserAgent, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Integer>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}