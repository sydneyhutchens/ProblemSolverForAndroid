package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fwgcIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fwgc_intro);
    }

    public void startFarmerProblem(View view) {
        Intent intent = new Intent(this, fwgcSolve.class);
        startActivity(intent);

    }
}