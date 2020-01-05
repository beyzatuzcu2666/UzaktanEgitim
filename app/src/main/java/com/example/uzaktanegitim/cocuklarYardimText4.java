package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class cocuklarYardimText4 extends AppCompatActivity {

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocuklar_yardim_text4);


        t1=findViewById(R.id.textView73);
        t2=findViewById(R.id.textView74);
        t3=findViewById(R.id.textView75);
        t4=findViewById(R.id.textView76);
        t5=findViewById(R.id.textView77);


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
                t5.setText("YANLIŞ!");


            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t5.setText("DOĞRU!");


            }
        });
    }

    public void button902(View view){
        Intent intent=new Intent(cocuklarYardimText4.this,cocuklarYardimText5.class);
        startActivity(intent);
    }


}
