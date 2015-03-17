package com.hkllzh.androiddemoapp.pull_refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.Scroller;

/**
 * 演示{@link android.widget.Scroller}原理的类
 * <p/>
 * lizheng -- 15/3/6
 * <p/>
 * AndroidDemoApp
 */
public class ScrollLayout extends LinearLayout {

    private String TAG = ScrollLayout.class.getSimpleName();


    private Scroller mScroller;

    private void init() {
        mScroller = new Scroller(getContext());
    }

    public ScrollLayout(Context context) {
        super(context);
        init();
    }

    public ScrollLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ScrollLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    // 该函数会在View重绘之时被调用  
    @Override
    public void computeScroll() {
        if (mScroller.computeScrollOffset()){
            // 滚动到此刻View应该滚动到的x,y坐标上.
            this.scrollTo(mScroller.getCurrX(), mScroller.getCurrY());
            // 请求重绘该View，从而又会导致computeScroll被调用，然后继续滚动，直到computeScrollOffset返回false
            this.postInvalidate();
        }
    }
    // 调用这个方法进行滚动，这里我们只滚动竖直方向，
    public void scrollToXY(int x,int y) {
        // 参数1和参数2分别为滚动的起始点水平、竖直方向的滚动偏移量
        // 参数3和参数4为在水平和竖直方向上滚动的距离
        mScroller.startScroll(getScrollX(), getScrollY(), x, y, 1000);
        this.invalidate();
    }



}
