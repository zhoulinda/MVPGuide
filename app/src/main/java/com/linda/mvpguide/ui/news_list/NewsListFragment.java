package com.linda.mvpguide.ui.news_list;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.linda.mvpguide.R;
import com.linda.mvpguide.adapter.NewsListAdapter;
import com.linda.mvpguide.app.AppConfig;
import com.linda.mvpguide.base.BaseFrameFragment;
import com.linda.mvpguide.bean.News;
import com.linda.mvpguide.databinding.FragmentNewsListBinding;
import com.linda.mvpguide.di.components.DaggerNewsListComponent;
import com.linda.mvpguide.di.modules.NewsListModule;
import com.linda.mvpguide.ui.NewsDetailActivity;

import javax.inject.Inject;

/**
 * 作者：linda on 2017/7/14 15:16
 * 邮箱：
 */

public class NewsListFragment extends BaseFrameFragment<NewsListPresenter>
        implements NewsListContract.View, SwipeRefreshLayout.OnRefreshListener,
        BaseQuickAdapter.OnItemClickListener {

    private String type;

    @Inject
    NewsListAdapter mAdapter;

    private FragmentNewsListBinding mBinding;

    public static Fragment newInstance(String type) {
        NewsListFragment fragment = new NewsListFragment();
        Bundle bundle = new Bundle();
        bundle.putString(AppConfig.NEWS_TYPE_KEY, type);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected int getContentResId() {
        return R.layout.fragment_news_list;
    }

    @Override
    protected void handleIntent() {
        type = getArguments().getString(AppConfig.NEWS_TYPE_KEY);
    }

    @Override
    protected void initInjector() {
        DaggerNewsListComponent.builder()
                .applicationComponent(getAppComponent())
                .newsListModule(new NewsListModule(this))
                .build()
                .inject(this);
    }

    @Override
    protected void initView() {
        mBinding = DataBindingUtil.bind(mContentView);
        mBinding.swipeRefreshLayout.setOnRefreshListener(this);
        mBinding.recyclerView.setHasFixedSize(true);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(mContext));
        mBinding.recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(this);
    }

    @Override
    protected void initData() {
        mPresenter.getNewsData(type, false);
    }

    public void showNewsData(News.ResultBean resultBean) {
        mBinding.swipeRefreshLayout.setRefreshing(false);
        mAdapter.setNewData(resultBean.getData());
    }

    @Override
    public void stateError() {
        super.stateError();
        mBinding.swipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void onRefresh() {
        mPresenter.getNewsData(type, true);
    }

    @Override
    public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
        Intent intent = new Intent(mContext, NewsDetailActivity.class);
        intent.putExtra(AppConfig.NEWS_DETAIL_URL, ((News.ResultBean.DataBean) adapter.getData()
                .get(position)).getUrl());
        startActivity(intent);
    }
}
