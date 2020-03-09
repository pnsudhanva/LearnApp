package com.example.uifordeafanddumb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class alphabets_numbers_1 extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16,tv17,tv18,tv19,tv20,tv21,tv22,tv23,tv24,tv25,tv26;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets_numbers_1);

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
        tv11 = findViewById(R.id.tv11);
        tv12 = findViewById(R.id.tv12);
        tv13 = findViewById(R.id.tv13);
        tv14 = findViewById(R.id.tv14);
        tv15 = findViewById(R.id.tv15);
        tv16 = findViewById(R.id.tv16);
        tv17 = findViewById(R.id.tv17);
        tv18 = findViewById(R.id.tv18);
        tv19 = findViewById(R.id.tv19);
        tv20 = findViewById(R.id.tv20);
        tv21 = findViewById(R.id.tv21);
        tv22 = findViewById(R.id.tv22);
        tv23 = findViewById(R.id.tv23);
        tv24 = findViewById(R.id.tv24);
        tv25 = findViewById(R.id.tv25);
        tv26 = findViewById(R.id.tv26);





        button1 = findViewById(R.id.button12);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(alphabets_numbers_1.this, alphabets_numbers_2.class);
                alphabets_numbers_1.this.startActivity(myIntent);
            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.a);
                mediaPlayer.start();
            }
        });


        tv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.b);
                mediaPlayer.start();
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.c);
                mediaPlayer.start();
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.d);
                mediaPlayer.start();
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.e);
                mediaPlayer.start();
            }
        });

        tv6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.f);
                mediaPlayer.start();
            }
        });

        tv7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.g);
                mediaPlayer.start();
            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.h);
                mediaPlayer.start();
            }
        });

        tv9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.i);
                mediaPlayer.start();
            }
        });

        tv10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.j);
                mediaPlayer.start();
            }
        });

        tv11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.k);
                mediaPlayer.start();
            }
        });


        tv12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.l);
                mediaPlayer.start();
            }
        });

        tv13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.m);
                mediaPlayer.start();
            }
        });

        tv14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.n);
                mediaPlayer.start();
            }
        });

        tv15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.o);
                mediaPlayer.start();
            }
        });

        tv16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.p);
                mediaPlayer.start();
            }
        });

        tv17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.q);
                mediaPlayer.start();
            }
        });

        tv18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.r);
                mediaPlayer.start();
            }
        });

        tv19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.s);
                mediaPlayer.start();
            }
        });

        tv20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.t);
                mediaPlayer.start();
            }
        });

        tv21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.u);
                mediaPlayer.start();
            }
        });


        tv22
                .setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.v);
                mediaPlayer.start();
            }
        });

        tv23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.w);
                mediaPlayer.start();
            }
        });

        tv24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.x);
                mediaPlayer.start();
            }
        });

        tv25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.y);
                mediaPlayer.start();
            }
        });

        tv26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(alphabets_numbers_1.this, R.raw.z);
                mediaPlayer.start();
            }
        });





    }

}
