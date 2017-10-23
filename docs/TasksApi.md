# TasksApi

All URIs are relative to *https://api.saasgrids.com/apis/crms/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTask**](TasksApi.md#createTask) | **POST** /{userId}/tasks | Creates a new task
[**deleteTaskById**](TasksApi.md#deleteTaskById) | **DELETE** /{userId}/tasks/{taskId} | Delete task by Id
[**getAllTasks**](TasksApi.md#getAllTasks) | **GET** /{userId}/tasks | Get all tasks
[**getTaskById**](TasksApi.md#getTaskById) | **GET** /{userId}/tasks/{taskId} | Get task by Id
[**updateTaskById**](TasksApi.md#updateTaskById) | **PUT** /{userId}/tasks/{taskId} | Update task by Id


<a name="createTask"></a>
# **createTask**
> createTask(userId, body)

Creates a new task



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TasksApi apiInstance = new TasksApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Task body = new Task(); // Task | Task object that needs to be created
try {
    apiInstance.createTask(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#createTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Task**](Task.md)| Task object that needs to be created |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTaskById"></a>
# **deleteTaskById**
> deleteTaskById(userId)

Delete task by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TasksApi apiInstance = new TasksApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
try {
    apiInstance.deleteTaskById(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#deleteTaskById");
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

<a name="getAllTasks"></a>
# **getAllTasks**
> List&lt;Task&gt; getAllTasks(userId, email)

Get all tasks



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TasksApi apiInstance = new TasksApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String email = "email_example"; // String | Email id of the task
try {
    List<Task> result = apiInstance.getAllTasks(userId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getAllTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **email** | **String**| Email id of the task |

### Return type

[**List&lt;Task&gt;**](Task.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaskById"></a>
# **getTaskById**
> Task getTaskById(userId, taskId)

Get task by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TasksApi apiInstance = new TasksApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String taskId = "taskId_example"; // String | ObjectId of task
try {
    Task result = apiInstance.getTaskById(userId, taskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#getTaskById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **taskId** | **String**| ObjectId of task |

### Return type

[**Task**](Task.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTaskById"></a>
# **updateTaskById**
> updateTaskById(userId, body)

Update task by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.TasksApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

TasksApi apiInstance = new TasksApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Task body = new Task(); // Task | Task object that needs to be updated
try {
    apiInstance.updateTaskById(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling TasksApi#updateTaskById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Task**](Task.md)| Task object that needs to be updated |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

