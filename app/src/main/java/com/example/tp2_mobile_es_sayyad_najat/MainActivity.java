package com.example.tp2_mobile_es_sayyad_najat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    EditText txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Create",Toast.LENGTH_LONG).show();

        txt1=findViewById(R.id.username);
        txt2=findViewById(R.id.password);

        b=findViewById(R.id.loginButton);
        b.setOnClickListener(view -> {
            Intent i=new Intent(MainActivity.this,SecondActivity.class);
            i.putExtra("username",txt1.getText().toString());
            i.putExtra("pass",txt2.getText().toString());
            startActivity(i);
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Start",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"Resume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"Restart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Pause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"Stop",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Destroy",Toast.LENGTH_LONG).show();
    }
}