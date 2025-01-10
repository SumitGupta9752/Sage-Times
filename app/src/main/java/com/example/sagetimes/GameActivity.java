package com.example.sagetimes;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GameActivity extends AppCompatActivity {
    public Button button_playTicTacToe,gameBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);

        //        fixed the rotation of the screen to portrait
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_game);

        //play game activity
        button_playTicTacToe=findViewById(R.id.play_TicTacToe);
        button_playTicTacToe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),TicTacToeActivity.class);
                startActivity(intent);
            }
        });

        // game back activity

        gameBackBtn=findViewById(R.id.game_back_btn);
        gameBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        // toast for upcoming games
        //this is for snake and ladder toast

        Button buttonStatus = findViewById(R.id.btn_snakeLadder);
        buttonStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Snake and Ladder Will be available soon", Toast.LENGTH_SHORT).show();
            }
        });


        // this is for the ludo toast
        Button buttonStatus1 = findViewById(R.id.btn_ludo);
        buttonStatus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Ludo will be available soon", Toast.LENGTH_SHORT).show();
            }
        });

        // this is for subway surfers toast
        Button buttonStatus2 = findViewById(R.id.btn_subwaySurfers);
        buttonStatus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Subway Surfers will be available soon", Toast.LENGTH_SHORT).show();
            }
        });

        // this is for gun shoot toast
        Button buttonStatus3 = findViewById(R.id.btn_gunShoot);
        buttonStatus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Gun Shoot will be available soon", Toast.LENGTH_SHORT).show();
            }
        });


    }
}