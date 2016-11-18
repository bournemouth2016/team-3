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

public class PhoneVibration extends AppCompatActivity {
    Vibrator mVibrator;
    Button vib1;
    TextView vib2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beacon_location);
        // Find button 1
        vib1 = (Button) findViewById(R.id.vibration);
        vib2 = (TextView) findViewById(R.id.text1);
        mVibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        if(mVibrator.hasVibrator()) {
            vib1.setText("vibyes");
            Log.v("cCan Vibrate", "YES");
        }
        else {
            vib1.setText("vibno");
            Log.v("cCan Vibrate", "NO");
        }
        // Click Listener for button1
       vib1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                vib1.setText("vibyes");

               // Vibrates for 300 Milliseconds
               mVibrator.vibrate(3000);

                }
            });
    }

}
