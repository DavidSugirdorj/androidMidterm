package edu.nwmissouri.midtermproject;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SudokuGame extends AppCompatActivity implements sudoku_fragments.OnFragmentInteractionListener {
    private SudokuBoard gameBoard;
    @Override
    public void onFragmentInteraction(int groupId, int cellId, View view) {

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sudoku_fragments);
        gameBoard = new SudokuBoard();


    }

}
