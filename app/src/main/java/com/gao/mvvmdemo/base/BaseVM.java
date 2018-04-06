package com.gao.mvvmdemo.base;

import java.lang.ref.WeakReference;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.base
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public abstract class BaseVM<V extends IBaseView> implements IBaseVM{
    private WeakReference<IBaseView> mVWeakReference;
    @Override
    public void attachView(IBaseView view) {
        mVWeakReference=new WeakReference<>(view);
    }

    @Override
    public void detachView() {
        if (mVWeakReference != null) {
            mVWeakReference.clear();
            mVWeakReference=null;
        }
    }

    @Override
    public IBaseView getIView() {
        if (mVWeakReference != null) {
           return mVWeakReference.get();
        }
        return null;
    }
}
