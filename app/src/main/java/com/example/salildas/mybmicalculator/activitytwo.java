package com.example.salildas.mybmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class activitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitytwo);
    }

    public void calcbmi(View view) {
        double height = 0;
        double weight = 0;
        double bmi = 0;
        String msg = "";


        EditText et1 = (EditText) findViewById(R.id.editText1);
        EditText et2 = (EditText) findViewById(R.id.editText2);

        Button b1 = (Button) findViewById(R.id.button2);

        TextView t1 = (TextView) findViewById(R.id.newText1);
        TextView t2 = (TextView) findViewById(R.id.newText2);

        if (et1.getText().toString().equals("") && et2.getText().toString().equals("")) {
            Toast.makeText(activitytwo.this, "Please Enter Height and Weight", Toast.LENGTH_LONG).show();
        } else if (et1.getText().toString().equals("")) {
            Toast.makeText(activitytwo.this, "Please Enter Weight", Toast.LENGTH_SHORT).show();
        } else if (et2.getText().toString().equals("")) {
            Toast.makeText(activitytwo.this, "Please Enter Height", Toast.LENGTH_SHORT).show();
        } else {

            weight = Double.parseDouble(et1.getText().toString());
            height = Double.parseDouble(et2.getText().toString());


            bmi = height * height;
            bmi = weight / bmi;

            t1.setText(String.valueOf(bmi));

            if (bmi < 16.5) {

                msg = "Underweight";

            } else if (bmi > 16.5 && bmi < 25) {

                msg = "Normal";

            } else if (bmi > 25) {

                msg = "Overweight";

            }

            t2.setText(msg);
        }
    }
}
