package com.example.lab03ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.lab03ex02.R.raw.never_gonna_give_you_up;

public class MainActivity extends AppCompatActivity {

    private Button Play;
    private Button Stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Music Player");

        final MediaPlayer rick_astley = MediaPlayer.create(this, never_gonna_give_you_up);

        Play = (Button) findViewById(R.id.button);
        Stop = (Button) findViewById(R.id.button2);

        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rick_astley.start();
            }
        });

        Stop.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    rick_astley.pause();
            }
        });
    }
}
