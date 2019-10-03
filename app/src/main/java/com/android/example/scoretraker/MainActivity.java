package com.android.example.scoretraker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * add 3 to team A score
     */
    public void addThreeA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }


    /**
     * add 2 to team A score
     */
    public void addTwoA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }


    /**
     * add 1 to team A score
     */
    public void addOneA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * add 3 to team B score
     */
    public void addThreeB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }


    /**
     * add 2 to team B score
     */
    public void addTwoB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }


    /**
     * add 1 to team B score
     */
    public void addOneB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * reset scores
     */
    public void resetButton(View view){
        scoreTeamB = 0;
        scoreTeamA = 0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
}
