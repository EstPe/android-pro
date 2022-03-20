package com.example.dialogbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int index = 0;
    int []arrPic = new int[]{R.drawable.birds,R.drawable.dog};
    public void slidePic(View view) {
        ImageView Pic = (ImageView) findViewById(R.id.imageView);
        Pic.setImageResource(arrPic[index]);
        index++;
        if(index > 1)
            index = 0;
    }
}