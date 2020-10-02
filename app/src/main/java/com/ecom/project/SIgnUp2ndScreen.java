package com.ecom.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SIgnUp2ndScreen extends AppCompatActivity {

    Button callSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_ign_up2nd_screen);


        callSignUp = findViewById(R.id.signup_btn);
        callSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SIgnUp2ndScreen.this, Dashboard.class);
                startActivity(intent);
            }
    });
}}