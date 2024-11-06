package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.view.View;

import android.content.Intent;

import android.os.Bundle;









import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView Tombol1 = findViewById(R.id.imageView1);
        Tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Tombol1.class);
                startActivity(intent);
            }
        });

        ImageView profile = findViewById(R.id.imageView8);
        profile.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, profile.class);
            startActivity(intent);
        });


    }
}