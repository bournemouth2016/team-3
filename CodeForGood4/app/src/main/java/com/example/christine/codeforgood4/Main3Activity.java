package com.example.christine.codeforgood4;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        populateListView();

        Intent intent = getIntent();
    }


    private void populateListView(){

        // Create list of items
        String rooms[] = {"Auditorium 1", "Auditorium 2", "Room 1", "Room 2", "Bathroom 1", "Bathroom 2"};
        // Build adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item, rooms);
        // Configure list view
        //ListView list = (ListView) findViewById(R.id.listViewMain);
        //list.setAdapter(adapter);
    }

}
