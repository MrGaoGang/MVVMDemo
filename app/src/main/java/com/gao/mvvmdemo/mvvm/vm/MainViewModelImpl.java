package com.gao.mvvmdemo.mvvm.vm;

import com.gao.mvvmdemo.base.BaseVM;
import com.gao.mvvmdemo.mvvm.activity.MainActivity;
import com.gao.mvvmdemo.mvvm.adapter.MainDataAdapter;
import com.gao.mvvmdemo.mvvm.beans.ShowDataBeans;
import com.gao.mvvmdemo.mvvm.datainterface.MainDataInterface;
import com.gao.mvvmdemo.mvvm.model.BaseMainModelImpl;

import java.util.List;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.mvvm.vm
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public class MainViewModelImpl extends BaseVM<MainActivity> implements BaseMainVM, MainDataInterface {
    private BaseMainModelImpl mMainModel;
    private MainDataAdapter mDataAdapter;
    private int page=1;
    public MainViewModelImpl() {
        mMainModel=new BaseMainModelImpl();
    }


    public void setDataAdapter(MainDataAdapter adapter){
        mDataAdapter=adapter;
    }

    @Override
    public void refresh() {
        page=1;
        mMainModel.getAndroidAPIData(1,this);
    }

    @Override
    public void loadMore() {
        page++;
        mMainModel.getAndroidAPIData(page,this);

    }

    @Override
    public void success(List<ShowDataBeans> beansList) {

        if (page==1){
            mDataAdapter.onRefreshData(beansList);
        }else {
            mDataAdapter.onLoadMoreData(beansList);
        }
    }

    @Override
    public void error(String message) {
        getIView().showError(message);
    }

    @Override
    public void complete() {
        getIView().complete();
    }
}
