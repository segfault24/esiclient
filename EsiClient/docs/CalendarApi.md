# CalendarApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharactersCharacterIdCalendar**](CalendarApi.md#getCharactersCharacterIdCalendar) | **GET** /v1/characters/{character_id}/calendar/ | List calendar event summaries
[**getCharactersCharacterIdCalendarEventId**](CalendarApi.md#getCharactersCharacterIdCalendarEventId) | **GET** /v3/characters/{character_id}/calendar/{event_id}/ | Get an event
[**getCharactersCharacterIdCalendarEventIdAttendees**](CalendarApi.md#getCharactersCharacterIdCalendarEventIdAttendees) | **GET** /v1/characters/{character_id}/calendar/{event_id}/attendees/ | Get attendees
[**putCharactersCharacterIdCalendarEventId**](CalendarApi.md#putCharactersCharacterIdCalendarEventId) | **PUT** /v3/characters/{character_id}/calendar/{event_id}/ | Respond to an event


<a name="getCharactersCharacterIdCalendar"></a>
# **getCharactersCharacterIdCalendar**
> List&lt;GetCharactersCharacterIdCalendar200Ok&gt; getCharactersCharacterIdCalendar(characterId, datasource, fromEvent, ifNoneMatch, token)

List calendar event summaries

Get 50 event summaries from the calendar. If no from_event ID is given, the resource will return the next 50 chronological event summaries from now. If a from_event ID is specified, it will return the next 50 chronological event summaries from after that event  ---  This route is cached for up to 5 seconds

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.CalendarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CalendarApi apiInstance = new CalendarApi();
Integer characterId = 56; // Integer | An EVE character ID
String datasource = "tranquility"; // String | The server name you would like data from
Integer fromEvent = 56; // Integer | The event ID to retrieve events from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCharactersCharacterIdCalendar200Ok> result = apiInstance.getCharactersCharacterIdCalendar(characterId, datasource, fromEvent, ifNoneMatch, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CalendarApi#getCharactersCharacterIdCalendar");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **fromEvent** | **Integer**| The event ID to retrieve events from | [optional]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdCalendar200Ok&gt;**](GetCharactersCharacterIdCalendar200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCharactersCharacterIdCalendarEventId"></a>
# **getCharactersCharacterIdCalendarEventId**
> GetCharactersCharacterIdCalendarEventIdOk getCharactersCharacterIdCalendarEventId(characterId, eventId, datasource, ifNoneMatch, token)

Get an event

Get all the information for a specific event  ---  This route is cached for up to 5 seconds

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.CalendarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CalendarApi apiInstance = new CalendarApi();
Integer characterId = 56; // Integer | An EVE character ID
Integer eventId = 56; // Integer | The id of the event requested
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    GetCharactersCharacterIdCalendarEventIdOk result = apiInstance.getCharactersCharacterIdCalendarEventId(characterId, eventId, datasource, ifNoneMatch, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CalendarApi#getCharactersCharacterIdCalendarEventId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **eventId** | **Integer**| The id of the event requested |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**GetCharactersCharacterIdCalendarEventIdOk**](GetCharactersCharacterIdCalendarEventIdOk.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCharactersCharacterIdCalendarEventIdAttendees"></a>
# **getCharactersCharacterIdCalendarEventIdAttendees**
> List&lt;GetCharactersCharacterIdCalendarEventIdAttendees200Ok&gt; getCharactersCharacterIdCalendarEventIdAttendees(characterId, eventId, datasource, ifNoneMatch, token)

Get attendees

Get all invited attendees for a given event  ---  This route is cached for up to 600 seconds

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.CalendarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CalendarApi apiInstance = new CalendarApi();
Integer characterId = 56; // Integer | An EVE character ID
Integer eventId = 56; // Integer | The id of the event requested
String datasource = "tranquility"; // String | The server name you would like data from
String ifNoneMatch = "ifNoneMatch_example"; // String | ETag from a previous request. A 304 will be returned if this matches the current ETag
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    List<GetCharactersCharacterIdCalendarEventIdAttendees200Ok> result = apiInstance.getCharactersCharacterIdCalendarEventIdAttendees(characterId, eventId, datasource, ifNoneMatch, token);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CalendarApi#getCharactersCharacterIdCalendarEventIdAttendees");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **eventId** | **Integer**| The id of the event requested |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **ifNoneMatch** | **String**| ETag from a previous request. A 304 will be returned if this matches the current ETag | [optional]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

[**List&lt;GetCharactersCharacterIdCalendarEventIdAttendees200Ok&gt;**](GetCharactersCharacterIdCalendarEventIdAttendees200Ok.md)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="putCharactersCharacterIdCalendarEventId"></a>
# **putCharactersCharacterIdCalendarEventId**
> putCharactersCharacterIdCalendarEventId(characterId, eventId, response, datasource, token)

Respond to an event

Set your response status to an event  ---  This route is cached for up to 5 seconds

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.CalendarApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

CalendarApi apiInstance = new CalendarApi();
Integer characterId = 56; // Integer | An EVE character ID
Integer eventId = 56; // Integer | The ID of the event requested
PutCharactersCharacterIdCalendarEventIdResponse response = new PutCharactersCharacterIdCalendarEventIdResponse(); // PutCharactersCharacterIdCalendarEventIdResponse | The response value to set, overriding current value
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    apiInstance.putCharactersCharacterIdCalendarEventId(characterId, eventId, response, datasource, token);
} catch (ApiException e) {
    System.err.println("Exception when calling CalendarApi#putCharactersCharacterIdCalendarEventId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **characterId** | **Integer**| An EVE character ID |
 **eventId** | **Integer**| The ID of the event requested |
 **response** | [**PutCharactersCharacterIdCalendarEventIdResponse**](PutCharactersCharacterIdCalendarEventIdResponse.md)| The response value to set, overriding current value |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

