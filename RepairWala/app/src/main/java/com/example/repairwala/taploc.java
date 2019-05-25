package com.example.repairwala;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.provider.Settings;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.EmptyStackException;

public class taploc extends AppCompatActivity {
    TextView textView,ddate,dtime;
    LinearLayout layout1,layout2,l1,l2,getdate,gettime;
    Button button;
    private static final String TAG ="GETDATE";
    private DatePickerDialog.OnDateSetListener mDateSetLsstner;
    private TimePickerDialog.OnTimeSetListener timeSetListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taploc);
        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("         Choose Provider");
        actionbar.setDisplayShowHomeEnabled(true);
        // actionbar.setHomeButtonEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#27AAE1")));
        textView = findViewById(R.id.address);
        layout1 = findViewById(R.id.layout1);
        layout2= findViewById(R.id.layout2);


        l1 = findViewById(R.id.lay1);
        l2 = findViewById(R.id.lay2);
        button = findViewById(R.id.cout);

        layout1.setVisibility(View.INVISIBLE);
        layout2.setVisibility(View.INVISIBLE);
        button.setVisibility(View.INVISIBLE);




        Intent intent = getIntent();
        String add= intent.getStringExtra("location");
        textView.setText(add);
        if(!textView.getText().equals("")) {
            layout1.setVisibility(View.VISIBLE);
            ddate = findViewById(R.id.date);
            dtime = findViewById(R.id.time);

            getdate = findViewById(R.id.displaydate);
            gettime = findViewById(R.id.displaytime);

            getdate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Calendar cal = Calendar.getInstance();
                    int year = cal.get(Calendar.YEAR);
                    int month = cal.get(Calendar.MONTH);
                    int day = cal.get(Calendar.DAY_OF_MONTH);
                    DatePickerDialog dialog = new DatePickerDialog(taploc.this, android.R.style.Theme_DeviceDefault_Light_Dialog, mDateSetLsstner, year, month, day);
                    dialog.getDatePicker().setMinDate(cal.getTimeInMillis());

                    dialog.show();

                }
            });
            mDateSetLsstner = new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    month = month + 1;
                    String date = month + "/" + dayOfMonth + "/" + year;
                    ddate.setText(date);



                }
            };

            gettime.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Calendar cal = Calendar.getInstance();

                    int hour = cal.get(Calendar.HOUR);
                    int minute = cal.get(Calendar.MINUTE);
                    TimePickerDialog dialog = new TimePickerDialog(taploc.this, android.R.style.Theme_DeviceDefault_Light_Dialog, new TimePickerDialog.OnTimeSetListener() {
                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                            dtime.setText(hourOfDay + ":" + minute);


                            if (ddate.getText().length()==0 && dtime.getText().length()==0){
                                layout2.setVisibility(View.INVISIBLE);
                            }
                            else {
                                layout2.setVisibility(View.VISIBLE);

                            }

                        }
                    }, hour, minute, true);


                    dialog.show();

                }
            });


            //else{
             //   layout2.setVisibility(View.VISIBLE);
           // }


            l1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(v==l1){

                        l1.setBackgroundColor(Color.parseColor("#27AAE1"));
                        l2.setBackgroundColor(Color.parseColor("#FFFFFF"));


                    }
                    button.setVisibility(View.VISIBLE);

                }
            });


            l2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (v==l2){

                        l2.setBackgroundColor(Color.parseColor("#27AAE1"));
                        l1.setBackgroundColor(Color.parseColor("#FFFFFF"));


                    }
                    button.setVisibility(View.VISIBLE);

                }
            });
        }









    }


    public void tap4add(View v){
        Intent intent =  new Intent(getApplicationContext(),addDetail.class);
        startActivity(intent);

    }

    public void checkout(View v){
        Intent intent =  new Intent(getApplicationContext(),reviewRequest.class);
        startActivity(intent);

    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
