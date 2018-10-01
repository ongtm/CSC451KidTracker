package com.example.tong.csc451kidtracker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] mDataset;

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView mTextView;
        public MyViewHolder(TextView v){
            super(v);
            mTextView = v;
        }
    }

    public MyAdapter(String[] myDataset){
        mDataset = myDataset;
    }

    //Creates new view, places it in a view holder and inflates it and returns the view holder
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.list_summary,parent,false);

        MyViewHolder vh = new MyViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){
        holder.mTextView.setText(mDataset[position]);
    }

    @Override
    public int getItemCount(){
        return mDataset.length;
    }
}
