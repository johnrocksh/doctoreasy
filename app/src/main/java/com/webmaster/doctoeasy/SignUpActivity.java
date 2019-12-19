package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    ImageView imageViewOrangeCube;
    TextView textViewPageName;
    TextView  textViewForgotPassword;
    ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        /* */
        initActivity();
    }

    private void initActivity() {
        /*sign up set text*/
            textViewPageName=findViewById(R.id.textViewPageName);
            textViewPageName.setText(R.string.text_view_sign_up);

        /*text_view_login set text*/
            textViewForgotPassword=findViewById(R.id.textViewForgotPassword);
            textViewForgotPassword.setText(R.string.text_view_login);

        /*press login_bottom_menu*/
            mConstraintLayout=(ConstraintLayout) findViewById(R.id.btnMyAccount);
            mConstraintLayout.setBackgroundResource(R.drawable.bottom_menu_pressed_bg);
    }

    public void backArrowClick(View view) {
        Intent intent= new Intent(SignUpActivity.this,LogInActivity.class);
        startActivity(intent);
    }

    public void patientBtnOnClick(View view) {
    Intent intent=new Intent(SignUpActivity.this,SignUpPatientActivity.class);
    startActivity(intent);
    }

    public void SpecialisButtooOnClick(View view) {
        Intent intent =new Intent(SignUpActivity.this,SignUpSpecialistActivity.class);
        startActivity(intent);

    }

    public void ClinicButtonOnClick(View view) {

        Intent intent = new Intent(SignUpActivity.this,DoctorCalendarActivity.class);
        startActivity(intent);

    }
}
