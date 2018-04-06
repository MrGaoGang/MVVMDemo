package com.gao.mvvmdemo.mvvm.model;

import android.util.Log;

import com.gao.mvvmdemo.mvvm.beans.DataBeans;
import com.gao.mvvmdemo.mvvm.beans.ShowDataBeans;
import com.gao.mvvmdemo.mvvm.datainterface.MainDataInterface;
import com.gao.mvvmdemo.mvvm.net.HttpsUtils;
import com.gao.mvvmdemo.mvvm.net.MainAPI;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.mvvm.model
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public class BaseMainModelImpl implements BaseMainModel {
    private static String TAG = "BaseMainModelImpl";
    private List<ShowDataBeans> mShowDataBeans = new ArrayList<>();

    @Override
    public void getAndroidAPIData(int page, final MainDataInterface dataInterface) {
        HttpsUtils.getInstance()
                .create(MainAPI.class)
                .getAndroidAPI(page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<DataBeans>() {
                    @Override
                    public void onNext(DataBeans beans) {
                        Log.i(TAG, "onNext");
                        if (!beans.isError()) {
                            mShowDataBeans.clear();
                            for (DataBeans.ResultsBean re : beans.getResults()) {
                                ShowDataBeans dataBeans=new ShowDataBeans();
                                dataBeans.set_id(re.get_id());
                                dataBeans.setImages(re.getImages());
                                dataBeans.setDesc(re.getDesc());
                                dataBeans.setSource(re.getSource());
                                mShowDataBeans.add(dataBeans);
                            }
                        }
                        dataInterface.success(mShowDataBeans);
                    }

                    @Override
                    public void onComplete() {
                        Log.i(TAG, "onComplete");
                        dataInterface.complete();
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.i(TAG, "onError");
                        dataInterface.error(e.getMessage());
                    }

                    @Override
                    public void onSubscribe(Disposable d) {

                    }
                });
    }
}
