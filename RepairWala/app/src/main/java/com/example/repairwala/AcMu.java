package com.example.repairwala;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class AcMu extends AppCompatActivity {
    private Button button;
    TextView textView;
    public static String service;
    public static String nunit;
    public static String stype;

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
        nunit= intent.getStringExtra("unit");
        service= intent.getStringExtra("service");
        stype= intent.getStringExtra("servicetype");

        this.service=service;
        this.nunit=nunit;
        this.stype=stype;

        Toast t = Toast.makeText(getApplicationContext(), ""+stype+"",Toast.LENGTH_LONG);
        t.show();

        textView.setText(nunit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent;

                intent =  new Intent(AcMu.this,taploc.class);
                intent.putExtra("service",service);
                intent.putExtra("unit",textView.getText());
                intent.putExtra("servicetype","On-site");
                startActivity(intent);

            }
        });


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

        Intent intent;

        intent =  new Intent(AcMu.this,numberofUnits.class);
        intent.putExtra("service",service);
        intent.putExtra("unit",service);
        intent.putExtra("servicetype","On-site");
        startActivity(intent);


    }


    public void donee(View view){

        Intent intent;

        intent =  new Intent(AcMu.this,taploc.class);
        intent.putExtra("service",service);
        intent.putExtra("unit",service);
        intent.putExtra("servicetype","On-site");
        startActivity(intent);

    }


    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }


}
