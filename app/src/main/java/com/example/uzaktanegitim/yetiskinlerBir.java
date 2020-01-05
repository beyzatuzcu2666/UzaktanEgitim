package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class yetiskinlerBir extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yetiskinler_bir);
    }
    public void buton1(View view){
        Intent intent= new Intent(yetiskinlerBir.this,devam1.class);
        startActivity(intent);


    }
}
