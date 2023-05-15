package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        if(Build.VERSION.SDK_INT > 9){
            ThreadPolicy policy = new ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

        final int welcomeScreen = 3000;//3 detik
        Thread welcome = new Thread(){
            int wait = 0;

            public void run(){
                try {
                    super.run();
                    while (wait < welcomeScreen){
                        sleep(100);
                        wait += 100;
                    }
                }catch (Exception e){
                    System.out.println("Exception : "+e);
                }finally {
                    Intent intent = new Intent(splashscreen.this,login.class);
                    startActivity(intent);
                }
            }
        };
        welcome.start();
    }
}