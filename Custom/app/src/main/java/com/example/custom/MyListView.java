package com.example.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class MyListView extends ListView {
    public MyListView(Context context) {
        super(context);
    }

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //解决显示不全的问题
        heightMeasureSpec =  MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE  >> 2,MeasureSpec.AT_MOST);
        //heightMeasureSpec  是一个32位的值，30位是Integer.MAX_VALUE 2位是模式
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }


}
