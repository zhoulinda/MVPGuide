package com.linda.mvpguide.di.components;

import com.linda.mvpguide.di.modules.NewsModule;
import com.linda.mvpguide.scope.FragmentScope;
import com.linda.mvpguide.ui.main.NewsFragment;

import dagger.Component;

/**
 * Created by linda on 2017/7/12.
 */

@FragmentScope
@Component(dependencies = ApplicationComponent.class, modules = NewsModule.class)
public interface NewsComponent {
    void inject(NewsFragment fragment);
}
