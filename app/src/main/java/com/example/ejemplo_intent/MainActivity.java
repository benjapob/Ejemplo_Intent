package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ImageView logo;
    EditText email;
    EditText contraseña;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.img);
        logo.setImageResource(R.mipmap.logo);

        email = findViewById(R.id.etUsuario);
        contraseña = findViewById(R.id.etPassword);

        EmpresaController.cargarLista();

    }

    public void menu(View v){
        String emailInput = email.getText().toString();
        String pwdInput = contraseña.getText().toString();
        if (emailInput.isEmpty() || pwdInput.isEmpty()){
            Toast.makeText(this, "Por favor, rellena los campos", Toast.LENGTH_SHORT).show();
        }
        else {
            DispositivoControllerMed controllerMed = EmpresaController.login(emailInput, pwdInput);
            if (controllerMed != null){
                Intent i = new Intent(this, Menu.class);
                /*Bundle bundle = new Bundle();
                bundle.putSerializable("controllerMed", controllerMed);
                i.putExtras(bundle);*/
                startActivity(i);
            }
            else {
                Toast.makeText(this, "Email o contraseña incorrecto", Toast.LENGTH_SHORT).show();
            }
        }
    }
    public void register(View v){
        Intent i = new Intent(this, Registrar.class);
        startActivity(i);
    }
}