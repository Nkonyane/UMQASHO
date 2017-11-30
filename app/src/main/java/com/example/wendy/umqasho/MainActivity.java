package com.example.wendy.umqasho;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

import static android.os.Build.VERSION_CODES.M;

public class MainActivity extends AppCompatActivity {
    TabHost Tabhost;

    private static final int SPLASH_TIME_OUT=4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(getApplicationContext(),LOGIN.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}