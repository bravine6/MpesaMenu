package com.example.mympesamenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity4 extends AppCompatActivity {
Button send;
EditText amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        send = findViewById(R.id.send);
        amount = findViewById(R.id.amount);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (amount.getText().toString().isEmpty()){
                    amount.setError("Required");
                }
            }
        });


        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}