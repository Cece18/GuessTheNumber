package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class sgameboardm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgameboardm);
    }
    int randomNum = (int) Math.floor(Math.random()*(50)+1);
    int lives = 5;

    public void buttonClicked(View v) {
        EditText inputBox = (EditText) findViewById(R.id.input);
        String str = inputBox.getText().toString();
        int guess = Integer.parseInt(str);

        String isSame = null;
        if (guess == randomNum){
            startActivity(new Intent(sgameboardm.this, WinnerScreen.class));
        }else if (guess < randomNum){
            isSame = "Try again! (Hint: Try Guessing Higher)";
            lives--;
        } else if (guess > randomNum){
            isSame = "Try again! (Hint: Try Guessing Lower)";
            lives--;
        }
        //if out of lives then change page
        if (lives == 0){
            startActivity(new Intent(sgameboardm.this, LoserScreen.class));
        }
        //update output and lives display
        ((TextView) findViewById(R.id.output)).setText(isSame);
        ((TextView) findViewById(R.id.lives)).setText("Lives: "+lives);
        ((TextView) findViewById(R.id.howcloseisguess)).setText(Game.howCloseNormal(randomNum,guess));
    }
    public  void returnBack(View v){
        startActivity(new Intent(sgameboardm.this, MainActivity.class));
    }
}