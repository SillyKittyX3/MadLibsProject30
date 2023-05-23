package com.example.madlibsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText etFood;
    private EditText etBusiness;
    private EditText etBadPassword;
    private EditText etAmountOfMoney;
    private EditText etLocation;
    private EditText etShape;
    private EditText etColor;
    private EditText etAdjective;
    private EditText etVerb;
    private EditText etNoun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFood = findViewById(R.id.et_food);
        etBusiness = findViewById(R.id.et_business);
        etBadPassword = findViewById(R.id.et_badPassword);
        etAmountOfMoney = findViewById(R.id.et_amountOfMoney);
        etLocation = findViewById(R.id.et_location);
        etShape = findViewById(R.id.et_shape);
        etColor = findViewById(R.id.et_color);
        etAdjective = findViewById(R.id.et_adjective);
        etVerb = findViewById(R.id.et_verb);
        etNoun = findViewById(R.id.et_noun);

    }
}