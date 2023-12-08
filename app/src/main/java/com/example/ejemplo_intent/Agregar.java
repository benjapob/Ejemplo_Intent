package com.example.ejemplo_intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Random;

public class Agregar extends AppCompatActivity {

    TextView gas;
    TextView sulf;
    TextView azufre;
    TextView ubicacion;
    Dispositivo dispositivo;
    String gasMedida = "";
    String sulfMedida = "";
    String azMedida = "";
    String ubicacionMed = "";
    Integer idEmpresa;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar);

        iniciarFireBase();

        gas = findViewById(R.id.medida1);
        sulf = findViewById(R.id.medida2);
        azufre = findViewById(R.id.medida3);
        ubicacion = findViewById(R.id.medida4);

        Intent intent = getIntent();
        idEmpresa = intent.getIntExtra("id", 0);

        getDispositivo();


    }

    private void iniciarFireBase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    private void calc(Double gasNum, Double sulfNum, Double azNum) {
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

        if (sulfNum > 80){
            sulfMedida = sulfNum.toString() + " (Alta)";
            sulf.setBackgroundColor(Color.RED);
        } else if (sulfNum > 40) {
            sulfMedida = sulfNum.toString() + " (Media)";
            sulf.setBackgroundColor(Color.YELLOW);
        }
        else {
            sulfMedida = sulfNum.toString() + " (Baja)";
            sulf.setBackgroundColor(Color.GREEN);
        }

        if (azNum > 80){
            azMedida = azNum.toString() + " (Alta)";
            azufre.setBackgroundColor(Color.RED);
        } else if (azNum > 40) {
            azMedida = azNum.toString() + " (Media)";
            azufre.setBackgroundColor(Color.YELLOW);
        }
        else {
            azMedida = azNum.toString() + " (Baja)";
            azufre.setBackgroundColor(Color.GREEN);
        }
    }

    private void getDispositivo() {
        databaseReference.child("Dispositivo").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for (DataSnapshot item : snapshot.getChildren()){
                    Dispositivo d = item.getValue(Dispositivo.class);
                    dispositivo = d;

                }

                Double gasNum = Double.parseDouble(dispositivo.getGas());
                Double sulfNum = Double.parseDouble(dispositivo.getAcidoSulf());
                Double azNum = Double.parseDouble(dispositivo.getAzufre());

                calc(gasNum, sulfNum, azNum);

                gas.setText("Gas: " + gasMedida );
                sulf.setText("Acido Sulfhídrico: " + sulfMedida);
                azufre.setText("Dióxido de Azufre: " + azMedida);

                ubicacionMed = dispositivo.getLatitud().toString() + "º "+ dispositivo.getLongitud().toString()+"º";
                ubicacion.setText("Ubicación: "+ubicacionMed);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void agregar(View view) {
        Medicion m = MedicionController.addDispositivoMed(gasMedida, sulfMedida, azMedida, ubicacionMed, idEmpresa);
        if (m != null){
            databaseReference.child("Medicion").child(String.valueOf(m.getIdMed())).setValue(m);
        }
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