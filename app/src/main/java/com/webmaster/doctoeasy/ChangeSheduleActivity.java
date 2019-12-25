package com.webmaster.doctoeasy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.View.FOCUS_LEFT;
import static android.view.View.FOCUS_RIGHT;

public class ChangeSheduleActivity extends AppCompatActivity {

    final static int BUTTON_WIDTH = 125;
    ArrayList<Integer> x_Motion;

    static final int MIN_DISTANCE = 100;
    private float downX, downY, upX, upY;
    boolean mIsSwiping = false;


    HorizontalScrollView hsv;
    HorizontalScrollView hsvSheduleTime;
    ScrollView scrollViewTuesday;
    ScrollView scrollViewMonday;
    ScrollView scrollViewWednesday;
    ScrollView scrollViewThursday;
    ScrollView scrollViewSaturday;
    ScrollView scrollViewFriday;
    ScrollView scrollViewSunday;

    TextView textViewMonday;
    TextView textViewTuesday;
    TextView textViewWednesday;
    TextView textViewThursday;
    TextView textViewFriday;
    TextView textViewSaturday;
    TextView textViewSunday;

    Button btn_mon_8am,btn_mon_9am,btn_mon_10am,btn_mon_11am,btn_mon_12am,btn_mon_1pm,btn_mon_2pm,btn_mon_3pm,
            btn_mon_4pm,btn_mon_5pm,btn_mon_6pm,btn_mon_7pm,btn_mon_8pm;

    Button btn_tues_8am,btn_tues_9am,btn_tues_10am,btn_tues_11am,btn_tues_12am,btn_tues_1pm,btn_tues_2pm,btn_tues_3pm,
            btn_tues_4pm,btn_tues_5pm,btn_tues_6pm,btn_tues_7pm,btn_tues_8pm;

    Button btn_wed_8am,btn_wed_9am,btn_wed_10am,btn_wed_11am,btn_wed_12am,btn_wed_1pm,btn_wed_2pm,btn_wed_3pm,
            btn_wed_4pm,btn_wed_5pm,btn_wed_6pm,btn_wed_7pm,btn_wed_8pm;

    Button btn_Thur_8am,btn_Thur_9am,btn_Thur_10am,btn_Thur_11am,btn_Thur_12am,btn_Thur_1pm,btn_Thur_2pm,btn_Thur_3pm,
            btn_Thur_4pm,btn_Thur_5pm,btn_Thur_6pm,btn_Thur_7pm,btn_Thur_8pm;

    Button btn_fri_8am,btn_fri_9am,btn_fri_10am,btn_fri_11am,btn_fri_12am,btn_fri_1pm,btn_fri_2pm,btn_fri_3pm,
            btn_fri_4pm,btn_fri_5pm,btn_fri_6pm,btn_fri_7pm,btn_fri_8pm;

    Button btn_sat_8am,btn_sat_9am,btn_sat_10am,btn_sat_11am,btn_sat_12am,btn_sat_1pm,btn_sat_2pm,btn_sat_3pm,
            btn_sat_4pm,btn_sat_5pm,btn_sat_6pm,btn_sat_7pm,btn_sat_8pm;

    Button btn_sun_8am,btn_sun_9am,btn_sun_10am,btn_sun_11am,btn_sun_12am,btn_sun_1pm,btn_sun_2pm,btn_sun_3pm,
            btn_sun_4pm,btn_sun_5pm,btn_sun_6pm,btn_sun_7pm,btn_sun_8pm;




    Context mycontext;

