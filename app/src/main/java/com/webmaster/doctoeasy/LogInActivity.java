package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LogInActivity extends AppCompatActivity {

 ImageView imageViewOrangeCube;
 TextView  textViewPageName;
 TextView  textViewForgotPassword;
 ConstraintLayout mConstraintLayout;


 public Layout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        /*jr code*/
        initActivity();

    }

    private void initActivity() {

        imageViewOrangeCube=findViewById(R.id.imageViewOrangeCube);
        textViewPageName=findViewById(R.id.textViewPageName);
        textViewPageName.setText(R.string.text_view_login);
        textViewForgotPassword=findViewById(R.id.textViewForgotPassword);
        textViewForgotPassword.setText(R.string.text_view_forgot_password);
        mConstraintLayout=(ConstraintLayout) findViewById(R.id.btnMyAccount);
        mConstraintLayout.setBackgroundResource(R.drawable.bottom_menu_pressed_bg);

    }

    public void backArrowClick(View view) {
        Intent intent= new Intent(LogInActivity.this,MainActivity.class);
        startActivity(intent);
    }

    public void checkBoxOnClick(View view) {

        if(imageViewOrangeCube.getVisibility()==view.VISIBLE){
            imageViewOrangeCube.setVisibility(view.INVISIBLE);
        }
        else{
           imageViewOrangeCube.setVisibility(view.VISIBLE);
        }


    }

    public void buttonArrowNextClick(View view) {

    }

    public void searchBtnOnClick(View view) {

        Intent intent=new Intent(LogInActivity.this,MainSearchActivity.class);
        startActivity(intent);
    }
}
