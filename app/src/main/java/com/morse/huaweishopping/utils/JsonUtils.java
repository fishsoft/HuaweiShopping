package com.morse.huaweishopping.utils;

import android.text.TextUtils;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

/**
 * 作者：Morse on 2015/11/2 17:12
 * 邮箱：zm902485jgsurjgc@163.com
 */
public class JsonUtils {

    /**
     * 将JsonObject对象转换成JavaBean
     * @param s
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T objectParse(JSONObject s, Class<T> tClass) {
        try {
            return new Gson().fromJson(s.toString(), tClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将JSONArray转换成JavaBean集合
     * @param array
     * @param ts
     * @param t
     * @param <T>
     * @return
     */
    public static <T> List<T> objectParsae(JSONArray array, List<T> ts, Class<T> t) {
        try {
            ts.clear();
            if (TextUtils.isEmpty(array.toString()) || array.length() <= 0)
                return null;
            for (int i = 0; i < array.length(); i++) {
                JSONObject object = (JSONObject) array.get(i);
                if (null != object)
                    ts.add(objectParse(object, t));
            }
            return ts;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
