package com.linda.mvpguide.di.components;

import com.linda.mvpguide.di.modules.NewsListModule;
import com.linda.mvpguide.scope.FragmentScope;
import com.linda.mvpguide.ui.news_list.NewsListFragment;

import dagger.Component;

/**
 * Created by linda on 2017/7/12.
 */

@FragmentScope
@Component(dependencies = ApplicationComponent.class, modules = NewsListModule.class)
public interface NewsListComponent {
    void inject(NewsListFragment fragment);
}
