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

public class ListActivity_2 extends AppCompatActivity {

    private ListView listView;
    private Intent intent;
    TextView textView;
    LinearLayout linearLayout;

    String [] items2 = {"Setup Arduino IDE","Basic Structure","Conditional/Loop","Useful Function"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity_2);

        listView= (ListView) findViewById(R.id.listView);
        textView = (TextView) findViewById(R.id.textView);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);



        //make an array of the objects according to a layout design
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, items2);

        //set the adapter for listview
        listView.setAdapter(adapter);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // ListView Clicked item index
                // int itemPosition     = position;

                // ListView Clicked item value
               // //String  itemValue    = (String) listView.getItemAtPosition(position);

//                    if(listView.getSelectedItem()==itemPosition) {
//                        intent = new Intent(MainActivity.this, ListActivity_1.class);
//                        intent.putExtra("name","Bangladesh");
//                        startActivity(intent);
//                    }

                switch (position){
                    case 0:
                        intent = new Intent(ListActivity_2.this, Sub_Activity_2_1.class);
                        // intent.putExtra("name","Bangladesh");
                        intent.putExtra("position","0");
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(ListActivity_2.this, Sub_Activity_2_2.class);
                        // intent.putExtra("name","Bangladesh");
                        intent.putExtra("position","1");
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(ListActivity_2.this, Sub_Activity_2_3.class);
                        // intent.putExtra("name","Bangladesh");
                        intent.putExtra("position","2");
                        startActivity(intent);
                        break;

                    case 3:
                        intent = new Intent(ListActivity_2.this,ListActivity_Sub_2_1.class);
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
        //inflate the menu resource file in your activity
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //code for item select event handling
        switch(item.getItemId()){
            case R.id.theme1:
                //textView.setText("Profile");
                linearLayout.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.theme2:
                //textView.setText("Profile");
                linearLayout.setBackgroundColor(Color.GREEN);
                break;

            case R.id.signout:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
