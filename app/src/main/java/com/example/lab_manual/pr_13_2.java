package com.example.lab_manual;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class pr_13_2 extends AppCompatActivity {
    private ProgressDialog progressDialog;
    private int progressStatus = 0;
    private Button btn_pb_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr13_2);
        btn_pb_2 = findViewById(R.id.btn_pb_2);

        btn_pb_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pb();
            }
        });
    }

    public void pb() {
        progressDialog = new ProgressDialog(this);
        progressDialog.setTitle("Loading");
        progressDialog.setMessage("Please wait...");
        progressDialog.setCancelable(false);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setMax(100);
        progressDialog.show();

        new Thread(new Runnable() {
            public void run() {
                try {
                    while (progressStatus < 100) {
                        progressStatus += 1;
                        Thread.sleep(50);
                        runOnUiThread(new Runnable() {
                            public void run() {
                                progressDialog.setProgress(progressStatus);
                            }
                        });
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    // Dismiss the dialog when progress reaches 100
                    progressDialog.dismiss();
                }
            }
        }).start();
    }
}
