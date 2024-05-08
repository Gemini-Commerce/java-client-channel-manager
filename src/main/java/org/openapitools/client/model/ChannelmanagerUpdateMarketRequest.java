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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.ChannelmanagerUpdateMarketRequestPayload;

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
 * ChannelmanagerUpdateMarketRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-08T08:02:08.598927156Z[Etc/UTC]")
public class ChannelmanagerUpdateMarketRequest {
  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PAYLOAD = "payload";
  @SerializedName(SERIALIZED_NAME_PAYLOAD)
  private ChannelmanagerUpdateMarketRequestPayload payload;

  public static final String SERIALIZED_NAME_PAYLOAD_MASK = "payloadMask";
  @SerializedName(SERIALIZED_NAME_PAYLOAD_MASK)
  private List<String> payloadMask;

  public ChannelmanagerUpdateMarketRequest() {
  }

  public ChannelmanagerUpdateMarketRequest tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public ChannelmanagerUpdateMarketRequest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ChannelmanagerUpdateMarketRequest payload(ChannelmanagerUpdateMarketRequestPayload payload) {
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  public ChannelmanagerUpdateMarketRequestPayload getPayload() {
    return payload;
  }

  public void setPayload(ChannelmanagerUpdateMarketRequestPayload payload) {
    this.payload = payload;
  }


  public ChannelmanagerUpdateMarketRequest payloadMask(List<String> payloadMask) {
    this.payloadMask = payloadMask;
    return this;
  }

  public ChannelmanagerUpdateMarketRequest addPayloadMaskItem(String payloadMaskItem) {
    if (this.payloadMask == null) {
      this.payloadMask = new ArrayList<>();
    }
    this.payloadMask.add(payloadMaskItem);
    return this;
  }

   /**
   * Get payloadMask
   * @return payloadMask
  **/
  @javax.annotation.Nullable
  public List<String> getPayloadMask() {
    return payloadMask;
  }

  public void setPayloadMask(List<String> payloadMask) {
    this.payloadMask = payloadMask;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelmanagerUpdateMarketRequest channelmanagerUpdateMarketRequest = (ChannelmanagerUpdateMarketRequest) o;
    return Objects.equals(this.tenantId, channelmanagerUpdateMarketRequest.tenantId) &&
        Objects.equals(this.id, channelmanagerUpdateMarketRequest.id) &&
        Objects.equals(this.payload, channelmanagerUpdateMarketRequest.payload) &&
        Objects.equals(this.payloadMask, channelmanagerUpdateMarketRequest.payloadMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, id, payload, payloadMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelmanagerUpdateMarketRequest {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    payloadMask: ").append(toIndentedString(payloadMask)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("payload");
    openapiFields.add("payloadMask");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChannelmanagerUpdateMarketRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChannelmanagerUpdateMarketRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChannelmanagerUpdateMarketRequest is not found in the empty JSON string", ChannelmanagerUpdateMarketRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChannelmanagerUpdateMarketRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChannelmanagerUpdateMarketRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("tenantId") != null && !jsonObj.get("tenantId").isJsonNull()) && !jsonObj.get("tenantId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tenantId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tenantId").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `payload`
      if (jsonObj.get("payload") != null && !jsonObj.get("payload").isJsonNull()) {
        ChannelmanagerUpdateMarketRequestPayload.validateJsonElement(jsonObj.get("payload"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("payloadMask") != null && !jsonObj.get("payloadMask").isJsonNull() && !jsonObj.get("payloadMask").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `payloadMask` to be an array in the JSON string but got `%s`", jsonObj.get("payloadMask").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChannelmanagerUpdateMarketRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChannelmanagerUpdateMarketRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChannelmanagerUpdateMarketRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChannelmanagerUpdateMarketRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ChannelmanagerUpdateMarketRequest>() {
           @Override
           public void write(JsonWriter out, ChannelmanagerUpdateMarketRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChannelmanagerUpdateMarketRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChannelmanagerUpdateMarketRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChannelmanagerUpdateMarketRequest
  * @throws IOException if the JSON string is invalid with respect to ChannelmanagerUpdateMarketRequest
  */
  public static ChannelmanagerUpdateMarketRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChannelmanagerUpdateMarketRequest.class);
  }

 /**
  * Convert an instance of ChannelmanagerUpdateMarketRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
