package com.hkllzh.androiddemoapp.pull_refresh;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.hkllzh.androiddemoapp.R;

/**
 * 下拉刷新的主页面
 * <p/>
 * lizheng -- 15/3/6
 * <p/>
 * AndroidDemoApp
 */
public class MainActivity extends Activity {

    private ScrollLayout scrollLayout;
    private TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_pull_refresh_main);
    }
}
