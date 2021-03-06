# SkillsApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdAttributes**](SkillsApi.md#getCharactersCharacterIdAttributes) | **GET** /v1/characters/{character_id}/attributes/ | Get character attributes
[**getCharactersCharacterIdSkillqueue**](SkillsApi.md#getCharactersCharacterIdSkillqueue) | **GET** /v2/characters/{character_id}/skillqueue/ | Get character&#39;s skill queue
[**getCharactersCharacterIdSkills**](SkillsApi.md#getCharactersCharacterIdSkills) | **GET** /v4/characters/{character_id}/skills/ | Get character skills


<a name="getCharactersCharacterIdAttributes"></a>
# **getCharactersCharacterIdAttributes**
> GetCharactersCharacterIdAttributesOk getCharactersCharacterIdAttributes(characterId, datasource, ifNoneMatch, token)

Get character attributes

Return attributes of a character  ---  This route is cached for up to 120 seconds

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.SkillsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

SkillsApi apiInstance = new SkillsApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    GetCharactersCharacterIdAttributesOk result = apiInstance.getCharactersCharacterIdAttributes(characterId, datasource, ifNoneMatch, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkillsApi#getCharactersCharacterIdAttributes");
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

[**GetCharactersCharacterIdAttributesOk**](GetCharactersCharacterIdAttributesOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCharactersCharacterIdSkillqueue"></a>
# **getCharactersCharacterIdSkillqueue**
> List&lt;GetCharactersCharacterIdSkillqueue200Ok&gt; getCharactersCharacterIdSkillqueue(characterId, datasource, ifNoneMatch, token)

Get character&#39;s skill queue

List the configured skill queue for the given character  ---  This route is cached for up to 120 seconds

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.SkillsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

SkillsApi apiInstance = new SkillsApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCharactersCharacterIdSkillqueue200Ok> result = apiInstance.getCharactersCharacterIdSkillqueue(characterId, datasource, ifNoneMatch, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkillsApi#getCharactersCharacterIdSkillqueue");
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

[**List&lt;GetCharactersCharacterIdSkillqueue200Ok&gt;**](GetCharactersCharacterIdSkillqueue200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCharactersCharacterIdSkills"></a>
# **getCharactersCharacterIdSkills**
> GetCharactersCharacterIdSkillsOk getCharactersCharacterIdSkills(characterId, datasource, ifNoneMatch, token)

Get character skills

List all trained skills for the given character  ---  This route is cached for up to 120 seconds

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.SkillsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

SkillsApi apiInstance = new SkillsApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    GetCharactersCharacterIdSkillsOk result = apiInstance.getCharactersCharacterIdSkills(characterId, datasource, ifNoneMatch, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SkillsApi#getCharactersCharacterIdSkills");
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

[**GetCharactersCharacterIdSkillsOk**](GetCharactersCharacterIdSkillsOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

