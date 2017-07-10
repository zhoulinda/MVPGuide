package com.linda.mvpguide.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by zhoulinda on 17/6/7.
 */

public class DateUtil {

    private static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String DAY_TIME_FORMAT = "yyyy-MM-dd";
    private static final long ONE_SECOND = 1000;
    private static final long ONE_MINUTE = ONE_SECOND * 60;
    private static final long ONE_HOUR = ONE_MINUTE * 60;
    private static final long ONE_DAY = ONE_HOUR * 24;
    private static final long ONE_MONTH = ONE_DAY * 30;
    private static final long ONE_YEAR = ONE_MONTH * 12;

    /**
     * String 类型 格式化 "yyyy-MM-dd HH:mm:ss"
     *
     * @param time
     * @return
     */
    public static Date getDate(String time) {

        try {
            return new SimpleDateFormat(DATE_TIME_FORMAT).parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * String 类型 格式化 "yyyy-MM-dd HH:mm:ss"
     *
     * @param time
     * @return
     */
    public static Date getDate(long time) {

        try {
            return new SimpleDateFormat(DATE_TIME_FORMAT).parse(String.valueOf(time));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * String 类型 格式化 "yyyy-MM-dd HH:mm:ss"
     *
     * @param time
     * @return
     */
    public static String getDateStr(Long time) {
        if (time == null) {
            return "";
        }
        return new SimpleDateFormat(DATE_TIME_FORMAT).format(time);
    }


    /**
     * String 类型 格式化 "yyyy-MM-dd"
     *
     * @param time
     * @return
     */
    public static String getDayStr(Long time) {
        if (time == null) {
            return "";
        }
        return new SimpleDateFormat(DAY_TIME_FORMAT).format(time);
    }


    /**
     * 获取目标时间和当前时间之间的差距
     *
     * @param date
     * @return
     */
    public static String getTimestampString(Date date) {

        Date curDate = new Date();

        long splitTime = curDate.getTime() - date.getTime();

        if (splitTime < (12 * ONE_MONTH)) {

            if (splitTime < ONE_MINUTE) {
                return "刚刚";
            }
            if (splitTime < ONE_HOUR) {
                return String.format("%d分钟前", splitTime / ONE_MINUTE);
            }

            if (splitTime < ONE_DAY) {
                return String.format("%d小时前", splitTime / ONE_HOUR);
            }

            if (splitTime < ONE_MONTH) {
                return String.format("%d天前", splitTime / ONE_DAY);
            }

            return String.format("%d月前", splitTime / ONE_MONTH);
        }
        String result;
        result = "y年M月d日 HH:mm";
        return (new SimpleDateFormat(result, Locale.CHINA)).format(date);
    }


    /**
     * 获取目标时间和当前时间之间的差距
     *
     * @param time
     * @return
     */
    public static String getTimestampString(Long time) {

        if (time == null) {
            return "";
        }

        Date curDate = new Date();

        long splitTime = curDate.getTime() - time;

        if (splitTime < (12 * ONE_MONTH)) {

            if (splitTime < ONE_MINUTE) {
                return "刚刚";
            }
            if (splitTime < ONE_HOUR) {
                return String.format("%d分钟前", splitTime / ONE_MINUTE);
            }

            if (splitTime < ONE_DAY) {
                return String.format("%d小时前", splitTime / ONE_HOUR);
            }

            if (splitTime < ONE_MONTH) {
                return String.format("%d天前", splitTime / ONE_DAY);
            }

            return String.format("%d月前", splitTime / ONE_MONTH);
        }
        String result;
        result = "y年M月d日 HH:mm";
        return (new SimpleDateFormat(result, Locale.CHINA)).format(time);
    }
}
