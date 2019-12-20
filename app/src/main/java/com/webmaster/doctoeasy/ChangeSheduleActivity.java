package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChangeSheduleActivity extends AppCompatActivity {


    TextView textViewMonday;
    TextView textViewTuesday;
    TextView textViewWednesday;
    TextView textViewThursday;
    TextView textViewFriday;
    TextView textViewSaturday;
    TextView textViewSunday;
    Context mycontext;

    LinearLayout linarLayoutDaysOfWeek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_shedule);
        mycontext=getBaseContext();
        textViewMonday = findViewById(R.id.textViewMonday);
        textViewTuesday = findViewById(R.id.textViewTuesday);
        textViewWednesday = findViewById(R.id.textViewWednesday);
        textViewThursday = findViewById(R.id.textViewThursday);
        textViewFriday = findViewById(R.id.textViewFriday);
        textViewSaturday = findViewById(R.id.textViewSaturday);
        textViewSunday = findViewById(R.id.textViewSunday);



        linarLayoutDaysOfWeek = findViewById(R.id.linearLayoutDaysOfWeek);


    }

    /*перебераем все textView c  днями недели и убираем bold*/
    public  void findChildren(View view) {

      try {

          int style = textViewMonday.getTypeface().getStyle();

          if (style == Typeface.BOLD) {
              textViewMonday.setTextAppearance(mycontext, R.style.regular);
          }

          style = textViewTuesday.getTypeface().getStyle();
          if (style == Typeface.BOLD) {
              textViewTuesday.setTextAppearance(mycontext, R.style.regular);
          }

          style = textViewWednesday.getTypeface().getStyle();
          if (style == Typeface.BOLD) {
              textViewWednesday.setTextAppearance(mycontext, R.style.regular);
          }



          style = textViewThursday.getTypeface().getStyle();
          if (style == Typeface.BOLD) {
              textViewThursday.setTextAppearance(mycontext, R.style.regular);
          }

          style = textViewFriday.getTypeface().getStyle();
          if (style == Typeface.BOLD) {
              textViewFriday.setTextAppearance(mycontext, R.style.regular);
          }

          style = textViewSaturday.getTypeface().getStyle();
          if (style == Typeface.BOLD) {
              textViewSaturday.setTextAppearance(mycontext, R.style.regular);
          }

          style = textViewSunday.getTypeface().getStyle();
          if (style == Typeface.BOLD) {
              textViewSunday.setTextAppearance(mycontext, R.style.regular);
          }
      }catch (NullPointerException ex){


      }

    }

    public void mondayOnClick(View view) {
        findChildren(linarLayoutDaysOfWeek);
       // textViewMonday.setTypeface(textViewMonday.getTypeface(), Typeface.BOLD);
        textViewMonday.setTextAppearance(mycontext, R.style.boldfont);
    }

    public void tuesdayOnClick(View view) {
        findChildren(linarLayoutDaysOfWeek);
        textViewTuesday.setTextAppearance(mycontext, R.style.boldfont);
    }

    public void wednesdayOnClick(View view) {
        findChildren(linarLayoutDaysOfWeek);
        textViewWednesday.setTextAppearance(mycontext, R.style.boldfont);
    }

    public void thursdayOnClick(View view) {
        findChildren(linarLayoutDaysOfWeek);
        textViewThursday.setTextAppearance(mycontext, R.style.boldfont);
    }

    public void fridayOnClick(View view) {
        findChildren(linarLayoutDaysOfWeek);
        textViewFriday.setTextAppearance(mycontext, R.style.boldfont);
    }

    public void saturdayOnClick(View view) {
        findChildren(linarLayoutDaysOfWeek);
        textViewSaturday.setTextAppearance(mycontext, R.style.boldfont);
    }

    public void sundayOnClick(View view) {
        findChildren(linarLayoutDaysOfWeek);
        textViewSunday.setTextAppearance(mycontext, R.style.boldfont);
    }
}
