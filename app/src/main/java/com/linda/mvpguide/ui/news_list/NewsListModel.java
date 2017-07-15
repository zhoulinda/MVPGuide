package com.linda.mvpguide.ui.news_list;

import com.linda.mvpguide.api.ServiceFactory;
import com.linda.mvpguide.app.AppConfig;
import com.linda.mvpguide.bean.News;
import com.linda.mvpguide.rx.RxHelper;
import com.linda.mvpguide.rx.RxScheduler;

import io.reactivex.Flowable;

/**
 * 作者：linda on 2017/7/14 17:03
 * 邮箱：
 */

public class NewsListModel implements NewsListContract.Model {

    @Override
    public Flowable<News.ResultBean> getNewsData(String type, boolean isRefresh) {
        return ServiceFactory.getInstance().getNewsData(type, AppConfig.JU_HE_KEY)
                .compose(RxHelper.<News.ResultBean>handleResult())
                .compose(RxScheduler.<News.ResultBean>io_main());


    }
}
