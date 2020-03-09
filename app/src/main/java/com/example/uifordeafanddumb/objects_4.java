package com.example.uifordeafanddumb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class objects_4 extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageView img1,img2,img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obj_4);

        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);

        Button button;
        button= findViewById(R.id.button9);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(objects_4.this, learn_1.class);
                objects_4.this.startActivity(myIntent);
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(objects_4.this, R.raw.policeman);
                mediaPlayer.start();
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(objects_4.this, R.raw.road);
                mediaPlayer.start();
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(objects_4.this, R.raw.lion);
                mediaPlayer.start();
            }
        });


    }
}
