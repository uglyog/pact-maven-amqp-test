package com.github.uglyog.mavenamqp;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import java.nio.charset.Charset;

public class Consumer
{
  public boolean processMessage(byte[] message) {
    try {
      JsonElement element = JsonParser.parseString(new String(message, Charset.forName("UTF-8")));
      JsonObject jsonObject = element.getAsJsonObject();
      long value = jsonObject.getAsJsonPrimitive("value").getAsLong();
      String type = jsonObject.getAsJsonPrimitive("type").getAsString();
      return true;
    } catch (JsonSyntaxException ex) {
      return false;
    }
  }
}
