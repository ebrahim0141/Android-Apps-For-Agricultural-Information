package com.helpagri.agrimaster;


import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;


public class SignUpctivity extends AppCompatActivity implements View.OnClickListener{

    private EditText signUpEmailEditText,signUpPasswordEditText;
    private TextView signIntextView;
    private Button signUpButton;
    private FirebaseAuth mAuth;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_upctivity);
        this.setTitle("Sign Up Activity");
        mAuth = FirebaseAuth.getInstance();

        progressBar = (ProgressBar) findViewById(R.id.progressBarId);
        signUpEmailEditText = (EditText) findViewById(R.id.signUpEmailEditTextId);
        signUpPasswordEditText = (EditText) findViewById(R.id.signUpPasswordEditTextId);
        signIntextView = (TextView) findViewById(R.id.signIntextViewId);
        signUpButton = (Button) findViewById(R.id.signUpButtonId);

        signIntextView.setOnClickListener(this);
        signUpButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId())
        {
            case R.id.signUpButtonId:
                userRegister();
                break;

            case R.id.signIntextViewId:
                Intent intent=new Intent(getApplicationContext(),SignInActivity.class);
                startActivity(intent);
                break;
        }
    }

    private void userRegister() {

        String email= signUpEmailEditText.getText().toString().trim();
        String password= signUpPasswordEditText.getText().toString().trim();

        if(email.isEmpty()){
            signUpEmailEditText.setError("Enter an email address");
            signUpEmailEditText.requestFocus();
            return;
        }

        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {   signUpEmailEditText.setError("Enter a valid email address");
            signUpEmailEditText.requestFocus();
            return;
        }

        if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {   signUpEmailEditText.setError("Enter a valid email address");
            signUpEmailEditText.requestFocus();
            return;
        }

        if(password.isEmpty()){
            signUpPasswordEditText.setError("Enter a password");
            signUpPasswordEditText.requestFocus();
            return;
        }

        if(password.length()<6)
        {   signUpPasswordEditText.setError("Minimum length of a password should be 6");
            signUpPasswordEditText.requestFocus();
            return;
        }

        progressBar.setVisibility(View.VISIBLE);
        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                progressBar.setVisibility(View.GONE);
                if (task.isSuccessful()) {
                    // Sign in success, update UI with the signed-in user's information
                    finish();
                    Toast.makeText(getApplicationContext(),"Registered is successful",Toast.LENGTH_SHORT).show();

                } else {
                    // If sign in fails, display a message to the user.
                    if(task.getException() instanceof FirebaseAuthUserCollisionException){
                        Toast.makeText(getApplicationContext(),"User is already registered",Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(),"Eror :" +task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}
