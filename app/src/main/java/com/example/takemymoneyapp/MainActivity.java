package com.example.takemymoneyapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button plusButton;
    private Button minusButton;
    private Button multipleButton;
    private Button divideButton;
    private TextView resultBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = (EditText) findViewById(R.id.operand1);
        operand2 = (EditText) findViewById(R.id.operand2);
        plusButton = (Button) findViewById(R.id.plus);
        minusButton = (Button) findViewById(R.id.minus);
        multipleButton = (Button) findViewById(R.id.multiple);
        divideButton = (Button) findViewById(R.id.divide);
        resultBox = (TextView) findViewById(R.id.result);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(operand1.getText().toString());
                double number2 = Double.parseDouble(operand2.getText().toString());

                resultBox.setText(Double.toString(number1 + number2));
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(operand1.getText().toString());
                double number2 = Double.parseDouble(operand2.getText().toString());

                resultBox.setText(Double.toString(number1 - number2));
            }
        });

        multipleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(operand1.getText().toString());
                double number2 = Double.parseDouble(operand2.getText().toString());

                resultBox.setText(Double.toString(number1 * number2));
            }
        });

        divideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(operand1.getText().toString());
                double number2 = Double.parseDouble(operand2.getText().toString());

                resultBox.setText(Double.toString(number1 / number2));
            }
        });


    }
}