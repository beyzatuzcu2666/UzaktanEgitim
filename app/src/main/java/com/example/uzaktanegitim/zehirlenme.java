package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class zehirlenme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zehirlenme);
    }
    public void button11(View view){
        Intent intent=new Intent(zehirlenme.this,bebeklerYardimButton.class);
        startActivity(intent);
    }
}
