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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets channelmanagerChannelStatus
 */
@JsonAdapter(ChannelmanagerChannelStatus.Adapter.class)
public enum ChannelmanagerChannelStatus {
  
  UNKNOWN("CH_STATUS_UNKNOWN"),
  
  ACTIVE("CH_STATUS_ACTIVE"),
  
  DISABLED("CH_STATUS_DISABLED"),
  
  UNDER_MAINTENANCE("CH_STATUS_UNDER_MAINTENANCE");

  private String value;

  ChannelmanagerChannelStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ChannelmanagerChannelStatus fromValue(String value) {
    for (ChannelmanagerChannelStatus b : ChannelmanagerChannelStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ChannelmanagerChannelStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ChannelmanagerChannelStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ChannelmanagerChannelStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ChannelmanagerChannelStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ChannelmanagerChannelStatus.fromValue(value);
  }
}
