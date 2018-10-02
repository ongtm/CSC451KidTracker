package com.example.tong.csc451kidtracker;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.View;
import com.example.tong.csc451kidtracker.model.Test;
import java.util.List;
import android.content.Context;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<Test> mTest;
    private Context mContext;

    public MyAdapter(Context context, List<Test> test){
        this.mContext = context;
        this.mTest = test;
    }


    public static class MyViewHolder extends RecyclerView.ViewHolder{
        //public View mView;
        public TextView testDate;
        public TextView numQuestions;
        public TextView numCorrect;
        public TextView numIncorrect;
        public TextView testId;

        public MyViewHolder(View testView){
            super(testView);

            testDate = testView.findViewById(R.id.testDate);
            numQuestions = testView.findViewById(R.id.numQuestions);
            numCorrect = testView.findViewById(R.id.numCorrect);
            numIncorrect = testView.findViewById(R.id.numIncorrect);
            testId = testView.findViewById(R.id.testId);
        }
    }


    //Creates new view, places it in a view holder and inflates it and returns the view holder
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType){

        LayoutInflater inflater = LayoutInflater.from(mContext);

        View testView = inflater.inflate(R.layout.activity_summary, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(testView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position){

        Test myTest = mTest.get(position);

        holder.testId.setText(myTest.getTestId());
        holder.testDate.setText(myTest.getTestDate());
        //holder.numQuestions.setText(myTest.getNumQuestions());
        holder.numQuestions.setText(String.valueOf(myTest.getNumQuestions()));
        holder.numCorrect.setText(String.valueOf(myTest.getNumCorrect()));
        holder.numIncorrect.setText(String.valueOf(myTest.getNumIncorrect()));

    }

    @Override
    public int getItemCount(){
        return mTest.size();
    }
}
