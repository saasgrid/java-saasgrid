# ContactsApi

All URIs are relative to *https://api.saasgrids.com/apis/crms/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createContact**](ContactsApi.md#createContact) | **POST** /{userId}/contacts | Creates a new contact
[**deleteContactById**](ContactsApi.md#deleteContactById) | **DELETE** /{userId}/contacts/{contactId} | Delete contact by Id
[**getAllContacts**](ContactsApi.md#getAllContacts) | **GET** /{userId}/contacts | Get all contacts
[**getContactByFilter**](ContactsApi.md#getContactByFilter) | **GET** /{userId}/contacts/filters/{filterId} | Get all contacts by filter
[**getContactById**](ContactsApi.md#getContactById) | **GET** /{userId}/contacts/{contactId} | Get contact by Id
[**getContactFilters**](ContactsApi.md#getContactFilters) | **GET** /{userId}/contacts/filters | Get all contact filters
[**updateContactById**](ContactsApi.md#updateContactById) | **PUT** /{userId}/contacts/{contactId} | Update contact by Id


<a name="createContact"></a>
# **createContact**
> Contact createContact(userId, body)

Creates a new contact



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Contact body = new Contact(); // Contact | Contact object that needs to be created
try {
    Contact result = apiInstance.createContact(userId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#createContact");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Contact**](Contact.md)| Contact object that needs to be created |

### Return type

[**Contact**](Contact.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteContactById"></a>
# **deleteContactById**
> deleteContactById(userId)

Delete contact by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
try {
    apiInstance.deleteContactById(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#deleteContactById");
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

<a name="getAllContacts"></a>
# **getAllContacts**
> InlineResponse2003 getAllContacts(userId, email)

Get all contacts



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String email = "email_example"; // String | Email id of the contacts
try {
    InlineResponse2003 result = apiInstance.getAllContacts(userId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getAllContacts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **email** | **String**| Email id of the contacts |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactByFilter"></a>
# **getContactByFilter**
> InlineResponse2004 getContactByFilter(userId, filterId, limit, skip)

Get all contacts by filter



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String filterId = "filterId_example"; // String | ObjectId of  filter
String limit = "limit_example"; // String | Number of records to be fetched
String skip = "skip_example"; // String | Skip value got from previous request, can be empty for first request
try {
    InlineResponse2004 result = apiInstance.getContactByFilter(userId, filterId, limit, skip);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContactByFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **filterId** | **String**| ObjectId of  filter |
 **limit** | **String**| Number of records to be fetched |
 **skip** | **String**| Skip value got from previous request, can be empty for first request | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactById"></a>
# **getContactById**
> Contact getContactById(userId, contactId)

Get contact by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String contactId = "contactId_example"; // String | ObjectId of contact
try {
    Contact result = apiInstance.getContactById(userId, contactId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContactById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **contactId** | **String**| ObjectId of contact |

### Return type

[**Contact**](Contact.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getContactFilters"></a>
# **getContactFilters**
> InlineResponse2002 getContactFilters(userId)

Get all contact filters



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
try {
    InlineResponse2002 result = apiInstance.getContactFilters(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#getContactFilters");
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

<a name="updateContactById"></a>
# **updateContactById**
> updateContactById(userId, body)

Update contact by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.ContactsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ContactsApi apiInstance = new ContactsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Contact body = new Contact(); // Contact | Contact object that needs to be updated
try {
    apiInstance.updateContactById(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ContactsApi#updateContactById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Contact**](Contact.md)| Contact object that needs to be updated |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

