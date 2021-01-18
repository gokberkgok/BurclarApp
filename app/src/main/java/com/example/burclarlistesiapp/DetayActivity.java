package com.example.burclarlistesiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textViewIsim,textView2,textViewOzellik;
        textViewIsim = findViewById(R.id.textViewIsim);
        textView2 = findViewById(R.id.textView2);
        textViewOzellik = findViewById(R.id.textViewOzellik);

        Intent intent = getIntent();
        String isimler = intent.getStringExtra("isim").toUpperCase();
        String ozellikler = intent.getStringExtra("ozellik");
        textViewOzellik.setText(ozellikler);
        textViewIsim.setText(isimler);

        Singleton singleton = Singleton.getInstance();
        imageView.setImageBitmap(singleton.getChosenImage());

    }
}