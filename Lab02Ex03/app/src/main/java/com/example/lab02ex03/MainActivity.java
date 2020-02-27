package com.example.lab02ex03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    private TextView tv, tv2;
    private EditText et;
    private double ounces = 0.00;
    private double added_charge = 0.00;
    private double price = 0.00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Package Weight APP");

        tv = (TextView) this.findViewById(R.id.textView9);
        tv2 = (TextView) this.findViewById(R.id.textView10);
        et = (EditText) this.findViewById(R.id.editText);

        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                try {
                    String strVal = et.getText().toString();
                    ounces = Double.parseDouble(strVal);
                } catch (NumberFormatException e){
                    ounces = 0.00;
                }

                if(ounces <= 0){
                    price = 0.00;
                } else if(ounces > 16) {
                    added_charge = Math.ceil((ounces - 16.00)/4.0) * 0.50;
                    price = 3.00 + added_charge;
                }

                tv.setText("$" + added_charge + "0");
                tv2.setText("$" + price + "0");
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
