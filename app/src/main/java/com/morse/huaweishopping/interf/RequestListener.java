package com.morse.huaweishopping.interf;

import org.json.JSONObject;

/**
 * 作者：Morse on 2015/11/2 17:02
 * 邮箱：zm902485jgsurjgc@163.com
 */
public interface RequestListener {

    public void onSuccess(JSONObject object);

    public void onFailed(String string);
}
