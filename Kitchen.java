package org.androidtown.hello;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;


public class Kitchen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitchen);
    }

    public void onBackButtonClicked(View v) {
        Toast.makeText(getApplicationContext(), "돌아가기 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();
        finish();
    }

    public void onRefButtonClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), Refrigerator.class);
        startActivity(intent);
    }

    public void onCalButtonClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), Cal.class);
        startActivity(intent);
    }

    /*
    public void onCalButtonClicked(View v) {
        Intent intent = new Intent(getApplicationContext(), Kitchen.class);
        startActivity(intent);
    }
    */
}
