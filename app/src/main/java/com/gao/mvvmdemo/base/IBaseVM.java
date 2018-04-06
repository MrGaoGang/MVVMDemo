package com.gao.mvvmdemo.base;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.base
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public interface IBaseVM<V extends IBaseView> {

    void attachView(V view);

    void detachView();

    V getIView();
}
