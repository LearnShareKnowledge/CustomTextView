package com.mypackage.customtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

public class CustomTextView extends android.support.v7.widget.AppCompatTextView {
    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,R.styleable.CustomTextView,0,0);

        try
        {
            String typefaceName = a.getString(R.styleable.CustomTextView_typeface);

            Typeface tf = Typeface.createFromAsset(context.getAssets(),typefaceName+".ttf");

            setTypeface(tf);

        }finally
        {
            a.recycle();
        }
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
