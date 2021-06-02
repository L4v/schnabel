package com.schnabel.schnabel.misc;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * Converts Unix timestamp to Java's LocalDateTime
 */
public class UnixToLocalDateTimeConverter extends JsonDeserializer<LocalDateTime>{

    @Override
    public LocalDateTime deserialize(JsonParser p, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
            String unixTimestamp = p.getText().trim();
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.valueOf(unixTimestamp)), TimeZone.getDefault().toZoneId());
    }
    
}
