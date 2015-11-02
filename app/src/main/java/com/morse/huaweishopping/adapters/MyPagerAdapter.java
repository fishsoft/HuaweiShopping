package com.morse.huaweishopping.adapters;

import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.morse.huaweishopping.beans.UrlBean;
import com.morse.huaweishopping.utils.ImageUtils;

import java.util.List;

/**
 * 作者：Morse on 2015/11/2 16:04
 * 邮箱：zm902485jgsurjgc@163.com
 */
public class MyPagerAdapter extends PagerAdapter {

    private List<ImageView> mImageViews;
    private List<UrlBean> mUrls;

    public MyPagerAdapter(List<ImageView> imageViews, List<UrlBean> urls) {
        this.mImageViews = imageViews;
        this.mUrls = urls;
    }

    @Override
    public void destroyItem(View container, int position, Object object) {
        // TODO Auto-generated method stub
        //((ViewPag.er)container).removeView((View)object);
        ((ViewPager) container).removeView(mImageViews.get(position));
    }

    @Override
    public Object instantiateItem(View container, int position) {
        ImageUtils.displayImage(mUrls.get(position).getAdPicUrl(), mImageViews.get(position));
        ((ViewPager) container).addView(mImageViews.get(position));
        return mImageViews.get((position + 1) % getCount());
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mImageViews.size();
    }

    @Override
    public boolean isViewFromObject(View arg0, Object arg1) {
        // TODO Auto-generated method stub
        return arg0 == arg1;
    }

    @Override
    public void restoreState(Parcelable arg0, ClassLoader arg1) {
        // TODO Auto-generated method stub

    }

    @Override
    public Parcelable saveState() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void startUpdate(View arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void finishUpdate(View arg0) {
        // TODO Auto-generated method stub

    }
}
