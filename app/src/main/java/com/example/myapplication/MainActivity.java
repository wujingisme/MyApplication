package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.Gridview.GridViewActivity;
import com.example.myapplication.listview.ListViewActivity;
import com.example.myapplication.recycleview.RecycleViewActivity;

import java.security.PrivateKey;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextview;
    private Button mBtnbutton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckedBox;
    private Button mBtnImageView;
    private Button mBtnListView;
    private Button mBtnGridView;
    private Button mBtnRecycleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextview = findViewById(R.id.btn_textview);
     /*   mBtnTextview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到演示界面
                Intent intent = new Intent(MainActivity.this, TextViewActivity.class);
                startActivity(intent);
            }
        });*/
        mBtnbutton = findViewById(R.id.btn_button);
      /*  mBtnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
                startActivity(intent);
            }
        })*/;
        mBtnEditText = findViewById(R.id.btn_edittext);
     /*   mBtnEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EditTextActivity.class);
                startActivity(intent);
            }
        });*/
        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
        /*mBtnRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RadioButtonActivity.class);
                startActivity(intent);
            }
        });*/
        mBtnCheckedBox=findViewById(R.id.btn_checkbox);
        mBtnImageView=findViewById(R.id.btn_imageview);
        mBtnListView=findViewById(R.id.btn_listview);
        mBtnGridView = findViewById(R.id.btn_gridview);
        mBtnRecycleView = findViewById(R.id.btn_recycleview);
      setListeners();
    }

    private void setListeners()
    {
        onClick onclick=new onClick();
        mBtnTextview.setOnClickListener(onclick);
        mBtnbutton.setOnClickListener(onclick);
        mBtnEditText.setOnClickListener(onclick);
        mBtnRadioButton.setOnClickListener(onclick);
        mBtnCheckedBox.setOnClickListener(onclick);
        mBtnImageView.setOnClickListener(onclick);
        mBtnListView.setOnClickListener(onclick);
        mBtnGridView.setOnClickListener(onclick);
        mBtnRecycleView.setOnClickListener(onclick);

    }

    private class onClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId())
            {
                case R.id.btn_textview:
                    intent=new Intent(MainActivity.this,TextView.class);
                    break;
                case R.id.btn_button:
                    intent=new Intent(MainActivity.this,Button.class);
                    break;
                case R.id.btn_edittext:
                    intent=new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    intent=new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent=new Intent(MainActivity.this,CheckboxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent=new Intent(MainActivity.this,ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent=new Intent(MainActivity.this,ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    intent=new Intent(MainActivity.this,GridViewActivity.class);
                    break;
                case R.id.btn_recycleview:
                    intent=new Intent(MainActivity.this,RecycleViewActivity.class);
                    break;

            }
            startActivity(intent);

        }

    }
}
