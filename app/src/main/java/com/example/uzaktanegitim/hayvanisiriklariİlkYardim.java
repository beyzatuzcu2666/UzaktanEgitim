package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class hayvanisiriklariİlkYardim extends AppCompatActivity {
    TextView textViewBir;
    TextView textViewİki;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hayvanisiriklari_ilk_yardim);
        textViewBir=findViewById(R.id.ariS);
        textViewİki=findViewById(R.id.akrepText);


    }
    public void ariTikla(View view){
     textViewBir.setText("Yaralı bölge yıkanır.\n" +
             "Derinin üzerinden arının iğnesi görünüyorsa çıkarılır.\n" +
             "Soğuk uygulama yapılır ( soğuk su ). Amonyak vb. kullanılmamalıdır.\n" +
             "Eğer ağızdan sokmuşsa, solunumu güçleştiriyorsa buz emmesi sağlanır.\n" +
             "Ağız içi sokmalarında ve alerji hikayesi olanlar için tıbbi yardım istenir.");
    }

    public void akrepTikla(View view){
        textViewİki.setText(" Sokmanın olduğu bölge hareket ettirilmez!\n" +
                "Yatar pozisyonda tutulur,\n" +
                "Yaraya soğuk uygulama yapılır,\n" +
                "Kan dolaşımını engellemeyecek şekilde bandaj uygulanır,\n" +
                "Turnike uygulanmaz\n" +
                "Yara üzerine hiçbir girişim yapılmaz ( kesilmez, emilmez vb.).");
    }

    public void devamButonu(View view){
        Intent intent=new Intent(hayvanisiriklariİlkYardim.this,devam41.class);
        startActivity(intent);
    }
}
