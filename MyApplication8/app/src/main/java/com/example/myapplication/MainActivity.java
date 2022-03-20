package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText userTxt,passTxt;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buLog(View view) {
        EditText userTxt=(EditText)findViewById(R.id.userTxt);
        EditText passTxt=(EditText)findViewById(R.id.passTxt);

        Intent myIntent=new Intent(this,MainActivity2.class);
        Bundle b=new Bundle();
        b.putString("user",userTxt.getText().toString());
        b.putString("pass",passTxt.getText().toString());
        myIntent.putExtras(b);
        startActivity(myIntent);

    }
}