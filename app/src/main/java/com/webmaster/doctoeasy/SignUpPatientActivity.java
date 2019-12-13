package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpPatientActivity extends AppCompatActivity {

    ImageView imageViewOrangeCube;
    TextView textViewPageName;
    TextView  textViewForgotPassword;
    ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_patient);

        initActivity();
    }

    private void initActivity() {
        /*init header*/
        textViewPageName=findViewById(R.id.textViewPageName);
        textViewPageName.setText(R.string.page_name_patient);

        /*init header*/
        textViewForgotPassword=findViewById(R.id.textViewForgotPassword);
        textViewForgotPassword.setText(R.string.text_view_login);

        /*init bottom*/
        mConstraintLayout=(ConstraintLayout) findViewById(R.id.btnMyAccaunt);
        mConstraintLayout.setBackgroundResource(R.drawable.bottom_menu_pressed_bg);
    }
    public void backArrowClick(View view) {

        Intent intent =new Intent(SignUpPatientActivity.this,SignUpActivity.class);
        startActivity(intent);
    }

    public void checkBoxOnClick(View view) {
    }
}
