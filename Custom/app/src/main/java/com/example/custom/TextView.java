package com.example.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class TextView extends View {

    private String mText;
    private int mTextColor;
    private int mTextSize;

    //构造函数会在new的时候调用，比如说:
    //TextView textView = new TextView(this);
    public TextView(Context context) {
        super(context);
    }

    //在布局layout使用时调用
    public TextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    //在布局layout使用时调用，但有style
    public TextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        //获取自定义属性集
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.TextView);

        //获取自定义View属性
        mText = array.getString(R.styleable.TextView_text);
        mTextColor = array.getColor(R.styleable.TextView_textColor,mTextColor);
        mTextSize = array.getDimensionPixelSize(R.styleable.TextView_textSize,mTextSize);

        //回收
        array.recycle();
    }

    /**
     * 自定义View测量方法
     * @param widthMeasureSpec
     * @param heightMeasureSpec
     */
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //布局宽高都由该方法指定
        //指定控件宽高，测量

        //获取宽高的模式
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

//        if (MeasureSpec.UNSPECIFIED){
//
//        }
    }

    /**
     * 绘制
     * @param canvas
     */
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /**
     * 事件分发，处理用户的交互
     * @param event
     * @return  事件分发拦截事件
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_UP:
                //手指抬起
                break;

            case MotionEvent.ACTION_DOWN:
                //手指按下
                break;

            case MotionEvent.ACTION_HOVER_MOVE:
                //手指移动
                break;
        }
        return super.onTouchEvent(event);
    }
}
