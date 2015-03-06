package com.hkllzh.androiddemoapp.main;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hkllzh.androiddemoapp.R;

/**
 * 主页面列表适配器
 * <p/>
 * lizheng -- 15/3/6
 * <p/>
 * AndroidDemoApp
 */
public class MainListAdapter extends BaseRVAdapter<MainListAdapter.MainListViewHolder, MainListBean> {

    @Override
    public MainListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainListViewHolder(getView(parent, viewType));
    }

    @Override
    protected int getItemLayoutRes(int viewType) {
        return R.layout.lv_item_main_list;
    }

    @Override
    public void baseOnBindViewHolder(MainListViewHolder holder, MainListBean bean) {
        holder.tvTitle.setText(bean.title);
        holder.tvDescription.setText(bean.description);
    }

    class MainListViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTitle;
        public TextView tvDescription;

        public MainListViewHolder(final View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            tvDescription = (TextView) itemView.findViewById(R.id.tvDescription);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemView.getContext().startActivity(new Intent(mData.get(getPosition()).action));
                }
            });
        }

    }

}
