package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Agregar extends AppCompatActivity {

    EditText et1;
    EditText et2;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        et1 = findViewById(R.id.etNombre);
        et2 = findViewById(R.id.etUbi);

    }

    public void agregar(View view) {
        finish();
    }


}