# AppointmentsApi

All URIs are relative to *https://api.saasgrids.com/apis/crms/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAppointment**](AppointmentsApi.md#createAppointment) | **POST** /{userId}/appointments | Creates a new appointment
[**deleteAppointmentsById**](AppointmentsApi.md#deleteAppointmentsById) | **DELETE** /{userId}/appointments/{appointmentId} | Delete appointments by Id
[**getAllAppointments**](AppointmentsApi.md#getAllAppointments) | **GET** /{userId}/appointments | Get all appointments
[**getAppointmentById**](AppointmentsApi.md#getAppointmentById) | **GET** /{userId}/appointments/{appointmentId} | Get appointment by Id
[**updateAppointmentById**](AppointmentsApi.md#updateAppointmentById) | **PUT** /{userId}/appointments/{appointmentId} | Update appointment by Id


<a name="createAppointment"></a>
# **createAppointment**
> createAppointment(userId, body)

Creates a new appointment



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.AppointmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AppointmentsApi apiInstance = new AppointmentsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Appointment body = new Appointment(); // Appointment | Appointments object that needs to be created
try {
    apiInstance.createAppointment(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentsApi#createAppointment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Appointment**](Appointment.md)| Appointments object that needs to be created |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAppointmentsById"></a>
# **deleteAppointmentsById**
> deleteAppointmentsById(userId)

Delete appointments by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.AppointmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AppointmentsApi apiInstance = new AppointmentsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
try {
    apiInstance.deleteAppointmentsById(userId);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentsApi#deleteAppointmentsById");
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

<a name="getAllAppointments"></a>
# **getAllAppointments**
> List&lt;Appointment&gt; getAllAppointments(userId, email)

Get all appointments



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.AppointmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AppointmentsApi apiInstance = new AppointmentsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String email = "email_example"; // String | Email id related to appointment
try {
    List<Appointment> result = apiInstance.getAllAppointments(userId, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentsApi#getAllAppointments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **email** | **String**| Email id related to appointment |

### Return type

[**List&lt;Appointment&gt;**](Appointment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppointmentById"></a>
# **getAppointmentById**
> Appointment getAppointmentById(userId, appointmentId)

Get appointment by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.AppointmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AppointmentsApi apiInstance = new AppointmentsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
String appointmentId = "appointmentId_example"; // String | ObjectId of appointment
try {
    Appointment result = apiInstance.getAppointmentById(userId, appointmentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentsApi#getAppointmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **appointmentId** | **String**| ObjectId of appointment |

### Return type

[**Appointment**](Appointment.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAppointmentById"></a>
# **updateAppointmentById**
> updateAppointmentById(userId, body)

Update appointment by Id



### Example
```java
// Import classes:
//import crms.ApiClient;
//import crms.ApiException;
//import crms.Configuration;
//import crms.auth.*;
//import saasgrids.AppointmentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AppointmentsApi apiInstance = new AppointmentsApi();
String userId = "userId_example"; // String | User instance id returned from saasgrids after authorization
Appointment body = new Appointment(); // Appointment | Appointment object that needs to be updated
try {
    apiInstance.updateAppointmentById(userId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AppointmentsApi#updateAppointmentById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| User instance id returned from saasgrids after authorization |
 **body** | [**Appointment**](Appointment.md)| Appointment object that needs to be updated |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

