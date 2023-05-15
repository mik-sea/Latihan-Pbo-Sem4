package com.example.latihan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;

public class NegaraAdapter extends BaseAdapter {
    TextView text1,text2;
//    ImageView imgView;
    String[][] data;
    Activity activity;

    public NegaraAdapter(Activity activity, String[][] data){
        super();
        this.data = data;
        this.activity = activity;
    }

    public int getCount(){return data.length;}
    public Object getItem(int position){return data[position];}
    public long getItemId(int position){return 0;}
    public View getView(int position, View convertView, ViewGroup parent){
        View v = convertView;
        if(v == null){
            LayoutInflater vi;
            vi = LayoutInflater.from(activity);
            //R.layout.activity_listviewactivity diganti dengan activity masing-masing yang ada imageview dan text1 dan text2
            v = vi.inflate(R.layout.activity_listviewactivity,null);
        }
        Object p = getItem(position);

        if (p != null){
            text1 = v.findViewById(R.id.text1);
            text2 = v.findViewById(R.id.text2);

            text1.setText(data[position][0]);
            text2.setText(data[position][2]);

        }
        return v;
    }

}
