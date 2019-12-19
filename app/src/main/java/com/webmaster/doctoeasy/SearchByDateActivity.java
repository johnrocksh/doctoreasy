package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SearchByDateActivity extends AppCompatActivity {
    ConstraintLayout mConstraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_date);
        initActivity();
        ConstraintLayout btnLogin=findViewById(R.id.btnMyAccount);
        btnLogin.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                Intent intent =new Intent(v.getContext(),LogInActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initActivity() {


        /*press login_bottom_menu*/
        mConstraintLayout=(ConstraintLayout) findViewById(R.id.btnSearch);
        mConstraintLayout.setBackgroundResource(R.drawable.bottom_menu_pressed_bg);
    }
}