    int screenWidth;
    int mSlop;
    LinearLayout linarLayoutDaysOfWeek;
    LinearLayout  LinearLayoutMonday;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_shedule);

        mycontext = getBaseContext();

        /*ссылка на скролл дней*/
        hsv = (HorizontalScrollView) findViewById(R.id.horizontalScrolView_days_of_weeks);
        hsvSheduleTime = (HorizontalScrollView) findViewById(R.id.horizontalScrollViewSheduleTime);
        /*дни недели*/
        textViewMonday = findViewById(R.id.textViewMonday);
        textViewTuesday = findViewById(R.id.textViewTuesday);
        textViewWednesday = findViewById(R.id.textViewWednesday);
        textViewThursday = findViewById(R.id.textViewThursday);
        textViewFriday = findViewById(R.id.textViewFriday);
        textViewSaturday = findViewById(R.id.textViewSaturday);
        textViewSunday = findViewById(R.id.textViewSunday);

        linarLayoutDaysOfWeek = findViewById(R.id.linearLayoutDaysOfWeek);

        scrollViewTuesday = findViewById(R.id.scrollViewTuesday);
        scrollViewMonday = findViewById(R.id.scrollViewMonday);
        scrollViewWednesday = findViewById(R.id.scrollViewWednesday);
        scrollViewThursday = findViewById(R.id.scrollViewThursday);
        scrollViewFriday = findViewById(R.id.scrollViewFriday);
        scrollViewSunday = findViewById(R.id.scrollViewSunday);
        scrollViewSaturday = findViewById(R.id.scrollViewSaturday);

        LinearLayoutMonday = findViewById(R.id.LinearLayoutMonday);



        screenWidth = getResources().getDisplayMetrics().widthPixels;
        /*Buttons устанавливаем длинну кнопок размену экрана*/
        initWidthButtons((Button)findViewById(R.id.btn_mon_8am));
        initWidthButtons((Button)findViewById(R.id.btn_mon_9am));
        initWidthButtons((Button)findViewById(R.id.btn_mon_10am));
        initWidthButtons((Button)findViewById(R.id.btn_mon_11am));
        initWidthButtons((Button)findViewById(R.id.btn_mon_12am));
        initWidthButtons((Button)findViewById(R.id.btn_mon_1pm));
        initWidthButtons((Button)findViewById(R.id.btn_mon_2pm));
        initWidthButtons((Button)findViewById(R.id.btn_mon_3pm));
        initWidthButtons((Button)findViewById(R.id.btn_mon_4pm));
        initWidthButtons((Button)findViewById(R.id.btn_mon_5pm));
        initWidthButtons((Button)findViewById(R.id.btn_mon_6pm));
        initWidthButtons((Button)findViewById(R.id.btn_mon_7pm));
        initWidthButtons((Button)findViewById(R.id.btn_mon_8pm));

        initWidthButtons((Button)findViewById(R.id.btn_Thur_8am));
        initWidthButtons((Button)findViewById(R.id.btn_Thur_9am));
        initWidthButtons((Button)findViewById(R.id.btn_Thur_10am));
        initWidthButtons((Button)findViewById(R.id.btn_Thur_11am));
        initWidthButtons((Button)findViewById(R.id.btn_Thur_12am));
        initWidthButtons((Button)findViewById(R.id.btn_Thur_1pm));
        initWidthButtons((Button)findViewById(R.id.btn_Thur_2pm));
        initWidthButtons((Button)findViewById(R.id.btn_Thur_3pm));
        initWidthButtons((Button)findViewById(R.id.btn_Thur_4pm));
        initWidthButtons((Button)findViewById(R.id.btn_Thur_5pm));
        initWidthButtons((Button)findViewById(R.id.btn_Thur_6pm));
        initWidthButtons((Button)findViewById(R.id.btn_Thur_7pm));
        initWidthButtons((Button)findViewById(R.id.btn_Thur_8pm));

        initWidthButtons((Button)findViewById(R.id.btn_tues_8am));
        initWidthButtons((Button)findViewById(R.id.btn_tues_9am));
        initWidthButtons((Button)findViewById(R.id.btn_tues_10am));
        initWidthButtons((Button)findViewById(R.id.btn_tues_11am));
        initWidthButtons((Button)findViewById(R.id.btn_tues_12am));
        initWidthButtons((Button)findViewById(R.id.btn_tues_1pm));
        initWidthButtons((Button)findViewById(R.id.btn_tues_2pm));
        initWidthButtons((Button)findViewById(R.id.btn_tues_3pm));
        initWidthButtons((Button)findViewById(R.id.btn_tues_4pm));
        initWidthButtons((Button)findViewById(R.id.btn_tues_5pm));
        initWidthButtons((Button)findViewById(R.id.btn_tues_6pm));
        initWidthButtons((Button)findViewById(R.id.btn_tues_7pm));
        initWidthButtons((Button)findViewById(R.id.btn_tues_8pm));

        initWidthButtons((Button)findViewById(R.id.btn_wed_8am));
        initWidthButtons((Button)findViewById(R.id.btn_wed_9am));
        initWidthButtons((Button)findViewById(R.id.btn_wed_10am));
        initWidthButtons((Button)findViewById(R.id.btn_wed_11am));
        initWidthButtons((Button)findViewById(R.id.btn_wed_12am));
        initWidthButtons((Button)findViewById(R.id.btn_wed_1pm));
        initWidthButtons((Button)findViewById(R.id.btn_wed_2pm));
        initWidthButtons((Button)findViewById(R.id.btn_wed_3pm));
        initWidthButtons((Button)findViewById(R.id.btn_wed_4pm));
        initWidthButtons((Button)findViewById(R.id.btn_wed_5pm));
        initWidthButtons((Button)findViewById(R.id.btn_wed_6pm));
        initWidthButtons((Button)findViewById(R.id.btn_wed_7pm));
        initWidthButtons((Button)findViewById(R.id.btn_wed_8pm));

        initWidthButtons((Button)findViewById(R.id.btn_fri_8am));
        initWidthButtons((Button)findViewById(R.id.btn_fri_9am));
        initWidthButtons((Button)findViewById(R.id.btn_fri_10am));
        initWidthButtons((Button)findViewById(R.id.btn_fri_11am));
        initWidthButtons((Button)findViewById(R.id.btn_fri_12am));
        initWidthButtons((Button)findViewById(R.id.btn_fri_1pm));
        initWidthButtons((Button)findViewById(R.id.btn_fri_2pm));
        initWidthButtons((Button)findViewById(R.id.btn_fri_3pm));
        initWidthButtons((Button)findViewById(R.id.btn_fri_4pm));
        initWidthButtons((Button)findViewById(R.id.btn_fri_5pm));
        initWidthButtons((Button)findViewById(R.id.btn_fri_6pm));
        initWidthButtons((Button)findViewById(R.id.btn_fri_7pm));
        initWidthButtons((Button)findViewById(R.id.btn_fri_8pm));

        initWidthButtons((Button)findViewById(R.id.btn_sat_8am));
        initWidthButtons((Button)findViewById(R.id.btn_sat_9am));
        initWidthButtons((Button)findViewById(R.id.btn_sat_10am));
        initWidthButtons((Button)findViewById(R.id.btn_sat_11am));
        initWidthButtons((Button)findViewById(R.id.btn_sat_12am));
        initWidthButtons((Button)findViewById(R.id.btn_sat_1pm));
        initWidthButtons((Button)findViewById(R.id.btn_sat_2pm));
        initWidthButtons((Button)findViewById(R.id.btn_sat_3pm));
        initWidthButtons((Button)findViewById(R.id.btn_sat_4pm));
        initWidthButtons((Button)findViewById(R.id.btn_sat_5pm));
        initWidthButtons((Button)findViewById(R.id.btn_sat_6pm));
        initWidthButtons((Button)findViewById(R.id.btn_sat_7pm));
        initWidthButtons((Button)findViewById(R.id.btn_sat_8pm));

        initWidthButtons((Button)findViewById(R.id.btn_sun_8am));
        initWidthButtons((Button)findViewById(R.id.btn_sun_9am));
        initWidthButtons((Button)findViewById(R.id.btn_sun_10am));
        initWidthButtons((Button)findViewById(R.id.btn_sun_11am));
        initWidthButtons((Button)findViewById(R.id.btn_sun_12am));
        initWidthButtons((Button)findViewById(R.id.btn_sun_1pm));
        initWidthButtons((Button)findViewById(R.id.btn_sun_2pm));
        initWidthButtons((Button)findViewById(R.id.btn_sun_3pm));
        initWidthButtons((Button)findViewById(R.id.btn_sun_4pm));
        initWidthButtons((Button)findViewById(R.id.btn_sun_5pm));
        initWidthButtons((Button)findViewById(R.id.btn_sun_6pm));
        initWidthButtons((Button)findViewById(R.id.btn_sun_7pm));
        initWidthButtons((Button)findViewById(R.id.btn_sun_8pm));

        hsvSheduleTime.setOnTouchListener(handleTouch);

    }

    //Set the touch listener for handling a slow drag and release
    public final void onRightToLeftSwipe() {
       // hsvSheduleTime.pageScroll(FOCUS_LEFT);
        Log.i("MY","RightToLeftSwipe!");
    }

    public void onLeftToRightSwipe(){
        Log.i( "MY","LeftToRightSwipe!");
      //  hsvSheduleTime.pageScroll(FOCUS_RIGHT);
    }



    private View.OnTouchListener handleTouch = new View.OnTouchListener() {

        @Override
        public boolean onTouch(View v, MotionEvent event) {

            switch(event.getAction()){
                case MotionEvent.ACTION_DOWN: {
                    downX = event.getX();
                    downY = event.getY();
                    //   return true;
                }
                case MotionEvent.ACTION_UP: {
                    upX = event.getX();
                    upY = event.getY();

                    float deltaX = downX - upX;
                    float deltaY = downY - upY;

                    // swipe horizontal?
                    if(Math.abs(deltaX) > MIN_DISTANCE){
                        // left or right
                        if(deltaX < 0) { onLeftToRightSwipe(); return true; }
                        if(deltaX > 0) { onRightToLeftSwipe(); return true; }
                    } else {  }



                    // swipe vertical?

                    //     return true;
                }
            }
            return false;
        }

    };




    void initWidthButtons(Button btn) {

       // btn = (Button)findViewById(R.id.btn_wed_8am);
        android.widget.LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(screenWidth,BUTTON_WIDTH); // 60 is height you can set it as u need
        btn.setLayoutParams(lp);

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
         hsvSheduleTime.smoothScrollBy(scrollViewMonday.getLeft(), 0);
        //hsvSheduleTime.pageScroll(FOCUS_RIGHT);

    }

    public void tuesdayOnClick(View view) {
        setStyleFontRegular(linarLayoutDaysOfWeek);
        textViewTuesday.setTextAppearance(mycontext, R.style.boldfont);
        hsv.smoothScrollBy(-100, 0);
        hsvSheduleTime.smoothScrollBy(scrollViewTuesday.getLeft(), 0);

    }

    public void wednesdayOnClick(View view) {
        setStyleFontRegular(linarLayoutDaysOfWeek);
        textViewWednesday.setTextAppearance(mycontext, R.style.boldfont);
        hsv.smoothScrollBy(-100, 0);
        hsvSheduleTime.smoothScrollBy(scrollViewWednesday.getLeft(), 0);
    }

    public void thursdayOnClick(View view) {
        setStyleFontRegular(linarLayoutDaysOfWeek);
        textViewThursday.setTextAppearance(mycontext, R.style.boldfont);
        hsv.smoothScrollBy(100, 0);
        hsvSheduleTime.smoothScrollBy(scrollViewThursday.getLeft(), 0);
    }

    public void fridayOnClick(View view) {
        setStyleFontRegular(linarLayoutDaysOfWeek);
        textViewFriday.setTextAppearance(mycontext, R.style.boldfont);
        hsv.smoothScrollBy(100, 0);
        hsvSheduleTime.smoothScrollBy(scrollViewFriday.getLeft(), 0);
    }

    public void saturdayOnClick(View view) {
        setStyleFontRegular(linarLayoutDaysOfWeek);
        textViewSaturday.setTextAppearance(mycontext, R.style.boldfont);
        hsv.smoothScrollBy(100, 0);
        hsvSheduleTime.smoothScrollBy(scrollViewSaturday.getLeft(), 0);
    }

    public void sundayOnClick(View view) {
        setStyleFontRegular(linarLayoutDaysOfWeek);
        textViewSunday.setTextAppearance(mycontext, R.style.boldfont);
        hsv.smoothScrollBy(100, 0);
        hsvSheduleTime.smoothScrollBy(scrollViewSunday.getLeft(), 0);
    }

    public void btn_mon_8am_OnClick(View view) {
        // у меня должен быть аррэй где хроняться все кнопки нажатые или вреся все доступно
        //при нажатии на кнопку я проверяю весь аррэй каждый раз
        //и записываю самую первую и самую последнюю запись
        //
        //кнопка меняет цвет
        //становиться ражатой

    }
}
