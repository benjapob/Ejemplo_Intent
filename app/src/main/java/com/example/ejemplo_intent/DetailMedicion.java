package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;

public class DetailMedicion extends AppCompatActivity {

    TextView tvFecha;
    TextView tvGas;
    TextView tvAcido;
    TextView tvAzufre;
    TextView tvUbi;
    Medicion medicion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgPersona = findViewById(R.id.img);
        imgPersona.setImageResource(R.mipmap.iot);

        tvFecha = findViewById(R.id.tvDato1);
        tvGas = findViewById(R.id.tvDato2);
        tvAcido = findViewById(R.id.tvDato3);
        tvAzufre = findViewById(R.id.tvDato4);
        tvUbi = findViewById(R.id.tvDato5);




        Intent intent = getIntent();
        medicion = (Medicion)intent.getSerializableExtra("medicion");

        tvFecha.setText("Fecha de medición: "+medicion.getFechaMedicion());
        tvGas.setText("Concentración de Gas: "+medicion.getGas());
        tvAcido.setText("Concentración de Ácido Sulfhídrico: "+medicion.getAcidoSulf());
        tvAzufre.setText("Concentración de Dióxido de Azufre: "+medicion.getAzufre());
        tvUbi.setText("Ubicación: "+medicion.getUbicacion());
    }



    public void back(View view) {
        finish();
    }
    public void del(View view) {
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this)
                .setTitle("Aviso")
                .setMessage("¿Estás seguro de eliminar esta medición?")
                .setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MedicionController.removeDispositivoMed(medicion.getIdMed());
                        Snackbar.make(tvFecha,"Dispositivo eliminado",Snackbar.LENGTH_SHORT)
                                .setAction("Ok", new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        //Your code
                                    }
                                })
                                .show();
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