package com.linda.mvpguide.utils;

import com.linda.mvpguide.app.AppApplication;
import com.orhanobut.logger.Logger;


/**
 * 作者：linda on 2017/7/15 12:00
 * 邮箱：
 */

public class LogUtil {

    private static boolean isDebug = true;
    private static final String TAG = AppApplication.getContext().getPackageName();

    public static void e(String tag,Object o) {
        if(isDebug) {
            Logger.e(tag, o);
        }
    }

    public static void e(Object o) {
        LogUtil.e(TAG,o);
    }

    public static void w(String tag,Object o) {
        if(isDebug) {
            Logger.w(tag, o);
        }
    }

    public static void w(Object o) {
        LogUtil.w(TAG,o);
    }

    public static void d(String msg) {
        if(isDebug) {
            Logger.d(msg);
        }
    }

    public static void i(String msg) {
        if(isDebug) {
            Logger.i(msg);
        }
    }
}
