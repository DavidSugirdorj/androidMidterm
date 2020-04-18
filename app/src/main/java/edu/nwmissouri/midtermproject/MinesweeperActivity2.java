package edu.nwmissouri.midtermproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;

public class MinesweeperActivity2 extends AppCompatActivity {
int counter;
    int bombvalue;
    int indexValue;
  Button button01 = (Button) findViewById(R.id.button01);
 Button button02 = (Button) findViewById(R.id.button02);
 Button button03 = (Button) findViewById(R.id.button03);
 Button button04 = (Button) findViewById(R.id.button04);
 Button button05 = (Button) findViewById(R.id.button05);
 Button button06 = (Button) findViewById(R.id.button06);
 Button button07 = (Button) findViewById(R.id.button07);
 Button button08 = (Button) findViewById(R.id.button08);
 Button button09 = (Button) findViewById(R.id.button15);
 Button button10 = (Button) findViewById(R.id.button10);
 Button button11 = (Button) findViewById(R.id.button11);
 Button button12 = (Button) findViewById(R.id.button12);
 Button button13 = (Button) findViewById(R.id.button13);
 Button button14 = (Button) findViewById(R.id.button14);
 Button button15 = (Button) findViewById(R.id.button09);
 Button button16 = (Button) findViewById(R.id.button16);
 Button button17 = (Button) findViewById(R.id.button17);
 Button button18 = (Button) findViewById(R.id.button18);
 Button button19 = (Button) findViewById(R.id.button19);
 Button button20 = (Button) findViewById(R.id.button20);
 Button button21 = (Button) findViewById(R.id.button21);
 Button button22 = (Button) findViewById(R.id.button22);
 Button button23 = (Button) findViewById(R.id.button23);
 Button button24 = (Button) findViewById(R.id.button24);
 Button button25 = (Button) findViewById(R.id.button25);
 Button button26 = (Button) findViewById(R.id.button26);
 Button button27 = (Button) findViewById(R.id.button27);
 Button button28 = (Button) findViewById(R.id.button28);
 Button button29 = (Button) findViewById(R.id.button29);
 Button button30 = (Button) findViewById(R.id.button30);
 Button button31 = (Button) findViewById(R.id.button31);
 Button button32 = (Button) findViewById(R.id.button32);
 Button button33 = (Button) findViewById(R.id.button33);
 Button button34 = (Button) findViewById(R.id.button34);
 Button button35 = (Button) findViewById(R.id.button35);
 Button button36 = (Button) findViewById(R.id.button36);
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

         //Timer works

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


