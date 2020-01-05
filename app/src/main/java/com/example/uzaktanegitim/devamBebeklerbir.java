package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class devamBebeklerbir extends AppCompatActivity {
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devam_bebeklerbir);
        textView=findViewById(R.id.textView44);
    }

    public void devam(View view){
        textView.setText("1- Hasta ayakta ya da oturur pozisyonda olabilir.\n 2- Bilinci kontrol edilir. \n 3- Sırtına iki kürek kemiği arasına 5 - 7 kez vurulur.");
    }

    public void devam2(View view){
        Intent intent=new Intent(devamBebeklerbir.this,bebeklerYardimButton.class);
        startActivity(intent);
    }
}
