package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class devam2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devam2);
    }

    public void devam3(View view){
        Intent intent=new Intent(devam2.this,yetiskinlerYardimButton.class);
        startActivity(intent);
    }


}
