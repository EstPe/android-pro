package com.example.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        Intent myIntent = new Intent(getBaseContext(),MyService.class);
        startService(myIntent);

    }

    public void stop(View view) {
        Intent myIntent = new Intent(getBaseContext(),MyService.class);
        stopService(myIntent);
    }
}