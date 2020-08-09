package com.example.sumit_chowdhury.roboticsapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Sub_Activity_2_3 extends AppCompatActivity {

    TextView textView,textView2;
    LinearLayout linearLayout;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity_2_3);

        textView= (TextView) findViewById(R.id.textView);
        textView2= (TextView) findViewById(R.id.textView2);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        textView.setText(R.string.coditional_t1);
        textView2.setText(R.string.loop_t1);

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
