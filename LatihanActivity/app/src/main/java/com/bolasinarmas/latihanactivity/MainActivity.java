package com.bolasinarmas.latihanactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnClosed, btnStart_activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClosed = findViewById(R.id.btn_closed);
        btnStart_activity = findViewById(R.id.btn_start_activity);

        btnClosed.setOnClickListener((View.OnClickListener) this);
        btnStart_activity.setOnClickListener((View.OnClickListener) this);

        Toast.makeText(this,"Activity:on Create()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this,"Activity:onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"Activity:onResume",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this,"Activity:onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this,"Activity:onStop",Toast.LENGTH_SHORT).show();
    }


}