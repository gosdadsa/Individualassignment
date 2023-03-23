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

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        Count totalcount=new Count();
        SharedPreferences pref = getSharedPreferences("MySharedPreferences", 0);
        SharedPreferences.Editor prefEditor = pref.edit();
        Button stbt=findViewById(R.id.button11);
        Button bt1=findViewById(R.id.button12);
        Button bt2=findViewById(R.id.button13);
        Button bt3=findViewById(R.id.button14);
        Button bt4=findViewById(R.id.button15);
        Button bt5=findViewById(R.id.button16);
        Button bt6=findViewById(R.id.button17);
        Button bt7=findViewById(R.id.button18);
        Button bt8=findViewById(R.id.button19);
        Button bt9=findViewById(R.id.button20);
        Button bt10=findViewById(R.id.button21);
        Button bt11=findViewById(R.id.button22);
        Button bt12=findViewById(R.id.button23);
        Button bt13=findViewById(R.id.button24);
        Button bt14=findViewById(R.id.button25);
        Button bt15=findViewById(R.id.button26);
        Button bt16=findViewById(R.id.button27);
        Button exbt=findViewById(R.id.button30);
        bt1.setEnabled(false);bt2.setEnabled(false);bt3.setEnabled(false);bt4.setEnabled(false);
        bt5.setEnabled(false);bt6.setEnabled(false);bt7.setEnabled(false);bt8.setEnabled(false);bt9.setEnabled(false);
        bt10.setEnabled(false);bt11.setEnabled(false);bt12.setEnabled(false);bt13.setEnabled(false);
        bt14.setEnabled(false);bt15.setEnabled(false);bt16.setEnabled(false);

        Button bts[]={bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16};
        exbt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
                System.exit(0);
            }

        });
        stbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stbt.setEnabled(false);
                L3_selection ramdon = new L3_selection();
                int ramnum = ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);


                new CountDownTimer(5000,1000)  //countdown timer to show time up message
                {

                    public void onTick ( long millisUntilFinished){

                    }


                    public void onFinish () {

                        Toast.makeText(Activity3.this, "Times Up",
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
                        bt10.setEnabled(false);
                        bt11.setEnabled(false);
                        bt12.setEnabled(false);
                        bt13.setEnabled(false);
                        bt14.setEnabled(false);
                        bt15.setEnabled(false);
                        bt16.setEnabled(false);


                        int count1 = totalcount.count;
                        int count2 =pref.getInt("Total",0);
                        int count3=count1+count2;
                        prefEditor.putInt("Total",count3);
                        prefEditor.commit();

                        Intent i = new
                                Intent(Activity3.this,  Activity4.class);
                        startActivity(i);
                        finish();
                    }
                }.
                        start();
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt1.setEnabled(false);
                bt1.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });
        bt2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt2.setEnabled(false);
                bt2.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt3.setEnabled(false);
                bt3.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });
        bt4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                bt4.setEnabled(false);
                bt4.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });
        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt5.setEnabled(false);
                bt5.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt6.setEnabled(false);
                bt6.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt7.setEnabled(false);
                bt7.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt8.setEnabled(false);
                bt8.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt9.setEnabled(false);
                bt9.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt10.setEnabled(false);
                bt10.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt11.setEnabled(false);
                bt11.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt12.setEnabled(false);
                bt12.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt13.setEnabled(false);
                bt13.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt14.setEnabled(false);
                bt14.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt15.setEnabled(false);
                bt15.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt16.setEnabled(false);
                bt16.setBackgroundColor(Color.GREEN);
                L3_selection ramdon=new L3_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
    }
}