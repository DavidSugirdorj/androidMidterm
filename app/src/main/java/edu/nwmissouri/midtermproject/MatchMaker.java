package edu.nwmissouri.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MatchMaker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_maker);
    }

    public void toMainActivity(View v){
        Intent toMain = new Intent(this,MainActivity.class);
        startActivity(toMain);
    }

}
