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

public class Sub_Activity_2_1 extends AppCompatActivity {

    TextView textView,textView2,textView3,textView4;
    ImageView imageView,imageView2,imageView3;
    LinearLayout linearLayout;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity_2_1);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        imageView= (ImageView) findViewById(R.id.imageView);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        imageView3= (ImageView) findViewById(R.id.imageView3);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);


        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            String list=bundle.getString("position");
            showdetail(list);
        }


    }


    void showdetail(String list){
        if(list.equals("0")){
            imageView.setImageResource(R.drawable.set_up_1);
            imageView2.setImageResource(R.drawable.set_up_2);
            imageView3.setImageResource(R.drawable.set_up_3);
            textView.setText(R.string.set_up_t1);
            textView2.setText(R.string.set_up_t2);
            textView3.setText(R.string.set_up_t3);
            textView4.setText(R.string.set_up_t4);
        }

//        if(list.equals("1")){
//            imageView.setImageResource(R.drawable.motordriver);
//            textView.setText(R.string.motor_driver_t);
//        }
//        if(list.equals("2")){
//            imageView.setImageResource(R.drawable.guiremotor);
//            textView.setText(R.string.dc_motor_t);
//        }
//        if(list.equals("3")){
//            imageView.setImageResource(R.drawable.guiremotor);
//            textView.setText(R.string.dc_motor_t);
//        }

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
