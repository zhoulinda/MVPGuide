package com.linda.mvpguide.api;

import com.linda.mvpguide.bean.HttpResult;
import com.linda.mvpguide.bean.News;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by zhoulinda on 17/5/25.
 */

public interface ApiService {

    String SERVICE_HOST = "http://v.juhe.cn/";

    //新闻
    @GET("toutiao/index")
    Flowable<HttpResult<News.ResultBean>> getNewsData(@Query("type") String type, @Query("key") String key);
}

