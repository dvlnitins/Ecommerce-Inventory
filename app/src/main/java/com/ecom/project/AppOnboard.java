package com.ecom.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppOnboard extends AppCompatActivity {


    Button login_btn, Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_onboard);

        login_btn = findViewById(R.id.login_btn);
        Submit = findViewById(R.id.mobile_otp);
        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AppOnboard.this, Login.class);
                startActivity(intent);
            }
        });
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AppOnboard.this, OTPVerification.class);
                startActivity(intent);
            }
        });
    }
}