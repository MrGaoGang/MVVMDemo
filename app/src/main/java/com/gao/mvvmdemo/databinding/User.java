package com.gao.mvvmdemo.databinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.gao.mvvmdemo.BR;

/**
 * Created by mr.gao on 2018/4/5.
 * Package:    com.gao.mvvmdemo.databinding
 * Create Date:2018/4/5
 * Project Name:MVVMDemo
 * Description:
 */

public class User extends BaseObservable{
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.user);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.user);
    }
}
