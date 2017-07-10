package com.linda.mvpguide.utils;

import android.widget.Toast;

import com.linda.mvpguide.app.AppApplication;

public class ToastUtil {
	private static Toast toast;
	/**
	 * 能够连续弹吐司，不用等上个消失
	 * @param text
	 */
	public static void showToast(String text){
		showToast(text, Toast.LENGTH_SHORT);
	}

	public static void showToast(String text, int time){
		if(toast==null){
			toast = Toast.makeText(AppApplication.getContext(), text, time);
		}
		toast.setText(text);
		toast.show();
	}
}
