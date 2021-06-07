package com.example.mympesamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {
    Button send;
EditText number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        send = findViewById(R.id.send);
        number= findViewById(R.id.number);


        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(number.getText().toString().isEmpty())
                {
                    number.setError("Required");
                    return;
                }
            }
        });
        Intent intent = new Intent(getApplicationContext(),Activity4.class);


        startActivity(intent);
    }
}