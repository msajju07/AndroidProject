package com.example.repairwala;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GardeningService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gardening_service);
        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("       Gardening Services");
        actionbar.setDisplayShowHomeEnabled(true);
        // actionbar.setHomeButtonEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4CAF50")));

    }


    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
public  void gardens(View view){
    Intent intent =  new Intent(getApplicationContext(),gardenservice.class);
    startActivity(intent);
}

}
