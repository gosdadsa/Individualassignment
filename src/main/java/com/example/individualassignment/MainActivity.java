package com.example.individualassignment;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences pref = getSharedPreferences("MySharedPreferences", 0);
        SharedPreferences.Editor prefEditor = pref.edit();

        Button button1=findViewById(R.id.button39);
        Button button2=findViewById(R.id.button59);
        Button button3=findViewById(R.id.button62);
        Button button4=findViewById(R.id.button82);
        Button startbt=findViewById(R.id.button35);


       button1.setEnabled(false); button2.setEnabled(false); button3.setEnabled(false); button4.setEnabled(false);
        Button exbt=findViewById(R.id.button28);
       Button[] bts={button1,button2,button3,button4};

         Count totalcount=new Count();

        exbt.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
                System.exit(0);
            }

        });
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                button1.setEnabled(false);
                button1.setBackgroundColor(Color.BLUE);
                L1_selection ramdon=new L1_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                totalcount.keepcount();
                button2.setEnabled(false);
                button2.setBackgroundColor(Color.BLUE);
                L1_selection ramdon=new L1_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                button3.setEnabled(false);
                button3.setBackgroundColor(Color.BLUE);
                L1_selection ramdon=new L1_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                totalcount.keepcount();
                button4.setEnabled(false);
                button4.setBackgroundColor(Color.BLUE);
                L1_selection ramdon=new L1_selection();
                int ramnum=ramdon.random;
                bts[ramnum].setBackgroundColor(Color.RED);
                bts[ramnum].setEnabled(true);
            }
        });

        startbt.setOnClickListener(new View.OnClickListener() {
           public void onClick(View v) {
               startbt.setEnabled(false);
               L1_selection ramdon = new L1_selection();
               int ramnum = ramdon.random;
               bts[ramnum].setBackgroundColor(Color.RED);
               bts[ramnum].setEnabled(true);


               new CountDownTimer(5000,1000)  //countdown timer to show time up message
                   {
                       public void onTick ( long millisUntilFinished){
                   }
                       public void onFinish () {

                       Toast.makeText(MainActivity.this, "Times Up",
                               Toast.LENGTH_SHORT).show();

                       button1.setEnabled(false);
                       button2.setEnabled(false);
                       button3.setEnabled(false);
                       button4.setEnabled(false);
                       int count = totalcount.count;
                           prefEditor.putInt("Total", count);
                           prefEditor.commit();

                       Intent i = new
                               Intent(MainActivity.this,  Activity2.class);
                       startActivity(i);
                       finish();
                   }
                   }.
                   start();
               }
        });
    }
}
