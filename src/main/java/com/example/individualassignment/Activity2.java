package com.example.individualassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Count totalcount=new Count();
        SharedPreferences pref = getSharedPreferences("MySharedPreferences", 0);
        SharedPreferences.Editor prefEditor = pref.edit();
        Button bt1=findViewById(R.id.button);
        Button bt2=findViewById(R.id.button2);
        Button bt3=findViewById(R.id.button3);
        Button bt4=findViewById(R.id.button4);
        Button bt5=findViewById(R.id.button5);
        Button bt6=findViewById(R.id.button6);
        Button bt7=findViewById(R.id.button7);
        Button bt8=findViewById(R.id.button8);
        Button bt9=findViewById(R.id.button9);
        Button stbt=findViewById(R.id.button10);
        Button exbt=findViewById(R.id.button29);

        Button bts[]={bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9};
  bt1.setEnabled(false);bt2.setEnabled(false);bt3.setEnabled(false);bt4.setEnabled(false);
        bt5.setEnabled(false);bt6.setEnabled(false);bt7.setEnabled(false);bt8.setEnabled(false);bt9.setEnabled(false);

        stbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stbt.setEnabled(false);
                L2_selection ramdon = new L2_selection();
                int ramnum = ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);


                new CountDownTimer(5000,1000)  //countdown timer to show time up message
                {

                    public void onTick ( long millisUntilFinished){

                    }


                    public void onFinish () {

                        Toast.makeText(Activity2.this, "Times Up",
                                Toast.LENGTH_SHORT).show();
                        bt1.setEnabled(false);
                        bt2.setEnabled(false);
                        bt3.setEnabled(false);
                        bt4.setEnabled(false);
                        bt5.setEnabled(false);
                        bt6.setEnabled(false);
                        bt7.setEnabled(false);
                        bt8.setEnabled(false);
                        bt9.setEnabled(false);


                        int count1 = totalcount.count;
                        int count2 =pref.getInt("Total",0);
                        int count3=count1+count2;
                        prefEditor.putInt("Total",count3);
                        prefEditor.commit();

                        Intent i = new
                                Intent(Activity2.this,  Activity3.class);
                        startActivity(i);
finish();
                    }

                }.

                        start();
            }

        });
        exbt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
                System.exit(0);

            }

        });

        bt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt1.setEnabled(false);
                bt1.setBackgroundColor(Color.BLUE);
                L2_selection ramdon=new L2_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });
        bt2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt2.setEnabled(false);
                bt2.setBackgroundColor(Color.BLUE);
                L2_selection ramdon=new L2_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });
        bt3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt3.setEnabled(false);
                bt3.setBackgroundColor(Color.BLUE);
                L2_selection ramdon=new L2_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });
        bt4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt4.setEnabled(false);
                bt4.setBackgroundColor(Color.BLUE);
                L2_selection ramdon=new L2_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });
        bt5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt5.setEnabled(false);
                bt5.setBackgroundColor(Color.BLUE);
                L2_selection ramdon=new L2_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });
        bt6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt6.setEnabled(false);
                bt6.setBackgroundColor(Color.BLUE);
                L2_selection ramdon=new L2_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });
        bt7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt7.setEnabled(false);
                bt7.setBackgroundColor(Color.BLUE);
                L2_selection ramdon=new L2_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });
        bt8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt8.setEnabled(false);
                bt8.setBackgroundColor(Color.BLUE);
                L2_selection ramdon=new L2_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });
        bt9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt9.setEnabled(false);
                bt9.setBackgroundColor(Color.BLUE);
                L2_selection ramdon=new L2_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });
    }
}