        //Game  Engine
        ArrayList<Integer>arrayList0=new ArrayList<Integer>();
        final ArrayList<Integer> aerialist2 = new ArrayList<Integer>();
        ArrayList<Integer>bombvaluee=new ArrayList<Integer>();
        for (int j = 0; j < 36; j++) {
            Random random = new Random();
            int randomNumber = random.nextInt(7 - 1) + 1;
            arrayList0.add(randomNumber);

        }
        for(int L=0;L<36;L++){
            aerialist2.add(40);
        }
        for (int k = 0; k < 36; k++) {
            int b = arrayList0.get(k);


            indexValue=k;
            if (b == 1) {
                aerialist2.remove(indexValue);
                aerialist2.add(indexValue,100);

                if(k<5&&k>0){

                    if(aerialist2.get(indexValue-1)!=1||aerialist2.get(indexValue-1)!=2||aerialist2.get(indexValue-1)!=3){
                        aerialist2.remove(indexValue-1);
                        aerialist2.add(indexValue-1,1);
                    }
                    else{

                        aerialist2.remove(indexValue-1);
                        aerialist2.add(indexValue-1,aerialist2.get(indexValue-1)+1);
                    }

                    if(aerialist2.get(indexValue+5)!=1||aerialist2.get(indexValue+5)!=2||aerialist2.get(indexValue+5)!=3){
                        aerialist2.remove(indexValue+5);
                        aerialist2.add(indexValue+5,1);
                    }
                    else{

                        aerialist2.remove(indexValue+5);
                        aerialist2.add(indexValue+5,aerialist2.get(indexValue+5)+1);

                    }
                    if(aerialist2.get(indexValue+6)!=1||aerialist2.get(indexValue+6)!=2||aerialist2.get(indexValue+6)!=3){
                        aerialist2.remove(indexValue+6);
                        aerialist2.add(indexValue+6,1);
                    }
                    else{

                        aerialist2.remove(indexValue+6);
                        aerialist2.add(indexValue+6,aerialist2.get(indexValue+6)+1);
                    }
                    if(aerialist2.get(indexValue+7)!=1||aerialist2.get(indexValue+7)!=2||aerialist2.get(indexValue+7)!=3){
                        aerialist2.remove(indexValue+7);
                        aerialist2.add(indexValue+7,1);
                    }
                    else{

                        aerialist2.remove(indexValue+7);
                        aerialist2.add(indexValue+7,aerialist2.get(indexValue+7)+1);

                    }
                    if(aerialist2.get(indexValue+1)!=1||aerialist2.get(indexValue+1)!=2||aerialist2.get(indexValue+1)!=3){
                        aerialist2.remove(indexValue+1);
                        aerialist2.add(indexValue+1,1);
                    }
                    else{

                        aerialist2.remove(indexValue+1);
                        aerialist2.add(indexValue+1,aerialist2.get(indexValue+5)+1);

                    }
                }
                else if(k>30&&k<35){
                    if(aerialist2.get(indexValue-1)!=1||aerialist2.get(indexValue-1)!=2||aerialist2.get(indexValue-1)!=3){
                        aerialist2.remove(indexValue-1);
                        aerialist2.add(indexValue-1,1);
                    }
                    else{

                        aerialist2.remove(indexValue-1);
                        aerialist2.add(indexValue-1,aerialist2.get(indexValue-1)+1);

                    }
                    if(aerialist2.get(indexValue-5)!=1||aerialist2.get(indexValue-5)!=2||aerialist2.get(indexValue-5)!=3){
                        aerialist2.remove(indexValue-5);
                        aerialist2.add(indexValue-5,1);
                    }
                    else{

                        aerialist2.remove(indexValue-5);
                        aerialist2.add(indexValue-5,aerialist2.get(indexValue-5)+1);

                    }
                    if(aerialist2.get(indexValue-6)!=1||aerialist2.get(indexValue-6)!=2||aerialist2.get(indexValue-6)!=3){
                        aerialist2.remove(indexValue-6);
                        aerialist2.add(indexValue-6,1);
                    }
                    else{

                        aerialist2.remove(indexValue-6);
                        aerialist2.add(indexValue-6,aerialist2.get(indexValue-6)+1);

                    }
                    if(aerialist2.get(indexValue-7)!=1||aerialist2.get(indexValue-7)!=2||aerialist2.get(indexValue-7)!=3){
                        aerialist2.remove(indexValue-7);
                        aerialist2.add(indexValue-7,1);
                    }
                    else{

                        aerialist2.remove(indexValue-7);
                        aerialist2.add(indexValue-7,aerialist2.get(indexValue-7)+1);

                    }
                    if(aerialist2.get(indexValue+1)!=1||aerialist2.get(indexValue+1)!=2||aerialist2.get(indexValue+1)!=3){
                        aerialist2.remove(indexValue+1);
                        aerialist2.add(indexValue+1,1);
                    }
                    else{

                        aerialist2.remove(indexValue+1);
                        aerialist2.add(indexValue+1,aerialist2.get(indexValue+1)+1);

                    }
                }
                else if(k==11||k==17|| k==23|| k==29){
                    if(aerialist2.get(indexValue-1)!=1||aerialist2.get(indexValue-1)!=2||aerialist2.get(indexValue-1)!=3){
                        aerialist2.remove(indexValue-1);
                        aerialist2.add(indexValue-1,1);
                    }
                    else{

                        aerialist2.remove(indexValue-1);
                        aerialist2.add(indexValue-1,aerialist2.get(indexValue-1)+1);

                    }
                    if(aerialist2.get(indexValue+5)!=1||aerialist2.get(indexValue+5)!=2||aerialist2.get(indexValue+5)!=3){
                        aerialist2.remove(indexValue+5);
                        aerialist2.add(indexValue+5,1);
                    }
                    else{

                        aerialist2.remove(indexValue+5);
                        aerialist2.add(indexValue+5,aerialist2.get(indexValue+5)+1);

                    }
                    if(aerialist2.get(indexValue-6)!=1||aerialist2.get(indexValue-6)!=2||aerialist2.get(indexValue-6)!=3){
                        aerialist2.remove(indexValue-6);
                        aerialist2.add(indexValue-6,1);
                    }
                    else{

                        aerialist2.remove(indexValue-6);
                        aerialist2.add(indexValue-6,aerialist2.get(indexValue-6)+1);

                    }
                    if(aerialist2.get(indexValue-7)!=1||aerialist2.get(indexValue-7)!=2||aerialist2.get(indexValue-7)!=3){
                        aerialist2.remove(indexValue-7);
                        aerialist2.add(indexValue-7,1);
                    }
                    else{

                        aerialist2.remove(indexValue-7);
                        aerialist2.add(indexValue-7,aerialist2.get(indexValue-7)+1);

                    }
                    if(aerialist2.get(indexValue+6)!=1||aerialist2.get(indexValue+6)!=2||aerialist2.get(indexValue+6)!=3){
                        aerialist2.remove(indexValue+6);
                        aerialist2.add(indexValue+6,1);
                    }
                    else{

                        aerialist2.remove(indexValue+6);
                        aerialist2.add(indexValue+6,aerialist2.get(indexValue+6)+1);

                    }



                }
                else if(k %6==0&&k!=6&&k!=30){
                    if(aerialist2.get(indexValue-6)!=1||aerialist2.get(indexValue-6)!=2||aerialist2.get(indexValue-6)!=3){
                        aerialist2.remove(indexValue-6);
                        aerialist2.add(indexValue-6,1);
                    }
                    else{

                        aerialist2.remove(indexValue-6);
                        aerialist2.add(indexValue-6,aerialist2.get(indexValue-6)+1);

                    }
                    if(aerialist2.get(indexValue-5)!=1||aerialist2.get(indexValue-5)!=2||aerialist2.get(indexValue-5)!=3){
                        aerialist2.remove(indexValue-5);
                        aerialist2.add(indexValue-5,1);
                    }
                    else{

                        aerialist2.remove(indexValue-5);
                        aerialist2.add(indexValue-5,aerialist2.get(indexValue-5)+1);

                    }
                    if(aerialist2.get(indexValue+1)!=1||aerialist2.get(indexValue+1)!=2||aerialist2.get(indexValue+1)!=3){
                        aerialist2.remove(indexValue+1);
                        aerialist2.add(indexValue+1,1);
                    }
                    else{

                        aerialist2.remove(indexValue+1);
                        aerialist2.add(indexValue+1,aerialist2.get(indexValue+1)+1);

                    }
                    if(aerialist2.get(indexValue+7)!=1||aerialist2.get(indexValue+7)!=2||aerialist2.get(indexValue+7)!=3){
                        aerialist2.remove(indexValue+7);
                        aerialist2.add(indexValue+7,1);
                    }
                    else{

                        aerialist2.remove(indexValue+7);
                        aerialist2.add(indexValue+7,aerialist2.get(indexValue+7)+1);

                    }
                    if(aerialist2.get(indexValue+6)!=1||aerialist2.get(indexValue+6)!=2||aerialist2.get(indexValue+6)!=3){
                        aerialist2.remove(indexValue+6);
                        aerialist2.add(indexValue+6,1);
                    }
                    else{

                        aerialist2.remove(indexValue+6);
                        aerialist2.add(indexValue+6,aerialist2.get(indexValue+6)+1);

                    }


                }
                else if(k==0){
                    if(aerialist2.get(indexValue+1)!=1||aerialist2.get(indexValue+1)!=2||aerialist2.get(indexValue+1)!=3){
                        aerialist2.remove(indexValue+1);
                        aerialist2.add(indexValue+1,1);
                    }
                    else{

                        aerialist2.remove(indexValue+1);
                        aerialist2.add(indexValue+1,aerialist2.get(indexValue+5)+1);

                    }
                    if(aerialist2.get(indexValue+7)!=1||aerialist2.get(indexValue+7)!=2||aerialist2.get(indexValue+7)!=3){
                        aerialist2.remove(indexValue+7);
                        aerialist2.add(indexValue+7,1);
                    }
                    else{

                        aerialist2.remove(indexValue+7);
                        aerialist2.add(indexValue+7,aerialist2.get(indexValue+7)+1);

                    }
                    if(aerialist2.get(indexValue+6)!=1||aerialist2.get(indexValue+6)!=3||aerialist2.get(indexValue+6)!=2){
                        aerialist2.remove(indexValue+6);
                        aerialist2.add(indexValue+6,1);
                    }
                    else{

                        aerialist2.remove(indexValue+6);
                        aerialist2.add(indexValue+6,aerialist2.get(indexValue+6)+1);

                    }


                }
                else if(k==5){
                    if(aerialist2.get(indexValue-1)!=1||aerialist2.get(indexValue-1)!=2||aerialist2.get(indexValue-1)!=3){
                        aerialist2.remove(indexValue-1);
                        aerialist2.add(indexValue-1,1);
                    }
                    else{

                        aerialist2.remove(indexValue-1);
                        aerialist2.add(indexValue-1,aerialist2.get(indexValue-1)+1);

                    }
                    if(aerialist2.get(indexValue+5)!=1||aerialist2.get(indexValue+5)!=2||aerialist2.get(indexValue+5)!=3){
                        aerialist2.remove(indexValue+5);
                        aerialist2.add(indexValue+5,1);
                    }
                    else{

                        aerialist2.remove(indexValue+5);
                        aerialist2.add(indexValue+5,aerialist2.get(indexValue+5)+1);

                    }
                    if(aerialist2.get(indexValue+6)!=1||aerialist2.get(indexValue+6)!=2||aerialist2.get(indexValue+6)!=3){
                        aerialist2.remove(indexValue+6);
                        aerialist2.add(indexValue+6,1);
                    }
                    else{

                        aerialist2.remove(indexValue+6);
                        aerialist2.add(indexValue+6,aerialist2.get(indexValue+6)+1);

                    }


                }
                else if (k==35){
                    if(aerialist2.get(indexValue-6)!=1||aerialist2.get(indexValue-6)!=2||aerialist2.get(indexValue-6)!=3){
                        aerialist2.remove(indexValue-6);
                        aerialist2.add(indexValue-6,1);
                    }
                    else{

                        aerialist2.remove(indexValue-6);
                        aerialist2.add(indexValue-6,aerialist2.get(indexValue-6)+1);

                    }
                    if(aerialist2.get(indexValue-7)!=1||aerialist2.get(indexValue-7)!=2||aerialist2.get(indexValue-7)!=3){
                        aerialist2.remove(indexValue-7);
                        aerialist2.add(indexValue-7,1);
                    }
                    else{

                        aerialist2.remove(indexValue-7);
                        aerialist2.add(indexValue-7,aerialist2.get(indexValue-7)+1);

                    }
                    if(aerialist2.get(indexValue-1)!=1||aerialist2.get(indexValue-1)!=2||aerialist2.get(indexValue-1)!=3){
                        aerialist2.remove(indexValue-1);
                        aerialist2.add(indexValue-1,1);
                    }
                    else{

                        aerialist2.remove(indexValue-1);
                        aerialist2.add(indexValue-1,aerialist2.get(indexValue-1)+1);

                    }


                }
                else if(k==30){
                    if(aerialist2.get(indexValue-6)!=1||aerialist2.get(indexValue-6)!=2||aerialist2.get(indexValue-6)!=3){
                        aerialist2.remove(indexValue-6);
                        aerialist2.add(indexValue-6,1);
                    }
                    else{

                        aerialist2.remove(indexValue-6);
                        aerialist2.add(indexValue-6,aerialist2.get(indexValue-6)+1);

                    }
                    if(aerialist2.get(indexValue-5)!=1||aerialist2.get(indexValue-5)!=2||aerialist2.get(indexValue-5)!=3){
                        aerialist2.remove(indexValue-5);
                        aerialist2.add(indexValue-5,1);
                    }
                    else{

                        aerialist2.remove(indexValue-5);
                        aerialist2.add(indexValue-5,aerialist2.get(indexValue-5)+1);

                    }
                    if(aerialist2.get(indexValue+1)!=1||aerialist2.get(indexValue+1)!=2||aerialist2.get(indexValue+1)!=3){
                        aerialist2.remove(indexValue+1);
                        aerialist2.add(indexValue+1,1);
                    }
                    else{

                        aerialist2.remove(indexValue+1);
                        aerialist2.add(indexValue+1,aerialist2.get(indexValue+1)+1);

                    }


                }
                else{
                    if(aerialist2.get(indexValue-5)!=1||aerialist2.get(indexValue-5)!=2||aerialist2.get(indexValue-5)!=3){
                        aerialist2.remove(indexValue-5);
                        aerialist2.add(indexValue-5,1);
                    }
                    else{

                        aerialist2.remove(indexValue-5);
                        aerialist2.add(indexValue-5,aerialist2.get(indexValue-5)+1);

                    }
                    if(aerialist2.get(indexValue-6)!=1||aerialist2.get(indexValue-6)!=2||aerialist2.get(indexValue-6)!=3){
                        aerialist2.remove(indexValue-6);
                        aerialist2.add(indexValue-6,1);
                    }
                    else{

                        aerialist2.remove(indexValue-6);
                        aerialist2.add(indexValue-6,aerialist2.get(indexValue-6)+1);

                    }
                    if(aerialist2.get(indexValue-7)!=1||aerialist2.get(indexValue-7)!=2||aerialist2.get(indexValue-7)!=3){
                        aerialist2.remove(indexValue-7);
                        aerialist2.add(indexValue-7,1);
                    }
                    else{

                        aerialist2.remove(indexValue-7);
                        aerialist2.add(indexValue-7,aerialist2.get(indexValue-7)+1);

                    }
                    if(aerialist2.get(indexValue-1)!=1||aerialist2.get(indexValue-1)!=2||aerialist2.get(indexValue-1)!=3){
                        aerialist2.remove(indexValue-1);
                        aerialist2.add(indexValue-1,1);
                    }
                    else{

                        aerialist2.remove(indexValue-1);
                        aerialist2.add(indexValue-1,aerialist2.get(indexValue-1)+1);

                    }
                    if(aerialist2.get(indexValue+5)!=1||aerialist2.get(indexValue+5)!=2||aerialist2.get(indexValue+5)!=3){
                        aerialist2.remove(indexValue+5);
                        aerialist2.add(indexValue+5,1);
                    }
                    else{

                        aerialist2.remove(indexValue+5);
                        aerialist2.add(indexValue+5,aerialist2.get(indexValue+5)+1);

                    }
                    if(aerialist2.get(indexValue+6)!=1||aerialist2.get(indexValue+6)!=2||aerialist2.get(indexValue+6)!=3){
                        aerialist2.remove(indexValue+6);
                        aerialist2.add(indexValue+6,1);
                    }
                    else{

                        aerialist2.remove(indexValue+6);
                        aerialist2.add(indexValue+6,aerialist2.get(indexValue+6)+1);

                    }

                    if(aerialist2.get(indexValue+7)!=1||aerialist2.get(indexValue+7)!=2||aerialist2.get(indexValue+7)!=3){
                        aerialist2.remove(indexValue+7);
                        aerialist2.add(indexValue+7,1);
                    }
                    else{

                        aerialist2.remove(indexValue+7);
                        aerialist2.add(indexValue+7,aerialist2.get(indexValue+7)+1);

                    }
                    if(aerialist2.get(indexValue+1)!=1||aerialist2.get(indexValue+1)!=2||aerialist2.get(indexValue+1)!=3){
                        aerialist2.remove(indexValue+1);
                        aerialist2.add(indexValue+1,1);
                    }
                    else{

                        aerialist2.remove(indexValue+1);
                        aerialist2.add(indexValue+1,aerialist2.get(indexValue+1)+1);

                    }

                }






            }

        }
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button01.setText(aerialist2.get(0));
            }
        });
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button02.setText(aerialist2.get(1));
            }
        });
        button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button03.setText(aerialist2.get(2));
            }
        });
        button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button04.setText(aerialist2.get(3));
            }
        });
        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button05.setText(aerialist2.get(4));
            }
        });
        button06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button06.setText(aerialist2.get(5));
            }
        });
        button07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button07.setText(aerialist2.get(6));
            }
        });
        button08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button08.setText(aerialist2.get(7));
            }
        });
        button09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button09.setText(aerialist2.get(8));
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button10.setText(aerialist2.get(9));
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button11.setText(aerialist2.get(10));
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button12.setText(aerialist2.get(11));
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button13.setText(aerialist2.get(12));
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button14.setText(aerialist2.get(13));
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button15.setText(aerialist2.get(14));
            }
        });
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button16.setText(aerialist2.get(15));
            }
        });
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button17.setText(aerialist2.get(16));
            }
        });
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button18.setText(aerialist2.get(17));
            }
        });
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button19.setText(aerialist2.get(18));
            }
        });
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button20.setText(aerialist2.get(19));
            }
        });
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button21.setText(aerialist2.get(20));
            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button22.setText(aerialist2.get(21));
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button23.setText(aerialist2.get(22));
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button24.setText(aerialist2.get(23));
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button25.setText(aerialist2.get(24));
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button26.setText(aerialist2.get(25));
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button27.setText(aerialist2.get(26));
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button28.setText(aerialist2.get(27));
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button29.setText(aerialist2.get(28));
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button30.setText(aerialist2.get(29));
            }
        });
        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button31.setText(aerialist2.get(30));
            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button32.setText(aerialist2.get(31));
            }
        });button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button33.setText(aerialist2.get(32));
            }
        });button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button34.setText(aerialist2.get(33));
            }
        });button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button35.setText(aerialist2.get(34));
            }
        });button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button36.setText(aerialist2.get(35));
            }
        });



































    }


}
