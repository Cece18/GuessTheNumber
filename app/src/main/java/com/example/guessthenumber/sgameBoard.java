package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sgameBoard extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgame_board);

    }
    int randomNum = (int) Math.floor(Math.random()*(10)+1);

    public void buttonClicked(View v) {
        EditText inputBox = (EditText) findViewById(R.id.input);
        String str = inputBox.getText().toString();

        int guess = Integer.parseInt(str);;

        
        String isSame = guess+" "+randomNum+" "+"wrong";
        if (guess == randomNum)
            isSame = guess+" "+randomNum+" "+"right";;
        ((TextView) findViewById(R.id.output)).setText(isSame);
    }
}