package com.example.repairwala;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class serviceman_login extends AppCompatActivity {
    FirebaseAuth mAuth;
    EditText emailtxt, passwordtxt;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serviceman_login);
        emailtxt = findViewById(R.id.emailtext);
        passwordtxt = findViewById(R.id.textpassword);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        mAuth = FirebaseAuth.getInstance();
    }
        private void servicemanlogin () {
            String eaddress = emailtxt.getText().toString().trim();
            String password = passwordtxt.getText().toString().trim();

            if (!Patterns.EMAIL_ADDRESS.matcher(eaddress).matches()) {
                emailtxt.setError("Please Enter Valid email");
                emailtxt.requestFocus();
                return;
            }

            if (eaddress.isEmpty()) {
                emailtxt.setError("Your email is required");
                emailtxt.requestFocus();
                return;
            }
            if (password.isEmpty()) {
                passwordtxt.setError("Your password is required");
                passwordtxt.requestFocus();
                return;
            }
            if (password.length() < 6) {
                passwordtxt.setError("Minimum length of password should be 6");
                passwordtxt.requestFocus();
                return;
            }
            progressBar.setVisibility(View.VISIBLE);

            mAuth.signInWithEmailAndPassword(eaddress, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    progressBar.setVisibility(View.GONE);
                    if (task.isSuccessful()) {

                        Intent intent = new Intent(serviceman_login.this, Dashboard.class);
                        Toast.makeText(getApplicationContext(), "Successfully login", Toast.LENGTH_SHORT).show();

                        intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    } else {
                        Toast.makeText(getApplicationContext(), task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                    }
                }
            });

        }


            public void serviceman(View view){
                servicemanlogin();

            }
    public void Signup(View v){
        Intent intent =  new Intent(getApplicationContext(),register.class);
        startActivity(intent);

    }

}
