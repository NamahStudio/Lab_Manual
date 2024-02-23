package com.example.lab_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class pr_13_1 extends AppCompatActivity {

    ProgressBar pb1;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr13_1);

        pb1=findViewById(R.id.progressBar);
        bt1=findViewById(R.id.btn_pb);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb1.setVisibility(View.VISIBLE);

                Handler h1=new Handler();
                h1.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        pb1.setVisibility(View.INVISIBLE);
                        Toast.makeText(pr_13_1.this, "Progress Bar Successfully Implemented", Toast.LENGTH_SHORT).show();

                    }
                },3000);
            }
        });
    }
}