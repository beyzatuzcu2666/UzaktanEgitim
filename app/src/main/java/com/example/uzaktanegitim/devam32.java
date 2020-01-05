package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class devam32 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devam32);
        textView=findViewById(R.id.kanamalarText);
    }

    public void button32(View view){
        textView.setText("Hasta/yaralının bilinci ve solunumu değerlendirilir. Üzeri örtülerek ayakları 30 cm. kaldırılır. Kapalı kırık varsa, kan damarlarının yaralanmasını önlemek ve bir iç kanamaya sebep olmamak için hasta ya da yaralının hareketsiz kalması sağlanır.");


    }
    public void button30(View view) {
        Intent intent=new Intent(devam32.this,yetiskinlerYardimButton.class);
        startActivity(intent);
    }
}
