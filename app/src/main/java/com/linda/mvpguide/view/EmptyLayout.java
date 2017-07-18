package com.linda.mvpguide.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.linda.mvpguide.R;
import com.linda.mvpguide.app.AppApplication;
import com.linda.mvpguide.utils.NetUtil;

public class EmptyLayout extends LinearLayout {

    public static final int HIDE_LAYOUT = 4;
    public static final int NETWORK_ERROR = 1;
    public static final int NETWORK_LOADING = 2;
    public static final int NODATA = 3;

    private Context context;
    private ProgressBar progress;
    public ImageView img;
    private TextView text;
    private int mErrorState;
    private OnClickListener listener;
    private LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT);

    public EmptyLayout(Context context) {
        this(context, null);
    }

    public EmptyLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public EmptyLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        init();
    }

    private void init() {
        View view = View.inflate(context, R.layout.layout_empty, null);
        img = (ImageView) view.findViewById(R.id.img);
        text = (TextView) view.findViewById(R.id.text);
        progress = (ProgressBar) view.findViewById(R.id.progress);
        setBackgroundColor(-1);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onClick(v);
                }
            }
        });
        addView(view, params);
        setErrorType(HIDE_LAYOUT);
    }

    public void setErrorType(int i) {
        setVisibility(View.VISIBLE);
        switch (i) {
            case NETWORK_LOADING:
                mErrorState = NETWORK_LOADING;
                progress.setVisibility(View.VISIBLE);
                img.setVisibility(View.GONE);
                text.setVisibility(View.GONE);
                break;

            case NETWORK_ERROR:
                mErrorState = NETWORK_ERROR;
                if (!NetUtil.isNetworkAvailable(AppApplication.getContext())) {
                    img.setBackgroundResource(R.drawable.icon_net_error);
                    text.setText(R.string.network_anomalies);
                } else {
                    img.setBackgroundResource(R.drawable.icon_net_error);
                    text.setText(R.string.net_error);
                }
                img.setVisibility(View.VISIBLE);
                text.setVisibility(View.VISIBLE);
                progress.setVisibility(View.GONE);
                break;

            case NODATA:
                mErrorState = NODATA;
                img.setBackgroundResource(R.drawable.icon_empty);
                img.setVisibility(View.VISIBLE);
                text.setText(R.string.no_data);
                text.setVisibility(View.VISIBLE);
                progress.setVisibility(View.GONE);
                break;

            case HIDE_LAYOUT:
                mErrorState = HIDE_LAYOUT;
                setVisibility(View.GONE);
                break;
            default:
                break;
        }
    }

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

}
