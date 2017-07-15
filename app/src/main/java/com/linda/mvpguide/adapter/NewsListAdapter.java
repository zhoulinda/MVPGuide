package com.linda.mvpguide.adapter;

import android.content.Context;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.linda.mvpguide.R;
import com.linda.mvpguide.bean.News;

/**
 * 作者：linda on 2017/7/14 16:46
 * 邮箱：
 */

public class NewsListAdapter extends BaseQuickAdapter<News.ResultBean.DataBean,BaseViewHolder>{

    public NewsListAdapter(Context context) {
        super(R.layout.adapter_news);
    }

    @Override
    protected void convert(BaseViewHolder helper, News.ResultBean.DataBean item) {
        helper.setText(R.id.title,item.getTitle());
    }
}
