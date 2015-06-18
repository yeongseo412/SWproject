package org.androidtown.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Planner extends Activity {

    private ListView m_Listview;
    private CustomAdapter m_Adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);

        m_Adapter = new CustomAdapter();

        m_Listview = (ListView) findViewById(R.id.listView);
        m_Listview.setAdapter(m_Adapter);

        m_Listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), m_Adapter.getItem(position) + "", Toast.LENGTH_SHORT).show();
                m_Adapter.remove(position);
            }
        });
        for (int i = 0; i < 10; i++)
            m_Adapter.add(i + 1 + "번째 테스트");

    }


}