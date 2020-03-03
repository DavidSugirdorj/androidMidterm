package edu.nwmissouri.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //replace the class name with whatever you used!
    public void sudokuAction(View v){
        Intent goToSudoku = new Intent(this, Sudoku.class);
        startActivity(goToSudoku);
    }

    public void matchMakerAction(View v){
        Intent goToMatchMaker = new Intent(this, MatchMaker.class);
        startActivity(goToMatchMaker);
    }

    public void twentyFortyEightAction(View v){
        Intent goToTwentyFourtyEight = new Intent(this, TwentyFortyEight.class);
        startActivity(goToTwentyFourtyEight);
    }

    public void mineSweeperAction(View v){
        Intent goToMineSweeper = new Intent(this, MineSweeper.class);
        startActivity(goToMineSweeper);
    }
}
