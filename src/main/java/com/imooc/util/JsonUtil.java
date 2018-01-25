package com.imooc.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @Author: Huang
 * @Description:
 * @Date: Create in 10:07$ 2018/1/18$
 * @Modified By:
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
