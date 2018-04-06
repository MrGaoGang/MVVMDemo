package com.gao.mvvmdemo.mvvm.beans;

import java.util.List;

/**
 * Created by mr.gao on 2018/4/6.
 * Package:    com.gao.mvvmdemo.mvvm.beans
 * Create Date:2018/4/6
 * Project Name:MVVMDemo
 * Description:
 */

public class DataBeans {


    /**
     * error : false
     * results : [{"_id":"5a9cf1f5421aa9103fff20b1","createdAt":"2018-03-05T15:29:57.435Z","desc":"DirectSelect Dropdown is a selection widget with an ethereal, full-screen modal popup displaying the available choices when the widget is interact with.","images":["http://img.gank.io/90db2f35-2e9d-4d75-b5a9-53ee1719b57b"],"publishedAt":"2018-03-12T08:44:50.326Z","source":"web","type":"Android","url":"https://github.com/Ramotion/direct-select-android","used":true,"who":"Alex Mikhnev"},{"_id":"5a9f4968421aa910426a1890","createdAt":"2018-03-07T10:07:36.87Z","desc":"TextPathView是一个把文字转化为路径动画然后展现出来的自定义控件","images":["http://img.gank.io/bc3987dc-eb33-451f-a901-3e65bd7b666b"],"publishedAt":"2018-03-12T08:44:50.326Z","source":"chrome","type":"Android","url":"https://github.com/totond/TextPathView","used":true,"who":"Jason"},{"_id":"5aa24192421aa9103fff20c3","createdAt":"2018-03-09T16:10:58.75Z","desc":"VirtualXposed：不用 Root，不解锁 BootLoader 也不用刷机就使用 Xposed 模块的APP","publishedAt":"2018-03-12T08:44:50.326Z","source":"web","type":"Android","url":"https://github.com/android-hacker/VirtualXposed","used":true,"who":"weishu"},{"_id":"5a7c42c8421aa90d24a065d4","createdAt":"2018-02-08T20:30:00.798Z","desc":"一个动画效果的播放控件，播放，暂停，停止之间的动画切换","images":["http://img.gank.io/c1ee3231-648d-4449-a455-04a13731b2e1"],"publishedAt":"2018-02-22T08:24:35.209Z","source":"web","type":"Android","url":"https://github.com/SwiftyWang/AnimatePlayButton","used":true,"who":null},{"_id":"5a7c6094421aa90d21aa114a","createdAt":"2018-02-08T22:37:08.833Z","desc":"漂亮的本地多媒体选择器","publishedAt":"2018-02-22T08:24:35.209Z","source":"web","type":"Android","url":"https://github.com/TonnyL/Charles","used":true,"who":"黎赵太郎"},{"_id":"5a7cf9e7421aa90d21aa114b","createdAt":"2018-02-09T09:31:19.687Z","desc":"开源的 markdown 编辑器","images":["http://img.gank.io/760970ea-daae-4b98-9f87-deecdd3fe1f7","http://img.gank.io/ea49dc41-3435-4126-ab5b-d7b3357ab517"],"publishedAt":"2018-02-22T08:24:35.209Z","source":"chrome","type":"Android","url":"https://github.com/zeleven/mua","used":true,"who":"蒋朋"},{"_id":"5a81333c421aa90d264d0eba","createdAt":"2018-02-12T14:25:00.318Z","desc":"A slider widget with a popup bubble displaying the precise value selected.","images":["http://img.gank.io/fe3c723f-643d-4466-91d5-86d9ed4ca88e"],"publishedAt":"2018-02-22T08:24:35.209Z","source":"web","type":"Android","url":"https://github.com/Ramotion/fluid-slider-android","used":true,"who":"Alex Mikhnev"},{"_id":"5a685120421aa911548992ab","createdAt":"2018-01-24T17:25:52.341Z","desc":"Android 下的音乐可视化","images":["http://img.gank.io/e0d29181-282e-4465-9965-1da81e0557d9"],"publishedAt":"2018-01-29T07:53:57.676Z","source":"web","type":"Android","url":"https://github.com/nekocode/MusicVisualization","used":true,"who":"nekocode"},{"_id":"5a69608a421aa9115b9306a2","createdAt":"2018-01-25T12:43:54.642Z","desc":"插件化理解与实现 \u2014\u2014 加载 Activity「类加载篇」","images":["http://img.gank.io/a861c69f-02d2-46e8-b120-58ba4b3d97bf"],"publishedAt":"2018-01-29T07:53:57.676Z","source":"web","type":"Android","url":"https://fashare2015.github.io/2018/01/24/dynamic-load-learning-load-activity/","used":true,"who":"梁山boy"}]
     */

    private boolean error;
    /**
     * _id : 5a9cf1f5421aa9103fff20b1
     * createdAt : 2018-03-05T15:29:57.435Z
     * desc : DirectSelect Dropdown is a selection widget with an ethereal, full-screen modal popup displaying the available choices when the widget is interact with.
     * images : ["http://img.gank.io/90db2f35-2e9d-4d75-b5a9-53ee1719b57b"]
     * publishedAt : 2018-03-12T08:44:50.326Z
     * source : web
     * type : Android
     * url : https://github.com/Ramotion/direct-select-android
     * used : true
     * who : Alex Mikhnev
     */

    private List<ResultsBean> results;

    public void setError(boolean error) {
        this.error = error;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public boolean isError() {
        return error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public static class ResultsBean {
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

        public void set_id(String _id) {
            this._id = _id;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public void setWho(String who) {
            this.who = who;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public String get_id() {
            return _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public String getSource() {
            return source;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public boolean isUsed() {
            return used;
        }

        public String getWho() {
            return who;
        }

        public List<String> getImages() {
            return images;
        }
    }
}
