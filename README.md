# saasgrids

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.clients.saasgrids</groupId>
    <artifactId>saasgrids</artifactId>
    <version>1.2.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.clients.saasgrids:saasgrids:1.2.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/saasgrids-1.2.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import crms.*;
import crms.auth.*;
import saasgrids.*;
import saasgrids.AccountsApi;

import java.io.File;
import java.util.*;

public class AccountsApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.saasgrids.com/apis/crms/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountsApi* | [**createAccount**](docs/AccountsApi.md#createAccount) | **POST** /{userId}/accounts | Creates a new account
*AccountsApi* | [**deleteAccountById**](docs/AccountsApi.md#deleteAccountById) | **DELETE** /{userId}/account/{accountId} | Delete account by Id
*AccountsApi* | [**getAccountById**](docs/AccountsApi.md#getAccountById) | **GET** /{userId}/account/{accountId} | Get account by Id
*AccountsApi* | [**getAccountFilters**](docs/AccountsApi.md#getAccountFilters) | **GET** /{userId}/accounts/filters | Get all account filters
*AccountsApi* | [**getAccountsByFilter**](docs/AccountsApi.md#getAccountsByFilter) | **GET** /{userId}/accounts/filters/{filterId} | Get all accounts by filter
*AccountsApi* | [**getAllAccounts**](docs/AccountsApi.md#getAllAccounts) | **GET** /{userId}/accounts | Get all accounts
*AccountsApi* | [**updateAccountById**](docs/AccountsApi.md#updateAccountById) | **PUT** /{userId}/account/{accountId} | Update account by Id
*AppointmentsApi* | [**createAppointment**](docs/AppointmentsApi.md#createAppointment) | **POST** /{userId}/appointments | Creates a new appointment
*AppointmentsApi* | [**deleteAppointmentsById**](docs/AppointmentsApi.md#deleteAppointmentsById) | **DELETE** /{userId}/appointments/{appointmentId} | Delete appointments by Id
*AppointmentsApi* | [**getAllAppointments**](docs/AppointmentsApi.md#getAllAppointments) | **GET** /{userId}/appointments | Get all appointments
*AppointmentsApi* | [**getAppointmentById**](docs/AppointmentsApi.md#getAppointmentById) | **GET** /{userId}/appointments/{appointmentId} | Get appointment by Id
*AppointmentsApi* | [**updateAppointmentById**](docs/AppointmentsApi.md#updateAppointmentById) | **PUT** /{userId}/appointments/{appointmentId} | Update appointment by Id
*ContactsApi* | [**createContact**](docs/ContactsApi.md#createContact) | **POST** /{userId}/contacts | Creates a new contact
*ContactsApi* | [**deleteContactById**](docs/ContactsApi.md#deleteContactById) | **DELETE** /{userId}/contacts/{contactId} | Delete contact by Id
*ContactsApi* | [**getAllContacts**](docs/ContactsApi.md#getAllContacts) | **GET** /{userId}/contacts | Get all contacts
*ContactsApi* | [**getContactByFilter**](docs/ContactsApi.md#getContactByFilter) | **GET** /{userId}/contacts/filters/{filterId} | Get all contacts by filter
*ContactsApi* | [**getContactById**](docs/ContactsApi.md#getContactById) | **GET** /{userId}/contacts/{contactId} | Get contact by Id
*ContactsApi* | [**getContactFilters**](docs/ContactsApi.md#getContactFilters) | **GET** /{userId}/contacts/filters | Get all contact filters
*ContactsApi* | [**updateContactById**](docs/ContactsApi.md#updateContactById) | **PUT** /{userId}/contacts/{contactId} | Update contact by Id
*DealsApi* | [**createDeals**](docs/DealsApi.md#createDeals) | **POST** /{userId}/deals | Creates a new deals
*DealsApi* | [**deleteDealById**](docs/DealsApi.md#deleteDealById) | **DELETE** /{userId}/deal/{dealId} | Delete deal by Id
*DealsApi* | [**getAllDeal**](docs/DealsApi.md#getAllDeal) | **GET** /{userId}/deals | Get all deal
*DealsApi* | [**getDealById**](docs/DealsApi.md#getDealById) | **GET** /{userId}/deal/{dealId} | Get deal by Id
*DealsApi* | [**updateDealById**](docs/DealsApi.md#updateDealById) | **PUT** /{userId}/deal/{dealId} | Update deal by Id
*LeadsApi* | [**createLead**](docs/LeadsApi.md#createLead) | **POST** /{userId}/leads | Creates a new lead
*LeadsApi* | [**deleteLeadById**](docs/LeadsApi.md#deleteLeadById) | **DELETE** /{userId}/leads/{leadId} | Delete lead by Id
*LeadsApi* | [**getAllLeads**](docs/LeadsApi.md#getAllLeads) | **GET** /{userId}/leads | Get all leads
*LeadsApi* | [**getLeadById**](docs/LeadsApi.md#getLeadById) | **GET** /{userId}/leads/{leadId} | Get lead by Id
*LeadsApi* | [**getLeadFilters**](docs/LeadsApi.md#getLeadFilters) | **GET** /{userId}/leads/filters | Get all lead filters
*LeadsApi* | [**getLeadsByFilter**](docs/LeadsApi.md#getLeadsByFilter) | **GET** /{userId}/leads/filters/{filterId} | Get all leads by filter
*LeadsApi* | [**updateLeadById**](docs/LeadsApi.md#updateLeadById) | **PUT** /{userId}/leads/{leadId} | Update lead by Id
*NotesApi* | [**createNote**](docs/NotesApi.md#createNote) | **POST** /{userId}/notes | Creates a new note
*NotesApi* | [**deleteNoteById**](docs/NotesApi.md#deleteNoteById) | **DELETE** /{userId}/note/{noteId} | Delete note by Id
*NotesApi* | [**getAllNotes**](docs/NotesApi.md#getAllNotes) | **GET** /{userId}/notes | Get all notes
*NotesApi* | [**getNoteById**](docs/NotesApi.md#getNoteById) | **GET** /{userId}/note/{noteId} | Get note by Id
*NotesApi* | [**updateNoteById**](docs/NotesApi.md#updateNoteById) | **PUT** /{userId}/note/{noteId} | Update note by Id
*TasksApi* | [**createTask**](docs/TasksApi.md#createTask) | **POST** /{userId}/tasks | Creates a new task
*TasksApi* | [**deleteTaskById**](docs/TasksApi.md#deleteTaskById) | **DELETE** /{userId}/tasks/{taskId} | Delete task by Id
*TasksApi* | [**getAllTasks**](docs/TasksApi.md#getAllTasks) | **GET** /{userId}/tasks | Get all tasks
*TasksApi* | [**getTaskById**](docs/TasksApi.md#getTaskById) | **GET** /{userId}/tasks/{taskId} | Get task by Id
*TasksApi* | [**updateTaskById**](docs/TasksApi.md#updateTaskById) | **PUT** /{userId}/tasks/{taskId} | Update task by Id
*UsersApi* | [**getUsers**](docs/UsersApi.md#getUsers) | **GET** /{userId}/users | Get all users


## Documentation for Models

 - [Account](docs/Account.md)
 - [Appointment](docs/Appointment.md)
 - [Contact](docs/Contact.md)
 - [Customfield](docs/Customfield.md)
 - [Deal](docs/Deal.md)
 - [Filter](docs/Filter.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [Lead](docs/Lead.md)
 - [Note](docs/Note.md)
 - [Task](docs/Task.md)
 - [User](docs/User.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

hello@saasgrids.com

