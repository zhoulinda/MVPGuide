package com.linda.mvpguide.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.linda.mvpguide.app.AppConfig;

public class SharedPreferencesUtil {

    private static SharedPreferences mSharedPreferences;

    private static final String SHAREDPREFERENCES_FILE_NAME = AppConfig.LOCAL_CACHE_FILE_NAME;

    public static void put(Context context, String key, boolean value) {

        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SHAREDPREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        }
        mSharedPreferences.edit().putBoolean(key, value).commit();
    }

    public static boolean get(Context context, String key, boolean defValue) {

        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SHAREDPREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        }
        return mSharedPreferences.getBoolean(key, defValue);
    }

    public static void put(Context context, String key, String value) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SHAREDPREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        }
        mSharedPreferences.edit().putString(key, value).commit();
    }

    public static String get(Context context, String key, String defValue) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SHAREDPREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        }
        return mSharedPreferences.getString(key, defValue);
    }

    public static void put(Context context, String key, int value) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SHAREDPREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        }
        mSharedPreferences.edit().putInt(key, value).commit();
    }


    public static Integer get(Context context, String key, int defValue) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SHAREDPREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        }
        return mSharedPreferences.getInt(key, defValue);
    }


    public static void remove(Context context, String key) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SHAREDPREFERENCES_FILE_NAME, Context.MODE_PRIVATE);
        }
        mSharedPreferences.edit().remove(key).commit();
    }

    public static void putStringAppend(Context context, String key, String value) {
        if (mSharedPreferences == null) {
            mSharedPreferences = context.getSharedPreferences(SHAREDPREFERENCES_FILE_NAME, Context.MODE_APPEND);
        }
        mSharedPreferences.edit().putString(key, value).commit();
    }

}
