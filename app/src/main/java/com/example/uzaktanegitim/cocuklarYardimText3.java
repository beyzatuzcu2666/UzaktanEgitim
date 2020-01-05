package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cocuklarYardimText3 extends AppCompatActivity {

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocuklar_yardim_text3);

        t1=findViewById(R.id.textView67);
        t2=findViewById(R.id.textView68);
        t3=findViewById(R.id.textView69);
        t4=findViewById(R.id.textView70);
        t5=findViewById(R.id.textView71);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t5.setText("YANLIŞ!");


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
                t5.setText("DOĞRU!");


            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t5.setText("YANLIŞ!");


            }
        });
    }

    public void button991(View view){
        Intent intent=new Intent(cocuklarYardimText3.this,cocuklarYardimText4.class);
        startActivity(intent);
    }
}
