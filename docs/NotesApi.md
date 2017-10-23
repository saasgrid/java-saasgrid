# NotesApi

All URIs are relative to *https://api.saasgrids.com/apis/crms/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNote**](NotesApi.md#createNote) | **POST** /{userId}/notes | Creates a new note
[**deleteNoteById**](NotesApi.md#deleteNoteById) | **DELETE** /{userId}/note/{noteId} | Delete note by Id
[**getAllNotes**](NotesApi.md#getAllNotes) | **GET** /{userId}/notes | Get all notes
[**getNoteById**](NotesApi.md#getNoteById) | **GET** /{userId}/note/{noteId} | Get note by Id
[**updateNoteById**](NotesApi.md#updateNoteById) | **PUT** /{userId}/note/{noteId} | Update note by Id


<a name="createNote"></a>
# **createNote**
> createNote(userId, body)

Creates a new note



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.NotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NotesApi apiInstance = new NotesApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Note body = new Note(); // Note | Note object that needs to be created
try {
    apiInstance.createNote(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#createNote");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Note**](Note.md)| Note object that needs to be created |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNoteById"></a>
# **deleteNoteById**
> deleteNoteById(userId)

Delete note by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.NotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NotesApi apiInstance = new NotesApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
try {
    apiInstance.deleteNoteById(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#deleteNoteById");
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

<a name="getAllNotes"></a>
# **getAllNotes**
> List&lt;Note&gt; getAllNotes(userId, email)

Get all notes



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.NotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NotesApi apiInstance = new NotesApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String email = "email_example"; // String | Email id of the note
try {
    List<Note> result = apiInstance.getAllNotes(userId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#getAllNotes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **email** | **String**| Email id of the note |

### Return type

[**List&lt;Note&gt;**](Note.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNoteById"></a>
# **getNoteById**
> Note getNoteById(userId, noteId)

Get note by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.NotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NotesApi apiInstance = new NotesApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String noteId = "noteId_example"; // String | ObjectId of acount
try {
    Note result = apiInstance.getNoteById(userId, noteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#getNoteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **noteId** | **String**| ObjectId of acount |

### Return type

[**Note**](Note.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNoteById"></a>
# **updateNoteById**
> updateNoteById(userId, body)

Update note by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.NotesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NotesApi apiInstance = new NotesApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Note body = new Note(); // Note | Note object that needs to be updated
try {
    apiInstance.updateNoteById(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling NotesApi#updateNoteById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Note**](Note.md)| Note object that needs to be updated |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

