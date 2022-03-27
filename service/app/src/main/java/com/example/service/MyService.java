package com.example.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyService extends Service {


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this,"Service is created",Toast.LENGTH_LONG).show();
    }

    public int onStartCommand(Intent Intent,int flags,int startId){
        Toast.makeText(this,"Service is STARTED",Toast.LENGTH_LONG).show();
        for(int i=0;i<=13;i++){
            Toast.makeText(this,"counter"+i,Toast.LENGTH_LONG).show();
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){

            }
        }
          return START_STICKY;
    }
    public void onDestroy(){
        Toast.makeText(this,"Service is DESTROY",Toast.LENGTH_LONG).show();
    }
}
