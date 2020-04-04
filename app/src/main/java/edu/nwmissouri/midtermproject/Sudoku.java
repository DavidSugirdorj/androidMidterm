package edu.nwmissouri.midtermproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Sudoku extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sudoku_start);
    }

    public void toMainActivity(View v){
        Intent toMain = new Intent(this,MainActivity.class);
        startActivity(toMain);
    }
    public void startSudoku(View v){

        setContentView(R.layout.sudoku_fragments);
    }
    public void goMain(View v){

        setContentView((R.layout.activity_main));
    }
}
