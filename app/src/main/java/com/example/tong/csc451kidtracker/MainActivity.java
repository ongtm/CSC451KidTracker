package com.example.tong.csc451kidtracker;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.tong.csc451kidtracker.database.DBHelper;
import com.example.tong.csc451kidtracker.database.DataSource;
import com.example.tong.csc451kidtracker.model.Question;
//import com.example.tong.csc451kidtracker.sample.SampleDataItems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener{

    DataSource mDataSource;
    public int levelSelected;
    public String level;
    public String testName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting up database
        mDataSource = new DataSource(this);
        mDataSource.open();

        //Assign Spinners objects by ID
        Spinner spinnerAdd = findViewById(R.id.spinneradd);

        //Creating array to hold items for spinner
        ArrayList<Integer> mathLevels = new ArrayList<Integer>();
        mathLevels.add(1);
        mathLevels.add(2);
        mathLevels.add(3);
        mathLevels.add(4);
        mathLevels.add(5);

        //Creating array adapter for spinner
        ArrayAdapter<Integer> spinnerAdapter = new ArrayAdapter<Integer>(this,android.R.layout.simple_spinner_item,mathLevels);

        //Set on Click listener for spinner
        spinnerAdd.setOnItemSelectedListener(this);

        //attaching adapter to the spinner
        spinnerAdd.setAdapter(spinnerAdapter);

        //setting onClickListeners for each imagebutton on activity
        ImageButton add1 = findViewById(R.id.imgadd1);
            add1.setOnClickListener(this);

        ImageButton sub1 = findViewById(R.id.imgsub1);
            sub1.setOnClickListener(this);

        ImageButton mul1 = findViewById(R.id.imgmul1);
            mul1.setOnClickListener(this);

        ImageButton div1 = findViewById(R.id.imgdiv1);
            div1.setOnClickListener(this);
    }

    /*@Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }*/

    //Item Selected Listener for Spinner
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Integer item = (Integer)parent.getItemAtPosition(position);

        //This may be the correct form
        //String item = parent.getItemAtPosition(position).toString();

        //Setting level
        levelSelected= item;
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Throw error?--Auto generated method.
    }

    @Override
    public void onClick(View view){



        //Setting intent action for activity change
        Intent thisIntent = new Intent(getBaseContext(),ProblemsActivity.class);

        if (levelSelected==1){
            level="one";
        }
        else if(levelSelected==2){
            level="two";
        }
        else if(levelSelected==3){
            level="three";
        }
        else if(levelSelected==4){
            level="four";
        }
        else if(levelSelected==5){
            level="five";
        }
        else{
            //Error
        }

        //Setting Intention Extra
        switch (view.getId()){

            case R.id.imgadd1:
                testName = "add" + level;
                break;

            case R.id.imgsub1:
                testName = "sub" + level;
                break;
            case R.id.imgmul1:
                testName = "mul" + level;
                break;
            case R.id.imgdiv1:
                testName = "div" + level;
                break;
        }
        thisIntent.putExtra("OPER_LEVEL", testName);
        startActivity(thisIntent);
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

        if(itemID == R.id.menu_scoreSummary){
            //navigate to score summary
            startActivity(new Intent(MainActivity.this,Summary.class));
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

    @Override
    protected void onPause(){
        super.onPause();
        mDataSource.close();
    }

    @Override
    protected void onResume(){
        super.onResume();
        mDataSource.open();
    }
}
