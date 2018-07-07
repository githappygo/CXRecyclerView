package com.cx.cxrecyclerview;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;

/**
 * Author：xiangcai
 * Time:2018/7/7 下午11:30
 * Description:自定义RecyclerView
 */
public class MainActivity extends AppCompatActivity {
    private SwipeRefreshLayout mSwipeRefreshLayout;

    private CXRecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSwipeRefreshLayout = findViewById(R.id.swiperefreshLayout);
        mRecyclerView = findViewById(R.id.recyclerview);
        /***
         * 设置刷新时显示的颜色
         */
        mSwipeRefreshLayout.setColorSchemeColors(
                Color.GREEN,
                Color.YELLOW,
                Color.RED);

        /**
         * 设定下拉圆圈的背景
         */

        mSwipeRefreshLayout.setProgressBackgroundColorSchemeColor(Color.WHITE);
        /**
         * 添加Android自带的分割线
         */
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


    }
}
