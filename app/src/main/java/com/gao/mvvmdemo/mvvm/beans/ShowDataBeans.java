package com.gao.mvvmdemo.mvvm.beans;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.gao.mvvmdemo.BR;

import java.util.List;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.mvvm.beans
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public class ShowDataBeans extends BaseObservable {
    private String _id;
    private String createdAt;
    private String desc;
    private String publishedAt;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;
    private List<String> images;



    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;

    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Bindable
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
        notifyPropertyChanged(BR.desc);
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }


    @Bindable
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
        notifyPropertyChanged(BR.source);

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    @Bindable
    public List<String> getImages() {
        return images;
    }


    public void setImages(List<String> images) {
        this.images = images;
        notifyPropertyChanged(BR.images);
    }
}
