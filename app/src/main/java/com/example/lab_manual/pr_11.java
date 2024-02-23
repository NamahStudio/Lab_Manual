package com.example.lab_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

public class pr_11 extends AppCompatActivity {

    CheckBox ch1,ch2,ch3,ch4,ch5;
    TextView show_branch;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr11);
        ch1=findViewById(R.id.chk_CO);
        ch2=findViewById(R.id.chk_IT);
        ch3=findViewById(R.id.chk_EE);
        ch4=findViewById(R.id.chk_CE);
        ch5=findViewById(R.id.chk_ME);

        show_branch=findViewById(R.id.selectedBranch);
        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){

                    show_branch.setText("Selected Branch Computer Engineering");
                }
            }
        });
        ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    show_branch.setText("Selected Branch Inforation Technology");
                }
            }
        });
        ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    show_branch.setText("Selected Branch Electrical Engineering");
                }
            }
        });
        ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    show_branch.setText("Selected Branch Civil Engineering");
                }
            }
        });
        ch5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    show_branch.setText("Selected Branch Mechanical Engineering");
                }
            }
        });


    }
}