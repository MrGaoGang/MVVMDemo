package com.gao.mvvmdemo.databinding.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.gao.mvvmdemo.BR;
import com.gao.mvvmdemo.R;
import com.gao.mvvmdemo.databinding.User;

import java.util.List;

/**
 * Created by mr.gao on 2018/4/5.
 * Package:    com.gao.mvvmdemo.databinding.adapter
 * Create Date:2018/4/5
 * Project Name:MVVMDemo
 * Description:
 */

public class TestBindingAdapter extends RecyclerView.Adapter<TestBindingHolder> {

    private List<User> data;

    private Context context;

    public TestBindingAdapter(Context context, List<User> list) {
        this.context = context;
        this.data = list;
    }

    @Override
    public TestBindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        ViewDataBinding binding=  DataBindingUtil.inflate(LayoutInflater.from(context),R.layout.test_item,parent,false);
        return new TestBindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(TestBindingHolder holder, int position) {
        holder.getBinding().setVariable(BR.user,data.get(position));
        // 立刻刷新界面
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }
}