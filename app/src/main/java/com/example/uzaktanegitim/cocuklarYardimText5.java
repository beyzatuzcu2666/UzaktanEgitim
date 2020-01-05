package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cocuklarYardimText5 extends AppCompatActivity {

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocuklar_yardim_text5);


        t1 = findViewById(R.id.textView79);
        t2 = findViewById(R.id.textView80);
        t3 = findViewById(R.id.textView81);
        t4 = findViewById(R.id.textView82);
        t5 = findViewById(R.id.textView83);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t5.setText("DOĞRU!");


            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t5.setText("YANLIŞ!");


            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t5.setText("YANLIŞ!");


            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t5.setText("YANLIŞ!");


            }
        });



    }
    public void button43(View view){
        Intent intent=new Intent(cocuklarYardimText5.this,Main3Activity.class);
        startActivity(intent);
    }

}