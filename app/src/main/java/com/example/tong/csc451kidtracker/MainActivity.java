package com.example.tong.csc451kidtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign Spinners objects by ID
        Spinner spinnerAdd = findViewById(R.id.spinneradd);
        Spinner spinnerSub = findViewById(R.id.spinnersub);
        Spinner spinnerMul = findViewById(R.id.spinnermul);
        Spinner spinnerDiv = findViewById(R.id.spinnerdiv);

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
        spinnerSub.setOnItemSelectedListener(this);
        spinnerMul.setOnItemSelectedListener(this);
        spinnerDiv.setOnItemSelectedListener(this);

        //attaching adapter to the spinner
        spinnerAdd.setAdapter(spinnerAdapter);
        spinnerSub.setAdapter(spinnerAdapter);
        spinnerMul.setAdapter(spinnerAdapter);
        spinnerDiv.setAdapter(spinnerAdapter);

        //setting onClickListeners for each imagebutton on activity
        ImageButton add1 = findViewById(R.id.imgadd1);
            add1.setOnClickListener(this);
        ImageButton add2 = findViewById(R.id.imgadd2);
            add2.setOnClickListener(this);
        ImageButton sub1 = findViewById(R.id.imgsub1);
            sub1.setOnClickListener(this);
        ImageButton sub2 = findViewById(R.id.imgsub2);
            sub2.setOnClickListener(this);
        ImageButton mul1 = findViewById(R.id.imgmul1);
            mul1.setOnClickListener(this);
        ImageButton mul2 = findViewById(R.id.imgmul2);
            mul2.setOnClickListener(this);
        ImageButton div1 = findViewById(R.id.imgdiv1);
            div1.setOnClickListener(this);
        ImageButton div2 = findViewById(R.id.imgdiv2);
            div2.setOnClickListener(this);

    }


    //Item Selected Listener for Spinner
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Integer item = (Integer)parent.getItemAtPosition(position);

        //This may be the correct form
        //String item = parent.getItemAtPosition(position).toString();

        //Displaying level for now--implement selection of questions from array later
        Toast.makeText(parent.getContext(), "Level Selected " + item, Toast.LENGTH_LONG).show();
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //Throw error?--Auto generated method.
    }

    @Override
    public void onClick(View view){

        //Setting intent action for activity change
        Intent thisIntent = new Intent(getBaseContext(),ProblemsActivity.class);

        //Setting Intention Extra
        switch (view.getId()){
            case R.id.imgadd1:
                thisIntent.putExtra("val1","imgadd1");
                break;
            case R.id.imgadd2:
                thisIntent.putExtra("val1","imgadd2");
                break;
            case R.id.imgsub1:
                thisIntent.putExtra("val1","imgsub1");
                break;
            case R.id.imgsub2:
                thisIntent.putExtra("val1","imgsub2");
                break;
            case R.id.imgmul1:
                thisIntent.putExtra("val1","imgmul1");
                break;
            case R.id.imgmul2:
                thisIntent.putExtra("val1","imgmul2");
                break;
            case R.id.imgdiv1:
                thisIntent.putExtra("val1","imgdiv1");
                break;
            case R.id.imgdiv2:
                thisIntent.putExtra("val1","imgdiv2");
                break;

        }

        startActivity(thisIntent);
    }

}
