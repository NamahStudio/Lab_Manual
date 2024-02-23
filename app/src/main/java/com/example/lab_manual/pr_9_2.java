package com.example.lab_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class pr_9_2 extends AppCompatActivity {
    Button add,sub,mul,div;
    TextView result;
    EditText n1,n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr_9_2);

        add=findViewById(R.id.btn_add);
        sub=findViewById(R.id.btn_sub);
        mul=findViewById(R.id.btn_multiply);
        div=findViewById(R.id.btn_div);

        result=findViewById(R.id.result_TV);
        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);







        add.setOnClickListener(v ->{
        int num1= Integer.parseInt(n1.getText().toString());
        int num2= Integer.parseInt(n2.getText().toString());
        result.setText(""+(num1+num2));
        });

        sub.setOnClickListener(v ->{
            int num1= Integer.parseInt(n1.getText().toString());
            int num2= Integer.parseInt(n2.getText().toString());
            result.setText(""+(num1-num2));
        });

        mul.setOnClickListener(v ->{
            int num1= Integer.parseInt(n1.getText().toString());
            int num2= Integer.parseInt(n2.getText().toString());
            result.setText(""+(num1*num2));
        });

        div.setOnClickListener(v ->{
            float num1= Integer.parseInt(n1.getText().toString());
            float num2= Integer.parseInt(n2.getText().toString());
            result.setText(""+(num1/num2));
        });





    }

}