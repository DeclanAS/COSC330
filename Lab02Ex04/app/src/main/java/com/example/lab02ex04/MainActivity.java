package com.example.lab02ex04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int patty = 0;
    private int cheese = 0;
    private int prosciutto = 0;
    private int sause = 0;

    private RadioGroup PattyRg;
    private CheckBox prosciuttoCb;
    private RadioGroup cheeseRg;
    private SeekBar caviarSb;
    private TextView totalTv;

    // Beef patty = 204 calories.
    // Lamb patty = 210 calories.
    // Ostrich patty = 130 calories.

    // Prosciutto = 100 calories.
    // Asiago Cheese (1oz) = 110 calories.
    // Creme Fraiche = 90 calories.
    // Caviar = 0 -> 12 calories.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Bob's Burger Calorie App");

        PattyRg = (RadioGroup) findViewById(R.id.radioGroup);
        prosciuttoCb = (CheckBox) findViewById(R.id.checkBox);
        cheeseRg = (RadioGroup) findViewById(R.id.radioGroup2);
        caviarSb = (SeekBar) findViewById(R.id.seekBar);
        totalTv = (TextView) findViewById(R.id.textView3);

        PattyRg.setOnCheckedChangeListener(rgListener);
        prosciuttoCb.setOnClickListener(hamlistener);
        cheeseRg.setOnCheckedChangeListener(rgListener);
        caviarSb.setOnSeekBarChangeListener(sklistener);
    }

    private RadioGroup.OnCheckedChangeListener rgListener = new RadioGroup.OnCheckedChangeListener(){
        public void onCheckedChanged(RadioGroup rg1, int radioID){
            switch(radioID){
                case 0x7f07007e: // Beef radioButton1
                    patty = 205;
                    break;
                case 0x7f07007f: // Lamb radioButton2
                    patty = 210;
                    break;
                case 0x7f070080: // Ostrich radioButton3
                    patty = 130;
                    break;
                case 0x7f070081: // Asiago radioButton4
                    cheese = 110;
                    break;
                case 0x7f070082: // Creme radioButton5
                    cheese = 90;
                    break;
            }
            updateCalories();
        }
    };

    private View.OnClickListener hamlistener = new View.OnClickListener() {
        public void onClick(View view){
            if(((CheckBox) view).isChecked()){
                prosciutto = 100;
            } else {
                prosciutto = 0;
            }
            updateCalories();
        }
    };

    private SeekBar.OnSeekBarChangeListener sklistener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            sause = caviarSb.getProgress()/5;
            updateCalories();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    };

    public void updateCalories(){
        totalTv.setText("Calories: " + getTotalCalories());
    }

    public int getTotalCalories(){
        return patty + cheese + prosciutto + sause;
    }

}
