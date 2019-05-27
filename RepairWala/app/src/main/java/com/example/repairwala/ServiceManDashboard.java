package com.example.repairwala;

import android.content.ClipData;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ServiceManDashboard extends AppCompatActivity {
    BottomNavigationView []bot_Nav_View = new  BottomNavigationView[4];
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_man_dashboard);

        /*bot_Nav_View[0] = findViewById(R.id.navigation_home);
        bot_Nav_View[1] = findViewById(R.id.navigation_calendar);
        bot_Nav_View[2] = findViewById(R.id.navigation_notifications);
        bot_Nav_View[3] = findViewById(R.id.navigation_tickets);

        bot_Nav_View[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),HomeAppliance.class);
                startActivity(intent);
            }
        });
        bot_Nav_View[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),HomeAppliance.class);
                startActivity(intent);
            }
        });
        bot_Nav_View[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),HomeAppliance.class);
                startActivity(intent);
            }
        });
        bot_Nav_View[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(),HomeAppliance.class);
                startActivity(intent);
            }
        });*/

        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    intent = new Intent(getApplicationContext(),ServiceManDashboard.class);
                    return true;
                case R.id.navigation_calendar:
                    intent = new Intent(getApplicationContext(),ServiceManProfile.class);
                    return true;
                case R.id.navigation_notifications:
                    intent = new Intent(getApplicationContext(),ServiceManNotifications.class);
                    return true;
                case R.id.navigation_tickets:
                    intent = new Intent(getApplicationContext(),ServiceManTickets.class);
                    return true;
            }
            return false;
        }
    };

}


