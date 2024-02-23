package com.example.lab_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button pr_4,pr_5,pr_6,pr_6_1,pr_7_1,pr_7_2,pr_8_1,pr_9_1,pr_9_2,pr_10_1,pr_10_2,pr_11,pr_12,pr_13_1,pr_13_2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        pr_4 = findViewById(R.id.pr_4);
        pr_5 = findViewById(R.id.pr_5);
        pr_6 = findViewById(R.id.pr_6);
        pr_6_1 = findViewById(R.id.pr_6_2);
        pr_7_1 = findViewById(R.id.pr_7_1);
        pr_7_2 = findViewById(R.id.pr_7_2);
        pr_8_1 = findViewById(R.id.pr_8_1);
        pr_9_1 = findViewById(R.id.pr_9_1);
        pr_9_2=findViewById(R.id.pr_9_2);
        pr_10_1=findViewById(R.id.pr_10_1);
        pr_10_2=findViewById(R.id.pr_10_2);
        pr_11=findViewById(R.id.pr_11);
        pr_12=findViewById(R.id.pr_12);
        pr_13_1=findViewById(R.id.pr_13_1);
        pr_13_2=findViewById(R.id.pr_13_2);



        pr_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Pratical4.class);
                startActivity(i);
            }
        });
        pr_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Pratical_5.class);
                startActivity(i);
            }
        });

        pr_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Table_Layout.class);
                startActivity(i);
            }
        });

        pr_6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Frame_Layout.class);
                startActivity(i);
            }
        });

        pr_7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,pr_7_1.class);
                startActivity(i);
            }
        });
        pr_7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,pr_7_2.class);
                startActivity(i);
            }
        });
        pr_8_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,pr_8_1.class);
                startActivity(i);
            }
        });
        pr_9_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,pr_9_1.class);
                startActivity(i);
            }
        });
        pr_9_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,pr_9_2.class);
                startActivity(i);
            }
        });
        pr_10_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,pr_10_1.class);
                startActivity(i);
            }
        }); pr_10_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,pr_10_2.class);
                startActivity(i);
            }
        });
        pr_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,pr_11.class);
                startActivity(i);
            }
        });
        pr_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,pr_12.class);
                startActivity(i);
            }
        });pr_13_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,pr_13_1.class);
                startActivity(i);
            }
        });pr_13_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,pr_13_2.class);
                startActivity(i);
            }
        });
    }



}