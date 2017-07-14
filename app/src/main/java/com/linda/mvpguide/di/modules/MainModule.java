package com.linda.mvpguide.di.modules;

import com.linda.mvpguide.scope.ActivityScope;
import com.linda.mvpguide.ui.main.MainActivity;
import com.linda.mvpguide.ui.main.NewsFragment;
import com.linda.mvpguide.ui.main.PicFragment;
import com.linda.mvpguide.ui.main.VideoFragment;

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

    @ActivityScope
    @Provides
    NewsFragment provideNewsFragment() {
        return new NewsFragment();
    }

    @ActivityScope
    @Provides
    PicFragment providePicFragment() {
        return new PicFragment();
    }

    @ActivityScope
    @Provides
    VideoFragment provideVideoFragment() {
        return new VideoFragment();
    }

}
