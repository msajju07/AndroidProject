package com.example.repairwala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class repairwala_app extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repairwala_app);
    }
    public void ULogin(View v){
        // yahi h?
        Intent intent =  new Intent(getApplicationContext(),login.class);
        startActivity(intent);

    }
    public void SLogin(View v){
        Intent intent =  new Intent(getApplicationContext(),serviceman_login.class);
        startActivity(intent);

    }


}
