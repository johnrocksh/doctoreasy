package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpPatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_patient);
    }

    public void backArrowClick(View view) {

        Intent intent =new Intent(SignUpPatientActivity.this,SignUpActivity.class);
        startActivity(intent);
    }
}
