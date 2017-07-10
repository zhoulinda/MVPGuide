package com.linda.mvpguide.utils;

import android.app.Activity;
import android.content.Context;

import com.linda.mvpguide.app.AppApplication;
import com.linda.mvpguide.app.AppConfig;

public class TokenUtils {

    /**
     * 保存token的方法
     */
    public static void saveToken(String token) {
        SharedPreferencesUtil.put(AppApplication.getAppComponent().getContext(), AppConfig.TOKEN, token);
    }

    /**
     * 获取token的方法
     */
    public static String getToken() {
        return SharedPreferencesUtil.get(AppApplication.getAppComponent().getContext(), AppConfig.TOKEN, "");
    }

    /**
     * 清空token的方法
     */
    public static void removeToken() {
        SharedPreferencesUtil.remove(AppApplication.getAppComponent().getContext(), AppConfig.TOKEN);
    }

    /**
     * 检测token 并finish 当前页面
     *
     * @param descri
     * @param context
     */

    public static void checkToken(String descri, Activity context, boolean isShowToast, boolean isFinishCurrentPage, boolean isToLogin) {

        if ("Invalid access token signature".equals(descri)
                || "nvalid access token claim format, invalid JSON format".equals(descri)
                || "Invalid access token claim content, cannot fetch userId".equals(descri)
                || "Invalid access token".equals(descri)) {
            if (isShowToast) {
                ToastUtil.showToast("验证账户失败");
            }
            removeToken();
            if (isToLogin) {
                reLogin(context);
            }
        } else if ("Access token info not found".equals(descri)
                || "Access token itself expires".equals(descri)
                || "Access token expires".equals(descri)
                || "Cannot find target user 'null'".equals(descri)) {
            if (isShowToast) {
                ToastUtil.showToast("登录过期");
            }
            removeToken();
            if (isToLogin) {
                reLogin(context);
            }
        } else if ("HTTP header 'X-Access-Token' cannot be blank.".equals(descri)) {
            if (isShowToast) {
                ToastUtil.showToast("请登录后重试");
            }
            removeToken();
            if (isToLogin) {
                reLogin(context);
            }
        } else if ("Mismatched access token".equals(descri)) {
            if (isShowToast) {
                ToastUtil.showToast("账号在其他设备登录");
            }
            removeToken();
            if (isToLogin) {
                reLogin(context);
            }
        } else if ("用户状态非法".equals(descri)) {
            if (isShowToast) {
                ToastUtil.showToast("您已被禁用");
            }
            removeToken();
            if (isToLogin) {
                reLogin(context);
            }
        }

        if (isFinishCurrentPage) {
            context.finish();
        }

    }


    /**
     * 检测token的方法
     *
     * @param descri
     * @param context
     */

    public static void checkToken(String descri, Context context) {

        if ("Invalid access token signature".equals(descri)
                || "nvalid access token claim format, invalid JSON format".equals(descri)
                || "Invalid access token claim content, cannot fetch userId".equals(descri)
                || "Invalid access token".equals(descri)) {

            ToastUtil.showToast("验证账户失败");
            removeToken();
            reLogin(context);

        } else if ("Access token info not found".equals(descri)
                || "Access token itself expires".equals(descri)
                || "Access token expires".equals(descri)
                || "Cannot find target user 'null'".equals(descri)) {

            ToastUtil.showToast("登录过期");
            removeToken();
            reLogin(context);

        } else if ("HTTP header 'X-Access-Token' cannot be blank.".equals(descri)) {

            ToastUtil.showToast("请登录后重试");
            removeToken();
            reLogin(context);

        } else if ("Mismatched access token".equals(descri)) {

            ToastUtil.showToast("账号在其他设备登录");
            removeToken();
            reLogin(context);

        } else if ("用户状态非法".equals(descri)) {

            ToastUtil.showToast("您已被禁用");
            removeToken();
            reLogin(context);
        }

    }


    /**
     * 检测详情页token的方法
     *
     * @param descri
     * @param context
     */

    public static void checkAndRemoveToken(String descri, Context context) {

        if ("Invalid access token signature".equals(descri)
                || "nvalid access token claim format, invalid JSON format".equals(descri)
                || "Invalid access token claim content, cannot fetch userId".equals(descri)
                || "Invalid access token".equals(descri)) {

            ToastUtil.showToast("验证账户失败");

        } else if ("Access token info not found".equals(descri)
                || "Access token itself expires".equals(descri)
                || "Access token expires".equals(descri)
                || "Cannot find target user 'null'".equals(descri)) {

            ToastUtil.showToast("登录过期");

        } else if ("HTTP header 'X-Access-Token' cannot be blank.".equals(descri)) {

            ToastUtil.showToast("请登录后重试");

        } else if ("Mismatched access token".equals(descri)) {

            ToastUtil.showToast("账号在其他设备登录");

        } else if ("用户状态非法".equals(descri)) {

            ToastUtil.showToast("您已被禁用");
        }

        removeToken();
    }

    /**
     * 检测我的页面token的方法
     *
     * @param descri
     * @param context
     */

    public static void checkAndRemoveTokenForPerson(String descri, Context context) {

        if ("Invalid access token signature".equals(descri)
                || "nvalid access token claim format, invalid JSON format".equals(descri)
                || "Invalid access token claim content, cannot fetch userId".equals(descri)
                || "Invalid access token".equals(descri)) {

            ToastUtil.showToast("验证账户失败");

        } else if ("Access token info not found".equals(descri)
                || "Access token itself expires".equals(descri)
                || "Access token expires".equals(descri)
                || "Cannot find target user 'null'".equals(descri)) {

            ToastUtil.showToast("登录过期");

        } else if ("HTTP header 'X-Access-Token' cannot be blank.".equals(descri)) {

            ToastUtil.showToast("您还未登录");

        } else if ("Mismatched access token".equals(descri)) {

            ToastUtil.showToast("账号在其他设备登录");

        } else if ("用户状态非法".equals(descri)) {

            ToastUtil.showToast("您已被禁用");
        }

        removeToken();
    }


    public static void testToken(String descri, Context context) {

        if ("Mismatched access token".equals(descri) || "Access token info not found".equals(descri)
                || "HTTP header 'X-Access-Token' cannot be blank.".equals(descri)
                || "Access token itself expires".equals(descri)
                || "Cannot find target user 'null'".equals(descri)) {

            ToastUtil.showToast("请重新登录");

            removeToken();

            reLogin(context);
        }
    }

    /**
     * 重新登录的方法
     *
     * @param context
     * @param context
     */

    private static void reLogin(Context context) {

//        Intent intent = new Intent(context, LoginActivity.class);
//
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//
//        context.startActivity(intent);
//        UIHelper.showSimpleBack(context, SimpleBackPage.LOGIN);

    }

}
