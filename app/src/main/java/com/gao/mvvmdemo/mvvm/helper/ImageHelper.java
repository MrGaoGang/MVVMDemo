package com.gao.mvvmdemo.mvvm.helper;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.mvvm.helper
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public class ImageHelper {

    /**
     * 注意：第三个参数为图片显示错误的时候，此处为drawable对象，
     * 那么在xml文件中就应该为@drawable/xxxx，否则会报错：
     * Error:(22, 29) Cannot find the setter for attribute 'app:imageUrl' with para
     * @param imageView
     * @param url
     * @param errorDra
     */
    @BindingAdapter(value = {"bind:imageUrl","bind:error"})
    public static void loadImages(ImageView imageView,String url,Drawable errorDra){
        Glide.with(imageView.getContext()).load(url).error(errorDra).centerCrop().into(imageView);
    }
}
