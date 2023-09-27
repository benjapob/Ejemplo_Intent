package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgPersona = findViewById(R.id.imgUsuario);
        imgPersona.setImageResource(R.mipmap.iot);
    }

    public void back(View view) {
        finish();
    }
    public void del(View view) {
        finish();
    }
}