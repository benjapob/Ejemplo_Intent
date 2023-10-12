package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    TextView tvFecha;
    TextView tvGas;
    TextView tvO2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgPersona = findViewById(R.id.img);
        imgPersona.setImageResource(R.mipmap.iot);

        tvFecha = findViewById(R.id.tvDato1);
        tvGas = findViewById(R.id.tvDato2);
        tvO2 = findViewById(R.id.tvDato3);

        Bundle bundle = getIntent().getExtras();
        String fecha = bundle.getString("fecha");
        String gas = bundle.getString("gas");
        String o2 = bundle.getString("o2");
        tvFecha.setText("Fecha de medición: "+fecha);
        tvGas.setText("Concentración de gas: "+gas);
        tvO2.setText("Concentración de o2: "+o2);
    }



    public void back(View view) {
        finish();
    }
    public void del(View view) {
        finish();
    }
}