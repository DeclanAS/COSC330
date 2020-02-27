package com.example.lab02ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int globalnum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void give_cookie(View view) {
        if(globalnum == 0) {
            ImageView image = (ImageView) findViewById(R.id.imageView);
            TextView textbox = (TextView) findViewById(R.id.textView);
            TextView textbox2 = (TextView) findViewById(R.id.textView2);
            Button butt = (Button) findViewById(R.id.button);
            butt.setText("Take away cookie");
            textbox.setText("Thank you for cookie!");
            textbox2.setText("Baby Yoda: I'm full.");
            image.setImageResource(R.drawable.newhappyyoda);
            globalnum = 1;
        } else if (globalnum == 1) {
            ImageView image = (ImageView) findViewById(R.id.imageView);
            TextView textbox = (TextView) findViewById(R.id.textView);
            TextView textbox2 = (TextView) findViewById(R.id.textView2);
            Button butt = (Button) findViewById(R.id.button);
            butt.setText("Give cookie");
            textbox.setText("Please give cookie.");
            textbox2.setText("Baby Yoda: I'm Hungry");
            image.setImageResource(R.drawable.babyyoda);
            globalnum = 0;
        }
    }
}
