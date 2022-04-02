package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class sgameboardh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgameboardh);
    }
    int randomNum = (int) Math.floor(Math.random()*(100)+1);
    int lives = 7;

    public void buttonClicked(View v) {
        EditText inputBox = (EditText) findViewById(R.id.input);
        String str = inputBox.getText().toString();
        int guess = Integer.parseInt(str);

        String isSame = null;
        if (guess == randomNum){
            startActivity(new Intent(sgameboardh.this, WinnerScreen.class));
        }else if (guess < randomNum){
            isSame = "Try again! (Hint: Guess higher)";
            lives--;
        } else if (guess > randomNum){
            isSame = "Try again! (Hint: Guess Lower)";
            lives --;
        }

        //if out of lives then change page
        if (lives == 0){
            startActivity(new Intent(sgameboardh.this, LoserScreen.class));
        }
        //update output and lives display
        ((TextView) findViewById(R.id.output)).setText(isSame);
        ((TextView) findViewById(R.id.lives)).setText("Lives: "+lives);
        ((TextView) findViewById(R.id.howcloseisguess)).setText(Game.howCloseHard(randomNum,guess));
    }
    public  void returnBack(View v){
        startActivity(new Intent(sgameboardh.this, MainActivity.class));
    }
}