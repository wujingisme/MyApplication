package com.example.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class CheckboxActivity extends AppCompatActivity {
private CheckBox mCb5;
private CheckBox mCb4;
private EditText mEt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        mCb4=findViewById(R.id.cb_4);
        mCb5=findViewById(R.id.cb_5);
        mCb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckboxActivity.this,isChecked?"5选中":"5未选中",Toast.LENGTH_SHORT).show();

            }
        });
        mCb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckboxActivity.this,isChecked?"4选中":"4未选中",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
