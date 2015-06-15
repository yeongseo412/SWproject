package org.androidtown.hello;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;


public class Cal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
    }


    public void onKitButton2Clicked(View v) {
        Intent intent = new Intent(getApplicationContext(), Kitchen.class);
        startActivity(intent);
    }

}
