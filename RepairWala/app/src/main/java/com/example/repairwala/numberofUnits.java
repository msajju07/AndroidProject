package com.example.repairwala;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class numberofUnits extends AppCompatActivity implements View.OnClickListener {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numberof_units);
        setTitle("                   Number of Units");

        txt1 = findViewById(R.id.unit1);
        txt2 =  findViewById(R.id.unit2);
        txt3 =  findViewById(R.id.unit3);
        txt4 =  findViewById(R.id.unit4);
        txt5 =  findViewById(R.id.unit5);
        txt6 =  findViewById(R.id.unit6);
        txt7 =  findViewById(R.id.unit7);
        txt8 =  findViewById(R.id.unit8);

        txt1.setOnClickListener(this);
        txt2.setOnClickListener(this);
        txt3.setOnClickListener(this);
        txt4.setOnClickListener(this);
        txt5.setOnClickListener(this);
        txt6.setOnClickListener(this);
        txt7.setOnClickListener(this);
        txt8.setOnClickListener(this);



    }
    @Override
    public void onClick(View view) {


        if (view==txt1){

            txt1.setBackgroundColor(Color.parseColor("#27AAE1"));
            txt2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt3.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt4.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt5.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt6.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt7.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt8.setBackgroundColor(Color.parseColor("#FFFFFF"));

            Intent intent;

            intent =  new Intent(numberofUnits.this,AcMu.class);
            intent.putExtra("unit","1");

            startActivity(intent);

        }


        else if (view==txt2){

            txt2.setBackgroundColor(Color.parseColor("#27AAE1"));
            txt1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt3.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt4.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt5.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt6.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt7.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt8.setBackgroundColor(Color.parseColor("#FFFFFF"));

            Intent intent;

            intent =  new Intent(numberofUnits.this,AcMu.class);
            intent.putExtra("unit","2");
            startActivity(intent);

        }

        else if (view==txt3){

            txt3.setBackgroundColor(Color.parseColor("#27AAE1"));
            txt1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt4.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt5.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt6.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt7.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt8.setBackgroundColor(Color.parseColor("#FFFFFF"));
            Intent intent;

            intent =  new Intent(numberofUnits.this,AcMu.class);
            intent.putExtra("unit","3");
            startActivity(intent);

        }
        else if (view==txt4){

            txt4.setBackgroundColor(Color.parseColor("#27AAE1"));
            txt1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt3.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt5.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt6.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt7.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt8.setBackgroundColor(Color.parseColor("#FFFFFF"));

            Intent intent;

            intent =  new Intent(numberofUnits.this,AcMu.class);
            intent.putExtra("unit","4");
            startActivity(intent);

        }
        else if (view==txt5){

            txt5.setBackgroundColor(Color.parseColor("#27AAE1"));
            txt1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt3.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt4.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt6.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt7.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt8.setBackgroundColor(Color.parseColor("#FFFFFF"));

            Intent intent;

            intent =  new Intent(numberofUnits.this,AcMu.class);
            intent.putExtra("unit","5");
            startActivity(intent);

        }
        else if (view==txt6){

            txt6.setBackgroundColor(Color.parseColor("#27AAE1"));
            txt1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt3.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt4.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt5.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt7.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt8.setBackgroundColor(Color.parseColor("#FFFFFF"));

            Intent intent;

            intent =  new Intent(numberofUnits.this,AcMu.class);
            intent.putExtra("unit","6");
            startActivity(intent);

        }

        else if (view==txt7){

            txt7.setBackgroundColor(Color.parseColor("#27AAE1"));
            txt1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt3.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt4.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt5.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt6.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt8.setBackgroundColor(Color.parseColor("#FFFFFF"));
            Intent intent;

            intent =  new Intent(numberofUnits.this,AcMu.class);
            intent.putExtra("unit","7");
            startActivity(intent);

        }
        else if (view==txt8){

            txt8.setBackgroundColor(Color.parseColor("#27AAE1"));
            txt1.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt3.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt4.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt5.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt6.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt7.setBackgroundColor(Color.parseColor("#FFFFFF"));
            txt2.setBackgroundColor(Color.parseColor("#FFFFFF"));

            Intent intent;

            intent =  new Intent(numberofUnits.this,AcMu.class);
            intent.putExtra("unit","8");
            startActivity(intent);

        }






    }






}