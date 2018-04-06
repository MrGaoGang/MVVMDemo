package com.gao.mvvmdemo.mvvm.net;

import com.gao.mvvmdemo.mvvm.constants.HttpURLS;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.mvvm.net
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public class HttpsUtils {
    OkHttpClient mClient;
    private static HttpsUtils sHttpsUtils;
    private static int TIME_OUT = 10;
    private Retrofit mRetrofit = null;

    public static HttpsUtils getInstance() {
        if (sHttpsUtils == null) {
            synchronized (HttpsUtils.class) {
                if (sHttpsUtils == null) {
                    sHttpsUtils = new HttpsUtils();
                }
            }
        }

        return sHttpsUtils;
    }

    public HttpsUtils() {
        initOkhttp();
        getRetrofit();
    }

    private void initOkhttp() {
        mClient = new OkHttpClient.Builder()
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
                .build();
    }

    private Retrofit getRetrofit() {
        if (mRetrofit == null) {
            mRetrofit = new Retrofit.Builder()
                    .client(mClient)
                    .baseUrl(HttpURLS.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        }
        return mRetrofit;
    }


    /**
     * 首先的创建
     * @param tClass
     * @param <T>
     * @return
     */
    public <T> T create(Class<T> tClass) {
        return mRetrofit.create(tClass);
    }

}
