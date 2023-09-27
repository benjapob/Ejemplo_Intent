package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Agregar extends AppCompatActivity {

    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        et1 = findViewById(R.id.etNombre);
        et2 = findViewById(R.id.etUbi);
    }


}