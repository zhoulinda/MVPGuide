package com.linda.mvpguide.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.linda.mvpguide.bean.News;
import com.linda.mvpguide.databinding.AdapterNewsBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：linda on 2017/7/14 16:46
 * 邮箱：
 */

public class NewsListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<News.ResultBean.DataBean> mDatas;

    public NewsListAdapter() {
    }

    public void setNewData(List<News.ResultBean.DataBean> list) {
        if (mDatas == null) {
            mDatas = new ArrayList<>();
        } else {
            mDatas.clear();
        }
        mDatas.addAll(list);
        notifyDataSetChanged();
    }


    public void addData(List<News.ResultBean.DataBean> list) {
        if (mDatas == null) {
            mDatas = new ArrayList<>();
        }
        mDatas.addAll(list);
        notifyDataSetChanged();
    }


    public List<News.ResultBean.DataBean> getData() {
        return mDatas == null ? (mDatas = new ArrayList<>()) : mDatas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        AdapterNewsBinding mBinding = AdapterNewsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new NewsViewHolder(mBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof NewsViewHolder) {
            final NewsViewHolder newsViewHolder = (NewsViewHolder) holder;
            News.ResultBean.DataBean dataBean = mDatas.get(holder.getAdapterPosition());
            newsViewHolder.mBinding.setNews(dataBean);
            newsViewHolder.mBinding.newsLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (listener != null) {
                        listener.onItemClick(newsViewHolder.getAdapterPosition());
                    }
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return mDatas == null ? 0 : mDatas.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        public AdapterNewsBinding mBinding;

        public NewsViewHolder(View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    private OnItemClickListener listener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }
}
