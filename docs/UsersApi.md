# UsersApi

All URIs are relative to *https://api.saasgrids.com/apis/crms/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsers**](UsersApi.md#getUsers) | **GET** /{userId}/users/{email} | Get all users


<a name="getUsers"></a>
# **getUsers**
> InlineResponse200 getUsers(userId, email)

Get all users



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.UsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UsersApi apiInstance = new UsersApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String email = "email_example"; // String | Registered emailid in Crm
try {
    InlineResponse200 result = apiInstance.getUsers(userId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsersApi#getUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **email** | **String**| Registered emailid in Crm |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

