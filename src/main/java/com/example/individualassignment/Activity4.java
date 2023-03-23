package com.example.individualassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        Count totalcount=new Count();
        SharedPreferences pref = getSharedPreferences("MySharedPreferences", 0);
        SharedPreferences.Editor prefEditor = pref.edit();
        Button stbt=findViewById(R.id.button60);
        Button bt1=findViewById(R.id.button33);
        Button bt2=findViewById(R.id.button34);
        Button bt3=findViewById(R.id.button36);
        Button bt4=findViewById(R.id.button37);
        Button bt5=findViewById(R.id.button38);
        Button bt6=findViewById(R.id.button61);
        Button bt7=findViewById(R.id.button40);
        Button bt8=findViewById(R.id.button41);
        Button bt9=findViewById(R.id.button42);
        Button bt10=findViewById(R.id.button43);
        Button bt11=findViewById(R.id.button44);
        Button bt12=findViewById(R.id.button45);
        Button bt13=findViewById(R.id.button46);
        Button bt14=findViewById(R.id.button47);
        Button bt15=findViewById(R.id.button48);
        Button bt16=findViewById(R.id.button49);
        Button bt17=findViewById(R.id.button50);
        Button bt18=findViewById(R.id.button51);
        Button bt19=findViewById(R.id.button52);
        Button bt20=findViewById(R.id.button53);
        Button bt21=findViewById(R.id.button54);
        Button bt22=findViewById(R.id.button55);
        Button bt23=findViewById(R.id.button56);
        Button bt24=findViewById(R.id.button57);
        Button bt25=findViewById(R.id.button58);
        Button exbt=findViewById(R.id.button31);
        bt1.setEnabled(false);bt2.setEnabled(false);bt3.setEnabled(false);bt4.setEnabled(false);
        bt5.setEnabled(false);bt6.setEnabled(false);bt7.setEnabled(false);bt8.setEnabled(false);bt9.setEnabled(false);
        bt10.setEnabled(false);bt11.setEnabled(false);bt12.setEnabled(false);bt13.setEnabled(false);
        bt14.setEnabled(false);bt15.setEnabled(false);bt16.setEnabled(false);  bt17.setEnabled(false);bt18.setEnabled(false);bt19.setEnabled(false);bt20.setEnabled(false);
        bt21.setEnabled(false);bt22.setEnabled(false);bt23.setEnabled(false);bt24.setEnabled(false);bt25.setEnabled(false);

        Button bts[]={bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20,bt21,bt22,bt23,bt24,bt25};
        exbt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
                System.exit(0);
            }

        });

        stbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stbt.setEnabled(false);
                L4_selection ramdon = new L4_selection();
                int ramnum = ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);


                new CountDownTimer(5000,1000)  //countdown timer to show time up message
                {

                    public void onTick ( long millisUntilFinished){

                    }


                    public void onFinish () {

                        Toast.makeText(Activity4.this, "Times Up",
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
                        bt17.setEnabled(false);
                        bt18.setEnabled(false);
                        bt19.setEnabled(false);
                        bt20.setEnabled(false);
                        bt21.setEnabled(false);
                        bt22.setEnabled(false);
                        bt23.setEnabled(false);
                        bt24.setEnabled(false);
                        bt25.setEnabled(false);


                        int count1 = totalcount.count;
                        int count2 =pref.getInt("Total",0);
                        int count3=count1+count2;
                        prefEditor.putInt("Total",count3);
                        prefEditor.commit();

                        Intent i = new
                                Intent(Activity4.this,  Activity5.class);
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
                bt1.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt2.setEnabled(false);
                bt2.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt3.setEnabled(false);
                bt3.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt4.setEnabled(false);
                bt4.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt5.setEnabled(false);
                bt5.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt6.setEnabled(false);
                bt6.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt7.setEnabled(false);
                bt7.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt8.setEnabled(false);
                bt8.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt9.setEnabled(false);
                bt9.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt10.setEnabled(false);
                bt10.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt11.setEnabled(false);
                bt11.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt12.setEnabled(false);
                bt12.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt13.setEnabled(false);
                bt13.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt14.setEnabled(false);
                bt14.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt15.setEnabled(false);
                bt15.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt16.setEnabled(false);
                bt16.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt17.setEnabled(false);
                bt17.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt18.setEnabled(false);
                bt18.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt19.setEnabled(false);
                bt19.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt20.setEnabled(false);
                bt20.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt21.setEnabled(false);
                bt21.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt22.setEnabled(false);
                bt22.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt23.setEnabled(false);
                bt23.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt24.setEnabled(false);
                bt24.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt25.setEnabled(false);
                bt25.setBackgroundColor(Color.YELLOW);
                L4_selection ramdon=new L4_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });





    }
}