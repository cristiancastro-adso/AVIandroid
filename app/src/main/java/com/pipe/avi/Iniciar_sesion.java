package com.pipe.avi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Iniciar_sesion extends AppCompatActivity {

    Button btniniciosesion;

    EditText edtCorreo, edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        btniniciosesion=findViewById(R.id.btniniciosesion);

        edtCorreo=findViewById(R.id.edtCorreo);
        edtPass=findViewById(R.id.edtPass);

        btniniciosesion.setOnClickListener(v -> {
            String texto = edtCorreo.getText().toString().trim();

            if (texto.isEmpty()) {
                edtCorreo.setError("Este campo es obligatorio");
                edtCorreo.requestFocus();
            } else {
                // Aquí continúa la lógica si el campo NO está vacío}
                Intent intent = new Intent(Iniciar_sesion.this, Principal.class);
                startActivity(intent);
            }

        });
    }
}