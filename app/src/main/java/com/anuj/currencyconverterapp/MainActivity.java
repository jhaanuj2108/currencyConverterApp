package com.anuj.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void currencyConverter(View view){
        EditText currencyConverterText = (EditText) findViewById(R.id.currencyConverterText);
        double convert = (Double.parseDouble(currencyConverterText.getText().toString())*1.6);
        convert = Math.round(convert*100.0)/100.0;
        Double.toString(convert);

        Toast.makeText(MainActivity.this, "Equivalent Nepali Rupee = NRP "+convert, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
