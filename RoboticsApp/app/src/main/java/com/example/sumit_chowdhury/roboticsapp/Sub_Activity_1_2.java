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

public class Sub_Activity_1_2 extends AppCompatActivity {

    TextView textView,textView2;
    ImageView imageView,imageView2;
    LinearLayout linearLayout;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity_1_2);


        textView= (TextView) findViewById(R.id.textView);
        textView2= (TextView) findViewById(R.id.textView2);
       // imageView= (ImageView) findViewById(R.id.imageView);
        imageView2= (ImageView) findViewById(R.id.imageView2);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);


        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            String list=bundle.getString("position");
            showdetail(list);
        }

//           imageView.setImageResource(R.drawable.arduino);
//           imageView2.setImageResource(R.drawable.arduino_2);
//           textView.setText(R.string.arduino_t1);
//           textView2.setText(R.string.arduino_t2);


    }



    void showdetail(String list){
        if(list.equals("0")){
            //imageView.setImageResource(R.drawable.arduino);
            imageView2.setImageResource(R.drawable.arduino_2);
            textView.setText(R.string.arduino_t1);
            textView2.setText(R.string.arduino_t2);
        }
    if(list.equals("1")){
           //imageView.setImageResource(R.drawable.motordriver);
            imageView2.setImageResource(R.drawable.motor_d_2);
            textView.setText(R.string.motor_driver_t_1);
            textView2.setText(R.string.motor_driver_t_2);
        }
        if(list.equals("2")){
           //imageView.setImageResource(R.drawable.motordriver);
            imageView2.setImageResource(R.drawable.pushbutton);
            textView.setText(R.string.led_with_botton_t1);
            textView2.setText(R.string.led_with_botton_t2);
        }
        if(list.equals("3")){
           //imageView.setImageResource(R.drawable.motordriver);
            imageView2.setImageResource(R.drawable.ldr);
            textView.setText(R.string.ldr_t1);
            textView2.setText(R.string.ldr_t2);
        }
        if(list.equals("4")){
           //imageView.setImageResource(R.drawable.motordriver);
            imageView2.setImageResource(R.drawable.rgb);
            textView.setText(R.string.rgb_led_t1);
            textView2.setText(R.string.rgb_led_t2);
        }
        if(list.equals("5")){
           //imageView.setImageResource(R.drawable.motordriver);
            imageView2.setImageResource(R.drawable.temp);
            textView.setText(R.string.temperature_sensor_t1);
            textView2.setText(R.string.temperature_sensor_t2);
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
