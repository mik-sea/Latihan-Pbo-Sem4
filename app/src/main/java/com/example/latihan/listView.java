package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

public class listView extends AppCompatActivity {

    ListView lvResult;
    private List<? extends Map<String,?>> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvResult = findViewById(R.id.lvResult);
        String[][] dataNegara = new String[][]{{"Indonesia","ASIA","indonesia"},{"Malaysia","ASIA","malaysia"},{"Singapore","ASIA","singapore"},{"Italia","EROPA","italia"},{"Inggris","EROPA","inggris"},{"Belanda","EROPA","belanda"},{"Argentina","AMERIKA","argentina"},{"Chile","AMERIKA","chile"},{"Mesir","AMERIKA","mesir"},{"Uganda","AMERIKA","ugandar"}};
        NegaraAdapter adapter = new NegaraAdapter(listView.this,dataNegara);
        lvResult.setAdapter(adapter);
    }
}