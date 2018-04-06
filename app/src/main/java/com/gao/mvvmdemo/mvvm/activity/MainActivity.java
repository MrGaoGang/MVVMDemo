package com.gao.mvvmdemo.mvvm.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.gao.mvvmdemo.R;
import com.gao.mvvmdemo.databinding.ActivityMainBinding;
import com.gao.mvvmdemo.mvvm.adapter.MainDataAdapter;
import com.gao.mvvmdemo.mvvm.base.MainBaseView;
import com.gao.mvvmdemo.mvvm.vm.MainViewModelImpl;
import com.mrgao.luckrecyclerview.LucklyRecyclerView;

public class MainActivity extends AppCompatActivity implements MainBaseView, LucklyRecyclerView.OnLoadMoreListener, LucklyRecyclerView.OnRefreshListener {
    private ActivityMainBinding mMainBinding;
    private MainDataAdapter mDataAdapter;
    private MainViewModelImpl mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        initView();


    }

    /**
     * 初始化布局
     */
    private void initView() {
        mDataAdapter = new MainDataAdapter(this);
        mMainBinding.recylerView.setLayoutManager(new LinearLayoutManager(this));
        mMainBinding.recylerView.setLoadMoreListener(this);
        mMainBinding.recylerView.setOnRefreshListener(this);
        mMainBinding.recylerView.setAdapter(mDataAdapter);

        if (mMainViewModel == null) {
            mMainViewModel = new MainViewModelImpl();
        }
        mMainViewModel.attachView(this);
        mMainViewModel.setDataAdapter(mDataAdapter);

        mMainViewModel.refresh();

    }

    /**
     * 显示错误信息
     *
     * @param message
     */
    @Override
    public void showError(String message) {

    }

    /**
     * Author: MrGao
     * CreateTime: 2018/4/6 16:22
     * MethodName:
     * Des：显示成功信息
     * Params：
     * Return:
     **/
    @Override
    public void showSuccess(String message) {

    }

    /**
     * Author: MrGao
     * CreateTime: 2018/4/6 16:22
     * MethodName: 显示正在加载等信息
     * Des：
     * Params：
     * Return:
     **/
    @Override
    public void showLoading() {

    }

    @Override
    public void onLoadMore() {
        mMainBinding.recylerView.setLoading();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mMainViewModel.loadMore();


            }
        }, 1200);
    }

    @Override
    public void complete() {
        mMainBinding.recylerView.setLoadingComplete();
        mMainBinding.recylerView.setRefreshComplete();
    }

    @Override
    public void onRefresh() {
        mMainBinding.recylerView.setRefreshEnable(true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mMainViewModel.refresh();

            }
        }, 1200);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mMainViewModel != null) {
            mMainViewModel.detachView();
        }
    }
}
