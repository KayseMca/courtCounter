package com.example.mohamedabdillahi.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int puanA=0;
int puanB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void result3(View view) {
        puanA +=3;
       displayForTeamA(puanA);
    }
    public void result1(View view) {
        puanA +=1;
        displayForTeamA(puanA);
    }
    public void result2(View view) {
        puanA +=2;
        displayForTeamA(puanA);
    }
    /*bnin kodu başliyor*/
    public void resultb3(View view) {
        puanB +=3;
        displayForTeamB(puanB);
    }
    public void resultb1(View view) {
        puanB +=1;
        displayForTeamB(puanB);
    }
    public void resultb2(View view) {
        puanB +=2;
        displayForTeamB(puanB);
    }

    public void wonTeam(View view) {

       if (puanA>puanB)
       {
           displayWonTeam("Congrats!\n TeamA win the match with "+puanA+" Scores");
       }
       else
           displayWonTeam("Congrats!\n TeamB win the match with "+puanB+" Scores");

    }
    public void reset(View view) {
        puanB =0;
        puanA=0;
        displayForTeamB(puanB);
        displayForTeamA(puanA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayWonTeam(String score) {
        TextView scoreView = (TextView) findViewById(R.id.team_won_score);
        scoreView.setText(String.valueOf(score));
    }
}
