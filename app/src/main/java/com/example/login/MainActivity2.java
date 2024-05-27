package com.example.login;
import android.os.Bundle;
import android.view.View;


import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private EditText editTextWeight, editTextUnits;
    private Button buttonCalculate;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Find views by their IDs
        editTextWeight = findViewById(R.id.editTextWeight);
        editTextUnits = findViewById(R.id.editTextUnits);
        buttonCalculate = findViewById(R.id.buttonCalculate);
        textViewResult = findViewById(R.id.textViewResult);

        // Set OnClickListener for the Calculate button
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the weight entered by the user
                double weight = Double.parseDouble(editTextWeight.getText().toString());

                // Get the units entered by the user
                int units = Integer.parseInt(editTextUnits.getText().toString());

                // Calculate the estimated blood volume donated
                double bloodVolume = calculateBloodVolume(weight, units);

                // Display the result in the TextView
                textViewResult.setText("Estimated blood volume donated:                                " + bloodVolume + " ml");
            }
        });
    }

    // Method to calculate estimated blood volume donated
    private double calculateBloodVolume(double weight, int units) {
        // Formula for estimated blood volume donated (ml)
        // Change this formula based on your requirements
        return weight * units * 10;
    }
}
