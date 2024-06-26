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
import org.openapitools.client.model.ChannelmanagerMarketResponse;

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
 * ChannelmanagerListMarketsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-08T15:00:20.871956445Z[Etc/UTC]")
public class ChannelmanagerListMarketsResponse {
  public static final String SERIALIZED_NAME_MARKETS = "markets";
  @SerializedName(SERIALIZED_NAME_MARKETS)
  private List<ChannelmanagerMarketResponse> markets;

  public static final String SERIALIZED_NAME_NEXT_PAGE_TOKEN = "nextPageToken";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE_TOKEN)
  private String nextPageToken;

  public ChannelmanagerListMarketsResponse() {
  }

  public ChannelmanagerListMarketsResponse markets(List<ChannelmanagerMarketResponse> markets) {
    this.markets = markets;
    return this;
  }

  public ChannelmanagerListMarketsResponse addMarketsItem(ChannelmanagerMarketResponse marketsItem) {
    if (this.markets == null) {
      this.markets = new ArrayList<>();
    }
    this.markets.add(marketsItem);
    return this;
  }

   /**
   * Get markets
   * @return markets
  **/
  @javax.annotation.Nullable
  public List<ChannelmanagerMarketResponse> getMarkets() {
    return markets;
  }

  public void setMarkets(List<ChannelmanagerMarketResponse> markets) {
    this.markets = markets;
  }


  public ChannelmanagerListMarketsResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Get nextPageToken
   * @return nextPageToken
  **/
  @javax.annotation.Nullable
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelmanagerListMarketsResponse channelmanagerListMarketsResponse = (ChannelmanagerListMarketsResponse) o;
    return Objects.equals(this.markets, channelmanagerListMarketsResponse.markets) &&
        Objects.equals(this.nextPageToken, channelmanagerListMarketsResponse.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markets, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelmanagerListMarketsResponse {\n");
    sb.append("    markets: ").append(toIndentedString(markets)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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
    openapiFields.add("markets");
    openapiFields.add("nextPageToken");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChannelmanagerListMarketsResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChannelmanagerListMarketsResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChannelmanagerListMarketsResponse is not found in the empty JSON string", ChannelmanagerListMarketsResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChannelmanagerListMarketsResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChannelmanagerListMarketsResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("markets") != null && !jsonObj.get("markets").isJsonNull()) {
        JsonArray jsonArraymarkets = jsonObj.getAsJsonArray("markets");
        if (jsonArraymarkets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("markets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `markets` to be an array in the JSON string but got `%s`", jsonObj.get("markets").toString()));
          }

          // validate the optional field `markets` (array)
          for (int i = 0; i < jsonArraymarkets.size(); i++) {
            ChannelmanagerMarketResponse.validateJsonElement(jsonArraymarkets.get(i));
          };
        }
      }
      if ((jsonObj.get("nextPageToken") != null && !jsonObj.get("nextPageToken").isJsonNull()) && !jsonObj.get("nextPageToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPageToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPageToken").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChannelmanagerListMarketsResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChannelmanagerListMarketsResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChannelmanagerListMarketsResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChannelmanagerListMarketsResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ChannelmanagerListMarketsResponse>() {
           @Override
           public void write(JsonWriter out, ChannelmanagerListMarketsResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChannelmanagerListMarketsResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChannelmanagerListMarketsResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChannelmanagerListMarketsResponse
  * @throws IOException if the JSON string is invalid with respect to ChannelmanagerListMarketsResponse
  */
  public static ChannelmanagerListMarketsResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChannelmanagerListMarketsResponse.class);
  }

 /**
  * Convert an instance of ChannelmanagerListMarketsResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

