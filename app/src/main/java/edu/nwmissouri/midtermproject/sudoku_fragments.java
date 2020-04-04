package edu.nwmissouri.midtermproject;


import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import edu.nwmissouri.midtermproject.R;

public class sudoku_fragments extends Fragment {
    private int fragGroupId;
    private OnFragmentInteractionListener mListener;
    private View v;

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(int groupId, int cellId, View view);
    }
    public sudoku_fragments(){
    //required empty
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.sudoku_fragments, container, false);

        //Set textview click listeners
        int textViews[] = new int[]{R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4,
                R.id.textView5, R.id.textView6, R.id.textView7, R.id.textView8, R.id.textView9};
        for (int textView1 : textViews) {
            TextView textView = v.findViewById(textView1);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mListener.onFragmentInteraction(fragGroupId, Integer.parseInt(view.getTag().toString()), view);
                }
            });
        }
        return v;
    }
    public void setID(int fragGroupId)
    {
        this.fragGroupId = fragGroupId;
    }
    public void setValue(int position, int value) {
        int textViews[] = new int[]{R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4,
                R.id.textView5, R.id.textView6, R.id.textView7, R.id.textView8, R.id.textView9};
        TextView currentView = v.findViewById(textViews[position]);
        currentView.setText(String.valueOf(value));
        currentView.setTextColor(Color.BLACK);
        currentView.setTypeface(null, Typeface.BOLD);
    }
    public boolean checkCorrectNum() {
        ArrayList<Integer> numbers = new ArrayList<>();
        int textViews[] = new int[]{R.id.textView1, R.id.textView2, R.id.textView3, R.id.textView4,
                R.id.textView5, R.id.textView6, R.id.textView7, R.id.textView8, R.id.textView9};
        for (int textView1 : textViews) {
            TextView textView = v.findViewById(textView1);
            int number = Integer.parseInt(textView.getText().toString());
            if (numbers.contains(number)) {
                return false;
            } else {
                numbers.add(number);
            }
        }
        return true;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
}