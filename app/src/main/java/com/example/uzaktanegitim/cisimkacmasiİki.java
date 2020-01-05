package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cisimkacmasiİki extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cisimkacmasi_iki);
    }
    public void devam2(View view){

        Intent intent=new Intent(cisimkacmasiİki.this,bebeklerYardimButton.class);
        startActivity(intent);

    }
}
