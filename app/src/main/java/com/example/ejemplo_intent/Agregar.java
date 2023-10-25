package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.Random;

public class Agregar extends AppCompatActivity {

    TextView gas;
    TextView o2;
    TextView ubicacion;
    String gasMedida = "";
    String o2Medida = "";
    String ubicacionMed = "";
    Integer idEmpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        gas = findViewById(R.id.medida1);
        o2 = findViewById(R.id.medida2);
        ubicacion = findViewById(R.id.medida3);

        Intent intent = getIntent();
        idEmpresa = intent.getIntExtra("id", 0);

        Random r = new Random();
        Integer gasNum = r.nextInt(100); //Vendrá desde el sensor

        Integer o2Num = r.nextInt(100); //Vendrá desde el sensor

        if (gasNum > 80){
            gasMedida = gasNum.toString() + " (Alta)";
            gas.setBackgroundColor(Color.RED);
        } else if (gasNum > 40) {
            gasMedida = gasNum.toString() + " (Media)";
            gas.setBackgroundColor(Color.YELLOW);
        }
        else {
            gasMedida = gasNum.toString() + " (Baja)";
            gas.setBackgroundColor(Color.GREEN);
        }

        if (o2Num > 80){
            o2Medida = o2Num.toString() + " (Alta)";
            o2.setBackgroundColor(Color.RED);
        } else if (o2Num > 40) {
            o2Medida = o2Num.toString() + " (Media)";
            o2.setBackgroundColor(Color.YELLOW);
        }
        else {
            o2Medida = o2Num.toString() + " (Baja)";
            o2.setBackgroundColor(Color.GREEN);
        }

        gas.setText("Gas: " + gasMedida );
        o2.setText("O2: " + o2Medida);

        ubicacionMed = "77º 23º";
        ubicacion.setText("Ubicación: "+ubicacionMed);
    }

    public void agregar(View view) {
        MedicionController.addDispositivoMed(gasMedida, o2Medida, ubicacionMed);
        Snackbar.make(gas,"Medicion agregada",Snackbar.LENGTH_SHORT)
                .setAction("Ok", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Your code
                    }
                })
                .show();
    }
    public void volver(View view) {
        finish();
    }

}