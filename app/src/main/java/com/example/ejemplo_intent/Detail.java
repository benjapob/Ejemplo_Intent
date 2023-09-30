package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    TextView tvNombre;
    TextView tvUbi;
    TextView tvGas;
    TextView tvDueño;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgPersona = findViewById(R.id.img);
        imgPersona.setImageResource(R.mipmap.iot);

        tvNombre = findViewById(R.id.tvDato1);
        tvUbi = findViewById(R.id.tvDato2);
        tvGas = findViewById(R.id.tvDato3);
        tvDueño = findViewById(R.id.tvDato4);

        Bundle bundle = getIntent().getExtras();
        String nom = bundle.getString("nombre");
        String ubi = bundle.getString("ubi");
        String gas = bundle.getString("gas");
        String dueño = bundle.getString("dueño");
        tvNombre.setText("Nombre: "+nom);
        tvUbi.setText("Ubicación: "+ubi);
        tvGas.setText("Concentración de gas: "+gas);
        tvDueño.setText("Dueño: "+dueño);
    }

    public void back(View view) {
        finish();
    }
    public void del(View view) {
        finish();
    }
}