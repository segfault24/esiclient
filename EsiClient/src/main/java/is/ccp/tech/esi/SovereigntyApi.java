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


import is.ccp.tech.esi.models.BadGateway;
import is.ccp.tech.esi.models.BadRequest;
import is.ccp.tech.esi.models.ErrorLimited;
import is.ccp.tech.esi.models.GetSovereigntyCampaigns200Ok;
import is.ccp.tech.esi.models.GetSovereigntyMap200Ok;
import is.ccp.tech.esi.models.GetSovereigntyStructures200Ok;
import is.ccp.tech.esi.models.InternalServerError;
import is.ccp.tech.esi.models.ServiceUnavailable;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SovereigntyApi {
    private ApiClient apiClient;

    public SovereigntyApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SovereigntyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getSovereigntyCampaigns */
    private com.squareup.okhttp.Call getSovereigntyCampaignsCall(String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/sovereignty/campaigns/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
    private com.squareup.okhttp.Call getSovereigntyCampaignsValidateBeforeCall(String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getSovereigntyCampaignsCall(datasource, ifNoneMatch, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List sovereignty campaigns
     * Shows sovereignty data for campaigns.  ---  This route is cached for up to 5 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @return List&lt;GetSovereigntyCampaigns200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetSovereigntyCampaigns200Ok> getSovereigntyCampaigns(String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<List<GetSovereigntyCampaigns200Ok>> resp = getSovereigntyCampaignsWithHttpInfo(datasource, ifNoneMatch);
        return resp.getData();
    }

    /**
     * List sovereignty campaigns
     * Shows sovereignty data for campaigns.  ---  This route is cached for up to 5 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @return ApiResponse&lt;List&lt;GetSovereigntyCampaigns200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetSovereigntyCampaigns200Ok>> getSovereigntyCampaignsWithHttpInfo(String datasource, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getSovereigntyCampaignsValidateBeforeCall(datasource, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<List<GetSovereigntyCampaigns200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List sovereignty campaigns (asynchronously)
     * Shows sovereignty data for campaigns.  ---  This route is cached for up to 5 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSovereigntyCampaignsAsync(String datasource, String ifNoneMatch, final ApiCallback<List<GetSovereigntyCampaigns200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSovereigntyCampaignsValidateBeforeCall(datasource, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetSovereigntyCampaigns200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getSovereigntyMap */
    private com.squareup.okhttp.Call getSovereigntyMapCall(String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/sovereignty/map/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
    private com.squareup.okhttp.Call getSovereigntyMapValidateBeforeCall(String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getSovereigntyMapCall(datasource, ifNoneMatch, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List sovereignty of systems
     * Shows sovereignty information for solar systems  ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @return List&lt;GetSovereigntyMap200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetSovereigntyMap200Ok> getSovereigntyMap(String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<List<GetSovereigntyMap200Ok>> resp = getSovereigntyMapWithHttpInfo(datasource, ifNoneMatch);
        return resp.getData();
    }

    /**
     * List sovereignty of systems
     * Shows sovereignty information for solar systems  ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @return ApiResponse&lt;List&lt;GetSovereigntyMap200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetSovereigntyMap200Ok>> getSovereigntyMapWithHttpInfo(String datasource, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getSovereigntyMapValidateBeforeCall(datasource, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<List<GetSovereigntyMap200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List sovereignty of systems (asynchronously)
     * Shows sovereignty information for solar systems  ---  This route is cached for up to 3600 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSovereigntyMapAsync(String datasource, String ifNoneMatch, final ApiCallback<List<GetSovereigntyMap200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSovereigntyMapValidateBeforeCall(datasource, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetSovereigntyMap200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getSovereigntyStructures */
    private com.squareup.okhttp.Call getSovereigntyStructuresCall(String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/v1/sovereignty/structures/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (datasource != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "datasource", datasource));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
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
    private com.squareup.okhttp.Call getSovereigntyStructuresValidateBeforeCall(String datasource, String ifNoneMatch, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        
        com.squareup.okhttp.Call call = getSovereigntyStructuresCall(datasource, ifNoneMatch, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List sovereignty structures
     * Shows sovereignty data for structures.  ---  This route is cached for up to 120 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @return List&lt;GetSovereigntyStructures200Ok&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<GetSovereigntyStructures200Ok> getSovereigntyStructures(String datasource, String ifNoneMatch) throws ApiException {
        ApiResponse<List<GetSovereigntyStructures200Ok>> resp = getSovereigntyStructuresWithHttpInfo(datasource, ifNoneMatch);
        return resp.getData();
    }

    /**
     * List sovereignty structures
     * Shows sovereignty data for structures.  ---  This route is cached for up to 120 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @return ApiResponse&lt;List&lt;GetSovereigntyStructures200Ok&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<GetSovereigntyStructures200Ok>> getSovereigntyStructuresWithHttpInfo(String datasource, String ifNoneMatch) throws ApiException {
        com.squareup.okhttp.Call call = getSovereigntyStructuresValidateBeforeCall(datasource, ifNoneMatch, null, null);
        Type localVarReturnType = new TypeToken<List<GetSovereigntyStructures200Ok>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List sovereignty structures (asynchronously)
     * Shows sovereignty data for structures.  ---  This route is cached for up to 120 seconds
     * @param datasource The server name you would like data from (optional, default to tranquility)
     * @param ifNoneMatch ETag from a previous request. A 304 will be returned if this matches the current ETag (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSovereigntyStructuresAsync(String datasource, String ifNoneMatch, final ApiCallback<List<GetSovereigntyStructures200Ok>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSovereigntyStructuresValidateBeforeCall(datasource, ifNoneMatch, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<GetSovereigntyStructures200Ok>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
