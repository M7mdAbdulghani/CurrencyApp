package com.example.mohamedabdulghani.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ConvertCurrency(View view){
        EditText amountTextView = findViewById(R.id.amountTextView);
        String textValue = amountTextView.getText().toString();
        double number = Double.parseDouble(textValue);

        double newNumber = number * 3.75;

        Toast.makeText(this, String.format("%.2f",newNumber) + " SR", Toast.LENGTH_SHORT).show();

    }
}
