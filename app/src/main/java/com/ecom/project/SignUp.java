package com.ecom.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class SignUp extends AppCompatActivity {


    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_sign_up);

        next = findViewById(R.id.signup_next_button);
    }

    public void callNextSignupScreen(View view){
        Intent intent = new Intent(getApplicationContext(), SIgnUp2ndScreen.class);
        startActivity(intent);
    }

    public void callLoginFromSignUp(View view) {
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
    }
}