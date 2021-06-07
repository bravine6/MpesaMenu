package com.example.mympesamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    String [] menu2= {"Send Money","Withdraw Cash","Buy Airtime","Loans and Savings","Lipa na M-PESA","My Account"};
    ListView listView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_2);
        listView2=findViewById(R.id.listView2);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.mylist,menu2);
        listView2.setAdapter(arrayAdapter);
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent i = new Intent(getApplicationContext(),Activity3.class);

                    startActivity(i);
                }


            }
        });

    }
}