package com.slier.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btn1 = findViewById(R.id.btn1);
        this.btn2 = findViewById(R.id.btn2);
        this.btn3 = findViewById(R.id.btn3);
        this.btn4 = findViewById(R.id.btn4);
        this.btn5 = findViewById(R.id.btn5);
        this.btn6 = findViewById(R.id.btn6);
        this.btn7 = findViewById(R.id.btn7);
        this.btn8 = findViewById(R.id.btn8);

        this.setupEvents();
    }

    private void setupEvents() {

        View.OnClickListener func = v -> {
            String phrase = v.getTag().toString();

            int soundID = this.getResources().getIdentifier(phrase, "raw", this.getPackageName());
            MediaPlayer mp = MediaPlayer.create(MainActivity.this, soundID);
            mp.start();
        };

        this.btn1.setOnClickListener(func);
        this.btn2.setOnClickListener(func);
        this.btn3.setOnClickListener(func);
        this.btn4.setOnClickListener(func);
        this.btn5.setOnClickListener(func);
        this.btn6.setOnClickListener(func);
        this.btn7.setOnClickListener(func);
        this.btn8.setOnClickListener(func);
    }
}
