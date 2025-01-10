//package com.example.sagetimes;
//
//import android.graphics.Color;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.activity.EdgeToEdge;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.graphics.Insets;
//import androidx.core.view.ViewCompat;
//import androidx.core.view.WindowInsetsCompat;
//
//import org.checkerframework.common.subtyping.qual.Bottom;
//
//
//public class TicTacToeActivity extends AppCompatActivity implements View.OnClickListener {
//    private boolean playerOneActive;
//    private TextView playerOneScore, playerTwoScore, playerStatus;
//    private Button[] buttons = new Button[9];
//    private Button reset, playAgain;
//
//    private int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
//    private final int[][] winningPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};
//
//    private int rounds;
//    private int playerOneScoreCount, playerTwoScoreCount;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_tic_tac_toe);
//
//        playerOneScore = findViewById(R.id.player_1_score);
//        playerTwoScore = findViewById(R.id.player_2_score);
//        playerStatus = findViewById(R.id.text_status);
//        reset = findViewById(R.id.btn_reset);
//        playAgain = findViewById(R.id.btn_playagain);
//
//        for (int i = 0; i < buttons.length; i++) {
//            buttons[i] = findViewById(getResources().getIdentifier("button_" + (i + 1), "id", getPackageName()));
//            buttons[i].setOnClickListener(this);
//        }
//
//        reset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                playAgain();
//                playerOneScoreCount = 0;
//                playerTwoScoreCount = 0;
//                updatePlayerScore();
//            }
//        });
//
//        playAgain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                playAgain();
//            }
//        });
//
//        playerOneScoreCount = 0;
//        playerTwoScoreCount = 0;
//        playerOneActive = true;
//        rounds = 0;
//    }
//
//    @Override
//    public void onClick(View v) {
//        if (!((Button) v).getText().toString().equals("")) {
//            return;
//        }
//
//        String buttonId = v.getResources().getResourceEntryName(v.getId());
//        int gameStatePointer = Integer.parseInt(buttonId.substring(buttonId.length() - 1)) - 1;
//
//        if (playerOneActive) {
//            ((Button) v).setText("X");
//            ((Button) v).setTextColor(Color.parseColor("#ffc34a"));
//            gameState[gameStatePointer] = 0;
//        } else {
//            ((Button) v).setText("0");
//            ((Button) v).setTextColor(Color.parseColor("#71fc3a"));
//            gameState[gameStatePointer] = 1;
//        }
//        rounds++;
//
//        if (checkWinner()) {
//            if (playerOneActive) {
//                playerOneScoreCount++;
//                updatePlayerScore();
//                playerStatus.setText("Player 1 has won");
//            } else {
//                playerTwoScoreCount++;
//                updatePlayerScore();
//                playerStatus.setText("Player 2 has won");
//            }
//        } else if (rounds == 9) {
//            playerStatus.setText("No winner");
//        } else {
//            playerOneActive = !playerOneActive;
//        }
//    }
//
//    private boolean checkWinner() {
//        for (int[] winningPosition : winningPositions) {
//            if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
//                    gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
//                    gameState[winningPosition[0]] != 2) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private void playAgain() {
//        rounds = 0;
//        playerOneActive = true;
//        for (int i = 0; i < buttons.length; i++) {
//            gameState[i] = 2;
//            buttons[i].setText("");
//        }
//        playerStatus.setText("Status");
//    }
//
//    private void updatePlayerScore() {
//        playerOneScore.setText(String.valueOf(playerOneScoreCount));
//        playerTwoScore.setText(String.valueOf(playerTwoScoreCount));
//    }
//}

package com.example.sagetimes;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TicTacToeActivity extends AppCompatActivity implements View.OnClickListener {
    private boolean playerOneActive;
    private TextView playerOneScore, playerTwoScore, playerStatus;
    private Button[] buttons = new Button[9];
    private Button reset, playAgain;

    private int[] gameState = {2, 2, 2, 2, 2, 2, 2, 2, 2};
    private final int[][] winningPositions = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}, {0, 3, 6}, {1, 4, 7}, {2, 5, 8}, {0, 4, 8}, {2, 4, 6}};

    private int rounds;
    private int playerOneScoreCount, playerTwoScoreCount;
    private boolean gameover; // Variable to track if the game is over

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        playerOneScore = findViewById(R.id.player_1_score);
        playerTwoScore = findViewById(R.id.player_2_score);
        playerStatus = findViewById(R.id.text_status);
        reset = findViewById(R.id.btn_reset);
        playAgain = findViewById(R.id.btn_playagain);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = findViewById(getResources().getIdentifier("button_" + (i + 1), "id", getPackageName()));
            buttons[i].setOnClickListener(this);
        }

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAgain();
                playerOneScoreCount = 0;
                playerTwoScoreCount = 0;
                updatePlayerScore();
            }
        });

        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAgain();
            }
        });

        playerOneScoreCount = 0;
        playerTwoScoreCount = 0;
        playerOneActive = true;
        rounds = 0;
        gameover = false; // Initialize gameover to false
    }

    @Override
    public void onClick(View v) {
        if (gameover || !((Button) v).getText().toString().equals("")) { // Check if gameover or cell is already marked
            return;
        }

        String buttonId = v.getResources().getResourceEntryName(v.getId());
        int gameStatePointer = Integer.parseInt(buttonId.substring(buttonId.length() - 1)) - 1;

        if (playerOneActive) {
            ((Button) v).setText("X");
            ((Button) v).setTextColor(Color.parseColor("#ffc34a"));
            gameState[gameStatePointer] = 0;
        } else {
            ((Button) v).setText("0");
            ((Button) v).setTextColor(Color.parseColor("#71fc3a"));
            gameState[gameStatePointer] = 1;
        }
        rounds++;

        if (checkWinner()) {
            gameover = true;
            if (playerOneActive) {
                playerOneScoreCount++;
                updatePlayerScore();
                playerStatus.setText("Player 1 has won");
            } else {
                playerTwoScoreCount++;
                updatePlayerScore();
                playerStatus.setText("Player 2 has won");
            }
        } else if (rounds == 9) {
            gameover = true;
            playerStatus.setText("No winner");
        } else {
            playerOneActive = !playerOneActive;
        }
    }

    private boolean checkWinner() {
        for (int[] winningPosition : winningPositions) {
            if (gameState[winningPosition[0]] == gameState[winningPosition[1]] &&
                    gameState[winningPosition[1]] == gameState[winningPosition[2]] &&
                    gameState[winningPosition[0]] != 2) {
                return true;
            }
        }
        return false;
    }

    private void playAgain() {
        rounds = 0;
        playerOneActive = true;
        gameover = false; // Reset gameover to false
        for (int i = 0; i < buttons.length; i++) {
            gameState[i] = 2;
            buttons[i].setText("");
        }
        playerStatus.setText("Status");
    }

    private void updatePlayerScore() {
        playerOneScore.setText(String.valueOf(playerOneScoreCount));
        playerTwoScore.setText(String.valueOf(playerTwoScoreCount));
    }
}
