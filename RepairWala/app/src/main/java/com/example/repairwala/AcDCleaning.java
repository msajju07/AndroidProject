package com.example.repairwala;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AcDCleaning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_dcleaning);
        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("        AC Deep Cleaning");
        actionbar.setDisplayShowHomeEnabled(true);
        // actionbar.setHomeButtonEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#27AAE1")));

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}

