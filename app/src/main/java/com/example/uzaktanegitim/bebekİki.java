package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;



public class bebekİki extends AppCompatActivity {
    private CheckBox c2;
    private CheckBox c3;
    private CheckBox c4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebek_iki);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        c4 = (CheckBox) findViewById(R.id.checkBox4);

        Button show = (Button) findViewById(R.id.button22);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int dogrucevaplar = 0;
                int yanlıscevaplar =0;

                if (c2.isChecked())
                    dogrucevaplar ++;
                if (c3.isChecked())
                    yanlıscevaplar ++;
                if (c4.isChecked())
                    dogrucevaplar ++;

                Toast.makeText(getApplicationContext(), "Dogru Cevaplar:  " + dogrucevaplar, Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Yanlış Cevaplar " + yanlıscevaplar , Toast.LENGTH_LONG).show();

            }
        });



    }



}
