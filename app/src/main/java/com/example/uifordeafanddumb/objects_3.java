package com.example.uifordeafanddumb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class objects_3 extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    ImageView img1,img2,img3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obj_3);

        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);

        Button button;
        button= findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(objects_3.this, objects_4.class);
                objects_3.this.startActivity(myIntent);
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(objects_3.this, R.raw.elephant);
                mediaPlayer.start();
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(objects_3.this, R.raw.giraffe);
                mediaPlayer.start();
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                mediaPlayer = MediaPlayer.create(objects_3.this, R.raw.forest);
                mediaPlayer.start();
            }
        });


    }
}
