package com.example.lab_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pratical_5 extends AppCompatActivity {
    Button l1,r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratical5);

        l1=findViewById(R.id.btn_linear);
        r1=findViewById(R.id.btn_relative);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Pratical_5.this,Linear_Layout.class);
                startActivity(i1);
            }
        });
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Pratical_5.this,Absolute_layout.class);
                startActivity(i1);
            }
        });


    }
}