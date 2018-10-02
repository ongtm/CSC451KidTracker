package com.example.tong.csc451kidtracker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ProblemsActivity extends AppCompatActivity {
    private boolean hintsVisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);

        //This is to test the key/value pair coming over from the MainActivity
        String getVal = getIntent().getStringExtra("val1");
        TextView tv =(TextView) findViewById(R.id.testtype);
        tv.setText(getVal);

        //pull sqlite data here

        //hide tvCorrectAnswer
        TextView textViewCA;
        TextView textViewCAT;

        textViewCA = findViewById(R.id.tvcorrectanswer);
        textViewCA.setText(getString(R.string.tvcorrectanswer));
        textViewCA.setVisibility(View.GONE);

        textViewCAT = findViewById(R.id.tvcorrectanswertext);
        textViewCAT.setText(getString(R.string.tvcorrectanswertext));
        textViewCAT.setVisibility(View.GONE);

        TextView textViewTT;

        textViewTT = findViewById(R.id.testtype);
        textViewTT.setVisibility(View.GONE);

        //Hint List items
        ListView listViewHints;
        listViewHints = findViewById(R.id.hintlist);
        String [] hintValues = new String []{"1","2","3","4"};

        ArrayList<String> arrayHint = new ArrayList<String>();

        for(int i = 0; i < hintValues.length; i++){
            arrayHint.add(hintValues[i]);
        }

        final StableArrayAdapter adapter = new StableArrayAdapter(this, android.R.layout.simple_list_item_1, Arrays.asList(hintValues));

        listViewHints.setAdapter(adapter);

        /************************************************************* */
        listViewHints.setVisibility(View.GONE);
        hintsVisible = false;

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
            this.finish();
        }
        else if(itemID == R.id.menu_scoreSummary_child){
            //navigate to score summary
            startActivity(new Intent(ProblemsActivity.this,Summary.class));
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


    public void onClickCheckAnswer(View view) {

        TextView textViewCA;
        TextView textViewResult;
        TextView textViewCAT;

        textViewCA = findViewById(R.id.tvcorrectanswer);
        textViewResult = findViewById(R.id.etresult);
        textViewCAT = findViewById(R.id.tvcorrectanswertext);



        //Toast.makeText(this,textViewResult.getText().toString(),Toast.LENGTH_LONG).show();
        //Toast.makeText(this, textViewCA.getText().toString(),Toast.LENGTH_LONG).show();

        if(textViewCA.getText().toString().equals(textViewResult.getText().toString())){
            textViewCAT.setText("");
            textViewCAT.setText("You entered the correct answer of " + textViewResult.getText().toString());
            textViewCAT.setVisibility(View.VISIBLE);

        }
        else{
            //String correctAnswer = textViewCA.getText().toString();
            textViewCAT.setText("");
            textViewCAT.setText("You entered an incorrect answer.  The correct answer is " + textViewCA.getText().toString());
            textViewCAT.setVisibility(View.VISIBLE);
        }



    }

    public void onClickHint(View view){
        Toast.makeText(this,"Hints not available at this time",Toast.LENGTH_LONG).show();
        ListView listViewHints;
        listViewHints = findViewById(R.id.hintlist);

        if(hintsVisible = false){
            listViewHints.setVisibility(View.VISIBLE);
        }
        else{
            listViewHints.setVisibility(View.GONE);
        }
    }

    public void onClickNextQuestion(View view){
        Toast.makeText(this, "Next Question button not operational", Toast.LENGTH_SHORT).show();
       /* TextView textViewNum1;
        TextView textViewNum2;
        TextView textViewCA;
        TextView textViewCAT;

        textViewNum1 = findViewById(R.id.tvnum1);
        textViewNum2 = findViewById(R.id.tvnum2);
        textViewCA = findViewById(R.id.tvcorrectanswer);
        textViewCAT = findViewById(R.id.tvcorrectanswertext);

        textViewNum1.setText('1');
        textViewNum2.setText('4');
        textViewCA.setText('5');

        textViewCAT.setVisibility(View.GONE);*/
    }

    private class StableArrayAdapter extends ArrayAdapter<String> {
        HashMap<String, Integer> mIDMap = new HashMap<String, Integer>();
        public StableArrayAdapter(Context context, int textViewResourceId, List<String>objects){
            super(context,textViewResourceId, objects);
            for(int i = 0; i< objects.size();i++){
                mIDMap.put(objects.get(i),i);
            }
        }

        @Override
        public long getItemId(int position){
            String item = getItem(position);
            return mIDMap.get(item);
        }

        @Override
        public boolean hasStableIds(){
            return true;
        }

    }


}
