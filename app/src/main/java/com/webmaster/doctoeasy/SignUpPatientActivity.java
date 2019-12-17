package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class SignUpPatientActivity extends AppCompatActivity {

    ImageView imageViewOrangeCube1;
    ImageView imageViewOrangeCube2;
    TextView textViewPageName;
    TextView textViewForgotPassword;
    ConstraintLayout mConstraintLayout;

    final Calendar dataOfBirthCalendar = Calendar.getInstance();
    EditText editTextDataOfBirth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_patient);
        initActivity();
    }

    private void initActivity() {
        /*init header*/
        textViewPageName = findViewById(R.id.textViewPageName);
        textViewPageName.setText(R.string.page_name_patient);

        /*init header*/
        textViewForgotPassword = findViewById(R.id.textViewForgotPassword);
        textViewForgotPassword.setText(R.string.text_view_login);

        /*init bottom*/
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.btnMyAccaunt);
        mConstraintLayout.setBackgroundResource(R.drawable.bottom_menu_pressed_bg);

        /*init patient fields*/
        editTextDataOfBirth = (EditText) findViewById(R.id.editTextDateOfBirth);

        imageViewOrangeCube1= findViewById(R.id.imageViewOrangeCube1);
        imageViewOrangeCube2= findViewById(R.id.imageViewOrangeCube2);


    }

    /*календарь для дня рождения*/
    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            dataOfBirthCalendar.set(Calendar.YEAR, year);
            dataOfBirthCalendar.set(Calendar.MONTH, month);
            dataOfBirthCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            updateEditTextDataBirth();
        }
    };

    private void updateEditTextDataBirth() {

        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
        editTextDataOfBirth.setText(sdf.format(dataOfBirthCalendar.getTime()));
    }


    public void backArrowClick(View view) {

        Intent intent = new Intent(SignUpPatientActivity.this, SignUpActivity.class);
        startActivity(intent);
    }


    public void dataBirthOnClick(View view) {

        new DatePickerDialog(SignUpPatientActivity.this, date, dataOfBirthCalendar
                .get(Calendar.YEAR), dataOfBirthCalendar.get(Calendar.MONTH),
                dataOfBirthCalendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    public void newsLatterSubscriptionOnClick(View view) {
        if(imageViewOrangeCube1.getVisibility()==view.VISIBLE){
            imageViewOrangeCube1.setVisibility(view.INVISIBLE);
        }
        else{
            imageViewOrangeCube1.setVisibility(view.VISIBLE);
        }
    }


    public void acceptRullesAndConditionsOnClick(View view) {
        if(imageViewOrangeCube2.getVisibility()==view.VISIBLE){
            imageViewOrangeCube2.setVisibility(view.INVISIBLE);
        }
        else{
            imageViewOrangeCube2.setVisibility(view.VISIBLE);
        }
    }
}
