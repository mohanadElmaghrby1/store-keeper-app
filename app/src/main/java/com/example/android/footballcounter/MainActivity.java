package com.example.android.footballcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0 ;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    public void displayForTeamA(int score){
        TextView scoreA = (TextView) findViewById(R.id.team_a_score);
        scoreA.setText(String.valueOf(score));
    }

    public void addSixGoalToTeamA(View view){
        scoreA+=6;
        displayForTeamA(scoreA);
    }

    public void addThreeGoalToTeamA(View view){
        scoreA+=3;
        displayForTeamA(scoreA);
    }

    public void addTwoGoalToTeamA(View view){
        scoreA+=2;
        displayForTeamA(scoreA);
    }

    public void displayForTeamB(int score){
        TextView scoreB = (TextView) findViewById(R.id.team_b_score);
        scoreB.setText(String.valueOf(score));
    }

    public void addSixGoalToTeamB(View view){
        scoreB+=6;
        displayForTeamB(scoreB);
    }

    public void addThreeGoalToTeamB(View view){
        scoreB+=3;
        displayForTeamB(scoreB);
    }

    public void addTwoGoalToTeamB(View view){
        scoreB+=2;
        displayForTeamB(scoreB);
    }

    public void reset (View view){
        scoreA=0;
        scoreB=0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
