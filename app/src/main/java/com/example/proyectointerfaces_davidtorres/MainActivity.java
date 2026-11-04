package com.example.proyectointerfaces_davidtorres;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageButton ib_calendario, ib_agenda, ib_usuarios, ib_opciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ib_usuarios = findViewById(R.id.ib_usuarios);

        ib_usuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iracontactos = new Intent(MainActivity.this, segundaActivity.class);
                startActivity(iracontactos);
            }
        });
    }
}