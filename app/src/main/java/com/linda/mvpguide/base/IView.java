package com.linda.mvpguide.base;

/**
 * Created by linda on 2017/7/12.
 */

public interface IView {

    void showErrorMsg(String msg);

    void stateLoading();

    void stateError();

    void stateEmpty();

    void stateSuccess();

}
