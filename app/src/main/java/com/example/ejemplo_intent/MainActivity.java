package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText etMsj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMsj = findViewById(R.id.etCorreo);

    }

    public void pag2(View v){
        Intent i = new Intent(this, ActivitySecond.class);

        i.putExtra("msj", etMsj.getText().toString());
        i.putExtra("msj2", "Patatas");
        i.putExtra("msj3", "Status OK");

        startActivity(i);

    }
}