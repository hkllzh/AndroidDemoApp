package com.hkllzh.androiddemoapp.main;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hkllzh.androiddemoapp.C;
import com.hkllzh.androiddemoapp.R;

import java.util.ArrayList;


public class MainActivity extends Activity {

    private RecyclerView recyclerView;
    private MainListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        adapter = new MainListAdapter();
        adapter.setData(getShowData());

        recyclerView.setAdapter(adapter);
    }

    public ArrayList<MainListBean> getShowData() {
        ArrayList<MainListBean> showData = new ArrayList<>();
        showData.add(new MainListBean("Scroller示例", "Scroller的示例程序", C.Action.ScrollerMain));
        showData.add(new MainListBean("下拉刷新示例", "一个通用的下拉刷新实现", C.Action.PullRefreshMain));
        return showData;
    }
}
