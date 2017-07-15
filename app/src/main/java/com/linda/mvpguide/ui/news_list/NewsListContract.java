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
        void showNewsData(News.ResultBean resultBean);
    }

    interface Model extends IModel {
        Flowable<News.ResultBean> getNewsData(String type, boolean isRefresh);
    }

    interface Presenter extends IPresenter {
        /**
         * 请求对应类型的新闻数据
         * @param type
         * @param isRefresh 是否为主动刷新
         */
        void getNewsData(String type, boolean isRefresh);
    }
}
