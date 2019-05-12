package com.github.uglyog.mavenamqp;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

public class MessageProvider
{
    public String generateCostMessage(long cost) {
        Map<String, Object> message = new HashMap<>();
        message.put("value", cost);
        message.put("type", "COST");
        message.put("currency", "AUD");
        return new Gson().toJson(message);
    }
}
