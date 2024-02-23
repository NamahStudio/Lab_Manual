package com.example.lab_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class pr_12 extends AppCompatActivity {

    RadioButton r1,r2;
    RadioGroup rg1;
    Button show_selected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr12);

        r1=findViewById(R.id.btnR1);
        r2=findViewById(R.id.btnR2);
        show_selected=findViewById(R.id.show_selected);


    }
}