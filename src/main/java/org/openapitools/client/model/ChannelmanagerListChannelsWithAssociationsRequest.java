/*
 * Channel Manager Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@gemini-commerce.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import GeminiCommerce_ChannelManager.JSON;

/**
 * ChannelmanagerListChannelsWithAssociationsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-08T14:28:19.142747222Z[Etc/UTC]")
public class ChannelmanagerListChannelsWithAssociationsRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize;

  public static final String SERIALIZED_NAME_PAGE_TOKEN = "pageToken";
  @SerializedName(SERIALIZED_NAME_PAGE_TOKEN)
  private String pageToken;

  public ChannelmanagerListChannelsWithAssociationsRequest() {
  }

  public ChannelmanagerListChannelsWithAssociationsRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nonnull
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public ChannelmanagerListChannelsWithAssociationsRequest pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The number of items to return per page. If not specified, it will returns all items.
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public ChannelmanagerListChannelsWithAssociationsRequest pageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

   /**
   * Get pageToken
   * @return pageToken
  **/
  @javax.annotation.Nullable
  public String getPageToken() {
    return pageToken;
  }

  public void setPageToken(String pageToken) {
    this.pageToken = pageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelmanagerListChannelsWithAssociationsRequest channelmanagerListChannelsWithAssociationsRequest = (ChannelmanagerListChannelsWithAssociationsRequest) o;
    return Objects.equals(this.tenantId, channelmanagerListChannelsWithAssociationsRequest.tenantId) &&
        Objects.equals(this.pageSize, channelmanagerListChannelsWithAssociationsRequest.pageSize) &&
        Objects.equals(this.pageToken, channelmanagerListChannelsWithAssociationsRequest.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, pageSize, pageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelmanagerListChannelsWithAssociationsRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    pageToken: ").append(toIndentedString(pageToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tenantId");
    openapiFields.add("pageSize");
    openapiFields.add("pageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("tenantId");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChannelmanagerListChannelsWithAssociationsRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChannelmanagerListChannelsWithAssociationsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChannelmanagerListChannelsWithAssociationsRequest is not found in the empty JSON string", ChannelmanagerListChannelsWithAssociationsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChannelmanagerListChannelsWithAssociationsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChannelmanagerListChannelsWithAssociationsRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChannelmanagerListChannelsWithAssociationsRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("pageToken") != null && !jsonObj.get("pageToken").isJsonNull()) && !jsonObj.get("pageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pageToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChannelmanagerListChannelsWithAssociationsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChannelmanagerListChannelsWithAssociationsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChannelmanagerListChannelsWithAssociationsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChannelmanagerListChannelsWithAssociationsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ChannelmanagerListChannelsWithAssociationsRequest>() {
           @Override
           public void write(JsonWriter out, ChannelmanagerListChannelsWithAssociationsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChannelmanagerListChannelsWithAssociationsRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChannelmanagerListChannelsWithAssociationsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChannelmanagerListChannelsWithAssociationsRequest
  * @throws IOException if the JSON string is invalid with respect to ChannelmanagerListChannelsWithAssociationsRequest
  */
  public static ChannelmanagerListChannelsWithAssociationsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChannelmanagerListChannelsWithAssociationsRequest.class);
  }

 /**
  * Convert an instance of ChannelmanagerListChannelsWithAssociationsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

