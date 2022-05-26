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

public class Signup extends AppCompatActivity {
   /* EditText fullNameSingUp, emailSingUp, phoneSingUp, passwordSingUp;
    Button btnsaveSingUp;
   // String nameuser,userName,emailUser,phoneUser,passwordUser;
*/
    // String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
//    DatabaseReference databaseReference;// = FirebaseDatabase.getInstance().getReferenceFromUrl("https://finalproject-9bc89-default-rtdb.firebaseio.com/");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
       /* fullNameSingUp = (EditText) findViewById(R.id.NameSingUp);
        emailSingUp = (EditText) findViewById(R.id.emailSingUp);
        phoneSingUp = (EditText) findViewById(R.id.PhoneSingUp);
        passwordSingUp = (EditText) findViewById(R.id.PasswordSingUp);
        btnsaveSingUp = (Button) findViewById(R.id.btnregister);
*/
       // databaseReference = FirebaseDatabase.getInstance().getReference().child("User");
     /*   btnsave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                userName = fullName.getText().toString();
                emailUser = email.getText().toString();
                phoneUser = phone.getText().toString();
                passwordUser = password.getText().toString();
                databaseReference.child("user").addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        if(snapshot.hasChild(phoneUser)){
                            Toast.makeText(Signup.this,"phone is already Registered",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            databaseReference.child("users").child(phoneUser).child("fullname").setValue(fullName);
                            databaseReference.child("users").child(phoneUser).child("email").setValue(emailUser);
                            databaseReference.child("users").child(phoneUser).child("password").setValue(passwordUser);

                            Toast.makeText(Signup.this, "User registered successfully.", Toast.LENGTH_SHORT).show();
                            finish();

                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

//                    Map<String, Object> user = new HashMap<>();
//                    userName = fullName.getText().toString();
//                    emailUser = email.getText().toString();
//                   phoneUser = phone.getText().toString();
//                   passwordUser = password.getText().toString();
//
//                    if (userName.isEmpty() || emailUser.isEmpty() || phoneUser.isEmpty() || passwordUser.isEmpty()) {
//                        Toast.makeText(RegisterPageActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
//                    }else if(!emailUser.matches(emailPattern)){
//                       Toast.makeText(RegisterPageActivity.this, "not an email", Toast.LENGTH_SHORT).show();
//                   }
//                        else {
//                        user.put("user name", fullName.getText().toString());
//                        user.put("email", email.getText().toString());
//                        user.put("phone", phone.getText().toString());
//                        user.put("password", password.getText().toString());
//                      databaseReference.push().setValue(user);
//                        Toast.makeText(RegisterPageActivity.this, "connected", Toast.LENGTH_LONG).show();
//                    }
            }

        });*/
    }
}