# LeadsApi

All URIs are relative to *https://api.saasgrids.com/apis/crms/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLead**](LeadsApi.md#createLead) | **POST** /{userId}/leads | Creates a new lead
[**deleteLeadById**](LeadsApi.md#deleteLeadById) | **DELETE** /{userId}/leads/{leadId} | Delete lead by Id
[**getAllLeads**](LeadsApi.md#getAllLeads) | **GET** /{userId}/leads | Get all leads
[**getLeadById**](LeadsApi.md#getLeadById) | **GET** /{userId}/leads/{leadId} | Get lead by Id
[**getLeadFilters**](LeadsApi.md#getLeadFilters) | **GET** /{userId}/leads/filters | Get all lead filters
[**getLeadsByFilter**](LeadsApi.md#getLeadsByFilter) | **GET** /{userId}/leads/filters/{filterId} | Get all leads by filter
[**updateLeadById**](LeadsApi.md#updateLeadById) | **PUT** /{userId}/leads/{leadId} | Update lead by Id


<a name="createLead"></a>
# **createLead**
> Lead createLead(userId, body)

Creates a new lead



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.LeadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LeadsApi apiInstance = new LeadsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Lead body = new Lead(); // Lead | Lead object that needs to be created
try {
    Lead result = apiInstance.createLead(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadsApi#createLead");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Lead**](Lead.md)| Lead object that needs to be created |

### Return type

[**Lead**](Lead.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteLeadById"></a>
# **deleteLeadById**
> deleteLeadById(userId)

Delete lead by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.LeadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LeadsApi apiInstance = new LeadsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
try {
    apiInstance.deleteLeadById(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadsApi#deleteLeadById");
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

<a name="getAllLeads"></a>
# **getAllLeads**
> InlineResponse2001 getAllLeads(userId, email)

Get all leads



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.LeadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LeadsApi apiInstance = new LeadsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String email = "email_example"; // String | Email id of the lead
try {
    InlineResponse2001 result = apiInstance.getAllLeads(userId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadsApi#getAllLeads");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **email** | **String**| Email id of the lead |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLeadById"></a>
# **getLeadById**
> Lead getLeadById(userId, leadId)

Get lead by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.LeadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LeadsApi apiInstance = new LeadsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String leadId = "leadId_example"; // String | ObjectId of lead
try {
    Lead result = apiInstance.getLeadById(userId, leadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadsApi#getLeadById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **leadId** | **String**| ObjectId of lead |

### Return type

[**Lead**](Lead.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLeadFilters"></a>
# **getLeadFilters**
> InlineResponse2002 getLeadFilters(userId)

Get all lead filters



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.LeadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LeadsApi apiInstance = new LeadsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
try {
    InlineResponse2002 result = apiInstance.getLeadFilters(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadsApi#getLeadFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLeadsByFilter"></a>
# **getLeadsByFilter**
> InlineResponse2001 getLeadsByFilter(userId, filterId)

Get all leads by filter



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.LeadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LeadsApi apiInstance = new LeadsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String filterId = "filterId_example"; // String | ObjectId of  filter
try {
    InlineResponse2001 result = apiInstance.getLeadsByFilter(userId, filterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadsApi#getLeadsByFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **filterId** | **String**| ObjectId of  filter |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateLeadById"></a>
# **updateLeadById**
> updateLeadById(userId, body)

Update lead by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.LeadsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LeadsApi apiInstance = new LeadsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Lead body = new Lead(); // Lead | Lead object that needs to be updated
try {
    apiInstance.updateLeadById(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling LeadsApi#updateLeadById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Lead**](Lead.md)| Lead object that needs to be updated |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

