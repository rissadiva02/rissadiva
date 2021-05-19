package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight, height;
    TextView result;
    String calculate, BMIresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weight = findViewById(R.id.weight);
        height = findViewById(R.id.height);
        result = findViewById(R.id.result);
    }
    public void calculateBMI(View view){
        String B1 = weight.getText().toString();
        String B2 = height.getText().toString();

        float weight = Float.parseFloat(B1);
        float height = Float.parseFloat(B2) / 100;

        float bmi = weight / (height * height);

        if (bmi < 16){
            BMIresult = " Severely Under Weight";
        }else if(bmi <18.5){
            BMIresult = "Under Weight";
        }else if(bmi >= 18.5 && bmi <= 24.9){
            BMIresult = "Normal Weight";
        }else {
            BMIresult = "Obese";
        }

        calculate = "Result:\n\n" + bmi + "\n"  + BMIresult;
        result.setText(calculate);




    }

}