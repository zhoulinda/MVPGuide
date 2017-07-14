package com.linda.mvpguide.di.components;

import com.linda.mvpguide.di.modules.MainModule;
import com.linda.mvpguide.scope.ActivityScope;
import com.linda.mvpguide.ui.main.MainActivity;

import dagger.Component;

/**
 * Created by linda on 2017/7/11.
 */
@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
