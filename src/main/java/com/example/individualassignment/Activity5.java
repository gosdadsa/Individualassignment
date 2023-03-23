package com.example.individualassignment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;

public class Activity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);
        SharedPreferences pref = getSharedPreferences("MySharedPreferences", 0);
        SharedPreferences.Editor prefEditor = pref.edit();
        Count totalcount=new Count();

        File file = new File(getApplicationContext().getFilesDir(),"honor.txt");
        if(file.exists()) {



        }
        else {
            String wel = "Honer List" + "\n";
            FileOutputStream fos;
            try {
                fos = openFileOutput("honor.txt",
                        MODE_PRIVATE);
                fos.write(wel.getBytes());
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Button stbt=findViewById(R.id.button63);
        Button bt1=findViewById(R.id.button64);
        Button bt2=findViewById(R.id.button65);
        Button bt3=findViewById(R.id.button66);
        Button bt4=findViewById(R.id.button67);
        Button bt5=findViewById(R.id.button68);
        Button bt6=findViewById(R.id.button69);
        Button bt7=findViewById(R.id.button70);
        Button bt8=findViewById(R.id.button71);
        Button bt9=findViewById(R.id.button72);
        Button bt10=findViewById(R.id.button73);
        Button bt11=findViewById(R.id.button74);
        Button bt12=findViewById(R.id.button75);
        Button bt13=findViewById(R.id.button76);
        Button bt14=findViewById(R.id.button77);
        Button bt15=findViewById(R.id.button78);
        Button bt16=findViewById(R.id.button79);
        Button bt17=findViewById(R.id.button80);
        Button bt18=findViewById(R.id.button81);
        Button bt19=findViewById(R.id.button83);
        Button bt20=findViewById(R.id.button84);
        Button bt21=findViewById(R.id.button85);
        Button bt22=findViewById(R.id.button86);
        Button bt23=findViewById(R.id.button87);
        Button bt24=findViewById(R.id.button88);
        Button bt25=findViewById(R.id.button89);
        Button bt26=findViewById(R.id.button90);
        Button bt27=findViewById(R.id.button91);
        Button bt28=findViewById(R.id.button92);
        Button bt29=findViewById(R.id.button93);
        Button bt30=findViewById(R.id.button94);
        Button bt31=findViewById(R.id.button95);
        Button bt32=findViewById(R.id.button96);
        Button bt33=findViewById(R.id.button97);
        Button bt34=findViewById(R.id.button98);
        Button bt35=findViewById(R.id.button99);
        Button bt36=findViewById(R.id.button100);
        Button exbt=findViewById(R.id.button32);
        bt1.setEnabled(false);bt2.setEnabled(false);bt3.setEnabled(false);bt4.setEnabled(false);
        bt5.setEnabled(false);bt6.setEnabled(false);bt7.setEnabled(false);bt8.setEnabled(false);bt9.setEnabled(false);
        bt10.setEnabled(false);bt11.setEnabled(false);bt12.setEnabled(false);bt13.setEnabled(false);
        bt14.setEnabled(false);bt15.setEnabled(false);bt16.setEnabled(false);  bt17.setEnabled(false);bt18.setEnabled(false);bt19.setEnabled(false);bt20.setEnabled(false);
        bt21.setEnabled(false);bt22.setEnabled(false);bt23.setEnabled(false);bt24.setEnabled(false);bt25.setEnabled(false); bt26.setEnabled(false);bt27.setEnabled(false);bt28.setEnabled(false);  bt29.setEnabled(false);bt30.setEnabled(false);bt31.setEnabled(false);bt32.setEnabled(false);
        bt33.setEnabled(false);bt34.setEnabled(false);bt35.setEnabled(false);bt36.setEnabled(false);
        Button bts[]={bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20,bt21,bt22,bt23,bt24,bt25,bt26,bt27,bt28,bt29,bt30,bt31,bt32,bt33,bt34,bt35,bt36};
        exbt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
                System.exit(0);
            }

        });
        stbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stbt.setEnabled(false);
                L5_selection ramdon = new L5_selection();
                int ramnum = ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);


                new CountDownTimer(5000,1000)  //countdown timer to show time up message
                {

                    public void onTick ( long millisUntilFinished){

                    }


                    public void onFinish () {

                        Toast.makeText(Activity5.this, "Times Up",
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
                        if(count3>=25) {
                            Intent ii = new
                                    Intent(Activity5.this,  input.class);
                            startActivity(ii);
                            finish();
                        }
else {
                            Intent i = new
                                    Intent(Activity5.this, scoretable.class);
                            startActivity(i);
                            finish();
                        }
                    }
                }.
                        start();
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt1.setEnabled(false);
                bt1.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt2.setEnabled(false);
                bt2.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt3.setEnabled(false);
                bt3.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt4.setEnabled(false);
                bt4.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt5.setEnabled(false);
                bt5.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt6.setEnabled(false);
                bt6.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt7.setEnabled(false);
                bt7.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt8.setEnabled(false);
                bt8.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt9.setEnabled(false);
                bt9.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt10.setEnabled(false);
                bt10.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt11.setEnabled(false);
                bt11.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt12.setEnabled(false);
                bt12.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt13.setEnabled(false);
                bt13.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt14.setEnabled(false);
                bt14.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt15.setEnabled(false);
                bt15.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt16.setEnabled(false);
                bt16.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt17.setEnabled(false);
                bt17.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt18.setEnabled(false);
                bt18.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt19.setEnabled(false);
                bt19.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt20.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt20.setEnabled(false);
                bt20.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt21.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt21.setEnabled(false);
                bt21.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt22.setEnabled(false);
                bt22.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt23.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt23.setEnabled(false);
                bt23.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt24.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt24.setEnabled(false);
                bt24.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt25.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt25.setEnabled(false);
                bt25.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt26.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt26.setEnabled(false);
                bt26.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt27.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt27.setEnabled(false);
                bt27.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt28.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt28.setEnabled(false);
                bt28.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt29.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt29.setEnabled(false);
                bt29.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt30.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt30.setEnabled(false);
                bt30.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt31.setEnabled(false);
                bt31.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt32.setEnabled(false);
                bt32.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt33.setEnabled(false);
                bt33.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt34.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt34.setEnabled(false);
                bt34.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt35.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt35.setEnabled(false);
                bt35.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
        bt36.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                bt36.setEnabled(false);
                bt36.setBackgroundColor(Color.CYAN);
                L5_selection ramdon=new L5_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });
    }
}