package com.example.myapplication.listview;

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

public class MyListAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayouInfalter;
    public MyListAdapter(Context context) {
        this.mContext = context;
        mLayouInfalter = LayoutInflater.from(context);
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

    static class ViewHolder {
        public ImageView imageView;
        public TextView tvTitle, tvTime, tvContent;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = mLayouInfalter.inflate(R.layout.layout_list_item, null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.iv);
            holder.tvTime = convertView.findViewById(R.id.tv_time);
            holder.tvContent = convertView.findViewById(R.id.tv_content);
            holder.tvTitle = convertView.findViewById(R.id.tv_title);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();

            //给控件赋值
            holder.tvTitle.setText("这是标题");
            holder.tvTime.setText("2008-12-7");
            holder.tvContent.setText("这是内容");
            Glide.with(mContext).load("https://ss2.baidu.com/6ONYsjip0QIZ8tyhnq/it/u=2194362911,2766375669&fm=173&app=49&f=JPEG?w=218&h=146&s=752209F751711594C621D0AD0300E001").into(holder.imageView);
        }
        return convertView;
    }
}

