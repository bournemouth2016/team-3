package com.example.christine.codeforgood4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AssisstanceSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.assisstance_selection_screen);

        Button next = (Button) findViewById(R.id.guideDogChoice);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), RoomSelection.class);
                startActivityForResult(myIntent, 0);
            }

        });
         next = (Button) findViewById(R.id.caneChoice);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), RoomSelection.class);
                startActivityForResult(myIntent, 0);
            }

        });

    }
}
