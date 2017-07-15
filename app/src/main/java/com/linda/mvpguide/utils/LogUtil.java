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

    public static void e(String tag, String msg) {
        if (isDebug) {
            Logger.t(tag).e(msg);
        }
    }

    public static void e(String msg) {
        LogUtil.e(TAG, msg);
    }

    public static void w(String tag, String msg) {
        if (isDebug) {
            Logger.t(tag).w(msg);
        }
    }

    public static void w(String msg) {
        LogUtil.w(TAG, msg);
    }

    public static void d(String tag, String msg) {
        if (isDebug) {
            Logger.t(tag).d(msg);
        }
    }

    public static void d(String msg) {
        if (isDebug) {
            Logger.d(msg);
        }
    }

    public static void i(String msg) {
        if (isDebug) {
            Logger.i(msg);
        }
    }

    public static void i(String tag, String msg) {
        if (isDebug) {
            Logger.t(tag).i(msg);
        }
    }
}
