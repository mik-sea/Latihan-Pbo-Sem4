package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class linearlayout extends AppCompatActivity {
    EditText editNama,editAlamat;
    TextView txtHasil;
    Button btnTampilkan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearlayout);
        editNama = findViewById(R.id.editNama);
        editAlamat = findViewById(R.id.editAlamat);
        txtHasil = findViewById(R.id.txtHasil);
        btnTampilkan = findViewById(R.id.btnTampilkan);

//        btnTampilkan gunakan fungsi setOnclickListener
        btnTampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtHasil.setText("Hello Nama Saya "+editNama.getText().toString()+" dan Alamat Saya di "+editAlamat.getText().toString());
            }
        });
    }
}