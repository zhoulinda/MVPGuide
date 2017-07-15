package com.linda.mvpguide.ui.news_list;

import com.linda.mvpguide.bean.News;
import com.linda.mvpguide.rx.RxSubscriber;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

/**
 * 作者：linda on 2017/7/14 16:17
 * 邮箱：
 */

public class NewsListPresenter implements NewsListContract.Presenter {

    private NewsListFragment mView;
    private NewsListModel mModel;

    public NewsListPresenter(NewsListFragment mView, NewsListModel mModel) {
        this.mView = mView;
        this.mModel = mModel;
    }

    @Override
    public void getNewsData(String type) {
        mModel.getNewsData(type)
                .doOnNext(new Consumer<News.ResultBean>() {
                    @Override
                    public void accept(@NonNull News.ResultBean resultBean) throws Exception {
                        mView.stateLoading();
                    }
                })
                .compose(mView.<News.ResultBean>bindToLifecycle())
                .subscribe(new RxSubscriber<News.ResultBean>(mView) {
                    @Override
                    public void onNext(News.ResultBean resultBean) {
                        mView.stateSuccess();
                        mView.showNewsData(resultBean);
                    }
                });
    }
}
