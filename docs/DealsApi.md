# DealsApi

All URIs are relative to *https://api.saasgrids.com/apis/crms/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeals**](DealsApi.md#createDeals) | **POST** /{userId}/deals | Creates a new deals
[**deleteDealById**](DealsApi.md#deleteDealById) | **DELETE** /{userId}/deal/{dealId} | Delete deal by Id
[**getAllDeal**](DealsApi.md#getAllDeal) | **GET** /{userId}/deals | Get all deal
[**getDealById**](DealsApi.md#getDealById) | **GET** /{userId}/deal/{dealId} | Get deal by Id
[**updateDealById**](DealsApi.md#updateDealById) | **PUT** /{userId}/deal/{dealId} | Update deal by Id


<a name="createDeals"></a>
# **createDeals**
> createDeals(userId, body)

Creates a new deals



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.DealsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DealsApi apiInstance = new DealsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Deal body = new Deal(); // Deal | Deal object that needs to be created
try {
    apiInstance.createDeals(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#createDeals");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Deal**](Deal.md)| Deal object that needs to be created |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDealById"></a>
# **deleteDealById**
> deleteDealById(userId)

Delete deal by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.DealsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DealsApi apiInstance = new DealsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
try {
    apiInstance.deleteDealById(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#deleteDealById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllDeal"></a>
# **getAllDeal**
> List&lt;Deal&gt; getAllDeal(userId, email)

Get all deal



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.DealsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DealsApi apiInstance = new DealsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String email = "email_example"; // String | Email id of the deal
try {
    List<Deal> result = apiInstance.getAllDeal(userId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#getAllDeal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **email** | **String**| Email id of the deal |

### Return type

[**List&lt;Deal&gt;**](Deal.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDealById"></a>
# **getDealById**
> Deal getDealById(userId, dealId)

Get deal by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.DealsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DealsApi apiInstance = new DealsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String dealId = "dealId_example"; // String | ObjectId of acount
try {
    Deal result = apiInstance.getDealById(userId, dealId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#getDealById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **dealId** | **String**| ObjectId of acount |

### Return type

[**Deal**](Deal.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDealById"></a>
# **updateDealById**
> updateDealById(userId, body)

Update deal by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.DealsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DealsApi apiInstance = new DealsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Deal body = new Deal(); // Deal | Deal object that needs to be updated
try {
    apiInstance.updateDealById(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DealsApi#updateDealById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Deal**](Deal.md)| Deal object that needs to be updated |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

