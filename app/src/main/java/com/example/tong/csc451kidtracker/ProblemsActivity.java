package com.example.tong.csc451kidtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProblemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);

        //This is to test the key/value pair coming over from the MainActivity
        String getVal = getIntent().getStringExtra("val1");
        TextView tv =(TextView) findViewById(R.id.tvcorrect);
        tv.setText(getVal);
    }
}
