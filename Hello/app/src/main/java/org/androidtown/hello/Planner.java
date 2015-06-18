package org.androidtown.hello;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

/**
 * Created by multimedia on 2015-06-17.
 */
public class Planner extends ActionBarActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);
        listView = (ListView) findViewById(R.id.listView);

        ImageManager.instance.setImageNum(123123);
    }


}
