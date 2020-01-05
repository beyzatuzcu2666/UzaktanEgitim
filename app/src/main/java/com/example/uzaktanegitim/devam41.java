package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class devam41 extends AppCompatActivity {
    TextView köpekİsirmasi;
    TextView yilansokmasi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devam41);

        köpekİsirmasi = findViewById(R.id.kopekİsirmasi);
        yilansokmasi = findViewById(R.id.yilansokmasi);


    }

    public void kopekİsirmasi(View view) {

        köpekİsirmasi.setText("HAFİF YARALANMALARDA; yara 5 dakika süreyle sabun ve soğuk suyla yıkanmalıdır.\n" +
                "Yaranın üzeri temiz bir bezle kapatılmalıdır. \n CİDDİ YARALANMA VE KANAMA VARSA; yaraya temiz bir bezle basınç uygulanarak kanama durdurulmalıdır. ");


    }

    public void yilansokmasi(View view) {
        yilansokmasi.setText("Hasta sakinleştirilip, dinlenmesi sağlanır." +
                "Yara su ile yıkanır." +
                "Yaraya yakın bölgedeki baskı yapabilecek eşyalar çıkarılır. Yaraya soğuk uygulama yapılır.\n" +
                "Yaralanan bölgeye dolaşımı engellemeyecek şekilde bandaj yapılır.");


    }
    public void button9(View view){
        Intent intent=new Intent(devam41.this,yetiskinlerYardimButton.class);
        startActivity(intent);
    }


}
