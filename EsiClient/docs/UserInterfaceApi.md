# UserInterfaceApi

All URIs are relative to *https://esi.evetech.net*

Method | HTTP request | Description
------------- | ------------- | -------------
[**postUiAutopilotWaypoint**](UserInterfaceApi.md#postUiAutopilotWaypoint) | **POST** /v2/ui/autopilot/waypoint/ | Set Autopilot Waypoint
[**postUiOpenwindowContract**](UserInterfaceApi.md#postUiOpenwindowContract) | **POST** /v1/ui/openwindow/contract/ | Open Contract Window
[**postUiOpenwindowInformation**](UserInterfaceApi.md#postUiOpenwindowInformation) | **POST** /v1/ui/openwindow/information/ | Open Information Window
[**postUiOpenwindowMarketdetails**](UserInterfaceApi.md#postUiOpenwindowMarketdetails) | **POST** /v1/ui/openwindow/marketdetails/ | Open Market Details
[**postUiOpenwindowNewmail**](UserInterfaceApi.md#postUiOpenwindowNewmail) | **POST** /v1/ui/openwindow/newmail/ | Open New Mail Window


<a name="postUiAutopilotWaypoint"></a>
# **postUiAutopilotWaypoint**
> postUiAutopilotWaypoint(addToBeginning, clearOtherWaypoints, destinationId, datasource, token)

Set Autopilot Waypoint

Set a solar system as autopilot waypoint  --- 

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.UserInterfaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

UserInterfaceApi apiInstance = new UserInterfaceApi();
Boolean addToBeginning = false; // Boolean | Whether this solar system should be added to the beginning of all waypoints
Boolean clearOtherWaypoints = false; // Boolean | Whether clean other waypoints beforing adding this one
Long destinationId = 789L; // Long | The destination to travel to, can be solar system, station or structure's id
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    apiInstance.postUiAutopilotWaypoint(addToBeginning, clearOtherWaypoints, destinationId, datasource, token);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInterfaceApi#postUiAutopilotWaypoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addToBeginning** | **Boolean**| Whether this solar system should be added to the beginning of all waypoints | [default to false]
 **clearOtherWaypoints** | **Boolean**| Whether clean other waypoints beforing adding this one | [default to false]
 **destinationId** | **Long**| The destination to travel to, can be solar system, station or structure&#39;s id |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUiOpenwindowContract"></a>
# **postUiOpenwindowContract**
> postUiOpenwindowContract(contractId, datasource, token)

Open Contract Window

Open the contract window inside the client  --- 

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.UserInterfaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

UserInterfaceApi apiInstance = new UserInterfaceApi();
Integer contractId = 56; // Integer | The contract to open
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    apiInstance.postUiOpenwindowContract(contractId, datasource, token);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInterfaceApi#postUiOpenwindowContract");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contractId** | **Integer**| The contract to open |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUiOpenwindowInformation"></a>
# **postUiOpenwindowInformation**
> postUiOpenwindowInformation(targetId, datasource, token)

Open Information Window

Open the information window for a character, corporation or alliance inside the client  --- 

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.UserInterfaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

UserInterfaceApi apiInstance = new UserInterfaceApi();
Integer targetId = 56; // Integer | The target to open
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    apiInstance.postUiOpenwindowInformation(targetId, datasource, token);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInterfaceApi#postUiOpenwindowInformation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetId** | **Integer**| The target to open |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUiOpenwindowMarketdetails"></a>
# **postUiOpenwindowMarketdetails**
> postUiOpenwindowMarketdetails(typeId, datasource, token)

Open Market Details

Open the market details window for a specific typeID inside the client  --- 

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.UserInterfaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

UserInterfaceApi apiInstance = new UserInterfaceApi();
Integer typeId = 56; // Integer | The item type to open in market window
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    apiInstance.postUiOpenwindowMarketdetails(typeId, datasource, token);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInterfaceApi#postUiOpenwindowMarketdetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **typeId** | **Integer**| The item type to open in market window |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postUiOpenwindowNewmail"></a>
# **postUiOpenwindowNewmail**
> postUiOpenwindowNewmail(newMail, datasource, token)

Open New Mail Window

Open the New Mail window, according to settings from the request if applicable  --- 

### Example
```java
// Import classes:
//import net.evetech.ApiClient;
//import net.evetech.ApiException;
//import net.evetech.Configuration;
//import net.evetech.auth.*;
//import net.evetech.esi.UserInterfaceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: evesso
OAuth evesso = (OAuth) defaultClient.getAuthentication("evesso");
evesso.setAccessToken("YOUR ACCESS TOKEN");

UserInterfaceApi apiInstance = new UserInterfaceApi();
PostUiOpenwindowNewmailNewMail newMail = new PostUiOpenwindowNewmailNewMail(); // PostUiOpenwindowNewmailNewMail | The details of mail to create
String datasource = "tranquility"; // String | The server name you would like data from
String token = "token_example"; // String | Access token to use if unable to set a header
try {
    apiInstance.postUiOpenwindowNewmail(newMail, datasource, token);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInterfaceApi#postUiOpenwindowNewmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **newMail** | [**PostUiOpenwindowNewmailNewMail**](PostUiOpenwindowNewmailNewMail.md)| The details of mail to create |
 **datasource** | **String**| The server name you would like data from | [optional] [default to tranquility] [enum: tranquility]
 **token** | **String**| Access token to use if unable to set a header | [optional]

### Return type

null (empty response body)

### Authorization

[evesso](../README.md#evesso)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

