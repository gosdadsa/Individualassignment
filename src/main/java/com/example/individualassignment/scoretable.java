package com.example.individualassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class scoretable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoretable);
        TextView tl= new TextView(this);
        LinearLayout ll= new LinearLayout(this);


        String strFileName = "honor.txt";
        FileInputStream fis;
        StringBuffer buffer = new StringBuffer();
        DataInputStream dataIO;
        String strLine = null;
        try {
            fis = openFileInput(strFileName);
            dataIO = new DataInputStream(fis);
            while ((strLine = dataIO.readLine()) != null){
                buffer.append(strLine + "\n");
            }
            dataIO.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tl.setText(buffer);
 ll.setOrientation(LinearLayout.VERTICAL);
 ll.addView(tl);
 setContentView(ll);
    }
}