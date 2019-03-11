package com.example.myapplication.listview;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.solver.ArrayLinkedVariables;
import android.view.View;
import android.support.annotation.Nullable;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.List;

public class ListViewActivity extends Activity {
    private ListView mLv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mLv1=findViewById(R.id.lv_1);
       mLv1.setAdapter(new MyListAdapter(ListViewActivity.this));

    }
}
