package com.example.myapplication;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {
    private TextView mTv4;
    private TextView mTv5,mTv6,mTv7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv4=findViewById(R.id.tv_4);
        mTv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        //去掉锯齿
        mTv4.getPaint().setAntiAlias(true);
        mTv5=findViewById(R.id.tv_5);
        mTv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);//下划线
        mTv6=findViewById(R.id.tv_6);
        mTv6.setText(Html.fromHtml("<u>猪事顺利</u>"));
        mTv7=findViewById(R.id.tv_7);
        mTv7.setSelected(true);
        //mTv6.setText("猪事顺利！");




    }
}
