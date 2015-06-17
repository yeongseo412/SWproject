package org.androidtown.hello;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;


public class Cal extends ActionBarActivity {

    CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        calendarView = (CalendarView) findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {

                Toast.makeText(getApplicationContext(),year+"년"+month+"월"+dayOfMonth+"일",0).show();

            }
        });
    }

    public void onKitButtonClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), Kitchen.class);
        startActivity(intent);
    }


}
