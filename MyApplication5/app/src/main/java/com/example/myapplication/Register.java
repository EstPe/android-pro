package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Register extends AppCompatActivity {
    EditText fullNameSingUp,emailSingUp,phoneSingUp,passwordSingUp;
    Button btnsaveSingUp;
    String userNameSingUp,emailUserSingUp,phoneUserSingUp,passwordUserSingUp;
  DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReferenceFromUrl("https://finalproject-9bc89-default-rtdb.firebaseio.com/");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
         fullNameSingUp = (EditText) findViewById(R.id.NameSingUp);
        emailSingUp = (EditText) findViewById(R.id.emailSingUp);
        phoneSingUp = (EditText) findViewById(R.id.PhoneSingUp);
        passwordSingUp = (EditText) findViewById(R.id.PasswordSingUp);
        btnsaveSingUp = (Button) findViewById(R.id.btnregister);
        databaseReference = FirebaseDatabase.getInstance().getReference().child("User");
        btnsaveSingUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userNameSingUp = fullNameSingUp.getText().toString();
                emailUserSingUp = emailSingUp.getText().toString();
                phoneUserSingUp = phoneSingUp.getText().toString();
                passwordUserSingUp = passwordSingUp.getText().toString();
                databaseReference.child("user").addListenerForSingleValueEvent(new ValueEventListener() {

                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.hasChild(phoneUserSingUp)){
                            Toast.makeText(Register.this,"phone is already Registered",Toast.LENGTH_SHORT).show();
                        }else {
                            databaseReference.child("users").child(phoneUserSingUp).child("fullname").setValue(userNameSingUp);
                            databaseReference.child("users").child(phoneUserSingUp).child("email").setValue(emailUserSingUp);
                            databaseReference.child("users").child(phoneUserSingUp).child("password").setValue(passwordUserSingUp);
                            Toast.makeText(Register.this, "User registered successfully.", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }

                });
            }
        });
        }


    }
