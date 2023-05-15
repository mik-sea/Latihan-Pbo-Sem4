package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listviewdata extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    String[] programming = {"Java","Android","C++","C#","Visual Basic","Ruby","Python","PHP","Lisp"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listviewdata);

        listView = findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,programming);
        listView.setAdapter(arrayAdapter);
    }
}