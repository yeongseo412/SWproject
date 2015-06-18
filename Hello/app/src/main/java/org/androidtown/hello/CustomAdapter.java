package org.androidtown.hello;


import android.content.Context;

import android.view.LayoutInflater;

import android.view.View;

import android.view.View.OnClickListener;

import android.view.View.OnLongClickListener;

import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.Button;

import android.widget.EditText;

import android.widget.Toast;

import java.util.ArrayList;




public class CustomAdapter extends BaseAdapter {


    private ArrayList<String> m_List;


    public CustomAdapter() {

        m_List = new ArrayList<String>();

    }

    @Override

    public int getCount() {

        return m_List.size();
   
 }

    
@Override

    public Object getItem(int position) {

        return m_List.get(position);
   
 }

   
 @Override
    
public long getItemId(int position) {

        return position;
   
 }

    
@Override
    
public View getView(int position, View convertView, ViewGroup parent) {

        final int pos = position;

        final Context context = parent.getContext();

        EditText et_text = null;

        Button btn = null;

        CustomHolder holder = null;


      


        if (convertView == null) {

           
 LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            convertView = inflater.inflate(R.layout.activity_viewplan, parent, false);


           et_text = (EditText) convertView.findViewById(R.id.editplan);

            btn = (Button) convertView.findViewById(R.id.checkBtn);


          
holder = new CustomHolder();

            holder.m_EditText = et_text;

            holder.m_Btn = btn;

            convertView.setTag(holder);

        } 
       else {

            holder = (CustomHolder) convertView.getTag();

            et_text = holder.m_EditText;

            btn = holder.m_Btn;

        }


        et_text.setText(m_List.get(position));

       btn.setOnClickListener(new OnClickListener() {


            @Override

            public void onClick(View v) {
      
              Toast.makeText(context, m_List.get(pos), Toast.LENGTH_SHORT).show();

            }

        });


              convertView.setOnClickListener(new OnClickListener() {


            @Override

            public void onClick(View v) {

                  Toast.makeText(context, "리스트 클릭 : " + m_List.get(pos), Toast.LENGTH_SHORT).show();

            }

        });


        convertView.setOnLongClickListener(new OnLongClickListener() {


            @Override

            public boolean onLongClick(View v) {

                    Toast.makeText(context, "리스트 롱 클릭 : " + m_List.get(pos), Toast.LENGTH_SHORT).show();

                return true;

            }

        });


        return convertView;

    }


  
    public void add(String _msg) {

        m_List.add(_msg);

        notifyDataSetChanged();

    }


    
    public void remove(int _position) {

        m_List.remove(_position);

        notifyDataSetChanged();

    }

    private class CustomHolder {

        EditText m_EditText;

        Button m_Btn;

    }

}
