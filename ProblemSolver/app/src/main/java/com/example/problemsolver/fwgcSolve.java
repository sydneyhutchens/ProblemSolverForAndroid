package com.example.problemsolver;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.problemsolver.domains.farmer.FarmerProblem;
import com.example.problemsolver.framework.problem.State;
import com.example.problemsolver.framework.solution.AStarSolver;
import com.example.problemsolver.framework.solution.Solution;
import com.example.problemsolver.framework.solution.Solver;
import com.example.problemsolver.framework.solution.SolvingAssistant;


public class fwgcSolve extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fwgc_solve);

        Intent intent = getIntent();
        problem = new FarmerProblem();
        solver = new SolvingAssistant(problem);
        stepSolver = new AStarSolver(problem);

        TextView textView = findViewById(R.id.stateTextView);
        textView.setText(" " + problem.getCurrentState().toString());
        Button next = findViewById(R.id.nextButton);
        next.setEnabled(false);
        TextView moveCount = findViewById(R.id.moveCountNum);
        moveCount.setText(" " +solver.getMoveCount());
        TextView congrats = findViewById(R.id.congratsMessage);
        congrats.setVisibility(View.GONE);
        TextView illegal = findViewById(R.id.illegalMove);
        illegal.setVisibility(View.GONE);

    }

    public void farmerGoesAlone(View view) {
        solver.tryMove("Farmer Goes Alone");
        if(!solver.isMoveLegal()) {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.VISIBLE);
        }
        else {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.GONE);
        }
        TextView textView = findViewById(R.id.stateTextView);
        textView.setText(" " + problem.getCurrentState().toString());
        TextView moveCount = findViewById(R.id.moveCountNum);
        moveCount.setText(" " + solver.getMoveCount());

        if(solver.isProblemSolved()) {
            TextView congrats = findViewById(R.id.congratsMessage);
            congrats.setVisibility(View.VISIBLE);
        }

    }

    public void farmerTakesWolf(View view) {
        solver.tryMove("Farmer Takes Wolf");
        if(!solver.isMoveLegal()) {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.VISIBLE);
        }
        else {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.GONE);
        }
        TextView textView = findViewById(R.id.stateTextView);
        textView.setText(" " + problem.getCurrentState().toString());
        TextView moveCount = findViewById(R.id.moveCountNum);
        moveCount.setText(" " +solver.getMoveCount());

        if(solver.isProblemSolved()) {
            TextView congrats = findViewById(R.id.congratsMessage);
            congrats.setVisibility(View.VISIBLE);
        }


    }

    public void farmerTakesGoat(View view) {
        solver.tryMove("Farmer Takes Goat");
        if(!solver.isMoveLegal()) {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.VISIBLE);
        }
        else {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.GONE);
        }
        TextView textView = findViewById(R.id.stateTextView);
        textView.setText(" " + problem.getCurrentState().toString());
        TextView moveCount = findViewById(R.id.moveCountNum);
        moveCount.setText(" " + solver.getMoveCount());

        if(solver.isProblemSolved()) {
            TextView congrats = findViewById(R.id.congratsMessage);
            congrats.setVisibility(View.VISIBLE);
        }

    }

    public void farmerTakesCabbage(View view) {
        solver.tryMove("Farmer Takes Cabbage");
        if(!solver.isMoveLegal()) {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.VISIBLE);
        }
        else {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.GONE);
        }
        TextView textView = findViewById(R.id.stateTextView);
        textView.setText(" "  + problem.getCurrentState().toString());
        TextView moveCount = findViewById(R.id.moveCountNum);
        moveCount.setText(" " + solver.getMoveCount());

        if(solver.isProblemSolved()) {
            TextView congrats = findViewById(R.id.congratsMessage);
            congrats.setVisibility(View.VISIBLE);
        }

    }

    public void resetProblem(View view) {
        solver.reset();
        Button solveButton = findViewById(R.id.solveButton);
        solveButton.setEnabled(true);
        Button nextButton = findViewById(R.id.nextButton);
        nextButton.setEnabled(false);
        TextView textView = findViewById(R.id.stateTextView);
        textView.setText(" " + problem.getCurrentState().toString());
        TextView statistics = findViewById(R.id.statisticsText);
        statistics.setText("");
        Button farmerButton = findViewById(R.id.farmerButton);
        farmerButton.setEnabled(true);
        Button wolfButton = findViewById(R.id.wolfButton);
        wolfButton.setEnabled(true);
        Button goatButton = findViewById(R.id.goatButton);
        goatButton.setEnabled(true);
        Button cabbageButton = findViewById(R.id.cabbageButton);
        cabbageButton.setEnabled(true);
        TextView moveCount = findViewById(R.id.moveCountNum);
        moveCount.setText(" " + solver.getMoveCount());
        TextView congrats = findViewById(R.id.congratsMessage);
        congrats.setVisibility(View.GONE);
        TextView illegal = findViewById(R.id.illegalMove);
        illegal.setVisibility(View.GONE);
    }

    public void solveProblem(View view) {
        Button solveButton = findViewById(R.id.solveButton);
        solveButton.setEnabled(false);
        stepSolver.solve();
        solution = stepSolver.getSolution();
        solution.next();
        TextView textView = findViewById(R.id.statisticsText);
        textView.setText(" " + stepSolver.getStatistics().toString());
        Button farmerButton = findViewById(R.id.farmerButton);
        farmerButton.setEnabled(false);
        Button wolfButton = findViewById(R.id.wolfButton);
        wolfButton.setEnabled(false);
        Button goatButton = findViewById(R.id.goatButton);
        goatButton.setEnabled(false);
        Button cabbageButton = findViewById(R.id.cabbageButton);
        cabbageButton.setEnabled(false);
        Button next = findViewById(R.id.nextButton);
        next.setEnabled(true);
    }

    public void nextMove(View view) {
        solver.update((State)solution.next().getData());
        TextView textView = findViewById(R.id.stateTextView);
        textView.setText(" " + problem.getCurrentState().toString());
        TextView moveCount = findViewById(R.id.moveCountNum);
        moveCount.setText(" " + solver.getMoveCount());
        if (solver.isProblemSolved()) {
            TextView congrats = findViewById(R.id.congratsMessage);
            congrats.setVisibility(View.VISIBLE);
            Button next = findViewById(R.id.nextButton);
            next.setEnabled(false);
        }
    }

    private FarmerProblem problem;
    private SolvingAssistant solver;
    private Solver stepSolver;
    private Solution solution;
}