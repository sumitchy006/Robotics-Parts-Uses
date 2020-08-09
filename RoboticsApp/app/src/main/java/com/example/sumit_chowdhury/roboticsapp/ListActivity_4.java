package com.example.sumit_chowdhury.roboticsapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class ListActivity_4 extends AppCompatActivity {

    private ListView listView;
    TextView textView;
    LinearLayout linearLayout;
    private Intent intent;

    String [] items1 = {"Uno", "Mega","Nano","Mini","Micro", "Leonardo", "Due","Lilypad"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity_4);


        listView= (ListView) findViewById(R.id.listView);
        textView = (TextView) findViewById(R.id.textView);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);


        //make an array of the objects according to a layout design
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, items1);

        //set the adapter for listview
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                switch (position){
                    case 0:
                        intent = new Intent(ListActivity_4.this, Sub_Activity_1_1.class);
                         intent.putExtra("position","11");
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(ListActivity_4.this, Sub_Activity_1_1.class);
                        intent.putExtra("position","12");
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(ListActivity_4.this, Sub_Activity_1_1.class);
                        intent.putExtra("position","13");
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(ListActivity_4.this, Sub_Activity_1_1.class);
                        intent.putExtra("position","14");
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(ListActivity_4.this, Sub_Activity_1_1.class);
                        intent.putExtra("position","15");
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(ListActivity_4.this, Sub_Activity_1_1.class);
                        intent.putExtra("position","16");
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(ListActivity_4.this, Sub_Activity_1_1.class);
                        intent.putExtra("position","17");
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(ListActivity_4.this, Sub_Activity_1_1.class);
                        intent.putExtra("position","18");
                        startActivity(intent);
                        break;


                }
                // Show Toast
                // Toast.makeText(getApplicationContext(), "Position:"+itemPosition+"  Item Clicked: " +itemValue , Toast.LENGTH_LONG).show();
            }
        });

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.theme1:
                linearLayout.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.theme2:
                linearLayout.setBackgroundColor(Color.GREEN);
                break;

            case R.id.signout:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }



}
