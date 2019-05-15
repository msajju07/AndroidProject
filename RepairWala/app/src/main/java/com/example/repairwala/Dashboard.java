package com.example.repairwala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void ACClick(View v){
        Intent intent =  new Intent(getApplicationContext(),AcService.class);
        startActivity(intent);

    }

    public void ElectronicClick(View v){
        Intent intent =  new Intent(getApplicationContext(),ElectronicService.class);
        startActivity(intent);

    }

    public void CleaningClick(View v){
        Intent intent =  new Intent(getApplicationContext(),CleaningService.class);
        startActivity(intent);

    }

    public void PlumbingClick(View v){
        Intent intent =  new Intent(getApplicationContext(),PlumbingService.class);
        startActivity(intent);

    }

    public void ElectricalClick(View v){
        Intent intent =  new Intent(getApplicationContext(),ElectricalService.class);
        startActivity(intent);

    }
    public void GardeningClick(View v){
        Intent intent =  new Intent(getApplicationContext(),GardeningService.class);
        startActivity(intent);

    }
    public void HApplClick(View v){
        Intent intent =  new Intent(getApplicationContext(),HomeAppliance.class);
        startActivity(intent);

    }
    public void HApplReClick(View v){
        Intent intent =  new Intent(getApplicationContext(),HomeApplianceR.class);
        startActivity(intent);

    }

}
