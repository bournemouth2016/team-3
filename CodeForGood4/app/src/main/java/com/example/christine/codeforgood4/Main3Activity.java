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

import static android.R.attr.duration;
import static com.example.christine.codeforgood4.R.id.text;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

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
                Toast.makeText(Main3Activity.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }

}
