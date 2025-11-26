package com.pipe.avi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Iniciar_sesion extends AppCompatActivity {

    Button btniniciosesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        btniniciosesion=findViewById(R.id.btniniciosesion);

        btniniciosesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iniciosesion = new Intent(Iniciar_sesion.this, Principal.class);
                startActivity(iniciosesion);
                Toast.makeText(Iniciar_sesion.this, "Sesion Iniciada", Toast.LENGTH_SHORT).show();
            }
        });
    }
}