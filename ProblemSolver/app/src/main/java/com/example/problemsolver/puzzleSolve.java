package com.example.problemsolver;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

import com.example.problemsolver.domains.puzzle.PuzzleProblem;
import com.example.problemsolver.framework.problem.State;
import com.example.problemsolver.framework.solution.AStarSolver;
import com.example.problemsolver.framework.solution.Solution;
import com.example.problemsolver.framework.solution.Solver;
import com.example.problemsolver.framework.solution.SolvingAssistant;

public class puzzleSolve extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puzzle_solve);

        Intent intent = getIntent();
        problem = new PuzzleProblem();
        solver = new SolvingAssistant(problem);
        stepSolver = new AStarSolver(problem);

        TextView textView = findViewById(R.id.stateTextView);
        textView.setText(" " + problem.getCurrentState().toString());
        Button next = findViewById(R.id.nextButton);
        next.setEnabled(false);
        TextView moveCount = findViewById(R.id.moveCountNum);
        moveCount.setText(" " + solver.getMoveCount());
        TextView congrats = findViewById(R.id.congratsMessage);
        congrats.setVisibility(View.GONE);
        TextView illegal = findViewById(R.id.illegalMove);
        illegal.setVisibility(View.GONE);
    }

    public void slideTile1(View view) {
        solver.tryMove("Slide Tile 1");
        if (!solver.isMoveLegal()) {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.VISIBLE);
        } else {
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

    public void slideTile2(View view) {
        solver.tryMove("Slide Tile 2");
        if (!solver.isMoveLegal()) {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.VISIBLE);
        } else {
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

    public void slideTile3(View view) {
        solver.tryMove("Slide Tile 3");
        if (!solver.isMoveLegal()) {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.VISIBLE);
        } else {
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

    public void slideTile4(View view) {
        solver.tryMove("Slide Tile 4");
        if (!solver.isMoveLegal()) {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.VISIBLE);
        } else {
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

    public void slideTile5(View view) {
        solver.tryMove("Slide Tile 5");
        if (!solver.isMoveLegal()) {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.VISIBLE);
        } else {
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

    public void slideTile6(View view) {
        solver.tryMove("Slide Tile 6");
        if (!solver.isMoveLegal()) {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.VISIBLE);
        } else {
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

    public void slideTile7(View view) {
        solver.tryMove("Slide Tile 7");
        if (!solver.isMoveLegal()) {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.VISIBLE);
        } else {
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

    public void slideTile8(View view) {
        solver.tryMove("Slide Tile 8");
        if(!solver.isMoveLegal()) {
            TextView illegal = findViewById(R.id.illegalMove);
            illegal.setVisibility(View.VISIBLE);
        } else {
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


    public void reset(View view) {
        solver.reset();
        Button solveButton = findViewById(R.id.solveButton);
        solveButton.setEnabled(true);
        Button nextButton = findViewById(R.id.nextButton);
        nextButton.setEnabled(false);
        TextView textView = findViewById(R.id.stateTextView);
        textView.setText(" " + problem.getCurrentState().toString());
        TextView statistics = findViewById(R.id.statisticsText);
        statistics.setText("");

        Button slide1 = findViewById(R.id.tile1);
        slide1.setEnabled(true);
        Button slide2 = findViewById(R.id.tile2);
        slide2.setEnabled(true);
        Button slide3 = findViewById(R.id.tile3);
        slide3.setEnabled(true);
        Button slide4 = findViewById(R.id.tile4);
        slide4.setEnabled(true);
        Button slide5 = findViewById(R.id.tile5);
        slide5.setEnabled(true);
        Button slide6 = findViewById(R.id.tile6);
        slide6.setEnabled(true);
        Button slide7 = findViewById(R.id.tile7);
        slide7.setEnabled(true);
        Button slide8 = findViewById(R.id.tile8);
        slide8.setEnabled(true);
        TextView moveCount = findViewById(R.id.moveCountNum);
        moveCount.setText(" " + solver.getMoveCount());
        TextView congrats = findViewById(R.id.congratsMessage);
        congrats.setVisibility(View.GONE);
        TextView illegal = findViewById(R.id.illegalMove);
        illegal.setVisibility(View.GONE);

    }

    public void solve(View view) {
            Button solveButton = findViewById(R.id.solveButton);
            solveButton.setEnabled(false);
            stepSolver.solve();
            solution = stepSolver.getSolution();
            solution.next();
            TextView statistics = findViewById(R.id.stateTextView);
            statistics.setText(" " + stepSolver.getStatistics().toString());
            Button slide1 = findViewById(R.id.tile1);
            slide1.setEnabled(false);
            Button slide2 = findViewById(R.id.tile2);
            slide2.setEnabled(false);
            Button slide3 = findViewById(R.id.tile3);
            slide3.setEnabled(false);
            Button slide4 = findViewById(R.id.tile4);
            slide4.setEnabled(false);
            Button slide5 = findViewById(R.id.tile5);
            slide5.setEnabled(false);
            Button slide6 = findViewById(R.id.tile6);
            slide6.setEnabled(false);
            Button slide7 = findViewById(R.id.tile7);
            slide7.setEnabled(false);
            Button slide8 = findViewById(R.id.tile8);
            slide8.setEnabled(false);
            Button next = findViewById(R.id.nextButton);
            next.setEnabled(true);
        }

    public void nextState(View view) {
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

    private PuzzleProblem problem;
    private SolvingAssistant solver;
    private Solver stepSolver;
    private Solution solution;
}