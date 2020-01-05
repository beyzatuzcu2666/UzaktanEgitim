package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cisimKacmasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cisim_kacmasi);
    }

    public void cisimKacmasi(View view) {

        Intent intent = new Intent(cisimKacmasi.this, cisimkacmasiİki.class);
        startActivity(intent);
    }
}
