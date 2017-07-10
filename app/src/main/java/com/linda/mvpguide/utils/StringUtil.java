package com.linda.mvpguide.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by zhoulinda on 17/5/31.
 */

public class StringUtil {

    /**
     * 标准格式化输出的函数
     *
     * @param num
     * @return
     */
    public static String format(double num) {
        NumberFormat formatter = new DecimalFormat("0.00");
        return formatter.format(num);
    }


    /**
     * 转换成Utf_8
     *
     * @param s
     * @return
     */
    public static String decode(String s) {
        try {
            return URLDecoder.decode(s == null ? "" : s, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }
}
