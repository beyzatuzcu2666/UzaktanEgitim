package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class yetiskinlerİki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yetiskinler_iki);

    }
    public void devam4(View view){
        Intent intent=new Intent(yetiskinlerİki.this,devam21.class);
        startActivity(intent);

    }
}
