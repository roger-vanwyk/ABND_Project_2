package com.example.android.myscorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    final int TRY_POINTS = 5;
    final int TRY_CONVERSION_POINTS = 2;
    final int DROP_KICK_POINTS = 3;
    final int PENALTY_KICK_POINTS = 3;
    final int PENALTY_TRY_POINTS = 2;

    int team_a_score = 0;
    int team_b_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Score Updates
     */
    public void resetScores(View v) {
        team_a_score = 0;
        team_b_score = 0;
        displayTeamAScore(team_a_score);
        displayTeamBScore(team_b_score);
    }

    public void updateTeamScore(View v) {
        switch (v.getId()) {
            case R.id.team_a_try:
                team_a_score += TRY_POINTS;
                break;
            case R.id.team_a_try_conversion:
                team_a_score += TRY_CONVERSION_POINTS;
                break;
            case R.id.team_a_drop_kick:
                team_a_score += DROP_KICK_POINTS;
                break;
            case R.id.team_a_penalty_kick:
                team_a_score += PENALTY_KICK_POINTS;
                break;
            case R.id.team_a_penalty_try:
                team_a_score += PENALTY_TRY_POINTS;
                break;

            case R.id.team_b_try:
                team_b_score += TRY_POINTS;
                break;
            case R.id.team_b_try_conversion:
                team_b_score += TRY_CONVERSION_POINTS;
                break;
            case R.id.team_b_drop_kick:
                team_b_score += DROP_KICK_POINTS;
                break;
            case R.id.team_b_penalty_kick:
                team_b_score += PENALTY_KICK_POINTS;
                break;
            case R.id.team_b_penalty_try:
                team_b_score += PENALTY_TRY_POINTS;
                break;

            default:
                break;
        }

        displayTeamAScore(team_a_score);
        displayTeamBScore(team_b_score);
    }

    /**
     * Display Scores
     */
    public void displayTeamAScore(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayTeamBScore(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}