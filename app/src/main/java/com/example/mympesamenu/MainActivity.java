package com.example.mympesamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] menu = {"Safaricom","Mpesa"};
    ListView listview;
    TextView textView;
    String[] listItem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listView);
        textView = findViewById(R.id.textView);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,R.layout.mylist,menu);
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==1)
                {
                    Intent intent = new Intent(getApplicationContext(),Activity2.class);

                    startActivity(intent);
                }
            }
        });

    }
}