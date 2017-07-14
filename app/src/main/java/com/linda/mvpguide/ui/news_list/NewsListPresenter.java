package com.linda.mvpguide.ui.news_list;

/**
 * 作者：linda on 2017/7/14 16:17
 * 邮箱：
 */

public class NewsListPresenter implements NewsListContract.Presenter{

    private NewsListFragment mView;
    private NewsListModel mModel;

    public NewsListPresenter(NewsListFragment mView, NewsListModel mModel) {
        this.mView = mView;
        this.mModel = mModel;
    }
}
