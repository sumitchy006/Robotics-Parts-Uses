package com.example.sumit_chowdhury.roboticsapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Sub_Activity_2_1_1 extends AppCompatActivity {

    TextView textView;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub__2_1_1);

        textView = (TextView) findViewById(R.id.textView);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            String list=bundle.getString("position");
            showdetail(list);
        }
    }

    void showdetail(String list){
        if(list.equals("1")){
            textView.setText(R.string.digitalRead);
        }

        if(list.equals("2")){
            textView.setText(R.string.digitalWrite);
        }
        if(list.equals("3")){
            textView.setText(R.string.Pin_mode);
        }
        if(list.equals("5")){
            textView.setText(R.string.analogRead);
        }
       if(list.equals("6")){
            textView.setText(R.string.analogWrite);
        }
      if(list.equals("8")){
            textView.setText(R.string.delay);
        }
        if(list.equals("9")){
            textView.setText(R.string.delay_Microseconds);
        }
        if(list.equals("10")){
            textView.setText(R.string.delay_micros);
        }
        if(list.equals("11")){
            textView.setText(R.string.delay_millis);
        }

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
