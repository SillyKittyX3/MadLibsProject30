package com.example.madlibsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SecondaryActivity extends AppCompatActivity {

    private Button btnNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        btnNextPage = findViewById(R.id.btn_nextpage);

        Intent secondActivity = new Intent( MainActivity.this, SecondaryActivity.class);
 }
}

