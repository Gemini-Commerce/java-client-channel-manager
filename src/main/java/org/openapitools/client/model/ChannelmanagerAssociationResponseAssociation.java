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
 * ChannelmanagerAssociationResponseAssociation
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-08T14:28:19.142747222Z[Etc/UTC]")
public class ChannelmanagerAssociationResponseAssociation {
  public static final String SERIALIZED_NAME_CHANNEL_GRN = "channelGrn";
  @SerializedName(SERIALIZED_NAME_CHANNEL_GRN)
  private String channelGrn;

  public static final String SERIALIZED_NAME_MARKET_GRN = "marketGrn";
  @SerializedName(SERIALIZED_NAME_MARKET_GRN)
  private String marketGrn;

  public ChannelmanagerAssociationResponseAssociation() {
  }

  public ChannelmanagerAssociationResponseAssociation channelGrn(String channelGrn) {
    this.channelGrn = channelGrn;
    return this;
  }

   /**
   * Get channelGrn
   * @return channelGrn
  **/
  @javax.annotation.Nullable
  public String getChannelGrn() {
    return channelGrn;
  }

  public void setChannelGrn(String channelGrn) {
    this.channelGrn = channelGrn;
  }


  public ChannelmanagerAssociationResponseAssociation marketGrn(String marketGrn) {
    this.marketGrn = marketGrn;
    return this;
  }

   /**
   * Get marketGrn
   * @return marketGrn
  **/
  @javax.annotation.Nullable
  public String getMarketGrn() {
    return marketGrn;
  }

  public void setMarketGrn(String marketGrn) {
    this.marketGrn = marketGrn;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelmanagerAssociationResponseAssociation channelmanagerAssociationResponseAssociation = (ChannelmanagerAssociationResponseAssociation) o;
    return Objects.equals(this.channelGrn, channelmanagerAssociationResponseAssociation.channelGrn) &&
        Objects.equals(this.marketGrn, channelmanagerAssociationResponseAssociation.marketGrn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelGrn, marketGrn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelmanagerAssociationResponseAssociation {\n");
    sb.append("    channelGrn: ").append(toIndentedString(channelGrn)).append("\n");
    sb.append("    marketGrn: ").append(toIndentedString(marketGrn)).append("\n");
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
    openapiFields.add("channelGrn");
    openapiFields.add("marketGrn");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChannelmanagerAssociationResponseAssociation
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChannelmanagerAssociationResponseAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChannelmanagerAssociationResponseAssociation is not found in the empty JSON string", ChannelmanagerAssociationResponseAssociation.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChannelmanagerAssociationResponseAssociation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChannelmanagerAssociationResponseAssociation` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("channelGrn") != null && !jsonObj.get("channelGrn").isJsonNull()) && !jsonObj.get("channelGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channelGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channelGrn").toString()));
      }
      if ((jsonObj.get("marketGrn") != null && !jsonObj.get("marketGrn").isJsonNull()) && !jsonObj.get("marketGrn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `marketGrn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("marketGrn").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChannelmanagerAssociationResponseAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChannelmanagerAssociationResponseAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChannelmanagerAssociationResponseAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChannelmanagerAssociationResponseAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<ChannelmanagerAssociationResponseAssociation>() {
           @Override
           public void write(JsonWriter out, ChannelmanagerAssociationResponseAssociation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChannelmanagerAssociationResponseAssociation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChannelmanagerAssociationResponseAssociation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChannelmanagerAssociationResponseAssociation
  * @throws IOException if the JSON string is invalid with respect to ChannelmanagerAssociationResponseAssociation
  */
  public static ChannelmanagerAssociationResponseAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChannelmanagerAssociationResponseAssociation.class);
  }

 /**
  * Convert an instance of ChannelmanagerAssociationResponseAssociation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

