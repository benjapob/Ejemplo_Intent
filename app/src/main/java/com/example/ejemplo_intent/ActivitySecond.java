package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivitySecond extends AppCompatActivity {

    TextView tvMsj2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvMsj2 = findViewById(R.id.tvMsj2);

        Bundle bundle = getIntent().getExtras();
        String m = bundle.getString("msj");
        tvMsj2.setText("Mensaje: "+m);
    }

    public void add(View view) {
        Intent i = new Intent(this, Agregar.class);
        startActivity(i);
    }
}