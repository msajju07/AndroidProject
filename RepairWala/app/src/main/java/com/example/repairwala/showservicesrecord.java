package com.example.repairwala;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class showservicesrecord extends AppCompatActivity {
TextView a,b,c,d,e,f,g,h;
    Button btn;
    DatabaseReference ref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showservicesrecord);

           a = (TextView) findViewById(R.id.text1);
        b = (TextView) findViewById(R.id.text2);

        c = (TextView) findViewById(R.id.text3);
        d = (TextView) findViewById(R.id.text4);
        e = (TextView) findViewById(R.id.text5);
        f = (TextView) findViewById(R.id.text6);
        g = (TextView) findViewById(R.id.text7);

        btn = (Button) findViewById(R.id.btnclick);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ref = FirebaseDatabase.getInstance().getReference().child("ServiceOrder");
               ref.addValueEventListener(new ValueEventListener() {
                   @Override
                   public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                       String dtime = dataSnapshot.child("datetime").getValue().toString();
                       String loc = dataSnapshot.child("location").getValue().toString();
                       String unit = dataSnapshot.child("nounit").getValue().toString();
                       String service = dataSnapshot.child("oservice").getValue().toString();
                       String pri = dataSnapshot.child("price").getValue().toString();
                       String sp = dataSnapshot.child("serprovider").getValue().toString();
                       String st = dataSnapshot.child("sertype").getValue().toString();


                       a.setText(dtime);
                       b.setText(loc);
                       c.setText(unit);
                       d.setText(service);
                       e.setText(pri);
                       f.setText(sp);
                       g.setText(st);


                   }

                   @Override
                   public void onCancelled(@NonNull DatabaseError databaseError) {

                   }
               });
            }
        });
    }
}
