# AccountsApi

All URIs are relative to *https://api.saasgrids.com/apis/crms/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](AccountsApi.md#createAccount) | **POST** /{userId}/accounts | Creates a new account
[**deleteAccountById**](AccountsApi.md#deleteAccountById) | **DELETE** /{userId}/account/{accountId} | Delete account by Id
[**getAccountById**](AccountsApi.md#getAccountById) | **GET** /{userId}/account/{accountId} | Get account by Id
[**getAccountFilters**](AccountsApi.md#getAccountFilters) | **GET** /{userId}/accounts/filters | Get all account filters
[**getAccountsByFilter**](AccountsApi.md#getAccountsByFilter) | **GET** /{userId}/accounts/filters/{filterId} | Get all accounts by filter
[**getAllAccounts**](AccountsApi.md#getAllAccounts) | **GET** /{userId}/accounts | Get all accounts
[**updateAccountById**](AccountsApi.md#updateAccountById) | **PUT** /{userId}/account/{accountId} | Update account by Id


<a name="createAccount"></a>
# **createAccount**
> createAccount(userId, body)

Creates a new account



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountsApi apiInstance = new AccountsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Account body = new Account(); // Account | Account object that needs to be created
try {
    apiInstance.createAccount(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#createAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Account**](Account.md)| Account object that needs to be created |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountById"></a>
# **deleteAccountById**
> deleteAccountById(userId)

Delete account by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountsApi apiInstance = new AccountsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
try {
    apiInstance.deleteAccountById(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#deleteAccountById");
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

<a name="getAccountById"></a>
# **getAccountById**
> Account getAccountById(userId, accountId)

Get account by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountsApi apiInstance = new AccountsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String accountId = "accountId_example"; // String | ObjectId of acount
try {
    Account result = apiInstance.getAccountById(userId, accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **accountId** | **String**| ObjectId of acount |

### Return type

[**Account**](Account.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAccountFilters"></a>
# **getAccountFilters**
> InlineResponse2002 getAccountFilters(userId)

Get all account filters



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountsApi apiInstance = new AccountsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
try {
    InlineResponse2002 result = apiInstance.getAccountFilters(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountFilters");
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

<a name="getAccountsByFilter"></a>
# **getAccountsByFilter**
> InlineResponse2005 getAccountsByFilter(userId, filterId)

Get all accounts by filter



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountsApi apiInstance = new AccountsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String filterId = "filterId_example"; // String | ObjectId of  filter
try {
    InlineResponse2005 result = apiInstance.getAccountsByFilter(userId, filterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAccountsByFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **filterId** | **String**| ObjectId of  filter |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAllAccounts"></a>
# **getAllAccounts**
> InlineResponse2005 getAllAccounts(userId, email)

Get all accounts



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountsApi apiInstance = new AccountsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String email = "email_example"; // String | Email id of the account
try {
    InlineResponse2005 result = apiInstance.getAllAccounts(userId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#getAllAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **email** | **String**| Email id of the account |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAccountById"></a>
# **updateAccountById**
> updateAccountById(userId, body)

Update account by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.AccountsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AccountsApi apiInstance = new AccountsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Account body = new Account(); // Account | Account object that needs to be updated
try {
    apiInstance.updateAccountById(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AccountsApi#updateAccountById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Account**](Account.md)| Account object that needs to be updated |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

