package com.example.repairwala;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CleaningService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning_service);
        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("        Cleaning Services");
        actionbar.setDisplayShowHomeEnabled(true);
        // actionbar.setHomeButtonEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#69A34F")));

    }


    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
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
