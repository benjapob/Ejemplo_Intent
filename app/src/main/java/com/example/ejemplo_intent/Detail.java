package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {

    TextView tvFecha;
    TextView tvGas;
    TextView tvO2;
    TextView tvUbi;
    DispositivoMed medicion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgPersona = findViewById(R.id.img);
        imgPersona.setImageResource(R.mipmap.iot);

        tvFecha = findViewById(R.id.tvDato1);
        tvGas = findViewById(R.id.tvDato2);
        tvO2 = findViewById(R.id.tvDato3);
        tvUbi = findViewById(R.id.tvDato4);



        Intent intent = getIntent();
        medicion = (DispositivoMed)intent.getSerializableExtra("medicion");

        tvFecha.setText("Fecha de medición: "+medicion.getFechaMedicion());
        tvGas.setText("Concentración de gas: "+medicion.getGasConc());
        tvO2.setText("Concentración de o2: "+medicion.getO2Conc());
        tvUbi.setText("Ubicación: "+medicion.getUbicacion());
    }



    public void back(View view) {
        finish();
    }
    public void del(View view) {
        DispositivoControllerMed.removeDispositivoMed(medicion.getIdMed());
        Toast.makeText(this, "Dispositivo eliminado", Toast.LENGTH_SHORT).show();
        finish();
    }
}