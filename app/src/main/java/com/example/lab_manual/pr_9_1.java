package com.example.lab_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class pr_9_1 extends AppCompatActivity {

    ToggleButton tb1;
    TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr91);

        tb1=findViewById(R.id.btn_toggle);
        tv1=findViewById(R.id.tv1);

        tb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    tv1.setText("Bluetooth is ON");
                } else {
                    tv1.setText("Bluetooth is OFF");

                }
            }
        });

    }
}