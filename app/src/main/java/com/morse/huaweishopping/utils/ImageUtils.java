package com.morse.huaweishopping.utils;

import android.net.Uri;
import android.widget.ImageView;

/**
 * 作者：Morse on 2015/11/2 16:50
 * 邮箱：zm902485jgsurjgc@163.com
 */
public class ImageUtils {

    public static void displayImage(String url,ImageView imageView){
        Uri uri=Uri.parse(url);
        imageView.setImageURI(uri);
    }

}
