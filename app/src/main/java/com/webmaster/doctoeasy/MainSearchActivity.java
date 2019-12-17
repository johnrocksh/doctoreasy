package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainSearchActivity extends AppCompatActivity {

    ConstraintLayout mConstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_search);

        initActivity();
    }
    private void initActivity() {


        /*press login_bottom_menu*/
        mConstraintLayout=(ConstraintLayout) findViewById(R.id.btnSearch);
        mConstraintLayout.setBackgroundResource(R.drawable.bottom_menu_pressed_bg);
    }
    public void backArrowClick(View view) {


    }
}
