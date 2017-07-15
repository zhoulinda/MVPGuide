package com.linda.mvpguide.ui.news_list;

import com.linda.mvpguide.base.IModel;
import com.linda.mvpguide.base.IPresenter;
import com.linda.mvpguide.base.IView;
import com.linda.mvpguide.bean.News;

import io.reactivex.Flowable;

/**
 * 作者：linda on 2017/7/14 17:04
 * 邮箱：
 */

public interface NewsListContract {

    interface View extends IView {

    }

    interface Model extends IModel {
        Flowable<News.ResultBean> getNewsData(String type);
    }

    interface Presenter extends IPresenter {
        void getNewsData(String type);
    }
}