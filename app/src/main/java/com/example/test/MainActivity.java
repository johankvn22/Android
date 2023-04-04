package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView MB,SSD,CPU,RAM,VGA,PSU;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MB = (CardView) findViewById(R.id.mb);
        SSD = (CardView) findViewById(R.id.ssd);
        CPU = (CardView) findViewById(R.id.cpu);
        RAM = (CardView) findViewById(R.id.ram);
        VGA = (CardView) findViewById(R.id.vga);
        PSU = (CardView) findViewById(R.id.psu);

        MB.setOnClickListener((View.OnClickListener)this);
        SSD.setOnClickListener((View.OnClickListener)this);
        CPU.setOnClickListener((View.OnClickListener)this);
        RAM.setOnClickListener((View.OnClickListener)this);
        VGA.setOnClickListener((View.OnClickListener)this);
        PSU.setOnClickListener((View.OnClickListener)this);
    }
    @Override
    public void onClick(View v){
        Intent i;
        switch (v.getId()){
            case R.id.mb : i = new Intent(this,product_mb.class); startActivity(i); break;
            case R.id.ssd : i = new Intent(this,product_ssd.class); startActivity(i); break;
            case R.id.cpu : i = new Intent(this,product_cpu.class); startActivity(i); break;
            case R.id.ram : i = new Intent(this,product_ram.class); startActivity(i); break;
            case R.id.vga : i = new Intent(this,product_vga.class); startActivity(i); break;
            case R.id.psu : i = new Intent(this,product_psu.class); startActivity(i); break;
        }
    }
}