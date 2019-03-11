package com.example.myapplication.Gridview;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;

import org.w3c.dom.Text;

public class MyGridViewAdapter extends BaseAdapter {
    private Context mcontext;
    private LayoutInflater mLayoutInflater;
    public MyGridViewAdapter(Context context) {
    this.mcontext=context;
    mLayoutInflater=LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 10;
    }


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
    static  class ViewHolder {
        public ImageView imageView;
        public TextView textView;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder=null;
        if(convertView==null)
        {
            convertView=mLayoutInflater.inflate(R.layout.layout_grit_item,null);
            holder =new ViewHolder();
            holder.imageView=convertView.findViewById(R.id.Iv_grid);
            holder.textView=convertView.findViewById(R.id.Tv_title);
            convertView.setTag(holder);
        }else {
            holder =(ViewHolder)convertView.getTag();
            holder.textView.setText("花");
            Glide.with(mcontext).load("https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=2194362911,2766375669&fm=173&app=49&f=JPEG?w=218&h=146&s=752209F751711594C621D0AD0300E001").into(holder.imageView);
        }
        return convertView;
    }
}
