package com.example.hotelmitaddelmundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText etPass, etUsu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etPass = (EditText)findViewById(R.id.etPassword2);
        etUsu = (EditText)findViewById(R.id.etName);
    }

    public void ingresar(View viw){

                Intent i = new Intent(this, principal.class);
                startActivity(i);

    }

    public void registro(View view){
        Intent i = new Intent(this, registrar.class);
        startActivity(i);

    }

}