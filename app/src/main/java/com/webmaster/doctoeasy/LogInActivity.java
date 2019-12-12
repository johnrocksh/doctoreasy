package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;

public class LogInActivity extends AppCompatActivity {


 public Layout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        //activity initialization
        init();



    }

    private void init() {
        View myLayout = LayoutInflater.from(this).inflate(R.layout.bottom_menu,null);
        View layout=(View)myLayout.findViewById(R.id.btnMyAccaunt);
        layout.setBackgroundResource(R.drawable.bottom_menu_pressed_bg);
    }

    public void backArrowClick(View view) {
        Intent intent= new Intent(LogInActivity.this,MainActivity.class);
        startActivity(intent);
    }
}
