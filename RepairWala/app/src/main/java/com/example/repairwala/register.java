package com.example.repairwala;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class register extends AppCompatActivity implements View.OnClickListener {
    private FirebaseAuth mAuth;
    EditText emailtxt,passwordtxt;
    Button btnsignup;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        emailtxt = (EditText) findViewById(R.id.email);
        passwordtxt=(EditText) findViewById(R.id.password);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        mAuth = FirebaseAuth.getInstance();

    }
    public void Registeration(View v){
        switch (v.getId()) {
            case R.id.registerbtn:
                registeruser();
                break;


        }

    }

    private void registeruser(){
        String eaddress= emailtxt.getText().toString().trim();
        String password = passwordtxt.getText().toString().trim();

        if (!Patterns.EMAIL_ADDRESS.matcher(eaddress).matches()) {
            emailtxt.setError("Please Enter Valid email");
            emailtxt.requestFocus();
            return;
        }

        if (eaddress.isEmpty()){
            emailtxt.setError("Your email is required");
            emailtxt.requestFocus();
            return;
        }
        if (password.isEmpty()){
            passwordtxt.setError("Your password is required");
            passwordtxt.requestFocus();
            return;
        }
        if(password.length()<6){
            passwordtxt.setError("Minimum length of password should be 6");
            passwordtxt.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(eaddress,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);

           if (task.isSuccessful()){


               Toast.makeText(getApplicationContext(),"User register successfull",Toast.LENGTH_SHORT).show();
               Intent intent =  new Intent(getApplicationContext(),login.class);
               startActivity(intent);

           }
           else{

               if(task.getException() instanceof FirebaseAuthUserCollisionException){
                    Toast.makeText(getApplicationContext(),"you are already registered",Toast.LENGTH_SHORT).show();

               }

           }

            }
        });

        }


    @Override
    public void onClick(View v) {



    }

    public void SLogin(View view) {
        Intent intent =  new Intent(getApplicationContext(),serviceman_login.class);
        startActivity(intent);
    }
}

