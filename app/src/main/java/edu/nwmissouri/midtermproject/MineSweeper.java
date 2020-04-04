package edu.nwmissouri.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;

public class MineSweeper extends AppCompatActivity {
    //Button
    Button button00;
    Button button01;
    Button button02;
    Button button03;
    Button button04;

    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;

    Button button20;
    Button button21;
    Button button22;
    Button button23;
    Button button24;

    Button button30;
    Button button31;
    Button button32;
    Button button33;
    Button button34;

    Button button40;
    Button button41;
    Button button42;
    Button button43;
    Button button44;

    Button button50;
    Button button51;
    Button button52;
    Button button53;
    Button button54;

    Button button60;
    Button button61;
    Button button62;
    Button button63;
    Button button64;

    Button button70;
    Button button71;
    Button button72;
    Button button73;
    Button button74;

    //Random number
    Random rnd = new Random();
    int randomnumber1=rnd.nextInt(5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine_sweeper);

        button00=(Button)findViewById(R.id.button00);
        button00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rnd.nextInt(5)==2) {
                    button00.setText("Bomb");

                    if (rnd.nextInt(5)==2){
                        button01.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button02.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button03.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button04.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button10.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button11.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button12.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button13.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button14.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button20.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button21.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button22.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button23.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button24.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button30.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button31.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button32.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button33.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button34.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button40.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button41.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button42.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button43.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button44.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button50.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button51.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button52.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button53.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button54.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button60.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button61.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button62.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button63.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button64.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button70.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button71.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button72.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button73.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button74.setText("Bomb");
                    }




                }
                else{
                }
            }
        });

        button01=(Button)findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");

                    if (rnd.nextInt(5)==2){
                        button00.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button02.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button03.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button04.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button10.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button11.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button12.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button13.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button14.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button20.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button21.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button22.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button23.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button24.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button30.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button31.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button32.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button33.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button34.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button40.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button41.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button42.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button43.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button44.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button50.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button51.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button52.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button53.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button54.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button60.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button61.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button62.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button63.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button64.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button70.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button71.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button72.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button73.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button74.setText("Bomb");
                    }


                }}
        });

        button02=(Button)findViewById(R.id.button02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");

                    if (rnd.nextInt(5)==2){
                        button01.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button00.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button03.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button04.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button10.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button11.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button12.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button13.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button14.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button20.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button21.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button22.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button23.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button24.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button30.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button31.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button32.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button33.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button34.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button40.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button41.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button42.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button43.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button44.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button50.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button51.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button52.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button53.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button54.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button60.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button61.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button62.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button63.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button64.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button70.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button71.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button72.setText("Bomb");
                    }if (rnd.nextInt(5)==2){
                        button73.setText("Bomb");
                    }
                    if (rnd.nextInt(5)==2){
                        button74.setText("Bomb");
                    }

                }}
        });

        button03=(Button)findViewById(R.id.button03);
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }


            }
        });


        button04=(Button)findViewById(R.id.button04);
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }

            }
        });

        //Row two button


        button10=(Button)findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }

            }
        });

        button11=(Button)findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }

            }
        });

        button12=(Button)findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }


            }
        });

        button13=(Button)findViewById(R.id.button13);
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }


            }
        });


        button14=(Button)findViewById(R.id.button14);
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }


            }
        });

        //Button three work


        button20=(Button)findViewById(R.id.button20);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }


            }
        });

        button21=(Button)findViewById(R.id.button21);
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }

            }
        });

        button22=(Button)findViewById(R.id.button22);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }

            }
        });

        button23=(Button)findViewById(R.id.button23);
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }

            }
        });


        button24=(Button)findViewById(R.id.button24);
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }

            }
        });


        //BUTTON ROW FOUR

        button30=(Button)findViewById(R.id.button30);
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }

            }
        });

        button31=(Button)findViewById(R.id.button31);
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }

            }
        });

        button32=(Button)findViewById(R.id.button32);
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }

            }
        });

        button33=(Button)findViewById(R.id.button33);
        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }

            }
        });


        button34=(Button)findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }

            }
        });


        //ROW FIVE WORK

        button40=(Button)findViewById(R.id.button40);
        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        button41=(Button)findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        button42=(Button)findViewById(R.id.button42);
        button42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        button43=(Button)findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });


        button44=(Button)findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        //ROW SIX WORK FOR BUTTON

        button50=(Button)findViewById(R.id.button50);
        button50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        button51=(Button)findViewById(R.id.button51);
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        button52=(Button)findViewById(R.id.button52);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        button53=(Button)findViewById(R.id.button53);
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });


        button54=(Button)findViewById(R.id.button54);
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        //ROW SEVEN WORK FOR BUTTON

        button60=(Button)findViewById(R.id.button60);
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        button61=(Button)findViewById(R.id.button61);
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        button62=(Button)findViewById(R.id.button62);
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        button63=(Button)findViewById(R.id.button63);
        button63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });


        button64=(Button)findViewById(R.id.button64);
        button64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });



        //ROW EIGHT WORK FOR BUTTON
        button70=(Button)findViewById(R.id.button70);
        button70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        button71=(Button)findViewById(R.id.button71);
        button71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        button72=(Button)findViewById(R.id.button72);
        button72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });

        button73=(Button)findViewById(R.id.button73);
        button73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });


        button74=(Button)findViewById(R.id.button74);
        button74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if (rnd.nextInt(5)==2){
                    button00.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button01.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button02.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button03.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button04.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button10.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button11.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button12.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button13.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button14.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button20.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button21.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button22.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button23.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button24.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button30.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button31.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button32.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button33.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button34.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button40.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button41.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button42.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button43.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button44.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button50.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button51.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button52.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button53.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button54.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button60.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button61.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button62.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button63.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button64.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button70.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button71.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button72.setText("Bomb");
                }if (rnd.nextInt(5)==2){
                    button73.setText("Bomb");
                }
                if (rnd.nextInt(5)==2){
                    button74.setText("Bomb");
                }
            }
        });





    }
}
