package com.webmaster.doctoeasy;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView imageViewLogin;
    ImageView imageViewSignUp;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    imageViewSignUp=findViewById(R.id.imageViewSignup);

    }



    public void imageViewLoginClick(View view) {


            Intent intent =new Intent(MainActivity.this,LogInActivity.class);
            startActivity(intent);



    }
}
