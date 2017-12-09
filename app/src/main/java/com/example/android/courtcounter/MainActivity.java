package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(0);


    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreA);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_scoreB);
        scoreView.setText(String.valueOf(score));
        //hello
    }
    /**
     * Displays Reset the given score .
     */
    public void Reset(View v) {
        scoreTeamA=0;
        scoreTeamB=0;
        TextView scoreViewB = (TextView) findViewById(R.id.team_a_scoreB);
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_scoreA);
        scoreViewA.setText(String.valueOf(0));
        scoreViewB.setText(String.valueOf(0));
    }
    public void Add2A(View v){
        scoreTeamA=scoreTeamA+2;
        displayForTeamA(scoreTeamA);

    }
    public void Add3A(View v){
        scoreTeamA=scoreTeamA+3;
        displayForTeamA(scoreTeamA);

    } public void FreeA(View v){
        scoreTeamA=scoreTeamA+1;
        displayForTeamA(scoreTeamA);

    }
    public void Add2B(View v){
        scoreTeamB=scoreTeamB+2;
        displayForTeamB(scoreTeamB);

    }
    public void Add3B(View v){
        scoreTeamB=scoreTeamB+3;
        displayForTeamB(scoreTeamB);

    } public void FreeB(View v){
        scoreTeamB=scoreTeamB+1;
        displayForTeamB(scoreTeamB);

    }
}
