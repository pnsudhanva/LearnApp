package com.example.uifordeafanddumb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class alphabets_numbers_2 extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets_numbers_2);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv10 = findViewById(R.id.tv10);

        Button button;
        button= findViewById(R.id.button13);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(alphabets_numbers_2.this, learn_1.class);
                alphabets_numbers_2.this.startActivity(myIntent);
            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_2.this, R.raw.zero);
                mediaPlayer.start();
            }
        });


        tv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_2.this, R.raw.one);
                mediaPlayer.start();
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_2.this, R.raw.two);
                mediaPlayer.start();
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_2.this, R.raw.three);
                mediaPlayer.start();
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_2.this, R.raw.four);
                mediaPlayer.start();
            }
        });

        tv6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_2.this, R.raw.five);
                mediaPlayer.start();
            }
        });

        tv7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_2.this, R.raw.six);
                mediaPlayer.start();
            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_2.this, R.raw.seven);
                mediaPlayer.start();
            }
        });

        tv9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_2.this, R.raw.eight);
                mediaPlayer.start();
            }
        });

        tv10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_2.this, R.raw.nine);
                mediaPlayer.start();
            }
        });
    }
}
