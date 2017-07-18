package com.linda.mvpguide.ui.news_list;

import com.linda.mvpguide.bean.News;
import com.linda.mvpguide.rx.RxSubscriber;

import org.reactivestreams.Subscription;

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
    public void getNewsData(String type, final boolean isRefresh) {
        mModel.getNewsData(type, isRefresh)
                .compose(mView.<News.ResultBean>bindToLifecycle())
                .doOnSubscribe(new Consumer<Subscription>() {
                    @Override
                    public void accept(@NonNull Subscription subscription) throws Exception {
                        if (!isRefresh) {
                            mView.stateLoading();
                        }
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
