package com.example.ejemplo_intent;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Menu extends AppCompatActivity {
    ImageView imgList;
    ImageView imgAdd;
    ImageView imgSettings;
    ImageView imgInfo;
    Integer idEmpresa;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    Medicion medicion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        iniciarFireBase();

        imgList = findViewById(R.id.imgList);
        imgList.setImageResource(R.mipmap.list);

        imgAdd = findViewById(R.id.imgAdd);
        imgAdd.setImageResource(R.mipmap.arrows);

        imgSettings = findViewById(R.id.imgSettings);
        imgSettings.setImageResource(R.mipmap.settings);

        imgInfo = findViewById(R.id.imgInfo);
        imgInfo.setImageResource(R.mipmap.info);

        Intent intent = getIntent();
        idEmpresa = intent.getIntExtra("id", 0);

        getMediciones();

        Dispositivo d = new Dispositivo(0, "","0.0","0.0","0.0","0.0","0.0", idEmpresa);

        if (d != null){
            databaseReference.child("Dispositivo").child(String.valueOf(d.getIdDispositivo())).setValue(d);
        }
        /*Intent intent = getIntent();
        controllerMed = (MedicionController)intent.getSerializableExtra("controllerMed");*/
    }

    private void iniciarFireBase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    private void getMediciones() {
        databaseReference.child("Medicion").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                MedicionController.listaDispositivoMed.clear();
                for (DataSnapshot item : snapshot.getChildren()){
                    Medicion m = item.getValue(Medicion.class);
                    if (MedicionController.findDispositivoMed(m.getIdMed()) == null && idEmpresa == m.getIdEmpresa()){
                        MedicionController.listaDispositivoMed.add(m);
                    }

                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void add(View view){
        Intent i = new Intent(this, Agregar.class);
        i.putExtra("id", idEmpresa);
        /*Bundle bundle = new Bundle();
        bundle.putSerializable("controllerMed", controllerMed);
        i.putExtras(bundle);*/

        startActivity(i);
    }

    public void list(View view){
        Intent i = new Intent(this, Listado.class);
        i.putExtra("id", idEmpresa);
        /*Bundle bundle = new Bundle();
        bundle.putSerializable("controllerMed", controllerMed);
        i.putExtras(bundle);*/

        startActivity(i);
    }

    public void settings(View view){
        /*Intent i = new Intent(this, Listado.class);

        startActivity(i);*/
    }

    public void info(View view){
        /*Intent i = new Intent(this, Listado.class);

        startActivity(i);*/
    }

    public void back(View view) {
        finish();
    }
}