package com.example.madlibsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondaryActivity extends AppCompatActivity {

    private TextView tvStory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        tvStory = findViewById(R.id.tv_story);

        Intent intent = getIntent();

        String story = intent.getStringExtra("story");

        tvStory.setText("story");
 }
}

