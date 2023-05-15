package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class home extends AppCompatActivity {
    Button btnLinear,btnRelative,btnLogin,btnListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnLinear = findViewById(R.id.btnLinear);
        btnRelative = findViewById(R.id.btnRelative);
        btnLogin = findViewById(R.id.btnLogin);
        btnListView = findViewById(R.id.btnListView);

//        setonclicklistener untuk 3 variable diatas
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linear = new Intent(home.this, linearlayout.class);
                startActivity(linear);
            }
        });
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relative = new Intent(home.this, relativelayout.class);
                startActivity(relative);
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent login = new Intent(home.this, login.class);
                startActivity(login);
            }
        });
        btnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ListView = new Intent(home.this, listView.class);
                startActivity(ListView);
            }
        });
    }
}