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

        int groupFragments[] = new int[]{R.id.cellGroupFragment, R.id.cellGroupFragment2, R.id.cellGroupFragment3, R.id.cellGroupFragment4,
                R.id.cellGroupFragment5, R.id.cellGroupFragment6, R.id.cellGroupFragment7, R.id.cellGroupFragment8, R.id.cellGroupFragment9};
        for (int i = 1; i < 10; i++) {
            sudoku_fragments groupFragment = (sudoku_fragments) getSupportFragmentManager().findFragmentById(groupFragments[i-1]);
            groupFragment.setID(i);
        }
    }


}
