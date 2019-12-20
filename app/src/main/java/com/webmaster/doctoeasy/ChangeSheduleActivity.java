package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ChangeSheduleActivity extends AppCompatActivity {

    HorizontalScrollView hsv;

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

        mycontext = getBaseContext();

        /*ссылка на сролл дней*/
        hsv = (HorizontalScrollView) findViewById(R.id.horizontalScrolView_days_of_weeks);

        /*дни недели*/
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
    public void setStyleFontRegular(View view) {

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
        } catch (NullPointerException ex) {


        }

    }

    public void mondayOnClick(View view) {
        /*шрифт болд*/
        setStyleFontRegular(linarLayoutDaysOfWeek);
        /*шрифт болд*/
         textViewMonday.setTextAppearance(mycontext, R.style.boldfont);
        hsv.smoothScrollBy(-100, 0);

    }

    public void tuesdayOnClick(View view) {
        setStyleFontRegular(linarLayoutDaysOfWeek);
        textViewTuesday.setTextAppearance(mycontext, R.style.boldfont);
        hsv.smoothScrollBy(-100, 0);
    }

    public void wednesdayOnClick(View view) {
        setStyleFontRegular(linarLayoutDaysOfWeek);
        textViewWednesday.setTextAppearance(mycontext, R.style.boldfont);
        hsv.smoothScrollBy(-100, 0);
    }

    public void thursdayOnClick(View view) {
        setStyleFontRegular(linarLayoutDaysOfWeek);
        textViewThursday.setTextAppearance(mycontext, R.style.boldfont);
        hsv.smoothScrollBy(110, 0);
    }

    public void fridayOnClick(View view) {
        setStyleFontRegular(linarLayoutDaysOfWeek);
        textViewFriday.setTextAppearance(mycontext, R.style.boldfont);

        hsv.smoothScrollBy(110, 0);
        //arrowScroll(HorizontalScrollView.FOCUS_LEFT/RIGHT)
    }

    public void saturdayOnClick(View view) {
        setStyleFontRegular(linarLayoutDaysOfWeek);
        textViewSaturday.setTextAppearance(mycontext, R.style.boldfont);
        hsv.smoothScrollBy(110, 0);
    }

    public void sundayOnClick(View view) {
        setStyleFontRegular(linarLayoutDaysOfWeek);
        textViewSunday.setTextAppearance(mycontext, R.style.boldfont);
        hsv.smoothScrollBy(110, 0);
    }
}
