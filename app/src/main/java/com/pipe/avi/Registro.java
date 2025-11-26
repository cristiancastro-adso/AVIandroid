package com.pipe.avi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registro extends AppCompatActivity {

    Button btnregistrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnregistrado=findViewById(R.id.btnregistrado);

        btnregistrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrado = new Intent(Registro.this, MainActivity.class);
                startActivity(registrado);
                Toast.makeText(Registro.this, "Usuario Registrado", Toast.LENGTH_SHORT).show();
            }
        });


    }
}