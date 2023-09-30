package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.img);
        logo.setImageResource(R.mipmap.logo);


    }

    public void pag2(View v){
        Intent i = new Intent(this, ActivitySecond.class);

        startActivity(i);

    }
}