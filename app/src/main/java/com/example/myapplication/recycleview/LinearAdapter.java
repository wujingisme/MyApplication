package com.example.myapplication.recycleview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.R;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder>{
    private Context mContext;
    private OnItenClickListener mListener;
    public LinearAdapter(Context context,OnItenClickListener listener)
    {
        this.mContext=context;
        this.mListener=listener;
    }
    @NonNull
    @Override
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearAdapter.LinearViewHolder holder, final int position) {
              holder.textView.setText("Hello world!");
              holder.itemView.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View v) {
                      Toast.makeText(mContext,"Click..."+position,Toast.LENGTH_SHORT).show();
                  }
              });
    }

    @Override
    public int getItemCount() {
        return 10;
    }
    class LinearViewHolder extends RecyclerView.ViewHolder{
        private TextView textView;
        public  LinearViewHolder(View itemView){
            super(itemView);
            textView=itemView.findViewById(R.id.tv_title);

        }
    }

    public interface  OnItenClickListener
    {

        void onclick(int pos);
    }
}
