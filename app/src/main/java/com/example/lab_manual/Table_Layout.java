package com.example.lab_manual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;

public class Table_Layout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout);
        TableLayout tb=new TableLayout(this);
        TableRow headerRow =new TableRow(this);
      String[] headers={"SR.No  ","Name  ","Roll No  "};
      for(String header : headers){
          TextView headerTV=new TextView(this);
          headerTV.setText(header);
          headerRow.addView(headerTV);
      }
      tb.addView(headerRow);
        for(int i=1;i<=10;i++){
            TableRow r1=new TableRow(this);
                TextView sr=new TextView(this);
                TextView name=new TextView(this);
                TextView rollNo=new TextView(this);
                sr.setText(""+i+" ");
                name.setText("Stud"+i+" ");
                rollNo.setText(""+(10+i)+" ");
                r1.addView(sr);
                r1.addView(name);
                r1.addView(rollNo);
            tb.addView(r1);
        }
        setContentView(tb);
    }
}