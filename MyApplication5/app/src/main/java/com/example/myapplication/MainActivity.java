package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {
    EditText phone, password;
    Button loginBtn,registerBtn;
    String PhoneUser,PasswordUser,userId,getPassword;
    DatabaseReference reff;
    FirebaseAuth fAuth = FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        phone = (EditText) findViewById(R.id.phonelogin);
        password = (EditText) findViewById(R.id.passwordlogin);
        loginBtn = (Button) findViewById(R.id.login);
        registerBtn = (Button) findViewById(R.id.SingUp);
        loginBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                phone = (EditText) findViewById(R.id.phonelogin);
                password = (EditText) findViewById(R.id.passwordlogin);
                PhoneUser = phone.getText().toString();//.trim();
                PasswordUser = password.getText().toString();//.trim();

                if(PhoneUser.isEmpty() || PasswordUser.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"please enter your mobile or password",Toast.LENGTH_LONG).show();
                }
            }
        });
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(LoginPageActivity.this,"please enter your mobile or password",Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,Register.class);
                startActivity(intent);

            }
        });

    }

}