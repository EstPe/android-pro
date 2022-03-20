package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText number1,number2;
    Button buttonP,buttonM,buttonMI,buttonD;
    TextView Display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonP = (Button)findViewById(R.id.buttonPlus);
        buttonM = (Button)findViewById(R.id.buttonMultiple);
        buttonMI = (Button)findViewById(R.id.buttonMinos);
        buttonD = (Button)findViewById(R.id.buttonDiv);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonPlus(number1,number2);
            }
        });
        buttonMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonMinos(number1,number2);

            }
        });

        buttonM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonMultiple(number1,number2);


            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buttonDiv(number1,number2);

            }
        });



    }
    public void buttonPlus(EditText num1,EditText num2) {
        int digit1,digit2;
        digit1 = Integer.parseInt(num1.getText().toString());
        digit2 = Integer.parseInt(num2.getText().toString());
        Display = (TextView)findViewById(R.id.answer);
        Display.setText("The answer is :"+(digit1+digit2));


    }


    public void buttonMinos(EditText num1,EditText num2) {
        int digit1,digit2;
        digit1 = Integer.parseInt(num1.getText().toString());
        digit2 = Integer.parseInt(num2.getText().toString());
        Display = (TextView)findViewById(R.id.answer);
        Display.setText("The answer is :"+(digit1-digit2));
    }

    public void buttonMultiple(EditText num1,EditText num2) {
        int digit1,digit2;
        digit1 = Integer.parseInt(num1.getText().toString());
        digit2 = Integer.parseInt(num2.getText().toString());
        Display = (TextView)findViewById(R.id.answer);
        Display.setText("The answer is :"+(digit1*digit2));
    }

    public void buttonDiv(EditText num1,EditText num2) {
            int digit1,digit2;
            digit1 = Integer.parseInt(num1.getText().toString());
            digit2 = Integer.parseInt(num2.getText().toString());
            Display = (TextView)findViewById(R.id.answer);
            Display.setText("The answer is :"+String.valueOf((double)(digit1/digit2)));
        }
    }
