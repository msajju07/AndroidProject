package com.example.repairwala;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.example.repairwala.R;

public class Dashboard extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {
    ActionBarDrawerToggle toggle;
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("             RepairWala");
        actionbar.setDisplayShowHomeEnabled(true);
        // actionbar.setHomeButtonEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#03A9F4")));
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setItemIconTintList(null);
        toggle = new ActionBarDrawerToggle(
                this, drawer,R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        if(toggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_his) {
            // Handle the camera action
        } else if (id == R.id.nav_noti) {

        } else if (id == R.id.nav_set) {


        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void ACClick(View v){
        Intent intent =  new Intent(getApplicationContext(),AcService.class);
        startActivity(intent);

    }

    public void ElectronicClick(View v){
        Intent intent =  new Intent(getApplicationContext(),ElectronicService.class);
        startActivity(intent);

    }

    public void CleaningClick(View v){
        Intent intent =  new Intent(getApplicationContext(),CleaningService.class);
        startActivity(intent);

    }

    public void PlumbingClick(View v){
        Intent intent =  new Intent(getApplicationContext(),PlumbingService.class);
        startActivity(intent);

    }

    public void ElectricalClick(View v){
        Intent intent =  new Intent(getApplicationContext(),ElectricalService.class);
        startActivity(intent);

    }
    public void GardeningClick(View v){
        Intent intent =  new Intent(getApplicationContext(),GardeningService.class);
        startActivity(intent);

    }
    public void HApplClick(View v){
        Intent intent =  new Intent(getApplicationContext(),HomeAppliance.class);
        startActivity(intent);

    }
    public void HApplReClick(View v){
        Intent intent =  new Intent(getApplicationContext(),HomeApplianceR.class);
        startActivity(intent);

    }
    public void PaintClick(View v){
        Intent intent =  new Intent(getApplicationContext(),PaintingService.class);
        startActivity(intent);

    }
    public void PestCClick(View v){
        Intent intent =  new Intent(getApplicationContext(),PestControl.class);
        startActivity(intent);

    }

}
