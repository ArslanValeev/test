package com.example.betatest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread background = new Thread(){
            public void run()
            {
                try {
                    sleep(5*1000);
                    Intent skip = new Intent(MainActivity.this,MainActivity2.class);

                }
                catch (Exception e){}
            }
        };
        background.start();
    }
    protected void onDestroy(){
        super.onDestroy();
    }
}