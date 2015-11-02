package com.morse.huaweishopping.utils;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.morse.huaweishopping.interf.RequestListener;

import org.json.JSONObject;

/**
 * 作者：Morse on 2015/11/2 16:58
 * 邮箱：zm902485jgsurjgc@163.com
 */
public class HttpUtils {

    public static String homeAdInfo="http://mw.vmall.com/homeAdInfo.json";
    public static String getHotWords="http://mw.vmall.com/search/getHotWords.json";
    public static String homeRegionList="http://mw.vmall.com/homeRegionList.json";

    public static String honor="http://mw.vmall.com/honor.json";

    public static String category="http://mw.vmall.com/category/getall.json";

    public static String personal="http://mw.vmall.com/personal/?clientVersion=31";

    public static JSONObject getHttpRequest(String url, final RequestListener listener){
        JsonObjectRequest request=new JsonObjectRequest(url, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                listener.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onFailed(error.toString());
            }
        });
        return null;
    }
}
