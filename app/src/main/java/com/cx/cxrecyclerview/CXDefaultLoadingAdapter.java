package com.cx.cxrecyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Author：xiangcai
 * Time:2018/7/7 下午11:3›9
 * Description:自定义默认加载adapter
 */
public class CXDefaultLoadingAdapter extends RecyclerView.Adapter {


    private int mDefaultCount = 20;

    private Context mContext;

    public CXDefaultLoadingAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CXDefaultHolder defaultHolder = new CXDefaultHolder(LayoutInflater.from(mContext).inflate(R.layout.item_recyclerview_default_loading, parent, false));
        return defaultHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return mDefaultCount;
    }


    public class CXDefaultHolder extends RecyclerView.ViewHolder {
        public CXDefaultHolder(View itemView) {
            super(itemView);
        }

    }

}
