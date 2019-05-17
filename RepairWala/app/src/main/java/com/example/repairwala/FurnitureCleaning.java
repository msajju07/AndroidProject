package com.example.repairwala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FurnitureCleaning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_furniture_cleaning);
    }
    public void Back(View v){
        Intent intent =  new Intent(getApplicationContext(),CleaningService.class);
        startActivity(intent);

    }

}
