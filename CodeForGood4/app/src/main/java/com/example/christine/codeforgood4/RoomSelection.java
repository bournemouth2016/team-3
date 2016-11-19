package com.example.christine.codeforgood4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class RoomSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_selection_screen);

        Intent intent = getIntent();

        populateListView();
        registerClickCallBack();

    }

    private void populateListView(){

        ListView list = (ListView) findViewById(R.id.listViewMain);

        String rooms[] = {"Auditorium 1", "Auditorium 2", "Room 1", "Room 2", "Bathroom 1", "Bathroom 2"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item, R.id.room, rooms);
        list.setAdapter(adapter);
    }
    private void registerClickCallBack(){
        ListView list = (ListView) findViewById(R.id.listViewMain);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id){
                TextView textView = (TextView) viewClicked;
                String message = "You clicked # " + position + ", which is string: " + textView.getText().toString();
                Toast.makeText(RoomSelection.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }

}
