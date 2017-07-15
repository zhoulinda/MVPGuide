package com.linda.mvpguide.ui.main;

import android.databinding.DataBindingUtil;

import com.linda.mvpguide.R;
import com.linda.mvpguide.adapter.NewsPagerAdapter;
import com.linda.mvpguide.base.BaseFragment;
import com.linda.mvpguide.databinding.FragmentNewsBinding;
import com.linda.mvpguide.di.components.DaggerNewsComponent;
import com.linda.mvpguide.di.modules.NewsModule;

import javax.inject.Inject;

/**
 * 作者：linda on 2017/7/14 15:14
 * 邮箱：
 */

public class NewsFragment extends BaseFragment {

    private FragmentNewsBinding mBinding;
    @Inject
    NewsPagerAdapter mAdapter;

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_news;
    }

    @Override
    protected void handleIntent() {

    }

    @Override
    protected void initInjector() {
        DaggerNewsComponent.builder()
                .applicationComponent(getAppComponent())
                .newsModule(new NewsModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected void initView() {
        mBinding = DataBindingUtil.bind(rootView);
        mBinding.viewPager.setAdapter(mAdapter);
        mBinding.tabLayout.setupWithViewPager(mBinding.viewPager);
    }

    @Override
    protected void initData() {

    }

}
