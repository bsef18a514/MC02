package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickConvert(View v)
    {
        EditText unit = (EditText) findViewById(R.id.text1);
        String temp = unit.getText().toString();

        Double unitincenti = Double.parseDouble(temp);

        Double unitinmeter = unitincenti/100;
        //String toasttext = "= " + unitinmeter.toString() + " m";
        //Toast.makeText(context:this, toasttext,Toast.LENGTH_LONG).show();
        //Toast.makeText(contextthis, toasttext, Toast.LENGTH_SHORT).show();

        final TextView fresult;

        fresult = (TextView) findViewById(R.id.result);
        fresult.setText(String.valueOf(unitinmeter));
        fresult.setTextColor(Color.CYAN);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}