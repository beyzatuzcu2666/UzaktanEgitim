package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public void bebeklerButton(View view){
        Intent intent=new Intent(Main3Activity.this,bebeklerYardimButton.class);
        startActivity(intent);

    }

    public void testlerButton(View view){
        Intent intent= new Intent(Main3Activity.this,cocuklarYardimButton.class);
        startActivity(intent);
    }
    public void yetiskinlerButton(View view) {
        Intent intent = new Intent(Main3Activity.this, yetiskinlerYardimButton.class);
        startActivity(intent);

    }
}
