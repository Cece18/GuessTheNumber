package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button sPlayer;
    private Button mPlayer;
    TextView popupBTN;
    Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sPlayer = findViewById(R.id.single);
        mPlayer = findViewById(R.id.multiplayer);
        sPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSinglePlayer();
            }
        });
        mPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMultiplayer();
            }
        });

        //popupBTN = findViewById(R.id.textView3);
        /*mDialog = new Dialog(this);

        popupBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.setContentView(R.layout.settings);

                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

            }
        });*/
    }

    public void openSinglePlayer(){
        Intent intent = new Intent(this,SinglePlayer.class);
        startActivity(intent);
    }
    public void openMultiplayer(){
        Intent intent = new Intent(this,Multiplayer.class);
        startActivity(intent);
    }
}
