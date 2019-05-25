package com.example.repairwala;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addDetail extends AppCompatActivity {
    EditText editText1,editText2,editText3,editText4,editText5;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_detail);
        ActionBar actionbar=getSupportActionBar();
        actionbar.setTitle("         Edit Home Details");
        actionbar.setDisplayShowHomeEnabled(true);
        // actionbar.setHomeButtonEnabled(true);
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#27AAE1")));
        editText1 = findViewById(R.id.street);
        editText2 = findViewById(R.id.bname);
        editText3 = findViewById(R.id.apart);
        editText4 = findViewById(R.id.adddire);
        editText5 = findViewById(R.id.city);






    }


    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void saveAdd(View view){
        String sname = editText1.getText().toString();
        String bname = editText2.getText().toString();
        String apart = editText3.getText().toString();
        String add = editText4.getText().toString();
        String city = editText5.getText().toString();

        Intent intent;

        intent =  new Intent(addDetail.this,taploc.class);
        intent.putExtra("location",bname+" "+apart+" "+sname+" "+add+" "+city);
        startActivity(intent);

    }
}
