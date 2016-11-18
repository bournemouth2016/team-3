package com.example.kevin.beaconwarning;

        import android.os.Bundle;
        import android.os.Vibrator;
        import android.app.Activity;
        import android.content.Context;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
/**
 * Created by kevin on 18/11/2016.
 */

public class PhoneVibration extends Activity {
    Vibrator mVibrator;
    Button vib1;
    public void onCreate(Bundle savedInstanceState) {
        // Find button 1
        vib1 = (Button) findViewById(R.id.vibration);
        mVibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        // Click Listener for button1
       vib1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               // Vibrates for 300 Milliseconds
               mVibrator.vibrate(300);
                }
            });
    }

}
