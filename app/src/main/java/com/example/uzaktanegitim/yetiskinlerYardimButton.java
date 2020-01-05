package com.example.uzaktanegitim;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class yetiskinlerYardimButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yetiskinler_yardim_button);

        ListView listView=findViewById(R.id.yetiskinlerListView);
        final ArrayList<String> türler1  = new ArrayList<>();
        türler1.add("Temel Yaşam Desteği Durmasında İlk Yardım");
        türler1.add("Kırık Çıkık ve Burkulmalarda İlk Yardım");
        türler1.add("Kanamalarda İlk Yardım");
        türler1.add("Hayvan Isırıkları ve Böcek Sokmalarında İlk Yardım");
        türler1.add("Yaralanmalarda İlk Yardım");


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.mytextview,türler1);
        listView.setAdapter((arrayAdapter));


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                    Intent intent = new Intent(yetiskinlerYardimButton.this,yetiskinlerBir.class);
                    startActivity(intent);

                }

                if(position == 1){
                    Intent intent = new Intent(yetiskinlerYardimButton.this,yetiskinlerİki.class);
                    startActivity(intent);

                }
                if(position == 2) {
                    Intent intent = new Intent(yetiskinlerYardimButton.this, yetiskinlerdeUc.class);
                    startActivity(intent);
                }

                if(position == 3) {
                    Intent intent = new Intent(yetiskinlerYardimButton.this, hayvanisiriklariİlkYardim.class);
                    startActivity(intent);
                }
                if(position == 4) {
                    Intent intent = new Intent(yetiskinlerYardimButton.this, zehirlenme.class);
                    startActivity(intent);
                }






            }
        });




    }
    public void anaSayfayaDön(View view){
        Intent intent=new Intent(yetiskinlerYardimButton.this,Main3Activity.class);
        startActivity(intent);

    }


}
