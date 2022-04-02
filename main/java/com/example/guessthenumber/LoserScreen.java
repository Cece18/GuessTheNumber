package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoserScreen extends AppCompatActivity {
    private Button mainmenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loser_screen);
        mainmenu = findViewById(R.id.single2);
        mainmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain();
            }
        });

    }
    public void openMain(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


}