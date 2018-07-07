package com.cx.cxrecyclerview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

/**
 * Author：xiangcai
 * Time:2018/7/7 下午11:52
 * Description:自定义RecyclerView
 */
public class CXRecyclerView extends RecyclerView{
    private CXDefaultLoadingAdapter mAdapter;
    public CXRecyclerView(Context context) {
        super(context);
        initView();
    }

    public CXRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public CXRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initView();
    }

    private void initView(){

        setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter=new CXDefaultLoadingAdapter(getContext());
        setAdapter(mAdapter);
    }


}
