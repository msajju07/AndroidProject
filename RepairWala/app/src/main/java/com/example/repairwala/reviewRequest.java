package com.example.repairwala;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class reviewRequest extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    public static String address,service,unit,date,time,stype,price,sprovider;
    Button sendorder;
    DatabaseReference databaseReference;
    ServiceOrder serviceOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_request);
        serviceOrder = new ServiceOrder();
        databaseReference=FirebaseDatabase.getInstance().getReference().child("ServiceOrder");

        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("         Review Request");
        actionbar.setDisplayShowHomeEnabled(true);
        // actionbar.setHomeButtonEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#27AAE1")));


        textView1 = findViewById(R.id.oService);
        textView2 = findViewById(R.id.noofunit);
        textView3 = findViewById(R.id.rlocation);
        textView4 = findViewById(R.id.sprovider);
        textView5 = findViewById(R.id.stype);
        textView6 = findViewById(R.id.datetime);
        textView7 = findViewById(R.id.sprice);
        textView8 = findViewById(R.id.tprice);


        Intent intent = getIntent();
        service= intent.getStringExtra("service");
        unit= intent.getStringExtra("unit");
        address= intent.getStringExtra("location");
        date= intent.getStringExtra("date");
        time= intent.getStringExtra("time");
        stype= intent.getStringExtra("servicetype");
        price= intent.getStringExtra("price");
        sprovider = intent.getStringExtra("serviceprovider");



        this.address = address;
        this.service=service;
        this.unit=unit;
        this.date =date;
        this.time=time;this.stype=stype;
        this.price=price;
        this.sprovider=sprovider;

        textView1.setText(service);
        textView2.setText(unit);
        textView3.setText(address);
        textView4.setText(sprovider);
        textView5.setText(stype);
        textView6.setText(date+" "+time);
        textView7.setText(price);
        textView8.setText(price);

    }

    public void order(){

        String ser = textView1.getText().toString();
        String nunit = textView2.getText().toString();
        String add = textView3.getText().toString();
        String sp = textView4.getText().toString();
        String st = textView5.getText().toString();
        String datetime = textView6.getText().toString();
        String pri = textView7.getText().toString();

        serviceOrder.setOservice(ser);
        serviceOrder.setNounit(nunit);
        serviceOrder.setLocation(add);
        serviceOrder.setSerprovider(sp);
        serviceOrder.setSertype(st);
        serviceOrder.setDatetime(datetime);
        serviceOrder.setPrice(pri);

        databaseReference.push().setValue(serviceOrder);
        Toast.makeText(this,"Successfull",Toast.LENGTH_SHORT).show();
        Intent intent =  new Intent(reviewRequest.this,Dashboard.class);
        startActivity(intent);
        }


    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void ondailog(View view){
        AlertDialog.Builder db = new AlertDialog.Builder(reviewRequest.this);
        View mview = getLayoutInflater().inflate(R.layout.dailogpayment,null);
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


    public void submit(View view){
        order();

    }


}
