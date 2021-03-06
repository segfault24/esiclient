# KillmailsApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdKillmailsRecent**](KillmailsApi.md#getCharactersCharacterIdKillmailsRecent) | **GET** /v1/characters/{character_id}/killmails/recent/ | Get a character&#39;s recent kills and losses
[**getCorporationsCorporationIdKillmailsRecent**](KillmailsApi.md#getCorporationsCorporationIdKillmailsRecent) | **GET** /v1/corporations/{corporation_id}/killmails/recent/ | Get a corporation&#39;s recent kills and losses
[**getKillmailsKillmailIdKillmailHash**](KillmailsApi.md#getKillmailsKillmailIdKillmailHash) | **GET** /v1/killmails/{killmail_id}/{killmail_hash}/ | Get a single killmail


<a name="getCharactersCharacterIdKillmailsRecent"></a>
# **getCharactersCharacterIdKillmailsRecent**
> List&lt;GetCharactersCharacterIdKillmailsRecent200Ok&gt; getCharactersCharacterIdKillmailsRecent(characterId, datasource, ifNoneMatch, page, token)

Get a character&#39;s recent kills and losses

Return a list of a character&#39;s kills and losses going back 90 days  ---  This route is cached for up to 300 seconds

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.KillmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

KillmailsApi apiInstance = new KillmailsApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCharactersCharacterIdKillmailsRecent200Ok> result = apiInstance.getCharactersCharacterIdKillmailsRecent(characterId, datasource, ifNoneMatch, page, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KillmailsApi#getCharactersCharacterIdKillmailsRecent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdKillmailsRecent200Ok&gt;**](GetCharactersCharacterIdKillmailsRecent200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCorporationsCorporationIdKillmailsRecent"></a>
# **getCorporationsCorporationIdKillmailsRecent**
> List&lt;GetCorporationsCorporationIdKillmailsRecent200Ok&gt; getCorporationsCorporationIdKillmailsRecent(corporationId, datasource, ifNoneMatch, page, token)

Get a corporation&#39;s recent kills and losses

Get a list of a corporation&#39;s kills and losses going back 90 days  ---  This route is cached for up to 300 seconds  --- Requires one of the following EVE corporation role(s): Director

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.KillmailsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

KillmailsApi apiInstance = new KillmailsApi();
Integer corporationId = 56; // Integer | An EVE corporation ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
Integer page = 1; // Integer | Which page of results to return
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCorporationsCorporationIdKillmailsRecent200Ok> result = apiInstance.getCorporationsCorporationIdKillmailsRecent(corporationId, datasource, ifNoneMatch, page, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KillmailsApi#getCorporationsCorporationIdKillmailsRecent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corporationId** | **Integer**| An EVE corporation ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **page** | **Integer**| Which page of results to return | [optional] [default to 1]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**List&lt;GetCorporationsCorporationIdKillmailsRecent200Ok&gt;**](GetCorporationsCorporationIdKillmailsRecent200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getKillmailsKillmailIdKillmailHash"></a>
# **getKillmailsKillmailIdKillmailHash**
> GetKillmailsKillmailIdKillmailHashOk getKillmailsKillmailIdKillmailHash(killmailHash, killmailId, datasource, ifNoneMatch)

Get a single killmail

Return a single killmail from its ID and hash  ---  This route is cached for up to 30758400 seconds

### Example
```java
// Import classes:
//import net.evetech.ApiException;
//import net.evetech.esi.KillmailsApi;


KillmailsApi apiInstance = new KillmailsApi();
String killmailHash = "killmailHash_example"; // String | The killmail hash for verification
Integer killmailId = 56; // Integer | The killmail ID to be queried
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
try {
    GetKillmailsKillmailIdKillmailHashOk result = apiInstance.getKillmailsKillmailIdKillmailHash(killmailHash, killmailId, datasource, ifNoneMatch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling KillmailsApi#getKillmailsKillmailIdKillmailHash");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **killmailHash** | **String**| The killmail hash for verification |
 **killmailId** | **Integer**| The killmail ID to be queried |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]

### Return type

[**GetKillmailsKillmailIdKillmailHashOk**](GetKillmailsKillmailIdKillmailHashOk.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

