package com.example.kevin.beaconwarning;

import android.os.Bundle;
import android.os.Vibrator;
import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by kevin on 18/11/2016.
 */

public class BeaconLocation extends Activity {
    Vibrator mVibrator;
    Button vib1;
    Button vib2;
    Button vib3;
    Button vib4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beacon_location);
        // Find button 1
        vib1 = (Button) findViewById(R.id.wall);
        vib2 = (Button) findViewById(R.id.doorway);
        vib3 = (Button) findViewById(R.id.stairs);
        vib4 = (Button) findViewById(R.id.emergencyExit);

        mVibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        // Click Listener for button1
        vib1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               // vib1.setText("vibyes");

                // Vibrates for 3000 Milliseconds

                   mVibrator.vibrate(3000);

            }
        });
        vib2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                long[] pattern = {0, 100, 1000, 300, 200, 100, 500, 200, 100};

                if (mVibrator.hasVibrator()) {
                    vib2.setText("vib, yes");
                    mVibrator.vibrate(pattern, -1);
                }
                else {
                    vib2.setText("vib, no");
                }


            }
        });
        vib3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                long[] pattern = {0, 500, 1500};

                if (mVibrator.hasVibrator()) {
                    vib3.setText("vib, yes");
                    mVibrator.vibrate(pattern, -1);
                } else {
                    vib3.setText("vib, no");
                }
            }
        });
        vib4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                long[] pattern = {0, 500, 1500300, 200, 100};

                if (mVibrator.hasVibrator()) {
                    vib4.setText("vib, yes");
                    mVibrator.vibrate(pattern, -1);
                } else {
                    vib4.setText("vib, no");
                }
            }
        });


    }



}

