package com.example.lab03ex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String createMsg = "onCreate()";
    private String startMsg = "onStart()";
    private String resumeMsg = "onResume()";
    private String pauseMsg = "onPause()";
    private String stopMsg = "onStop()";
    private String restartMsg = "onRestart()";
    private String destroyMsg = "onDestroy()";
    private String Msg = "Activity Callbacks: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, createMsg, Toast.LENGTH_LONG).show();
        Log.v(Msg, createMsg);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, startMsg, Toast.LENGTH_LONG).show();
        Log.v(Msg, startMsg);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, resumeMsg, Toast.LENGTH_LONG).show();
        Log.v(Msg, resumeMsg);
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, pauseMsg, Toast.LENGTH_LONG).show();
        Log.v(Msg, pauseMsg);
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, stopMsg, Toast.LENGTH_LONG).show();
        Log.v(Msg, stopMsg);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, restartMsg, Toast.LENGTH_LONG).show();
        Log.v(Msg, restartMsg);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, destroyMsg, Toast.LENGTH_LONG).show();
        Log.v(Msg, destroyMsg);
    }
}
