package com.example.sumit_chowdhury.roboticsapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn1,btn2,btn3,btn4;
    private Intent intent;

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button) findViewById(R.id.bt_1);
        btn2=(Button) findViewById(R.id.bt_2);
        btn3=(Button) findViewById(R.id.bt_3);
        btn4=(Button) findViewById(R.id.bt_4);

        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.bt_1){
            intent=new Intent(MainActivity.this,ListActivity_1.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.bt_2){
            intent=new Intent(MainActivity.this,ListActivity_2.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.bt_3){
            intent=new Intent(MainActivity.this,ListActivity_3.class);
            startActivity(intent);
        }
       if(view.getId()==R.id.bt_4){
            intent=new Intent(MainActivity.this,ListActivity_4.class);
            startActivity(intent);
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){

            case R.id.about_us:
                    intent=new Intent(MainActivity.this,About_us.class);
                    startActivity(intent);
                  // linearLayout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.rate_us:
                intent=new Intent(MainActivity.this,Rate_us.class);
                startActivity(intent);
                //linearLayout.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.signout:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
