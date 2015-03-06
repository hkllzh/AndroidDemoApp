package com.hkllzh.androiddemoapp.main;

/**
 * 主页列表数据类
 * <p/>
 * lizheng -- 15/3/6
 * <p/>
 * AndroidDemoApp
 */
public class MainListBean {
    public String title;
    public String description;
    public String action;

    public MainListBean(String title, String description, String action) {
        this.title = title;
        this.description = description;
        this.action = action;
    }
}
