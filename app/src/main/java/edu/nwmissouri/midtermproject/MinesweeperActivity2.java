package edu.nwmissouri.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MinesweeperActivity2 extends AppCompatActivity {
int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minesweeper2);
        final Intent int2=new Intent(this,MineSweeper.class);
        Button btn2=(Button)findViewById(R.id.button102);
        Button letsplay=(Button)findViewById(R.id.play);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(int2);

            }
        });



        letsplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView time=(TextView)findViewById(R.id.TIME);

                new CountDownTimer(2250000,1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        time.setText(String.valueOf("TIME:"+counter));
                        counter++;
                    }
                    @Override
                    public void onFinish() {
                        time.setText("Finished");
                    }
                }.start();
            }
        });
    }
}
