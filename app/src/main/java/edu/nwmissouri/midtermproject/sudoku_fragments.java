package edu.nwmissouri.midtermproject;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class sudoku_fragments extends Fragment {
    private int fragmentsID;
    private fragmentListener mListener;
    private View v;

    public sudoku_fragments(){
    }

    @Override
    public void onCreate(Bundle savedState) {

        super.onCreate(savedState);
        if (getArguments() != null) {
        }
    }
    //finding textviews by id and inflate for now
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.sudoku_fragments, container,false);
        int fragmentTVS[]= new int[]{
                R.id.fragTV1_0,R.id.fragTV1_1,R.id.fragTV1_2,R.id.fragTV1_3,R.id.fragTV1_0,R.id.fragTV1_5,R.id.fragTV1_6,R.id.fragTV1_7,R.id.fragTV1_9,R.id.fragTV2_1,R.id.fragTV2_2,R.id.fragTV2_3,R.id.fragTV2_4,R.id.fragTV2_5,R.id.fragTV2_6,R.id.fragTV2_7,R.id.fragTV2_8
        };
        return v;
    }

    public interface fragmentListener {
        void fragmentinteraction(int groupId, int cellId, View view);
    }
}
