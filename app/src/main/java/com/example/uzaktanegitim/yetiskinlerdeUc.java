package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class yetiskinlerdeUc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yetiskinlerde_uc);
    }

    public void devam31(View view){

        Intent intent=new Intent(yetiskinlerdeUc.this,devam32.class);
        startActivity(intent);

    }
}
