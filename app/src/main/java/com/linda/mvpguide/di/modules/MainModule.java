package com.linda.mvpguide.di.modules;

import android.support.v4.app.Fragment;

import com.linda.mvpguide.scope.ActivityScope;
import com.linda.mvpguide.ui.main.MainActivity;
import com.linda.mvpguide.ui.main.NewsFragment;
import com.linda.mvpguide.ui.main.PicFragment;
import com.linda.mvpguide.ui.main.VideoFragment;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;

/**
 * Created by linda on 2017/7/10.
 */

@Module
public class MainModule {

    private MainActivity mView;

    public MainModule(MainActivity view) {
        mView = view;
    }

    //    头条，社会，国内，娱乐，体育，军事，科技，财经，时尚等新闻信息
//    @ActivityScope
//    @Provides
//    String[] provideStrs() {
//        return new String[]{"头条", "社会", "国内", "娱乐", "体育", "军事", "科技", "财经", "时尚"};
//    }

    @ActivityScope
    @Provides
    List<Fragment> provideFragmeng() {
        List<Fragment> fragments = new ArrayList<>();
        NewsFragment newsFragment = new NewsFragment();
        PicFragment picFragment = new PicFragment();
        VideoFragment videoFragment = new VideoFragment();
        fragments.add(newsFragment);
        fragments.add(picFragment);
        fragments.add(videoFragment);
        return fragments;
    }



}
