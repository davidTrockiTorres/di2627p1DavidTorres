package com.example.proyectointerfaces_davidtorres;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class segundaActivity extends AppCompatActivity {
    EditText et_nombre, et_ape, et_mail;
    ToggleButton toggleButton;
    RadioGroup rg_genero;

    CheckBox cbamigos, cbfamiliares, cbtrabajo;
    Button btn_guardar, btn_cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        et_nombre = findViewById(R.id.et_nombre);
        et_ape = findViewById(R.id.et_ape);
        et_mail = findViewById(R.id.et_mail);
        toggleButton = findViewById(R.id.toggleButton);
        rg_genero = findViewById(R.id.rg_genero);
        cbamigos = findViewById(R.id.cbamigos);
        cbfamiliares = findViewById(R.id.cbfamiliares);
        cbtrabajo = findViewById(R.id.cbtrabajo);
        btn_guardar = findViewById(R.id.btn_guardar);
        btn_cancelar = findViewById(R.id.btn_cancelar);

        btn_cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btn_guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = et_nombre.getText().toString().trim();
                String apellidos = et_ape.getText().toString().trim();
                String email = et_mail.getText().toString().trim();
                boolean sexoSeleccionado = rg_genero.getCheckedRadioButtonId() != -1;
                boolean grupoSeleccionado = cbamigos.isChecked() || cbfamiliares.isChecked() || cbtrabajo.isChecked();

                if (nombre.isEmpty() || apellidos.isEmpty() || email.isEmpty() || !sexoSeleccionado || !grupoSeleccionado) {
                    Toast.makeText(segundaActivity.this, "Introduce todos los datos", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}