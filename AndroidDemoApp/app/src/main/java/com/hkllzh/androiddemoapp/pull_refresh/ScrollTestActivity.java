package com.hkllzh.androiddemoapp.pull_refresh;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.hkllzh.androiddemoapp.R;

/**
 * Scroll测试页面
 * <p/>
 * lizheng -- 15/3/17
 * <p/>
 * AndroidDemoApp
 */
public class ScrollTestActivity extends Activity {

    private ScrollLayout scrollLayout;
    private TextView tvTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_scroller_demo);

        scrollLayout = (ScrollLayout) findViewById(R.id.scrollLayout);

        tvTest = (TextView) findViewById(R.id.tvTest);

        tvTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                scrollLayout.scrollToXY(-200, -1000);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        scrollLayout.scrollToXY(200, 1000);
                    }
                }, 2000);
            }
        });
    }
}
