package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonActivity extends AppCompatActivity {
    private Button mBt3;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        mBt3 = findViewById(R.id.bt3);
        mBt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonActivity.this, "Bt3说我被点击了", Toast.LENGTH_LONG).show();
            }
        });

    }


    public void showToast(View view){
        Toast.makeText(this,"很不幸被点击了",Toast.LENGTH_LONG).show();
    }
}



