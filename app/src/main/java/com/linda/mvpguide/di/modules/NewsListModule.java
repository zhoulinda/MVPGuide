package com.linda.mvpguide.di.modules;

import com.linda.mvpguide.adapter.NewsListAdapter;
import com.linda.mvpguide.scope.FragmentScope;
import com.linda.mvpguide.ui.news_list.NewsListFragment;
import com.linda.mvpguide.ui.news_list.NewsListModel;
import com.linda.mvpguide.ui.news_list.NewsListPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by linda on 2017/7/12.
 */

@Module
public class NewsListModule {

    private NewsListFragment mView;

    public NewsListModule(NewsListFragment mView) {
        this.mView = mView;
    }

    @FragmentScope
    @Provides
    NewsListAdapter provideNewsListPagerAdapter() {
        return new NewsListAdapter(mView.getContext());
    }

    @FragmentScope
    @Provides
    NewsListPresenter provideNewsListPresenter(NewsListModel mModel) {
        return new NewsListPresenter(mView, mModel);
    }

    @FragmentScope
    @Provides
    NewsListModel provideNewsListModel() {
        return new NewsListModel();
    }
}
