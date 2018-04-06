package com.gao.mvvmdemo.mvvm.model;

import com.gao.mvvmdemo.mvvm.datainterface.MainDataInterface;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.mvvm.model
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public interface BaseMainModel {

    void getAndroidAPIData(int page,MainDataInterface dataInterface);
}
