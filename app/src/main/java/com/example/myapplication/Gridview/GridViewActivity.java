package com.example.myapplication.Gridview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;

import com.example.myapplication.R;
import com.example.myapplication.listview.MyListAdapter;

public class GridViewActivity extends AppCompatActivity {
    private GridView gridView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridview);
        gridView=findViewById(R.id.gv);
        gridView.setAdapter(new MyListAdapter(GridViewActivity.this));

    }
}
