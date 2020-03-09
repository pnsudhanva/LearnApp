package com.example.uifordeafanddumb;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class colours_1 extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10;

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours_1);

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


        tv1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                    mediaPlayer = MediaPlayer.create(colours_1.this, R.raw.orange);
                    mediaPlayer.start();
                }
            });


        tv2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(colours_1.this, R.raw.red);
                mediaPlayer.start();
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(colours_1.this, R.raw.purple);
                mediaPlayer.start();
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(colours_1.this, R.raw.yellow);
                mediaPlayer.start();
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(colours_1.this, R.raw.blue);
                mediaPlayer.start();
            }
        });

        tv6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(colours_1.this, R.raw.green);
                mediaPlayer.start();
            }
        });

        tv7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(colours_1.this, R.raw.black);
                mediaPlayer.start();
            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(colours_1.this, R.raw.white);
                mediaPlayer.start();
            }
        });

        tv9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(colours_1.this, R.raw.pink);
                mediaPlayer.start();
            }
        });

        tv10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(colours_1.this, R.raw.brown);
                mediaPlayer.start();
            }
        });


    }


}




