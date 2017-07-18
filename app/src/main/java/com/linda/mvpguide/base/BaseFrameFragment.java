package com.linda.mvpguide.base;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.linda.mvpguide.R;
import com.linda.mvpguide.view.EmptyLayout;

import javax.inject.Inject;

/**
 * 作者：linda on 2017/7/14 15:56
 * 邮箱：
 */

public abstract class BaseFrameFragment<T, E extends ViewDataBinding> extends BaseFragment<E> {

    protected EmptyLayout mEmptyLayout;
    protected View mContentView;

    @Inject
    protected T mPresenter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        initInjector();
        if (rootView == null) {
            rootView = inflater.inflate(getLayoutResId(), container, false);
            LinearLayout mContentContain = (LinearLayout) rootView.findViewById(R.id.content_contain);
            mEmptyLayout = (EmptyLayout) rootView.findViewById(R.id.emptyLayout);
            mEmptyLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    initData();
                }
            });
            mContentView = getContentView();
            mBinding = DataBindingUtil.bind(mContentView);
            mContentContain.addView(mContentView);
            initView();
            initData();
        }
        return rootView;
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_frame_base;
    }

    private View getContentView() {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        return inflater.inflate(getContentResId(), null);
    }

    protected abstract int getContentResId();

    @Override
    public void showErrorMsg(String msg) {

    }

    @Override
    public void stateLoading() {
        mEmptyLayout.setErrorType(EmptyLayout.NETWORK_LOADING);
    }

    @Override
    public void stateError() {
        mEmptyLayout.setErrorType(EmptyLayout.NETWORK_ERROR);
    }

    @Override
    public void stateEmpty() {
        mEmptyLayout.setErrorType(EmptyLayout.NODATA);
    }

    @Override
    public void stateSuccess() {
        mEmptyLayout.setErrorType(EmptyLayout.HIDE_LAYOUT);
    }
}
