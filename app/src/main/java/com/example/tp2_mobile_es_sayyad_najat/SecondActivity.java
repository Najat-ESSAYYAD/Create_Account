package com.example.tp2_mobile_es_sayyad_najat;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView text2;
    TextView text3;

    Button imgbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        text2=findViewById(R.id.username2);
        text3=findViewById(R.id.password2);

        Bundle extras=getIntent().getExtras();

        String n=extras.getString("username");
        String p=extras.getString("pass");

        text2.setText(n);
        text3.setText(p);

        imgbtn=findViewById(R.id.EditButton);

        imgbtn.setOnClickListener(view -> {
            Intent i=new Intent(SecondActivity.this,MainActivity.class);
            startActivity(i);

        });
    }
}