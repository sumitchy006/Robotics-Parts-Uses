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

public class Sub_Activity_1_1 extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    LinearLayout linearLayout;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_activity_1_1);

        textView= (TextView) findViewById(R.id.textView);
        //textView2= (TextView) findViewById(R.id.textView2);
        imageView= (ImageView) findViewById(R.id.imageView);
        //imageView2= (ImageView) findViewById(R.id.imageView2);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);


        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){
            String list=bundle.getString("position");
            showdetail(list);
        }


    }


    void showdetail(String list){
//        if(list.equals("0")){
//            imageView.setImageResource(R.drawable.arduino);
//            imageView2.setImageResource(R.drawable.arduino_2);
//            textView.setText(R.string.arduino_t1);
//            textView2.setText(R.string.arduino_t2);
//        }

//        if(list.equals("1")){
//            imageView.setImageResource(R.drawable.motordriver);
//            textView.setText(R.string.motor_driver_t);
//        }

        if(list.equals("2")){
            imageView.setImageResource(R.drawable.guiremotor);
            textView.setText(R.string.dc_motor_t);
        }
        if(list.equals("3")){
            imageView.setImageResource(R.drawable.servo_motor);
            textView.setText(R.string.servo_motor_t);
        }
        if(list.equals("4")){
            imageView.setImageResource(R.drawable.bluetooth);
            textView.setText(R.string.bluetooth_t);
        }
        if(list.equals("5")){
            imageView.setImageResource(R.drawable.wifimodiul);
            textView.setText(R.string.wifi_modiul_t);
        }
        if(list.equals("6")){
            imageView.setImageResource(R.drawable.lcd_display);
            textView.setText(R.string.lcd_display_t);
        }
        if(list.equals("7")){
            imageView.setImageResource(R.drawable.sonersensor);
            textView.setText(R.string.soner_sensor_t);
        }
        if(list.equals("8")){
            imageView.setImageResource(R.drawable.ir_sensor);
            textView.setText(R.string.ir_sensor_t);
        }
        if(list.equals("11")){
            imageView.setImageResource(R.drawable.uno_1);
            textView.setText(R.string.uno);
        }
        if(list.equals("12")){
            imageView.setImageResource(R.drawable.mega);
            textView.setText(R.string.mega);
        }
        if(list.equals("13")){
            imageView.setImageResource(R.drawable.nano);
            textView.setText(R.string.nano);
        }
       if(list.equals("14")){
            imageView.setImageResource(R.drawable.mini);
            textView.setText(R.string.mini);
        }
      if(list.equals("15")){
            imageView.setImageResource(R.drawable.micro_2);
            textView.setText(R.string.micro);
        }
     if(list.equals("16")){
            imageView.setImageResource(R.drawable.leonardo_1);
            textView.setText(R.string.leonardo);
        }
     if(list.equals("17")){
            imageView.setImageResource(R.drawable.due);
            textView.setText(R.string.due);
        }
     if(list.equals("18")){
            imageView.setImageResource(R.drawable.lilypad);
            textView.setText(R.string.lilypod);
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
