package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class Loading_Screen extends AppCompatActivity {
    private ProgressBar spinner;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);
        spinner = (ProgressBar) findViewById(R.id.progressBar);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Loading_Screen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2500);
    }
    public void onPageFinished(View view){
        spinner.setVisibility(View.GONE);
    }
}