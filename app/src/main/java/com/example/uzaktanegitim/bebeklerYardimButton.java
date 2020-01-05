package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class bebeklerYardimButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebekler_yardim_button);

        ListView listView = findViewById(R.id.bebeklerListView);

        final ArrayList<String> cesitler = new ArrayList<>();
        cesitler.add("Solunum Yolu Tıkanıklarında İlk Yardım");
        cesitler.add("Yanıklar için İlk Yardım");
        cesitler.add("Bilinç Bozukluğunda İlk Yardım");
        cesitler.add("Göze Kulağa Buruna Yabancı Cisim Kaçmasında İlk Yardım");
        cesitler.add("Zehirlenmelerde İlk Yardım");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.mytextview, cesitler);
        //simple list ben sadece metin göstereceğim demek


        //listView

        listView.setAdapter((arrayAdapter));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(bebeklerYardimButton.this, bebeklerBir.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(bebeklerYardimButton.this, bebekİki.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(bebeklerYardimButton.this, bilincBozuklugu.class);
                    startActivity(intent);

                }


                if (position == 3) {
                    Intent intent = new Intent(bebeklerYardimButton.this, cisimKacmasi.class);
                    startActivity(intent);

                }
                if (position == 4) {
                    Intent intent = new Intent(bebeklerYardimButton.this, zehirlenme.class);
                    startActivity(intent);

                }
            }

        });
    }
        public void devam2(View view){
            Intent intent=new Intent(bebeklerYardimButton.this,Main3Activity.class);
            startActivity(intent);

        }
    }










