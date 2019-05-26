package com.example.repairwala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Login(View v){
        Intent intent =  new Intent(getApplicationContext(),login.class);
        startActivity(intent);

    }
    public void DStats(View v){
        Intent intent =  new Intent(getApplicationContext(),dashboard_stats.class);
        startActivity(intent);

    }
    public void SStats(View v){
        Intent intent =  new Intent(getApplicationContext(),service_stats.class);
        startActivity(intent);

    }

}

