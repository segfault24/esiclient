# ClonesApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdClones**](ClonesApi.md#getCharactersCharacterIdClones) | **GET** /v3/characters/{character_id}/clones/ | Get clones
[**getCharactersCharacterIdImplants**](ClonesApi.md#getCharactersCharacterIdImplants) | **GET** /v1/characters/{character_id}/implants/ | Get active implants


<a name="getCharactersCharacterIdClones"></a>
# **getCharactersCharacterIdClones**
> GetCharactersCharacterIdClonesOk getCharactersCharacterIdClones(characterId, datasource, ifNoneMatch, token)

Get clones

A list of the character&#39;s clones  ---  This route is cached for up to 120 seconds

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.ClonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

ClonesApi apiInstance = new ClonesApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    GetCharactersCharacterIdClonesOk result = apiInstance.getCharactersCharacterIdClones(characterId, datasource, ifNoneMatch, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClonesApi#getCharactersCharacterIdClones");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**GetCharactersCharacterIdClonesOk**](GetCharactersCharacterIdClonesOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCharactersCharacterIdImplants"></a>
# **getCharactersCharacterIdImplants**
> List&lt;Integer&gt; getCharactersCharacterIdImplants(characterId, datasource, ifNoneMatch, token)

Get active implants

Return implants on the active clone of a character  ---  This route is cached for up to 120 seconds

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.ClonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

ClonesApi apiInstance = new ClonesApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<Integer> result = apiInstance.getCharactersCharacterIdImplants(characterId, datasource, ifNoneMatch, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClonesApi#getCharactersCharacterIdImplants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

**List&lt;Integer&gt;**

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

