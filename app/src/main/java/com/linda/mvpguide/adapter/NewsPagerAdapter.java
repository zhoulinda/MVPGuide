package com.linda.mvpguide.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.linda.mvpguide.ui.news_list.NewsListFragment;

/**
 * Created by linda on 2017/7/12.
 */

public class NewsPagerAdapter extends FragmentPagerAdapter {

    private String[] types;

    public NewsPagerAdapter(FragmentManager fm, String[] items) {
        super(fm);
        this.types = items;
    }

    @Override
    public Fragment getItem(int position) {
        return NewsListFragment.newInstance(getEnType(types[position]));
    }

    @Override
    public int getCount() {
        return types.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return types[position];
    }

    private String getEnType(String type) {
        String enType = null;
        switch (type) {
            case "头条":
                enType = "top";
                break;
            case "社会":
                enType = "shehui";
                break;
            case "国内":
                enType = "guonei";
                break;
            case "国际":
                enType = "guoji";
                break;
            case "娱乐":
                enType = "yule";
                break;
            case "体育":
                enType = "tiyu";
                break;
            case "军事":
                enType = "junshi";
                break;
            case "科技":
                enType = "keji";
                break;
            case "财经":
                enType = "caijing";
                break;
            case "时尚":
                enType = "shishang";
                break;
        }
        return enType;
    }
}
