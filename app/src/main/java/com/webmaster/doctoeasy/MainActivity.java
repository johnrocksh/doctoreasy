package com.webmaster.doctoeasy;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewLogin;
    ImageView imageViewSignUp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    imageViewLogin=findViewById(R.id.imageViewLogin2);
    imageViewSignUp=findViewById(R.id.imageViewSignUp);
    imageViewLogin.setVisibility(View.INVISIBLE);

    }



    public void imageViewLoginClick(View view) {

        if (imageViewLogin.getVisibility() == View.INVISIBLE) {
            imageViewLogin.setVisibility(View.VISIBLE);
            Intent intent =new Intent(MainActivity.this,LogInActivity.class);
            startActivity(intent);

        }

    }
}
