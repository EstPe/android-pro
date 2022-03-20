package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add;
    Button minus;
    TextView display;
    int point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        add = (Button) findViewById(R.id.btnplus);
        minus = (Button) findViewById(R.id.btnminus);
        display = (TextView) findViewById(R.id.txtdisplay);
        add.setOnClickListener(this);
        minus.setOnClickListener (this);

    }

    public void onClick(View v){
        if(v == minus){
            point--;
            display.setText("your point is "+point);

        }
        if(v == add){
            point++;
            display.setText("your points is "+point);

        }
    }




}