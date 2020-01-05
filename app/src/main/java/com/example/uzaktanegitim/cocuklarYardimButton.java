package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class cocuklarYardimButton extends AppCompatActivity {
    private CheckBox cb1;
    private CheckBox cb2;
    private CheckBox cb3;
    private CheckBox cb4;
    private CheckBox cb5;
    private CheckBox cb6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocuklar_yardim_button);
        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb2 = (CheckBox) findViewById(R.id.checkBox5);
        cb3 = (CheckBox) findViewById(R.id.checkBox6);
        cb4 = (CheckBox) findViewById(R.id.checkBox7);
        cb5 = (CheckBox) findViewById(R.id.checkBox8);
        cb6 = (CheckBox) findViewById(R.id.checkBox9);


        //CheckBox'ların Listener'larını tanımlıyoruz.


        Button show = (Button) findViewById(R.id.button27);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dogrucevaplar = 0;
                int yanlıscevaplar = 0;

                if (cb1.isChecked())
                    yanlıscevaplar++;
                if (cb2.isChecked())
                    dogrucevaplar++;
                if (cb3.isChecked())
                    yanlıscevaplar++;
                if (cb4.isChecked())
                    yanlıscevaplar++;
                if (cb5.isChecked())
                    dogrucevaplar++;
                if (cb6.isChecked())
                    dogrucevaplar++;


                Toast.makeText(getApplicationContext(), "Dogru Cevaplar: " + dogrucevaplar, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Yanlış Cevaplar " + yanlıscevaplar, Toast.LENGTH_LONG).show();
            }
        });

    }
        public void button990(View view){
        Intent intent=new Intent(cocuklarYardimButton.this,cocuklarYardimTest2.class);
        startActivity(intent);



        }


    }




