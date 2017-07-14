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
        return NewsListFragment.newInstance(types[position]);
    }

    @Override
    public int getCount() {
        return types.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return types[position];
    }
}
