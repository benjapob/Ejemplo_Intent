package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Registrar extends AppCompatActivity {

    ImageView logo;

    EditText correo;
    EditText password;
    EditText nombre;
    EditText rut;
    EditText telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        logo = findViewById(R.id.img);
        logo.setImageResource(R.mipmap.logo);

        correo = findViewById(R.id.etUsuario);
        password = findViewById(R.id.etPassword);
        nombre = findViewById(R.id.etNombre);
        rut = findViewById(R.id.etRut);
        telefono = findViewById(R.id.etTelefono);
    }

    public void registerEmpresa(View view){
        String correoInput = correo.getText().toString();
        String passwordInput = password.getText().toString();
        String nombreInput = nombre.getText().toString();
        String rutInput = rut.getText().toString();
        String telefonoInput = telefono.getText().toString();

        if (correoInput.isEmpty() || passwordInput.isEmpty() || nombreInput.isEmpty() || rutInput.isEmpty() || telefonoInput.isEmpty()) {
            Toast.makeText(this, "Por favor, rellena los campos", Toast.LENGTH_SHORT).show();
        }
        else {
            EmpresaController.addEmpresa(nombreInput, rutInput, passwordInput, correoInput, telefonoInput);
            Toast.makeText(this, "Empresa registrada", Toast.LENGTH_SHORT).show();
            finish();
        }
    }
}