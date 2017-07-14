package com.linda.mvpguide.di.modules;

import com.linda.mvpguide.adapter.NewsPagerAdapter;
import com.linda.mvpguide.scope.FragmentScope;
import com.linda.mvpguide.ui.main.NewsFragment;

import dagger.Module;
import dagger.Provides;

/**
 * Created by linda on 2017/7/12.
 */

@Module
public class NewsModule {

    private NewsFragment mView;

    public NewsModule(NewsFragment mView) {
        this.mView = mView;
    }

    @FragmentScope
    @Provides
    NewsPagerAdapter provideNewsPagerAdapter(String[] types) {
        return new NewsPagerAdapter(mView.getChildFragmentManager(), types);
    }

    //    头条，社会，国内，娱乐，体育，军事，科技，财经，时尚
    @FragmentScope
    @Provides
    String[] provideNewsTypes() {
        return new String[]{"头条", "社会", "国内", "娱乐", "体育", "军事", "科技", "财经", "时尚"};
    }
}
