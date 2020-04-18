package com.example.demo.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

/**
 * @Author PengZhang
 * @Date 2020/4/13 22:34
 * @Version 1.0
 */
public class JsonTools {
    // Object转json
    public static String objectToJson(Object o) {
        final ObjectMapper om = new ObjectMapper();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            om.setDateFormat(simpleDateFormat);
            return om.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
