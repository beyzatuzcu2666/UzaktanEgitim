package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class yaralanmalar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yaralanmalar);
    }

    public void devam(View view){
        Intent intent=new Intent(yaralanmalar.this,devam51.class);
        startActivity(intent);
    }
}
