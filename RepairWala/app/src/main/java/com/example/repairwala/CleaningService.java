package com.example.repairwala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CleaningService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning_service);
    }
    public void Back(View v){
        Intent intent =  new Intent(getApplicationContext(),Dashboard.class);
        startActivity(intent);

    }
    public void HCleaningClick(View v){
        Intent intent =  new Intent(getApplicationContext(),HouseCleaning.class);
        startActivity(intent);

    }
    public void FCleaningClick(View v){
        Intent intent =  new Intent(getApplicationContext(),FurnitureCleaning.class);
        startActivity(intent);

    }
    public void KCleaningClick(View v){
        Intent intent =  new Intent(getApplicationContext(),KitchenCleaning.class);
        startActivity(intent);

    } public void BCleaningClick(View v){
        Intent intent =  new Intent(getApplicationContext(),BathroomCleaning.class);
        startActivity(intent);

    }
}
