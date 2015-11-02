package com.morse.huaweishopping.beans;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 作者：Morse on 2015/11/2 17:29
 * 邮箱：zm902485jgsurjgc@163.com
 */
public class UrlBean {

    /**
     * adPrdUrl : http://asale.vmall.com/hw1111.html
     * adPicUrl : http://res.vmallres.com/pimages//sale/2015-11/20151101120319494.png
     */

    @JSONField(name = "adPrdUrl")
    private String adPrdUrl;
    @JSONField(name = "adPicUrl")
    private String adPicUrl;

    public void setAdPrdUrl(String adPrdUrl) {
        this.adPrdUrl = adPrdUrl;
    }

    public void setAdPicUrl(String adPicUrl) {
        this.adPicUrl = adPicUrl;
    }

    public String getAdPrdUrl() {
        return adPrdUrl;
    }

    public String getAdPicUrl() {
        return adPicUrl;
    }
}
