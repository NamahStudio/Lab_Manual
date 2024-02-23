package com.example.lab_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pr_7_2 extends AppCompatActivity {

    EditText name,marks;
    Button show_details;
    TextView show_data;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr7_2);

        name=findViewById(R.id.name);
        marks=findViewById(R.id.marks);
        show_data=findViewById(R.id.data_show);


        show_details=findViewById(R.id.btn_show_details);


        show_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=name.getText().toString();
                String m=marks.getText().toString();


                show_data.setText("Name="+n+" and Marks="+m);


            }
        });




    }
}