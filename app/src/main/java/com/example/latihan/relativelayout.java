package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class relativelayout extends AppCompatActivity {

    Spinner data;
    Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativelayout);
        data = findViewById(R.id.provinsi);
        btnOK = findViewById(R.id.tombol);

        btnOK.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Toast.makeText(relativelayout.this, "Pilihan "+data.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}