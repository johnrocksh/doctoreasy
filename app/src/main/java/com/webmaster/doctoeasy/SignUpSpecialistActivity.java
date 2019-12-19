package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpSpecialistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_specialist);
    }

    public void signUpOnClick(View view) {
        Intent intent = new Intent(SignUpSpecialistActivity.this,DoctorCalendarActivity.class);
        startActivity(intent);
    }
}
