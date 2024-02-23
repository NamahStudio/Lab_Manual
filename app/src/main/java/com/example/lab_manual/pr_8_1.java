package com.example.lab_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class pr_8_1 extends AppCompatActivity {

    String[] sub={"MAD","Python","PHP","ETI","Management"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr81);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,sub);

        AutoCompleteTextView actv=findViewById(R.id.autoCompleteTV);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
    }
}