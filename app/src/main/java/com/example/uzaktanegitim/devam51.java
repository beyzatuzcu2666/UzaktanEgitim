package com.example.uzaktanegitim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class devam51 extends AppCompatActivity {
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devam51);
        textView=findViewById(R.id.textView40);
        textView2=findViewById(R.id.textView41);

    }
    public void button1(View view){
        textView.setText("DOĞRU !");
        textView2.setText("");


    }
    public void button2(View view){
        textView2.setText("YANLIŞ !");
        textView.setText("");

    }
}
