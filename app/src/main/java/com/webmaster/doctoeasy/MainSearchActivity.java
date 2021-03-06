package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainSearchActivity extends AppCompatActivity {

    ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search);

        ConstraintLayout btnLogin=findViewById(R.id.btnMyAccount);
        btnLogin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent =new Intent(v.getContext(),MainActivity.class);
                startActivity(intent);
            }
        });
            initActivity();

    }
    private void initActivity() {


        /*press login_bottom_menu*/
        mConstraintLayout=(ConstraintLayout) findViewById(R.id.btnSearch);
        mConstraintLayout.setBackgroundResource(R.drawable.bottom_menu_pressed_bg);
    }
    public void backArrowClick(View view) {


    }

    public void editTextSpecialistOnClick(View view) {
        Intent intent=new Intent(MainSearchActivity.this,SearchBySpecialistActivity.class);
        startActivity(intent);
    }

    public void editTextAreaOnClick(View view) {
        Intent intent=new Intent(MainSearchActivity.this,SearchByAreaActivity.class);
        startActivity(intent);
    }

    public void editTextDateOnClick(View view) {
        Intent intent=new Intent(MainSearchActivity.this,SearchByDateActivity.class);
        startActivity(intent);
    }



}
