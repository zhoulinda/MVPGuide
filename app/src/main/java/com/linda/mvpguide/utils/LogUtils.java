package com.linda.mvpguide.utils;

import android.util.Log;

import java.util.Objects;

/**
 * 一个打印Log的快捷的方便的工具类
 *
 * @author Pgrammer.ybj@outlook.com
 *         <p>
 *         Created by yangbj on 15/8/27.
 */
public class LogUtils {

    public static boolean isDebug = true;

    /**
     * 打印提示信息 i 级别
     */

    public static void i(String tag, String info) {
        if (isDebug)

            Log.i(tag, info);
    }

    /**
     * 根据类名做Tag，利于观察
     *
     * @param tag  在调用的时候直接填入this即可
     * @param info 提示的信息
     */
    public static void i(Object tag, String info) {
        if (info != null){
            if (isDebug) {
                Log.i(tag.getClass().getSimpleName(), info);
            }
        }
    }

    /**
     * 打印Error级别的信息
     *
     * @param tag
     * @param info
     */
    public static void e(String tag, String info) {
        if (info != null) {
            if (isDebug)
                Log.e(tag, info);
        }
    }

    public static void e(Object tag, String info) {
        if (info != null) {
            if (isDebug) {
                Log.e(tag.getClass().getSimpleName(), info);
            }
        }
    }


    /**
     * 打印Debug级别信息
     */
    public static void d(String tag, String info) {
        if (info != null) {
            if (isDebug)
                Log.d(tag, info);
        }
    }

    public static void d(Objects tag, String info) {
        if (info != null) {
            if (isDebug) {
                Log.e(tag.getClass().getSimpleName(), info);
            }
        }
    }
}
