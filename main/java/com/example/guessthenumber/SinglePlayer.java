package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SinglePlayer extends AppCompatActivity {

    private Button easy;
    private Button hard;
    private Button medium;
    TextView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);
        easy = findViewById(R.id.easy);
        hard = findViewById(R.id.hard);
        medium = findViewById(R.id.medium);
        backBtn = findViewById(R.id.textView9);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openback();
            }
        });

        easy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensgameeasy();
            }
        });
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengamemed();
            }
        });
        hard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengamehard();
            }
        });



    }
    public void opensgameeasy(){
        Intent intent = new Intent(this,sgameBoard.class);
        startActivity(intent);
    }

    public void opengamemed(){
        Intent intent = new Intent(this,sgameboardm.class);
        startActivity(intent);
    }
    public void opengamehard(){
        Intent intent = new Intent(this,sgameboardh.class);
        startActivity(intent);
    }
    public void openback(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }









}