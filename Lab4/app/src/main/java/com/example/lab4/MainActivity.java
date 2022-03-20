package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void Clear(View view) {
        EditText name = (EditText) findViewById(R.id.editUserName);
        Intent myIntent = new Intent(this, activity2.class);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("clear");
        builder.setMessage("Are you sure you want to clear this name ?");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                name.setText(" ");
                startActivity(myIntent);


            }
        }).show();
        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        }).show();

    }
}
