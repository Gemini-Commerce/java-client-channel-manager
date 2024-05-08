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
import org.openapitools.client.model.ChannelmanagerChannelResponse;

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
 * ChannelmanagerMarketResponseWithAssociationsAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-08T15:00:20.871956445Z[Etc/UTC]")
public class ChannelmanagerMarketResponseWithAssociationsAssociation {
  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelmanagerChannelResponse channel;

  public ChannelmanagerMarketResponseWithAssociationsAssociation() {
  }

  public ChannelmanagerMarketResponseWithAssociationsAssociation channel(ChannelmanagerChannelResponse channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @javax.annotation.Nullable
  public ChannelmanagerChannelResponse getChannel() {
    return channel;
  }

  public void setChannel(ChannelmanagerChannelResponse channel) {
    this.channel = channel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelmanagerMarketResponseWithAssociationsAssociation channelmanagerMarketResponseWithAssociationsAssociation = (ChannelmanagerMarketResponseWithAssociationsAssociation) o;
    return Objects.equals(this.channel, channelmanagerMarketResponseWithAssociationsAssociation.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelmanagerMarketResponseWithAssociationsAssociation {\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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
    openapiFields.add("channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChannelmanagerMarketResponseWithAssociationsAssociation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChannelmanagerMarketResponseWithAssociationsAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChannelmanagerMarketResponseWithAssociationsAssociation is not found in the empty JSON string", ChannelmanagerMarketResponseWithAssociationsAssociation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChannelmanagerMarketResponseWithAssociationsAssociation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChannelmanagerMarketResponseWithAssociationsAssociation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `channel`
      if (jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) {
        ChannelmanagerChannelResponse.validateJsonElement(jsonObj.get("channel"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChannelmanagerMarketResponseWithAssociationsAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChannelmanagerMarketResponseWithAssociationsAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChannelmanagerMarketResponseWithAssociationsAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChannelmanagerMarketResponseWithAssociationsAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<ChannelmanagerMarketResponseWithAssociationsAssociation>() {
           @Override
           public void write(JsonWriter out, ChannelmanagerMarketResponseWithAssociationsAssociation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChannelmanagerMarketResponseWithAssociationsAssociation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChannelmanagerMarketResponseWithAssociationsAssociation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChannelmanagerMarketResponseWithAssociationsAssociation
  * @throws IOException if the JSON string is invalid with respect to ChannelmanagerMarketResponseWithAssociationsAssociation
  */
  public static ChannelmanagerMarketResponseWithAssociationsAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChannelmanagerMarketResponseWithAssociationsAssociation.class);
  }

 /**
  * Convert an instance of ChannelmanagerMarketResponseWithAssociationsAssociation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

