package com.linda.mvpguide.ui;

import com.linda.mvpguide.R;
import com.linda.mvpguide.app.AppConfig;
import com.linda.mvpguide.base.BaseActivity;
import com.linda.mvpguide.databinding.ActivityNewsDetailBinding;

/**
 * 作者：linda on 2017/7/16 11:58
 * 邮箱：
 */

public class NewsDetailActivity extends BaseActivity<ActivityNewsDetailBinding> {

    private String newsDetailUrl;

    @Override
    protected int getLayoutRedId() {
        return R.layout.activity_news_detail;
    }

    @Override
    protected String getToolbarTitle() {
        return null;
    }

    @Override
    protected void handleIntent() {
        newsDetailUrl = getIntent().getStringExtra(AppConfig.NEWS_DETAIL_URL);
    }

    @Override
    protected void initInjector() {

    }

    @Override
    protected void initView() {
    }

    @Override
    protected void initData() {
        mBinding.webView.loadUrl(newsDetailUrl);
    }

}
