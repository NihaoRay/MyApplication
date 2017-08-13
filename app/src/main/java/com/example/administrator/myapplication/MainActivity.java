package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String [] strings = {"小学一年级", "小学", "小学", "小学", "小学", "小学", "小学", "小学","小学", "小学", "小学", "小学","小学", "小学"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  *//*ListView demoListView = (ListView) findViewById();*//*

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, strings );
*/
       /* demoListView.setAdapter(adapter);*/
    }

    


}
