package com.example.christine.codeforgood4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class GenderSelection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gender_selection_screen);

        Button next = (Button) findViewById(R.id.maleChoice);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), AssisstanceSelection.class);
                startActivityForResult(myIntent, 0);
            }

        });
         next = (Button) findViewById(R.id.femaleChoice);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), AssisstanceSelection.class);
                startActivityForResult(myIntent, 0);
            }

        });
    }

}
