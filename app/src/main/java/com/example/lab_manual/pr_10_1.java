package com.example.lab_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class pr_10_1 extends AppCompatActivity {
    EditText name,pass;
    Button btn_login;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr10_1);
        name=findViewById(R.id.fb_username);
        pass=findViewById(R.id.fb_password);
        
        btn_login=findViewById(R.id.btn_login);
        
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().isEmpty() && pass.getText().toString().isEmpty()){
                    Toast.makeText(pr_10_1.this, "Enter Values", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(pr_10_1.this, "Login Done", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
        
    }
}