package com.gao.mvvmdemo.base;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.base
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public interface IBaseView {
    // 显示错误提示
    void showError(String message);

    //显示成功提示
    void showSuccess(String message);

    //显示正在加载
    void showLoading();

    void complete();
}
