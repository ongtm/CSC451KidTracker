package com.example.tong.csc451kidtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ProblemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);

        //Do I need this?
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //show back button on toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //This is to test the key/value pair coming over from the MainActivity
        String getVal = getIntent().getStringExtra("val1");
        TextView tv =(TextView) findViewById(R.id.tvcorrect);
        tv.setText(getVal);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mInflator = getMenuInflater();
        mInflator.inflate(R.menu.toolbar_menu,menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemID = item.getItemId();

        if(itemID==R.id.menu_home){
            this.finish();
        }
        else if(itemID == R.id.menu_scoreSummary){
            //navigate to score summary
            startActivity(new Intent(ProblemsActivity.this,Summary.class));
        }
        else if (itemID == R.id.menu_about){
            //navigate to about
            Toast.makeText(this, "This menu item is not operational at this time", Toast.LENGTH_LONG).show();
        }
        else{
            //No action
        }
        return super.onOptionsItemSelected(item);

    }

}
