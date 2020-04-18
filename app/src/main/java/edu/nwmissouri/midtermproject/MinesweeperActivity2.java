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
                bombvaluee.add(k);
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

        final int[] j = {0};
        for(int i=0;i<36;i++){
             final Button button = (Button) findViewById(getResources().getIdentifier("button" + i, "id",
                    this.getPackageName()));
           final int k=aerialist2.get(i);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   j[0] =1;
                }
            });
               if (j[0]==1){
                   button.setText(k);
               }
        }


    }


}
