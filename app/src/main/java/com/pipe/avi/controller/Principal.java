package com.pipe.avi.controller;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.pipe.avi.R;

public class Principal extends AppCompatActivity {

    ImageButton btnusuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        btnusuario=findViewById(R.id.btnusuario);

        btnusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Principal.this, User.class);
                startActivity(intent);
            }
        });
    }
}