package com.linda.mvpguide.ui.main;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.linda.mvpguide.R;
import com.linda.mvpguide.app.AppApplication;
import com.linda.mvpguide.di.components.DaggerMainComponent;
import com.linda.mvpguide.di.modules.MainModule;
import com.linda.mvpguide.utils.ToastUtil;

import java.util.List;

import javax.inject.Inject;

import static com.linda.mvpguide.R.id.toolbar;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "MainActivity";
    private FragmentManager mFragmentManager;

    @Inject
    NewsFragment mNewsFragment;
    @Inject
    PicFragment mPicFragment;
    @Inject
    VideoFragment mVideoFragment;
    private NavigationView mNavigationView;
    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInject();
        initView();
    }

    private void initView() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        Toolbar mToolbar = (Toolbar) findViewById(toolbar);
        mToolbar.setTitle(getString(R.string.app_name));
        setSupportActionBar(mToolbar);
        getSupportActionBar().setHomeButtonEnabled(true); //设置返回键可用
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //创建返回键，并实现打开关/闭监听
        ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.open, R.string.close) {
            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                mDrawerLayout.openDrawer(Gravity.START, true);
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                mDrawerLayout.closeDrawer(Gravity.START, true);
            }
        };
        mDrawerToggle.syncState();
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        mNavigationView = (NavigationView) findViewById(R.id.navigationView);
        mNavigationView.setNavigationItemSelectedListener(this);

        mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mTransaction = mFragmentManager.beginTransaction();
        mTransaction
                .add(R.id.frame_contain, mNewsFragment, mNewsFragment.getClass().getSimpleName())
                .add(R.id.frame_contain, mPicFragment, mPicFragment.getClass().getSimpleName())
                .add(R.id.frame_contain, mVideoFragment, mVideoFragment.getClass().getSimpleName())
                .hide(mPicFragment).hide(mVideoFragment).show(mNewsFragment).commit();
    }

    private void initInject() {
        DaggerMainComponent.builder()
                .applicationComponent(AppApplication.getAppComponent())
                .mainModule(new MainModule(this))
                .build()
                .inject(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        mDrawerLayout.closeDrawer(Gravity.START, true);
        switch (item.getItemId()) {
            case R.id.news:
                showFragment(mNewsFragment.getClass().getSimpleName());
                break;
            case R.id.pic:
                showFragment(mPicFragment.getClass().getSimpleName());
                break;
            case R.id.video:
                showFragment(mVideoFragment.getClass().getSimpleName());
                break;
            case R.id.store:
                ToastUtil.showToast(getString(R.string.store));
                break;
            case R.id.setting:
                ToastUtil.showToast(getString(R.string.setting));
                break;
        }
        return false;
    }

    private void showFragment(String simpleName) {
        FragmentTransaction mTransaction = mFragmentManager.beginTransaction();
        List<Fragment> fragments = mFragmentManager.getFragments();
        if (fragments == null) {
            return;
        }
        for (Fragment fragment : fragments) {
            if (TextUtils.equals(fragment.getClass().getSimpleName(), simpleName)) {
                mTransaction.show(fragment);
            } else {
                mTransaction.hide(fragment);
            }
        }
        mTransaction.commit();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
    }
}
