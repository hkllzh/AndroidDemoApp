package com.hkllzh.androiddemoapp;

import android.app.Application;

import com.hkllzh.androiddemoapp.net.NetRequest;

/**
 * 此程序的Application
 * <p/>
 * lizheng -- 15/3/4
 * <p/>
 * AndroidDemoApp
 */
public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        NetRequest.init(this);

    }
}
