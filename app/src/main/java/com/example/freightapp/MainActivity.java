package com.example.freightapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.freightapp.Adapters.GridViewAdapter;

public class MainActivity extends AppCompatActivity {

    GridView gridView ;
    String[] values = {"java" , "Css","Android Studio","Jqury"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.Grid_View);
        GridViewAdapter gridViewAdapter = new GridViewAdapter(this , values);
        gridView.setAdapter(gridViewAdapter);


    }
}
