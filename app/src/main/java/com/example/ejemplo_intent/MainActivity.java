package com.example.ejemplo_intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ImageView logo;
    EditText email;
    EditText contraseña;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iniciarFireBase();

        logo = findViewById(R.id.img);
        logo.setImageResource(R.mipmap.logo);

        email = findViewById(R.id.etUsuario);
        contraseña = findViewById(R.id.etPassword);

        getEmpresas();

    }

    private void iniciarFireBase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    private void getEmpresas() {
        databaseReference.child("Empresa").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                EmpresaController.listaEmpresa.clear();
                for (DataSnapshot item : snapshot.getChildren()){
                    Empresa e = item.getValue(Empresa.class);
                    if (EmpresaController.findEmpresa(e.getIdEmpresa()) == null){
                        EmpresaController.listaEmpresa.add(e);
                    }
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void menu(View v){
        String emailInput = email.getText().toString();
        String pwdInput = contraseña.getText().toString();
        if (emailInput.isEmpty() || pwdInput.isEmpty()){
                Snackbar.make(email,"Por favor, rellena los campos",Snackbar.LENGTH_SHORT)
                        .setAction("Ok", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                //Your code
                            }
                        })
                        .show();
        }
        else {
            Integer idEmpresa = EmpresaController.login(emailInput, pwdInput);
            if (idEmpresa != null){
                Intent i = new Intent(this, Menu.class);
                i.putExtra("id", idEmpresa);
                /*Bundle bundle = new Bundle();
                bundle.putSerializable("controllerMed", controllerMed);
                i.putExtras(bundle);*/
                startActivity(i);
            }
            else {
                Snackbar.make(email,"Email o contraseña incorrectos",Snackbar.LENGTH_SHORT)
                        .setAction("Ok", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                //Your code
                            }
                        })
                        .show();
            }
        }
    }
    public void register(View v){
        Intent i = new Intent(this, Registrar.class);
        startActivity(i);
    }
}