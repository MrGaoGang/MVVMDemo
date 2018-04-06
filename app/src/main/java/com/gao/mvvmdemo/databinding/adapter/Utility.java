package com.gao.mvvmdemo.databinding.adapter;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.gao.mvvmdemo.databinding.User;

import java.util.List;

/**
 * Created by mr.gao on 2018/4/5.
 * Package:    com.gao.mvvmdemo.databinding.adapter
 * Create Date:2018/4/5
 * Project Name:MVVMDemo
 * Description:
 */

public class Utility {
    @BindingAdapter("bind:image")
    public static void loadImage(ImageView image, Drawable resId){
        image.setImageDrawable(resId);
    }

    @BindingAdapter("bind:data")
    public static void setData(RecyclerView recyclerView, List<User> data){
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new TestBindingAdapter(recyclerView.getContext(), data));
    }
}
