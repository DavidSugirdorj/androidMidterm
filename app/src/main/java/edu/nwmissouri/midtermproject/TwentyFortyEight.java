package edu.nwmissouri.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TwentyFortyEight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twenty_forty_eight);
    }
    public void toMainActivity(View v){
        Intent toMain = new Intent(this,MainActivity.class);
        startActivity(toMain);
    }
}
