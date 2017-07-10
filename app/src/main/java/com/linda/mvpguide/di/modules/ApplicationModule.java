package com.linda.mvpguide.di.modules;

import android.content.Context;
import android.os.Handler;

import com.linda.mvpguide.app.AppApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhoulinda on 17/5/11.
 */

@Module
public class ApplicationModule {

    private AppApplication mApplication;
//    private final DaoSession mDaoSession;
//    private final RxBus mRxBus;

    public ApplicationModule(AppApplication application) {
        mApplication = application;
//        mDaoSession = daoSession;
//        mRxBus = rxBus;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return mApplication.getApplicationContext();
    }

    @Provides
    @Singleton
    Handler provideHandler() {
        return new Handler();
    }
//
//    @Provides
//    @Singleton
//    RxBus provideRxBus() {
//        return mRxBus;
//    }
//
//    @Provides
//    @Singleton
//    DaoSession provideDaoSession() {
//        return mDaoSession;
//    }
}
