package com.linda.mvpguide.helper;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by zhoulinda on 17/6/20.
 */

public class GlideHelper {

    @BindingAdapter("bind:image")
    public static void loadUrl(ImageView view, String url) {
        Glide.with(view.getContext())
                .load(url)
                .into(view);
    }

//    @BindingAdapter("bind:roundImage")
//    public static void loadRoundImage(ImageView view, String url) {
//        Glide.with(view.getContext())
//                .load(url)
//                .bitmapTransform(new CropCircleTransformation(view.getContext()))
//                .into(view);
//    }
}
