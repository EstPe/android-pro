package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* setContentView(R.layout.activity_main2);
        TextView txtDisplay=(TextView)findViewById(R.id.txtDisplay);
        Bundle b=getIntent().getExtras();

        String user=b.getString("user");
        String password=b.getString("pass");
        txtDisplay.setText("the username is:"+user+"and the password is"+password);*/



    }

    public void buttonCalc(View view) {

    }

    public void buttonPlus(View view) {
        EditText number1=(EditText)findViewById(R.id.number1);
        EditText number2=(EditText)findViewById(R.id.number2);
        TextView txtDisplay=(TextView)findViewById(R.id.Name);


    }
}