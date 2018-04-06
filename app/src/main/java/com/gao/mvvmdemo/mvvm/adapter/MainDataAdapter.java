package com.gao.mvvmdemo.mvvm.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.gao.mvvmdemo.BR;
import com.gao.mvvmdemo.R;
import com.gao.mvvmdemo.base.BaseBindViewHolder;
import com.gao.mvvmdemo.base.BaseBindingAdapter;
import com.gao.mvvmdemo.mvvm.beans.ShowDataBeans;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.mvvm.adapter
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public class MainDataAdapter extends BaseBindingAdapter<ShowDataBeans,BaseBindViewHolder> {


    public MainDataAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseBindViewHolder onCreateVH(ViewGroup parent, int viewType) {
        ViewDataBinding binding=DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.main_item,parent,false);
        return new BaseBindViewHolder(binding);
    }


    @Override
    public void onBindVH(BaseBindViewHolder holder, int position) {
        ViewDataBinding binding=holder.getBinding();
        binding.setVariable(BR.databeans,mDataList.get(position));
        binding.executePendingBindings();
    }
}
