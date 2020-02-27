package com.example.lab02ex02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View.OnClickListener;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    double price = 0.00;
    boolean chocolate;
    boolean cream;
    // $4.00 per cup
    // $1.00 (Chocolate) per cup
    // $0.50 (Whipped Cream) per cup

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Purchase Coffee");
    }

    // This function clears the bottom
    // coffee price summary.
    public void clearsummary(View view){
        TextView os = (TextView) findViewById(R.id.textView7);
        TextView summary = (TextView) findViewById(R.id.textView8);
        os.setVisibility(view.INVISIBLE);
        summary.setVisibility(view.INVISIBLE);
    }

    // This function is for the subtract button.
    public void subtract_quantity(View view) {
        clearsummary(view);
        TextView value = (TextView) findViewById(R.id.textView4);
        TextView maxmsg = (TextView) findViewById(R.id.textView5);
        String strVal = value.getText().toString();
        quantity = Integer.parseInt(strVal);
        // Keeps max-limit note hidden.
        if(quantity != 100){
            maxmsg.setVisibility(view.INVISIBLE);
        }
        // Prevents negative coffees.
        if(quantity == 0){
            quantity = 0;
        } else { // Subtracts quantity by one.
            quantity--;
            value.setText("" + quantity);
        }

        // Makes sure max-limit note stays hidden
        // when clicking the subtract button when
        // the quantity was already 100.
        if(quantity == 99){
            maxmsg.setVisibility(view.INVISIBLE);
        }
    }

    // This function is for the increase button.
    public void increase_quantity(View view) {
        clearsummary(view); // Clears summary.
        TextView maxmsg = (TextView) findViewById(R.id.textView5); // gets max-limit textview.
        TextView value = (TextView) findViewById(R.id.textView4); // gets quantity textview.

        String strVal = value.getText().toString(); // converts it to string then to integer.
        quantity = Integer.parseInt(strVal);

        // Two possible outcomes.
        if(quantity == 100){
            maxmsg.setVisibility(view.VISIBLE);
        } else {
            maxmsg.setVisibility(view.INVISIBLE);
            quantity++;
            value.setText("" + quantity);
        }
    }

    public void submitorder(View view) {
        // Finds a few Checkboxes and TextViews.
        CheckBox cb1 = (CheckBox) findViewById(R.id.checkBox1);
        CheckBox cb2 = (CheckBox) findViewById(R.id.checkBox2);
        TextView os = (TextView) findViewById(R.id.textView7);
        TextView summary = (TextView) findViewById(R.id.textView8);

        String cream = "No", chocolate = "No";
        double modifier = 0.00; // Modifier is the extra cost of chocolate and cream.

        if(cb1.isChecked()){
            cream = "Yes";
            modifier+= 0.50;
        }

        if(cb2.isChecked()) {
            chocolate = "Yes";
            modifier+=1.00;
        }

        price = (4.00 + modifier) * quantity; // Determines final price.

        // A mess of a format.
        if(quantity != 0) {
            summary.setText("Added whipped cream? \t\t" + cream + "\t\nAdded chocolate? \t\t\t\t\t\t\t\t" + chocolate + "\nQuantity: \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + quantity + "\t\n\nPrice: $" + price + "0\t\nTHANK YOU!");
        } else {
            summary.setText("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tNo Quantity Added!");
        }
        // Makes the two textviews visible.
        os.setVisibility(view.VISIBLE);
        summary.setVisibility(view.VISIBLE);
    }

    // Ensures that the summary disappears when the check boxes are clicked.
    public void checkboxclick(View view) {
        clearsummary(view);
    }
}
