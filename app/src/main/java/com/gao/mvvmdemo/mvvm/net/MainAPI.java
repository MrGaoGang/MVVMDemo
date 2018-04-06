package com.gao.mvvmdemo.mvvm.net;

import com.gao.mvvmdemo.mvvm.beans.DataBeans;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.mvvm.net
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public interface MainAPI {

    @GET("Android/10/{page}")
    Observable<DataBeans> getAndroidAPI(@Path("page") int page);
}
