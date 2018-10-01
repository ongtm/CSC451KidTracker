package com.example.tong.csc451kidtracker;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;

public class Summary extends AppCompatActivity {
    //Recycler view objects
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] myDataset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        //Recycler View
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //Setting for keeping layout size the same regardless of content
        mRecyclerView.setHasFixedSize(true);

        //using linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        myDataset[0] = "A";
        myDataset[1] = "B";
        myDataset[2] = "C";
        myDataset[3] = "D";

        Toast.makeText(this, "I got this far!", Toast.LENGTH_SHORT).show();
        //mAdapter = new MyAdapter(myDataset);
        //mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mInflator = getMenuInflater();
        mInflator.inflate(R.menu.toolbar_menu_child,menu);

        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemID = item.getItemId();

        if(itemID==R.id.menu_home_child){
            //navigate to home
            this.finish();

        }
        else if (itemID == R.id.menu_about_child){
            //navigate to about
            Toast.makeText(this, "This menu item is not operational at this time", Toast.LENGTH_LONG).show();
        }
        else{
            //No action
        }
        return super.onOptionsItemSelected(item);

    }

}
