package com.example.repairwala;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AcMu extends AppCompatActivity {
    private Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_mu);
        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("        AC Maintenance");
        actionbar.setDisplayShowHomeEnabled(true);
        // actionbar.setHomeButtonEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#27AAE1")));
        button = findViewById(R.id.toglebtn);
        textView = findViewById(R.id.noun);
        Intent intent = getIntent();
        String nunit= intent.getStringExtra("unit");

        textView.setText(nunit);
        if(!textView.getText().equals("")){
            button.setEnabled(true);
            button.setBackgroundColor(Color.parseColor("#27AAE1"));
            button.setText("Continue");

        }
    else{
        button.setEnabled(false);
        }

        //  button.setEnabled(false);
        //button.setBackgroundColor(Color.parseColor("#ffff"));


    }

    public void ondailog(View view){
        AlertDialog.Builder db = new AlertDialog.Builder(AcMu.this);
        View mview = getLayoutInflater().inflate(R.layout.dailogbox,null);
        db.setView(mview);
        final AlertDialog dialog = db.create();
        dialog.show();
        Button oK = (Button) mview.findViewById(R.id.ok);
        oK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            dialog.cancel();

            }
        });

    }


    public void noofunit(View view){
        Intent intent =  new Intent(getApplicationContext(),numberofUnits.class);
        startActivity(intent);

    }


    public void donee(View view){
        Intent intent =  new Intent(getApplicationContext(),taploc.class);
        startActivity(intent);

    }


    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


}
