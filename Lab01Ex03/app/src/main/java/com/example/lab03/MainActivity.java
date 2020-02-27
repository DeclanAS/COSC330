package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Lab01ex3");
    }

    public void onClick(View view) {
        // Grabbing the TextView.
        TextView text = (TextView) findViewById(R.id.textView);
        // Grabbing the current value of the text.
        String textVal = text.getText().toString();
        int value;
        value = Integer.parseInt(textVal);
        value++;
        // Increase the text value by 1, and setting the text to that value.
        text.setText("" + value);
    }
}
