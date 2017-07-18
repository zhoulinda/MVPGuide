package com.linda.mvpguide.utils;

import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

import java.util.List;

/**
 * Created by yangbj on 15/9/24.
 */
public class NetUtil {

    /**
     *   一、判断网络连接是否可用
     *
     * @param context
     * @return
     */


    private  static ConnectivityManager cm;

    public static boolean isNetworkAvailable(Context context) {
        if (cm == null) {

            cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        }

        NetworkInfo[] info = cm.getAllNetworkInfo();

            if (info != null) {

                for (int i = 0; i < info.length; i++) {

                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {

                        return true;
                    }
                }
            }

        return false;
    }

    /**
     * 二、判断GPS是否打开
     *
     * @param context
     * @return
     */
    public static boolean isGpsEnabled(Context context) {

        LocationManager lm = ((LocationManager) context.getSystemService(Context.LOCATION_SERVICE));

        List<String> accessibleProviders = lm.getProviders(true);

        return accessibleProviders != null && accessibleProviders.size() > 0;
    }

    /**
     * 三 ：判断WIFI是否打开
     *
     * @param context
     * @return
     */

    public static boolean isWifiEnabled(Context context) {

        ConnectivityManager mgrConn = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        TelephonyManager mgrTel = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);

        return ((mgrConn.getActiveNetworkInfo() != null && mgrConn.getActiveNetworkInfo().getState() == NetworkInfo.State.CONNECTED) || mgrTel.getNetworkType() == TelephonyManager.NETWORK_TYPE_UMTS);

    }

    /**
     * 四、判断是否是3G网络
     *
     * @param context
     * @return
     */

    public static boolean is3rd(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkINfo = cm.getActiveNetworkInfo();

        if (networkINfo != null && networkINfo.getType() == ConnectivityManager.TYPE_MOBILE) {

            return true;
        }

        return false;
    }

    /**
     *   五、判断是wifi还是3g网络,用户的体现性在这里了，wifi就可以建议下载或者在线播放。
     *
     * @param context
     * @return
     */
    public static boolean isWifi(Context context) {

        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo networkINfo = cm.getActiveNetworkInfo();

        if (networkINfo != null && networkINfo.getType() == ConnectivityManager.TYPE_WIFI) {

            return true;
        }

        return false;
    }
}
