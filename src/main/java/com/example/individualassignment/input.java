package com.example.individualassignment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.FileOutputStream;

public class input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        SharedPreferences pref = getSharedPreferences("MySharedPreferences", 0);

        LinearLayout ll= new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        EditText ed=new EditText(this);
        TextView tv=new TextView(this);
        Button bt=new Button(this);
        bt.setText("Confirm");
        tv.setText("Please key in your name,we will record you in honor list");
        ll.addView(tv);
        ll.addView(ed);
        ll.addView(bt);
        setContentView(ll);

        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

String inputt=ed.getText().toString();
                FileOutputStream fos;
                int num = pref.getInt("Total", 0);
                String str1 = Integer.toString(num);
                String ip =inputt  + " with score " + str1+"\n";

                FileOutputStream foss;

                try {
                    foss = openFileOutput("honor.txt",
                            MODE_APPEND);
                    foss.write(ip.getBytes());
                    foss.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Intent i = new
                        Intent(input.this, scoretable.class);
                startActivity(i);
                finish();



            }
        });

    }
}
