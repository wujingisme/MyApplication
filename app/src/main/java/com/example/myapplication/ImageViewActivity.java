package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {
    private ImageView mIv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        mIv2=findViewById(R.id.iv_2);
        Glide.with(this).load("https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=2194362911,2766375669&fm=173&app=49&f=JPEG?w=218&h=146&s=752209F751711594C621D0AD0300E001").into(mIv2);
    }
}
