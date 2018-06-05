package com.mcdennylucaz.ScoreKeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int cornera = 0;
    int cornerb = 0;
    int kicka = 0;
    int kickb = 0;
    int penaltya = 0;
    int penaltyb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Team A
     **/

    /* Displays the given score for Team A.*/
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /*Adding one goal to team A*/
    public void addOneGoalTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /*Adding 1 corner kick to team A*/
    public void addOneCornerTeamA(View view) {
        cornera += 1;
        displayCornerForTeamA(cornera);
    }

    /* Displays the corners for Team A.*/
    public void displayCornerForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cornera);
        scoreView.setText(String.valueOf(score));
    }

    /*Adding 1 free kick to team A*/
    public void addOneKickTeamA(View view) {
        kicka += 1;
        displayKickForTeamA(kicka);
    }

    /* Displays the free kicks for Team A.*/
    public void displayKickForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.freekicka);
        scoreView.setText(String.valueOf(score));
    }

    /*Adding 1 free kick to team A*/
    public void addOnePenaltyA(View view) {
        penaltya += 1;
        displayPenaltyTeamA(penaltya);
    }

    /* Displays the penalty for Team A.*/
    public void displayPenaltyTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penaltya);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Team B
     **/

    /* Displays the given score for Team B.*/
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /*Adding one goal to team A*/
    public void addOneGoalTeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /*Adding 1 corner kick to team B*/
    public void addOneCornerTeamB(View view) {
        cornerb += 1;
        displayCornerForTeamB(cornerb);
    }

    /* Displays the corners for Team A.*/
    public void displayCornerForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cornerb);
        scoreView.setText(String.valueOf(score));
    }

    /*Adding 1 free kick to team A*/
    public void addOneKickTeamB(View view) {
        kickb += 1;
        displayKickForTeamB(kickb);
    }

    /* Displays the free kicks for Team B.*/
    public void displayKickForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.freekickb);
        scoreView.setText(String.valueOf(score));
    }

    /*Adding 1 free kick to team B*/
    public void addOnePenaltyB(View view) {
        penaltyb += 1;
        displayPenaltyTeamB(penaltyb);
    }

    /* Displays the penalty for Team B.*/
    public void displayPenaltyTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.penaltyb);
        scoreView.setText(String.valueOf(score));
    }

    public void resetButton(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
         cornera = 0;
        cornerb = 0;
        kicka = 0;
        kickb = 0;
        penaltya = 0;
         penaltyb = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayCornerForTeamA(cornera);
        displayCornerForTeamB(cornerb);
        displayKickForTeamA(kicka);
        displayKickForTeamB(kickb);
        displayPenaltyTeamA(penaltya);
        displayPenaltyTeamB(penaltyb);
    }
}
