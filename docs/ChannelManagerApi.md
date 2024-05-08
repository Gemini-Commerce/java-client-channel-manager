# ChannelManagerApi

All URIs are relative to *https://channel.api.gogemini.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**channelManagerCreateAssociation**](ChannelManagerApi.md#channelManagerCreateAssociation) | **POST** /channelmanager.ChannelManager/CreateAssociation | CreateAssociation |
| [**channelManagerCreateChannel**](ChannelManagerApi.md#channelManagerCreateChannel) | **POST** /channelmanager.ChannelManager/CreateChannel | CreateChannel |
| [**channelManagerCreateMarket**](ChannelManagerApi.md#channelManagerCreateMarket) | **POST** /channelmanager.ChannelManager/CreateMarket | CreateMarket |
| [**channelManagerDeleteAssociation**](ChannelManagerApi.md#channelManagerDeleteAssociation) | **POST** /channelmanager.ChannelManager/DeleteAssociation | DeleteAssociation |
| [**channelManagerDeleteChannel**](ChannelManagerApi.md#channelManagerDeleteChannel) | **POST** /channelmanager.ChannelManager/DeleteChannel | DeleteChannel |
| [**channelManagerDeleteMarket**](ChannelManagerApi.md#channelManagerDeleteMarket) | **POST** /channelmanager.ChannelManager/DeleteMarket | DeleteMarket |
| [**channelManagerGetChannel**](ChannelManagerApi.md#channelManagerGetChannel) | **POST** /channelmanager.ChannelManager/GetChannel | GetChannel |
| [**channelManagerGetChannelWithAssociations**](ChannelManagerApi.md#channelManagerGetChannelWithAssociations) | **POST** /channelmanager.ChannelManager/GetChannelWithAssociations | GetChannelWithAssociations |
| [**channelManagerGetMarket**](ChannelManagerApi.md#channelManagerGetMarket) | **POST** /channelmanager.ChannelManager/GetMarket | GetMarket |
| [**channelManagerGetMarketWithAssociations**](ChannelManagerApi.md#channelManagerGetMarketWithAssociations) | **POST** /channelmanager.ChannelManager/GetMarketWithAssociations | GetMarketWithAssociations |
| [**channelManagerListChannels**](ChannelManagerApi.md#channelManagerListChannels) | **POST** /channelmanager.ChannelManager/ListChannels | ListChannels |
| [**channelManagerListChannelsWithAssociations**](ChannelManagerApi.md#channelManagerListChannelsWithAssociations) | **POST** /channelmanager.ChannelManager/ListChannelsWithAssociations | ListChannelsWithAssociations |
| [**channelManagerListMarkets**](ChannelManagerApi.md#channelManagerListMarkets) | **POST** /channelmanager.ChannelManager/ListMarkets | ListMarkets |
| [**channelManagerListMarketsWithAssociations**](ChannelManagerApi.md#channelManagerListMarketsWithAssociations) | **POST** /channelmanager.ChannelManager/ListMarketsWithAssociations | ListMarketsWithAssociations |
| [**channelManagerUpdateChannel**](ChannelManagerApi.md#channelManagerUpdateChannel) | **POST** /channelmanager.ChannelManager/UpdateChannel | UpdateChannel |
| [**channelManagerUpdateMarket**](ChannelManagerApi.md#channelManagerUpdateMarket) | **POST** /channelmanager.ChannelManager/UpdateMarket | UpdateMarket |


<a id="channelManagerCreateAssociation"></a>
# **channelManagerCreateAssociation**
> ChannelmanagerAssociationResponse channelManagerCreateAssociation(body)

CreateAssociation

Create a new association between a channel and a market or entities

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerCreateAssociationRequest body = new ChannelmanagerCreateAssociationRequest(); // ChannelmanagerCreateAssociationRequest | 
    try {
      ChannelmanagerAssociationResponse result = apiInstance.channelManagerCreateAssociation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerCreateAssociation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerCreateAssociationRequest**](ChannelmanagerCreateAssociationRequest.md)|  | |

### Return type

[**ChannelmanagerAssociationResponse**](ChannelmanagerAssociationResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerCreateChannel"></a>
# **channelManagerCreateChannel**
> ChannelmanagerChannelResponse channelManagerCreateChannel(body)

CreateChannel

Create a new channel

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerCreateChannelRequest body = new ChannelmanagerCreateChannelRequest(); // ChannelmanagerCreateChannelRequest | 
    try {
      ChannelmanagerChannelResponse result = apiInstance.channelManagerCreateChannel(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerCreateChannel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerCreateChannelRequest**](ChannelmanagerCreateChannelRequest.md)|  | |

### Return type

[**ChannelmanagerChannelResponse**](ChannelmanagerChannelResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerCreateMarket"></a>
# **channelManagerCreateMarket**
> ChannelmanagerMarketResponse channelManagerCreateMarket(body)

CreateMarket

Create a new market

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerCreateMarketRequest body = new ChannelmanagerCreateMarketRequest(); // ChannelmanagerCreateMarketRequest | 
    try {
      ChannelmanagerMarketResponse result = apiInstance.channelManagerCreateMarket(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerCreateMarket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerCreateMarketRequest**](ChannelmanagerCreateMarketRequest.md)|  | |

### Return type

[**ChannelmanagerMarketResponse**](ChannelmanagerMarketResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerDeleteAssociation"></a>
# **channelManagerDeleteAssociation**
> Object channelManagerDeleteAssociation(body)

DeleteAssociation

Delete an existing association between a channel and a market or entities

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerDeleteAssociationRequest body = new ChannelmanagerDeleteAssociationRequest(); // ChannelmanagerDeleteAssociationRequest | 
    try {
      Object result = apiInstance.channelManagerDeleteAssociation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerDeleteAssociation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerDeleteAssociationRequest**](ChannelmanagerDeleteAssociationRequest.md)|  | |

### Return type

**Object**

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerDeleteChannel"></a>
# **channelManagerDeleteChannel**
> Object channelManagerDeleteChannel(body)

DeleteChannel

Soft delete an existing channel

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerDeleteChannelRequest body = new ChannelmanagerDeleteChannelRequest(); // ChannelmanagerDeleteChannelRequest | 
    try {
      Object result = apiInstance.channelManagerDeleteChannel(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerDeleteChannel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerDeleteChannelRequest**](ChannelmanagerDeleteChannelRequest.md)|  | |

### Return type

**Object**

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerDeleteMarket"></a>
# **channelManagerDeleteMarket**
> Object channelManagerDeleteMarket(body)

DeleteMarket

Soft delete an existing market

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerDeleteMarketRequest body = new ChannelmanagerDeleteMarketRequest(); // ChannelmanagerDeleteMarketRequest | 
    try {
      Object result = apiInstance.channelManagerDeleteMarket(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerDeleteMarket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerDeleteMarketRequest**](ChannelmanagerDeleteMarketRequest.md)|  | |

### Return type

**Object**

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerGetChannel"></a>
# **channelManagerGetChannel**
> ChannelmanagerChannelResponse channelManagerGetChannel(body)

GetChannel

Get an existing channel

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerGetChannelRequest body = new ChannelmanagerGetChannelRequest(); // ChannelmanagerGetChannelRequest | 
    try {
      ChannelmanagerChannelResponse result = apiInstance.channelManagerGetChannel(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerGetChannel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerGetChannelRequest**](ChannelmanagerGetChannelRequest.md)|  | |

### Return type

[**ChannelmanagerChannelResponse**](ChannelmanagerChannelResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerGetChannelWithAssociations"></a>
# **channelManagerGetChannelWithAssociations**
> ChannelmanagerChannelResponseWithAssociations channelManagerGetChannelWithAssociations(body)

GetChannelWithAssociations

Get an existing channel with associations

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerGetChannelWithAssociationsRequest body = new ChannelmanagerGetChannelWithAssociationsRequest(); // ChannelmanagerGetChannelWithAssociationsRequest | 
    try {
      ChannelmanagerChannelResponseWithAssociations result = apiInstance.channelManagerGetChannelWithAssociations(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerGetChannelWithAssociations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerGetChannelWithAssociationsRequest**](ChannelmanagerGetChannelWithAssociationsRequest.md)|  | |

### Return type

[**ChannelmanagerChannelResponseWithAssociations**](ChannelmanagerChannelResponseWithAssociations.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerGetMarket"></a>
# **channelManagerGetMarket**
> ChannelmanagerMarketResponse channelManagerGetMarket(body)

GetMarket

Get an existing market

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerGetMarketRequest body = new ChannelmanagerGetMarketRequest(); // ChannelmanagerGetMarketRequest | 
    try {
      ChannelmanagerMarketResponse result = apiInstance.channelManagerGetMarket(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerGetMarket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerGetMarketRequest**](ChannelmanagerGetMarketRequest.md)|  | |

### Return type

[**ChannelmanagerMarketResponse**](ChannelmanagerMarketResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerGetMarketWithAssociations"></a>
# **channelManagerGetMarketWithAssociations**
> ChannelmanagerMarketResponseWithAssociations channelManagerGetMarketWithAssociations(body)

GetMarketWithAssociations

Get an existing market with associations

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerGetMarketWithAssociationsRequest body = new ChannelmanagerGetMarketWithAssociationsRequest(); // ChannelmanagerGetMarketWithAssociationsRequest | 
    try {
      ChannelmanagerMarketResponseWithAssociations result = apiInstance.channelManagerGetMarketWithAssociations(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerGetMarketWithAssociations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerGetMarketWithAssociationsRequest**](ChannelmanagerGetMarketWithAssociationsRequest.md)|  | |

### Return type

[**ChannelmanagerMarketResponseWithAssociations**](ChannelmanagerMarketResponseWithAssociations.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerListChannels"></a>
# **channelManagerListChannels**
> ChannelmanagerListChannelsResponse channelManagerListChannels(body)

ListChannels

List all channels

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerListChannelsRequest body = new ChannelmanagerListChannelsRequest(); // ChannelmanagerListChannelsRequest | 
    try {
      ChannelmanagerListChannelsResponse result = apiInstance.channelManagerListChannels(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerListChannels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerListChannelsRequest**](ChannelmanagerListChannelsRequest.md)|  | |

### Return type

[**ChannelmanagerListChannelsResponse**](ChannelmanagerListChannelsResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerListChannelsWithAssociations"></a>
# **channelManagerListChannelsWithAssociations**
> ChannelmanagerListChannelsWithAssociationsResponse channelManagerListChannelsWithAssociations(body)

ListChannelsWithAssociations

List all channels with associations

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerListChannelsWithAssociationsRequest body = new ChannelmanagerListChannelsWithAssociationsRequest(); // ChannelmanagerListChannelsWithAssociationsRequest | 
    try {
      ChannelmanagerListChannelsWithAssociationsResponse result = apiInstance.channelManagerListChannelsWithAssociations(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerListChannelsWithAssociations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerListChannelsWithAssociationsRequest**](ChannelmanagerListChannelsWithAssociationsRequest.md)|  | |

### Return type

[**ChannelmanagerListChannelsWithAssociationsResponse**](ChannelmanagerListChannelsWithAssociationsResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerListMarkets"></a>
# **channelManagerListMarkets**
> ChannelmanagerListMarketsResponse channelManagerListMarkets(body)

ListMarkets

List all markets

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerListMarketsRequest body = new ChannelmanagerListMarketsRequest(); // ChannelmanagerListMarketsRequest | 
    try {
      ChannelmanagerListMarketsResponse result = apiInstance.channelManagerListMarkets(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerListMarkets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerListMarketsRequest**](ChannelmanagerListMarketsRequest.md)|  | |

### Return type

[**ChannelmanagerListMarketsResponse**](ChannelmanagerListMarketsResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerListMarketsWithAssociations"></a>
# **channelManagerListMarketsWithAssociations**
> ChannelmanagerListMarketsWithAssociationsResponse channelManagerListMarketsWithAssociations(body)

ListMarketsWithAssociations

List all markets with associations

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerListMarketsWithAssociationsRequest body = new ChannelmanagerListMarketsWithAssociationsRequest(); // ChannelmanagerListMarketsWithAssociationsRequest | 
    try {
      ChannelmanagerListMarketsWithAssociationsResponse result = apiInstance.channelManagerListMarketsWithAssociations(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerListMarketsWithAssociations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerListMarketsWithAssociationsRequest**](ChannelmanagerListMarketsWithAssociationsRequest.md)|  | |

### Return type

[**ChannelmanagerListMarketsWithAssociationsResponse**](ChannelmanagerListMarketsWithAssociationsResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerUpdateChannel"></a>
# **channelManagerUpdateChannel**
> ChannelmanagerChannelResponse channelManagerUpdateChannel(body)

UpdateChannel

Update an existing channel

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerUpdateChannelRequest body = new ChannelmanagerUpdateChannelRequest(); // ChannelmanagerUpdateChannelRequest | 
    try {
      ChannelmanagerChannelResponse result = apiInstance.channelManagerUpdateChannel(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerUpdateChannel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerUpdateChannelRequest**](ChannelmanagerUpdateChannelRequest.md)|  | |

### Return type

[**ChannelmanagerChannelResponse**](ChannelmanagerChannelResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

<a id="channelManagerUpdateMarket"></a>
# **channelManagerUpdateMarket**
> ChannelmanagerMarketResponse channelManagerUpdateMarket(body)

UpdateMarket

Update an existing market

### Example
```java
// Import classes:
import GeminiCommerce_ChannelManager.ApiClient;
import GeminiCommerce_ChannelManager.ApiException;
import GeminiCommerce_ChannelManager.Configuration;
import GeminiCommerce_ChannelManager.auth.*;
import GeminiCommerce_ChannelManager.models.*;
import org.openapitools.client.api.ChannelManagerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://channel.api.gogemini.io");
    
    // Configure API key authorization: standardAuthorization
    ApiKeyAuth standardAuthorization = (ApiKeyAuth) defaultClient.getAuthentication("standardAuthorization");
    standardAuthorization.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //standardAuthorization.setApiKeyPrefix("Token");

    ChannelManagerApi apiInstance = new ChannelManagerApi(defaultClient);
    ChannelmanagerUpdateMarketRequest body = new ChannelmanagerUpdateMarketRequest(); // ChannelmanagerUpdateMarketRequest | 
    try {
      ChannelmanagerMarketResponse result = apiInstance.channelManagerUpdateMarket(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelManagerApi#channelManagerUpdateMarket");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | [**ChannelmanagerUpdateMarketRequest**](ChannelmanagerUpdateMarketRequest.md)|  | |

### Return type

[**ChannelmanagerMarketResponse**](ChannelmanagerMarketResponse.md)

### Authorization

[standardAuthorization](../README.md#standardAuthorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A successful response. |  -  |
| **0** | An unexpected error response. |  -  |

