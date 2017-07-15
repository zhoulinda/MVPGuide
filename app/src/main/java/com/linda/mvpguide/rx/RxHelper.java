package com.linda.mvpguide.rx;

import com.linda.mvpguide.bean.HttpResult;
import com.linda.mvpguide.exception.ApiException;

import org.reactivestreams.Publisher;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.FlowableTransformer;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

/**
 * 作者：linda on 2017/7/15 13:14
 * 邮箱：
 */

public class RxHelper {

    /**
     * 同一处理Flowable
     *
     * @param <T>
     * @return
     */
    public static <T> FlowableTransformer<HttpResult<T>, T> handleResult() {
        return new FlowableTransformer<HttpResult<T>, T>() {
            @Override
            public Publisher<T> apply(@NonNull Flowable<HttpResult<T>> httpResultFlowable) {
                return httpResultFlowable.flatMap(new Function<HttpResult<T>, Publisher<T>>() {
                    @Override
                    public Publisher<T> apply(@NonNull HttpResult<T> tHttpResult) throws Exception {
                        if (tHttpResult.getError_code() == 0) {
                            return createData(tHttpResult.getResult());
                        } else {
                            return Flowable.error(new ApiException("服务器返回error"));
                        }
                    }
                });
            }
        };
    }


    /**
     * 生成Flowable
     *
     * @param t
     * @param <T>
     * @return
     */
    private static <T> Publisher<T> createData(final T t) {
        return Flowable.create(new FlowableOnSubscribe<T>() {
            @Override
            public void subscribe(@NonNull FlowableEmitter<T> emitter) throws Exception {
                try {
                    emitter.onNext(t);
                    emitter.onComplete();
                } catch (Exception e) {
                    emitter.onError(e);
                }
            }
        }, BackpressureStrategy.BUFFER);
    }
}
