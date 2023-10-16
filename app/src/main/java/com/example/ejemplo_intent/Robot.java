package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Robot extends AppCompatActivity {

    TextView gas;
    TextView o2;
    String gasMedida = "";

    String o2Medida = "";
    DispositivoControllerMed controllerMed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);
        gas = findViewById(R.id.medida1);
        o2 = findViewById(R.id.medida2);

        Intent intent = getIntent();
        controllerMed = (DispositivoControllerMed)intent.getSerializableExtra("controllerMed");

        Random r = new Random();
        Integer gasNum = r.nextInt(100); //Vendrá desde el sensor

        Integer o2Num = r.nextInt(100); //Vendrá desde el sensor

        if (gasNum > 80){
            gasMedida = gasNum.toString() + " (Alta)";
        } else if (gasNum > 40) {
            gasMedida = gasNum.toString() + " (Media)";
        }
        else {
            gasMedida = gasNum.toString() + " (Baja)";
        }

        if (o2Num > 80){
            o2Medida = o2Num.toString() + " (Alta)";
        } else if (o2Num > 40) {
            o2Medida = o2Num.toString() + " (Media)";
        }
        else {
            o2Medida = o2Num.toString() + " (Baja)";
        }

        o2.setText("Concentración de gas: " + gasMedida );
        gas.setText("Concentración de o2: " + o2Medida);

    }

    public void agregar(View view) {
        controllerMed.addDispositivoMed(gasMedida, o2Medida);
        Toast.makeText(this, "Agregado al historial", Toast.LENGTH_SHORT).show();
    }
    public void volver(View view) {
        finish();
    }

}