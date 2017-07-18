package com.linda.mvpguide.base;

import android.app.Activity;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.linda.mvpguide.app.AppApplication;
import com.linda.mvpguide.di.components.ApplicationComponent;
import com.trello.rxlifecycle2.components.support.RxFragment;

/**
 * 作者：linda on 2017/7/14 11:26
 * 邮箱：
 */

public abstract class BaseFragment<E extends ViewDataBinding> extends RxFragment implements IView {

    protected final String TAG = this.getClass().getName();
    protected View rootView;
    protected Context mContext;
    protected Activity mActivity;
    protected E mBinding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        if (getArguments() != null) {
            handleIntent();
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initInjector();
        rootView = inflater.inflate(getLayoutResId(), container, false);
        mBinding =DataBindingUtil.bind(rootView);
        initView();
        initData();
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        if (getMenuId() != 0)
            inflater.inflate(getMenuId(), menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onMenuItemClick(item);
        return super.onOptionsItemSelected(item);
    }

    /**
     * 获取 ApplicationComponent
     *
     * @return ApplicationComponent
     */
    protected ApplicationComponent getAppComponent() {
        return AppApplication.getAppComponent();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
        mActivity = (Activity) context;
    }


    protected abstract void handleIntent();

    protected abstract int getLayoutResId();

    protected abstract void initInjector();

    protected abstract void initView();

    protected abstract void initData();

    protected int getMenuId() {
        return 0;
    }

    protected void onMenuItemClick(MenuItem item) {

    }

    @Override
    public void showErrorMsg(String msg) {

    }

    @Override
    public void stateLoading() {

    }

    @Override
    public void stateError() {

    }

    @Override
    public void stateEmpty() {

    }

    @Override
    public void stateSuccess() {

    }
}
