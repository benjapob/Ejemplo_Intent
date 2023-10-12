package com.example.ejemplo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {
    ImageView imgList;
    ImageView imgAdd;
    ImageView imgSettings;
    ImageView imgInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        imgList = findViewById(R.id.imgList);
        imgList.setImageResource(R.mipmap.list);

        imgAdd = findViewById(R.id.imgAdd);
        imgAdd.setImageResource(R.mipmap.arrows);

        imgSettings = findViewById(R.id.imgSettings);
        imgSettings.setImageResource(R.mipmap.settings);

        imgInfo = findViewById(R.id.imgInfo);
        imgInfo.setImageResource(R.mipmap.info);
    }

    public void add(View view){
        Intent i = new Intent(this, Robot.class);

        startActivity(i);
    }

    public void list(View view){
        Intent i = new Intent(this, ActivitySecond.class);

        startActivity(i);
    }

    public void settings(View view){
        /*Intent i = new Intent(this, ActivitySecond.class);

        startActivity(i);*/
    }

    public void info(View view){
        /*Intent i = new Intent(this, ActivitySecond.class);

        startActivity(i);*/
    }

    public void back(View view) {
        finish();
    }
}