package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivitySecond extends AppCompatActivity {

    TextView tvMsj2;
    public ListView listView;
    DispositivoControllerMed controllerMed;
    DispositivoMed medicion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    @Override
    public void onResume(){
        super.onResume();
        // al resumir la ventana
        DispositivoControllerMed.cargarLista();
        AdaptadorDispositivo adapter = new AdaptadorDispositivo(this);
        listView = findViewById(R.id.listaDispositivos);
        listView.setAdapter(adapter);

        /*Intent intent = getIntent();
        controllerMed = (DispositivoControllerMed)intent.getSerializableExtra("controllerMed");*/


        //Generar función click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent detail = new Intent(ActivitySecond.this, Detail.class);
                medicion = DispositivoControllerMed.getListaDispositivoMed().get(i);
                Bundle bundleDetail = new Bundle();
                bundleDetail.putSerializable("medicion", medicion);
                detail.putExtras(bundleDetail);

                startActivity(detail);
            /*Toast.makeText(ActivitySecond.this, "Rut:"+
                    DispositivoControllerMed.getListaDispositivo().get(i).getIdDisp(), Toast.LENGTH_SHORT).show();
                    detail.putExtra("fecha", DispositivoControllerMed.getListaDispositivoMed().get(i).getFechaMedicion().toString());
                    detail.putExtra("o2", DispositivoControllerMed.getListaDispositivoMed().get(i).getO2Conc());
                    detail.putExtra("gas", DispositivoControllerMed.getListaDispositivoMed().get(i).getGasConc());*/
            }
        });

        /*tvMsj2 = findViewById(R.id.tvMsj2);

        Bundle bundle = getIntent().getExtras();
        String m = bundle.getString("msj");
        tvMsj2.setText("Mensaje: "+m);*/
    }

    public void add(View view) {
        Intent i = new Intent(this, Robot.class);
        /*Bundle bundle = new Bundle();
        bundle.putSerializable("controllerMed", controllerMed);
        i.putExtras(bundle);*/
        startActivity(i);
    }
    public void back(View view) {
        finish();
    }

    class AdaptadorDispositivo extends ArrayAdapter<DispositivoMed> {
        AppCompatActivity appCompatActivity;
        public AdaptadorDispositivo(AppCompatActivity context) {
            super(context, R.layout.activity_dispositivo, DispositivoControllerMed.getListaDispositivoMed());
            appCompatActivity = context;
        }


        public View getView(int i, View convertView, ViewGroup parent) {

            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.activity_dispositivo, null);

            TextView txtNombre = item.findViewById(R.id.fechaMed);
            txtNombre.setText(DispositivoControllerMed.getListaDispositivoMed().get(i).getFechaMedicion().toString());

            /*TextView txtUbicacion = item.findViewById(R.id.tvUbi);
            txtUbicacion.setText(DispositivoControllerMed.getListaDispositivo().get(i).getUbiDisp());*/

            ImageView imgPersona = item.findViewById(R.id.imgDisp);
            imgPersona.setImageResource(R.mipmap.iot);
            return (item);

        }
    }
}