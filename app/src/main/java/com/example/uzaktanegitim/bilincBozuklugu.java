package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bilincBozuklugu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bilinc_bozuklugu);
    }
    public void Button123(View view){
        Intent intent=new Intent(bilincBozuklugu.this,bebeklerYardimButton.class);
        startActivity(intent);

    }
}
