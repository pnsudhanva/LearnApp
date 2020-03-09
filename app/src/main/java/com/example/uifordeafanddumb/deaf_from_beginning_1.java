package com.example.uifordeafanddumb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class deaf_from_beginning_1 extends AppCompatActivity {
     Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deaf_from_beginning_1);

        button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(deaf_from_beginning_1.this, learn_1.class);
                deaf_from_beginning_1.this.startActivity(myIntent);
            }
        });

    }
}
