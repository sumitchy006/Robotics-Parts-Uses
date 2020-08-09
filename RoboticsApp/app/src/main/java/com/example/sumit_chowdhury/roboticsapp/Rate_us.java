package com.example.sumit_chowdhury.roboticsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

public class Rate_us extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        textView = (TextView) findViewById(R.id.textView);

    }


    public void onSubmit(View view){
        float ratingValue = ratingBar.getRating();

        if(ratingValue < 2){
            textView.setText("Rating: "+ratingValue+"\nIs it that worse?");
        }

        else if(ratingValue <= 3 && ratingValue >= 2){
            textView.setText("Rating: "+ratingValue+"\nWe will try to be better !");
        }

        else if(ratingValue > 3 && ratingValue <= 4){
            textView.setText("Rating: "+ratingValue+"\nThat means you are having a good time here :)");
        }

        else if(ratingValue > 4){
            textView.setText("Rating: "+ratingValue+"\nWow! We will keep up the good work ;)");
        }
    }

}
