package com.example.umdcsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityStudent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_student);

        final Button degreeTrackerButton = findViewById(R.id.degreeTrackerButton);
        final Button tutoringButton = findViewById(R.id.tutoringButton);
        final Button advisingButton = findViewById(R.id.advisingButton);
        final Button classReviewsButton = findViewById(R.id.classReviewsButton);

    }

}
