package com.linda.mvpguide.helper;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.text.TextUtils;

import com.linda.mvpguide.R;

/**
 * Created by zhoulinda on 16/7/21.
 */
public class DialogHelper {

    private static DialogFragment fragment;

    /***
     * 获取一个耗时等待对话框
     *
     * @param context
     * @param message
     * @return
     */
    public static ProgressDialog getWaitDialog(Context context, String message) {
        ProgressDialog waitDialog = new ProgressDialog(context, R.style.ProgressDialogTheme);
        if (!TextUtils.isEmpty(message)) {
            waitDialog.setMessage(message);
        }
        waitDialog.show();
        return waitDialog;
    }


    /**
     * 获取一个提示对话框
     *
     * @param title
     * @param message
     * @param negativeText
     * @return
     */
//    public static DialogFragment getMessageDialog(String title, String message, String positiveText,
//                                                  String negativeText,
//                                                  FragmentManager manager, String tag) {
//        fragment = MessageDialogFragment.newInstance(title, message, positiveText, negativeText);
//        fragment.show(manager, tag);
//        return fragment;
//    }


    /**
     * 获取一个单选对话框
     *
     * @param title
     * @param value
     * @param negativeText
     * @return
     */
//    public static DialogFragment getSingleChoiceDialog(String title, String[] value, String positiveText,
//                                                       String negativeText,
//                                                       FragmentManager manager, String tag) {
//        fragment = SingleChoiceDialogFragment.newInstance(title, value, positiveText, negativeText);
//        fragment.show(manager, tag);
//        return fragment;
//    }
}
