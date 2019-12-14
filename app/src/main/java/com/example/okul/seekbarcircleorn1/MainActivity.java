package com.example.okul.seekbarcircleorn1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import me.angrybyte.circularslider.CircularSlider;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CircularSlider slidersicaklik=(CircularSlider)findViewById(R.id.circular);
        final TextView sicdeger=(TextView) findViewById(R.id.sicgoster);
        slidersicaklik.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {


                sicdeger.setText("merhaba");
                return false;
            }
        });

    }
}
