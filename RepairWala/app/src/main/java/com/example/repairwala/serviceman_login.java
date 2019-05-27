package com.example.repairwala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class serviceman_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serviceman_login);
    }
//    public void serviceManD(View v){
//        Intent intent =  new Intent(getApplicationContext(),Dashboard.class);
//        startActivity(intent);
//
//    }
    public void SLogin(View v){
        Intent intent =  new Intent(getApplicationContext(),ServiceManDashboard.class);
        startActivity(intent);

    }

}
