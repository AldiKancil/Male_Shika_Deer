package com.bolasinarmas.login;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.editUsername);
        password = findViewById(R.id.editPassword);
        buttonLogin = findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(view -> {
            String usernamekey = username.getText().toString();
            String passwordkey = password.getText().toString();

            if(usernamekey.equals("Aldi") && passwordkey.equals("150220")){
                //Jika logmasuk berjaya
                Toast.makeText(getApplicationContext(), "Log masuk berjaya",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, AktivitiSelamatDatang.class);
                MainActivity.this.startActivity(intent);
            } else{
                //jika logmasuk gagal
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("Nama Pengguna atau Kata Laluan anda salah!")
                        .setNegativeButton("sila ulang",null).create().show();
            }
        });
    }
}