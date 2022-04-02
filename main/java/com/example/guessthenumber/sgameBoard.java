package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    int lives = 3;

    public void submitGuess(View v) {
        //getting guess from input
        EditText inputBox = (EditText) findViewById(R.id.input);
        String str = inputBox.getText().toString();
        int guess = Integer.parseInt(str);
        //determines if right or wrong
        String isSame = null;
        if (guess == randomNum){
            startActivity(new Intent(sgameBoard.this, WinnerScreen.class));
        }else if(guess < randomNum) {
            isSame = "Try again! (Hint: Try Guessing Higher)" + randomNum;
            lives--;
        } else if (guess > randomNum){
            isSame = "Try again! (Hint: Try Guessing Lower)" + randomNum;
            lives--;
        }
        //if out of lives then change page
        if (lives == 0){
            startActivity(new Intent(sgameBoard.this, LoserScreen.class));
        }
        //update output and lives display
        ((TextView) findViewById(R.id.output)).setText(isSame);
        ((TextView) findViewById(R.id.lives)).setText("Lives: "+lives);
        ((TextView) findViewById(R.id.howcloseisguess)).setText(Game.howCloseEasy(randomNum,guess));
    }
    public  void returnBack(View v){
        startActivity(new Intent(sgameBoard.this, MainActivity.class));
    }
}