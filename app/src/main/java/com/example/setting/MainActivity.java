package com.example.setting;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.setting.R;

public class MainActivity extends AppCompatActivity {


    //Member Variable
    private final String TAG = "examevent1";


    private EditText IdETXT;
    private Button addbtn, modbtn, canbtn;

    private CheckBox autocheck, wificheck;

    private RadioGroup radioGroup;
    private RadioButton whtierbtn, darkrbtn, bluerbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init(); //초기화
        Log.i(TAG, "OnCreate()");

    }

    private void init() {

        IdETXT = findViewById(R.id.nameETXT);
        addbtn = findViewById(R.id.save);
        modbtn = findViewById(R.id.modi);
        canbtn = findViewById(R.id.cancel);
        autocheck = findViewById(R.id.Ckauto);
        wificheck = findViewById(R.id.Ckwifi);
        whtierbtn = findViewById(R.id.Ckwhite);
        darkrbtn = findViewById(R.id.Ckdark);
        bluerbtn = findViewById(R.id.Ckblue);
        Log.i(TAG, "init()");


        modbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                IdETXT.setClickable(true);
                IdETXT.setFocusable(true);



            }
        });


        canbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IdETXT.setText("");
                whtierbtn.setChecked(false);
                darkrbtn.setChecked(false);
                bluerbtn.setChecked(false);
                autocheck.setChecked(false);
                wificheck.setChecked(false);


            }
        });

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "OnClick save");
                IdETXT.setClickable(false);
                IdETXT.setFocusable(false);
                if (IdETXT.getText().length() > 0 && (autocheck.isChecked() || wificheck.isChecked()) && (whtierbtn.isChecked() || darkrbtn.isChecked() || bluerbtn.isChecked())) {
                    Log.i(TAG, "name " + IdETXT.getText() + "autocheck " + autocheck.isChecked() + wificheck.isChecked() + whtierbtn + darkrbtn.isChecked() + bluerbtn.isChecked());

                } else {
                    Log.i(TAG, "NO ");



                }
            }
        });
    }
}








