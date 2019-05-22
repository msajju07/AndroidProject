package com.example.repairwala;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AcService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_service);
        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("              AC Services");
        actionbar.setDisplayShowHomeEnabled(true);
        // actionbar.setHomeButtonEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#27AAE1")));

    }


    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void AcDCleaning(View v){
        Intent intent =  new Intent(getApplicationContext(),AcDCleaning.class);
        startActivity(intent);

    }

    public void AcM(View v){
        Intent intent =  new Intent(getApplicationContext(),AcMaintenace.class);
        startActivity(intent);

    }
    public void AcDuctCleaning(View v){
        Intent intent =  new Intent(getApplicationContext(),AcDuctCleaning.class);
        startActivity(intent);

    }
    public void AcThermoInstall(View v){
        Intent intent =  new Intent(getApplicationContext(),AcThermoInstall.class);
        startActivity(intent);

    }
    public void AcSCleaning(View v){
        Intent intent =  new Intent(getApplicationContext(),AcSCleaning.class);
        startActivity(intent);

    }




}
