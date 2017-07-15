package com.linda.mvpguide.adapter;

import android.content.Context;
import android.widget.ImageView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.linda.mvpguide.R;
import com.linda.mvpguide.bean.News;
import com.linda.mvpguide.helper.GlideHelper;

/**
 * 作者：linda on 2017/7/14 16:46
 * 邮箱：
 */

public class NewsListAdapter extends BaseQuickAdapter<News.ResultBean.DataBean, BaseViewHolder> {

    public NewsListAdapter(Context context) {
        super(R.layout.adapter_news);
    }

    @Override
    protected void convert(BaseViewHolder helper, News.ResultBean.DataBean item) {
        GlideHelper.loadUrl((ImageView) helper.getView(R.id.picture), item.getThumbnail_pic_s());
        helper.setText(R.id.title, item.getTitle());
        helper.setText(R.id.author_name, item.getAuthor_name());
        helper.setText(R.id.date, item.getDate());
    }
}
