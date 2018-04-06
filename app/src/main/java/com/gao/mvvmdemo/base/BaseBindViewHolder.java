package com.gao.mvvmdemo.base;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.base
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public class BaseBindViewHolder extends RecyclerView.ViewHolder {
    ViewDataBinding mDataBinding;
    public BaseBindViewHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        mDataBinding=binding;
    }

    public ViewDataBinding getBinding() {
        return mDataBinding;
    }
}
