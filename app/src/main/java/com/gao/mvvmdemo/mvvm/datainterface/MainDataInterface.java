package com.gao.mvvmdemo.mvvm.datainterface;

import com.gao.mvvmdemo.mvvm.beans.ShowDataBeans;

import java.util.List;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.mvvm.datainterface
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public interface MainDataInterface {
    /*返回数据成功*/
    void success(List<ShowDataBeans> beansList);
    /*返回数据失败*/
    void error(String message);
    /*返回数据完成*/
    void complete();
}
