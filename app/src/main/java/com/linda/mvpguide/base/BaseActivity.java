package com.linda.mvpguide.base;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.linda.mvpguide.R;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

/**
 * Created by linda on 2017/7/10.
 */

public abstract class BaseActivity<T extends ViewDataBinding> extends RxAppCompatActivity {

    protected Activity _activity;
    protected T mBinding;
    protected
    @Nullable
    Toolbar mToolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        _activity = this;
        View rootView = View.inflate(this, getLayoutRedId(), null);
        setContentView(rootView);
        mBinding = DataBindingUtil.bind(rootView);
        mToolbar = mBinding.getRoot().findViewById(R.id.toolbar);
        setToolbarTitle(getToolbarTitle());
        setSupportActionBar(mToolbar);
        getSupportActionBar().setHomeButtonEnabled(true); //设置返回键可用
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        handleIntent();
        initInjector();
        initView();
        initData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (getMenuId() != 0) {
            getMenuInflater().inflate(getMenuId(), menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            default:
                onMenuItemClick(item.getItemId());
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void setToolbarTitle(String title) {
        if (mToolbar == null)
            return;
        if (title == null || TextUtils.isEmpty(title)) {
            mToolbar.setTitle(R.string.app_name);
        }
        mToolbar.setTitle(title);
    }

    protected abstract int getLayoutRedId();

    protected abstract String getToolbarTitle();

    protected abstract void handleIntent();

    protected abstract void initInjector();

    protected abstract void initView();

    protected abstract void initData();

    protected int getMenuId() {
        return 0;
    }


    protected void onMenuItemClick(int itemId) {

    }

}
