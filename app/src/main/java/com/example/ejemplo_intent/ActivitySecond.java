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

public class ActivitySecond extends AppCompatActivity {

    TextView tvMsj2;
    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        DispositivoController.cargarLista();
        AdaptadorDispositivo adapter = new AdaptadorDispositivo(this);
        listView = findViewById(R.id.listaDispositivos);
        listView.setAdapter(adapter);

        //Generar función click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent detail = new Intent(ActivitySecond.this, Detail.class);
                detail.putExtra("nombre", DispositivoController.getListaDispositivo().get(i).getNombreDisp());
                detail.putExtra("ubi", DispositivoController.getListaDispositivo().get(i).getUbiDisp());
                detail.putExtra("gas", "3");
                detail.putExtra("dueño", "Papa Frita");
                startActivity(detail);
                /*Toast.makeText(ActivitySecond.this, "Rut:"+
                        DispositivoController.getListaDispositivo().get(i).getIdDisp(), Toast.LENGTH_SHORT).show();*/
            }
        });

        /*tvMsj2 = findViewById(R.id.tvMsj2);

        Bundle bundle = getIntent().getExtras();
        String m = bundle.getString("msj");
        tvMsj2.setText("Mensaje: "+m);*/
    }

    public void add(View view) {
        Intent i = new Intent(this, Agregar.class);
        startActivity(i);
    }

    class AdaptadorDispositivo extends ArrayAdapter<Dispositivo> {
        AppCompatActivity appCompatActivity;
        public AdaptadorDispositivo(AppCompatActivity context) {
            super(context, R.layout.activity_dispositivo, DispositivoController.getListaDispositivo());
            appCompatActivity = context;
        }


        public View getView(int i, View convertView, ViewGroup parent) {
            LayoutInflater inflater = appCompatActivity.getLayoutInflater();
            View item = inflater.inflate(R.layout.activity_dispositivo, null);

            TextView txtNombre = item.findViewById(R.id.tvNombre);
            txtNombre.setText(DispositivoController.getListaDispositivo().get(i).getNombreDisp());

            TextView txtUbicacion = item.findViewById(R.id.tvUbi);
            txtUbicacion.setText(DispositivoController.getListaDispositivo().get(i).getUbiDisp());

            ImageView imgPersona = item.findViewById(R.id.imgDisp);
            imgPersona.setImageResource(R.mipmap.iot);
            return (item);

        }
    }
}