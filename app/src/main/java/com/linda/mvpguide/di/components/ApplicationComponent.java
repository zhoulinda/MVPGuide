package com.linda.mvpguide.di.components;

import android.content.Context;
import android.os.Handler;

import com.linda.mvpguide.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zhoulinda on 17/5/11.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

//    void inject(BaseActivity baseActivity);

    // provide
    Context getContext();

    Handler getHandler();
//
//    RxBus getRxBus();
//
//    DaoSession getDaoSession();
}
