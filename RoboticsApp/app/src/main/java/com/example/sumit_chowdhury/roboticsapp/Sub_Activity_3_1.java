package com.example.sumit_chowdhury.roboticsapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Sub_Activity_3_1 extends AppCompatActivity {

    TextView textView,textView2,textView3;
    ImageView imageView,imageView2;
    LinearLayout linearLayout;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity_3_1);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);


        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            String list=bundle.getString("position");
            showdetail(list);
        }


    }


    void showdetail(String list){
        if(list.equals("0")){
            imageView.setImageResource(R.drawable.blink_1);
            imageView2.setImageResource(R.drawable.blink_2);
            textView.setText(R.string.Blinking_led_t1);
            textView2.setText(R.string.Blinking_led_t2);
            textView3.setText(R.string.Blinking_led_t3);
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
                break;case R.id.theme2:
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
