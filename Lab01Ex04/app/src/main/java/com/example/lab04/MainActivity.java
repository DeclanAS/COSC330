package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        // Setting the tag.
        final String TAG = MainActivity.class.getSimpleName();

        // Grabbing the TextView.
        TextView text = (TextView) findViewById(R.id.textView);
        // Grabbing the current value of the text.
        String textVal = text.getText().toString();
        int value;
        value = Integer.parseInt(textVal);
        value++;
        // Increase the text value by 1, and setting the text to that value.
        text.setText("" + value);

        // Logging.
        Log.i(TAG, "Button Clicked Declan S, " + value);
    }
}
