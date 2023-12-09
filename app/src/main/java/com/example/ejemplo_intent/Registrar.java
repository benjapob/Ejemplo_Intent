package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Registrar extends AppCompatActivity {

    ImageView logo;

    EditText correo;
    EditText password;
    EditText nombre;
    EditText rut;
    EditText telefono;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        iniciarFireBase();

        logo = findViewById(R.id.img);
        logo.setImageResource(R.mipmap.logo);

        correo = findViewById(R.id.etUsuario);
        password = findViewById(R.id.etPassword);
        nombre = findViewById(R.id.etNombre);
        rut = findViewById(R.id.etRut);
        telefono = findViewById(R.id.etTelefono);
    }

    private void iniciarFireBase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    public void registerEmpresa(View view) throws NoSuchAlgorithmException{
        String correoInput = correo.getText().toString();
        String passwordInput = Hash.hashPassword( password.getText().toString() );
        String nombreInput = nombre.getText().toString();
        String rutInput = rut.getText().toString();
        String telefonoInput = telefono.getText().toString();

        if (correoInput.isEmpty() || passwordInput.isEmpty() || nombreInput.isEmpty() || rutInput.isEmpty() || telefonoInput.isEmpty()) {
            Snackbar.make(correo,"Por favor, rellena los campos",Snackbar.LENGTH_SHORT)
                    .setAction("Ok", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            //Your code
                        }
                    })
                    .show();
        }
        else {
            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this)
                    .setTitle("Aviso")
                    .setMessage("Vas a crear una nueva empresa")
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Empresa e = EmpresaController.addEmpresa(nombreInput, rutInput, passwordInput, correoInput, telefonoInput);
                            if (e != null){
                                databaseReference.child("Empresa").child(String.valueOf(e.getIdEmpresa())).setValue(e);
                            }
                            finish();
                        }
                    })
                    .setNegativeButton("Volver", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                        }
                    });
            builder.create();
            builder.show();

        }
    }
    public void back(View view){
        finish();
    }
}