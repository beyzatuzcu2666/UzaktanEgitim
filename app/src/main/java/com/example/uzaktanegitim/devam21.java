package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class devam21 extends AppCompatActivity {

    TextView cikikText;
    TextView nedirText;
    TextView text1;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devam21);
        cikikText=findViewById(R.id.textView21);
        nedirText=findViewById(R.id.textView22);
        text1=findViewById(R.id.textView24);
        text2=findViewById(R.id.textView25);

    }
    public void cikiknedir(View view){
        cikikText.setText("Eklem yüzeylerinin kalıcı olarak ayrılmasıdır");

    }

    public void nedir(View view){
        nedirText.setText("Eklem yüzeylerinin anlık olarak ayrılmasıdır");

    }

    public void button7(View view){
        text2.setText(" ");
        text1.setText("Tebrikler, DOĞRU!");


    }

    public void button8(View view){
        text1.setText(" ");
        text2.setText("Üzgünüm, YANLIŞ!");
    }
    public void button9(View view){
        Intent intent=new Intent(devam21.this,yetiskinlerYardimButton.class);
        startActivity(intent);
    }
}
