package com.gao.mvvmdemo.databinding.adapter;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * Created by mr.gao on 2018/4/5.
 * Package:    com.gao.mvvmdemo.databinding.adapter
 * Create Date:2018/4/5
 * Project Name:MVVMDemo
 * Description:
 */

public class TestBindingHolder extends RecyclerView.ViewHolder{

    private ViewDataBinding binding;

    public TestBindingHolder(ViewDataBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public ViewDataBinding getBinding() {
        return binding;
    }

    public void setBinding(ViewDataBinding binding) {
        this.binding = binding;
    }
}