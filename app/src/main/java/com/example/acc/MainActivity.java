package com.example.acc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tvsoal;
    TextView tvhasil;
    Button btnganjil;
    Button btngenap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvsoal = findViewById(R.id.soal);
        tvhasil = findViewById(R.id.hasil);
        btnganjil = findViewById(R.id.button);
        btngenap = findViewById(R.id.button2);

        //Angka Random
        Random myRandom = new Random();
        int num = myRandom.nextInt(101);//0 - 100
        tvsoal.setText(""+num);

        //button ganjil
        btnganjil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (num % 2 == 0)
                    tvhasil.setText("-5");
                else
                    tvhasil.setText("+5");
            }
        });

        //button genap
        btngenap.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (num % 2 == 0)
                    tvhasil.setText("+5");
                else
                    tvhasil.setText("-5");
            }
        });
    }
}