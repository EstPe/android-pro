package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button add;
    EditText editText;
    TextView display;
    int point;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        add = (Button) findViewById(R.id.btnplus);
        editText = (EditText) findViewById(R.id.age);
        display = (TextView) findViewById(R.id.display);
        add.setOnClickListener(this);//מגיע מחרוזת צריך לבצע המרה//בדרך כלל בשביל הכפתור

    }

    public void onClick(View v){
        int year = Integer.parseInt(editText.getText().toString());
            display.setText("your age is "+(2022-year));

    }




}