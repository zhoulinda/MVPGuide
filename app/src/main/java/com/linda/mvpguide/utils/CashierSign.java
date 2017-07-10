package com.linda.mvpguide.utils;

import android.util.Log;

import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA
 * User: Sirius
 * Date: 2015/6/19
 * Time: 15:20
 */
public class CashierSign {

    public static final String Cashier_sdCode = "CASH002";//收银服务定义code
    public static final int launchType = 0;//请求类型，0:启动main Activity，1：启动指定Activity，2：启动service()

    private static final String Tag = "CashierSign";

    private static final String SignType = "MD5";
    private static final String inputCharset = "UTF-8";

    public static byte[] sign(String bpId, String invokeCashierKey, String channel, String payType, String outTradeNo, String body, String attach, String totalFee
            , String backPkgName, String backClassPath, String notifUrl, String call_scan) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Map<String, String> dataMap = new HashMap<String, String>();
        dataMap.put("bp_id", bpId);
        dataMap.put("channel", channel);
        dataMap.put("pay_type", payType);
        dataMap.put("out_trade_no", outTradeNo);
        dataMap.put("body", body);
        dataMap.put("attach", attach);
        dataMap.put("total_fee", totalFee);
        dataMap.put("input_charset", inputCharset);
        //如果需要页面调回到自己的App，需要在调用中增加参数package和classpath(如com.xxx.pay.ResultActivity)，并且这个跳转的Activity需要在AndroidManifest.xml中增加android:exported=”true”属性。
//        dataMap.put("package", backPkgName);
//        dataMap.put("classpath", backClassPath);
        dataMap.put("notify_url", notifUrl);
        dataMap.put("call_scan", call_scan);

        String sign = getSign(invokeCashierKey, dataMap);
        dataMap.put("sign", sign);

        JSONObject json = new JSONObject(dataMap);
        return json.toString().getBytes(inputCharset);
    }

    //签名加密方法，只需要调用
    private static String getSign(String invokeCashierKey, Map<String, String> dataMap) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        List<String> keyList = new ArrayList<String>(dataMap.keySet());
        Collections.sort(keyList);
        StringBuilder builder = new StringBuilder();
        for (String mapKey : keyList) {
            builder.append(mapKey).append("=").append(dataMap.get(mapKey)).append("&");
        }
        builder.append("key=").append(invokeCashierKey);
        Log.i(Tag, "MD5加密前-->" + builder);
        MessageDigest md5 = MessageDigest.getInstance(SignType);
        md5.update(builder.toString().getBytes(inputCharset));
        byte[] md5Bytes = md5.digest();
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        Log.i(Tag, "MD5加密后-->" + hexValue);
        return hexValue.toString();
    }
}
