package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class puzzleIntro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_intro);
    }

    public void startPuzzleProblem(View view) {
        Intent intent = new Intent(this, puzzleSolve.class);
        startActivity(intent);
    }
}