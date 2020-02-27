package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle("Lab01Ex02");
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        // Grabs the TextView of the text box.
        String text = ((TextView) findViewById(R.id.textView2)).getText().toString();

        // Depending on the current text, it will set the text between Hello OR Goodbye.
        if(text.equals("Hello")){
            ((TextView) findViewById(R.id.textView2)).setText("Goodbye");
        } else if (text.equals("Goodbye")){
            ((TextView) findViewById(R.id.textView2)).setText("Hello");
        }
    }
}
