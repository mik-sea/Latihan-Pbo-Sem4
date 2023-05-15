package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText username,password;
    Button btnLogin;
    TextView forgot_password,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.txt_username);
        password = findViewById(R.id.txt_password);
        btnLogin = findViewById(R.id.btn);
        forgot_password = findViewById(R.id.forgot_password);
        signup = findViewById(R.id.signup);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("mik") && password.getText().toString().equals("mik") ){
                    Toast.makeText(login.this, "Selamat Datang "+username.getText().toString(), Toast.LENGTH_SHORT).show();
                    Intent home = new Intent(login.this,home.class);
                    startActivity(home);
                }else{
                    Toast.makeText(login.this, "Username & Password salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup = new Intent(login.this, register.class);
                startActivity(signup);
            }
        });


    }
}