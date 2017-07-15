package com.linda.mvpguide.app;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

import com.linda.mvpguide.di.components.ApplicationComponent;
import com.linda.mvpguide.di.components.DaggerApplicationComponent;
import com.linda.mvpguide.di.modules.ApplicationModule;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * Created by zhoulinda on 17/5/11.
 */

public class AppApplication extends Application {

    private static final String TAG = "AppApplication";

    private static ApplicationComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initLogger();
        initInjector();

    }

    private void initLogger() {
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    /**
     * 初始化注射器
     */
    private void initInjector() {
        // 这里不做注入操作，只提供一些全局单例数据
        mAppComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public static ApplicationComponent getAppComponent() {
        return mAppComponent;
    }

    public static Context getContext() {
        return mAppComponent.getContext();
    }

    public static Handler getHandler() {
        return mAppComponent.getHandler();
    }


    /**
     * 初始化数据库
     */
    private void initDatabase() {
//        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(getApplication(), DB_NAME);
//        Database database = helper.getWritableDb();
//        mDaoSession = new DaoMaster(database).newSession();
//        NewsTypeDao.updateLocalData(getApplication(), mDaoSession);
//        DownloadUtils.init(mDaoSession.getBeautyPhotoInfoDao());
    }
}
